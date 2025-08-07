package com.olm;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class ObjectLifecycleManager {
    private static void printMemoryUsage(String label)
    {
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage heap = memoryBean.getHeapMemoryUsage();
        System.out.println("\n--------"+label+"---------");
        System.out.println("Heap Used: "+(heap.getUsed()/(1024*1024))+"MB"+", Max Heap Used: "+(heap.getMax()/(1024*1024))+"MB");
    }

    public static void main(String[] args) throws Exception {
        
        printMemoryUsage("Start");

        ReferenceQueue<BigObject> refQueue = new ReferenceQueue<>();
        BigObject bigObject = new BigObject();
        PhantomReference<BigObject> phantomReference = new PhantomReference<>(bigObject,refQueue);

        printMemoryUsage("After Big Object Created..");
        try(CustomResource resource= new CustomResource())
        {
            resource.doWork();
        }
        // Nullify reference to BigObject to make it eligible for Garbage Collection
        bigObject = null;
        System.out.println("\n[INFO] Manually nullified strong reference to BigObject.");
        System.out.println("Requesting Garbage Collection");
        System.gc();
        Thread.sleep(2000); // Allow GC to complete it works till than we will take pause of 2 sec
        printMemoryUsage("After GC Done.");
        if(refQueue.poll()!=null)
        {
            System.out.println("[INFO] BigObject has been garbage Collected, Detected via PhantomReference");
        }
        else
            System.out.println("[WARNING] BigObject has been not yet Collected.");

        System.out.println("\n[INFO] Application Finished.....");
    }
}
