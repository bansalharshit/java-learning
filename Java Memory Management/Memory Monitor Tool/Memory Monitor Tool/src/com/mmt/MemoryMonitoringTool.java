package com.mmt;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MemoryMonitoringTool {
    private final MemoryMXBean memoryMXBean;
    private final List<GarbageCollectorMXBean> gcBeans;
    private final ScheduledExecutorService scheduler;
    public MemoryMonitoringTool() {
        this.memoryMXBean = ManagementFactory.getMemoryMXBean();
        this.gcBeans = ManagementFactory.getGarbageCollectorMXBeans();
        this.scheduler = Executors.newScheduledThreadPool(1);

    }
public void startMonitoring()
{
    System.out.println("Starting Memory Monitoring Tool");
    scheduler.scheduleAtFixedRate(this::logMemoryUsage,0,5, TimeUnit.SECONDS);
    scheduler.scheduleAtFixedRate(this::logGcEvents,0,10,TimeUnit.SECONDS);
}

private void logMemoryUsage()
{
    MemoryUsage heap= memoryMXBean.getHeapMemoryUsage();
    MemoryUsage nonHeap = memoryMXBean.getNonHeapMemoryUsage();

    System.out.println("\n-------Memory Usage-------");
    System.out.println("Heap Memory: Used= "+heap.getUsed()/(1024*1024)+ " MB, Max= "+heap.getMax()/(1024*1024)+" MB");
    System.out.println("Non Heap Memory(MetaSpace or Stack): Used= "+nonHeap.getUsed()/(1024*1024)+ " MB, Max= "+nonHeap.getMax()/(1024*1024)+" MB");
}

private void logGcEvents(){
    System.out.println("\n-----Garbage Collection Stats-----");
    for(GarbageCollectorMXBean gcBean:gcBeans)
    {
        System.out.println("GC Name: "+gcBean.getName());
        System.out.println("Collection Count: "+gcBean.getCollectionCount());
        System.out.println("Collection Time: "+gcBean.getCollectionTime()+"ms");
    }
}

    public static void main(String[] args) {
        MemoryMonitoringTool monitoringTool = new MemoryMonitoringTool();
        monitoringTool.startMonitoring();

        while(true)
        {
            try{
              byte[] memoryFiller = new byte[10*1024*1024]; // Allocate 10MB
                Thread.sleep(2000);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

}
