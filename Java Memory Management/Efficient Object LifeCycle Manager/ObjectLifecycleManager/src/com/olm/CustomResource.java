package com.olm;

public class CustomResource implements AutoCloseable{

    public CustomResource() {
        System.out.println("Resource Opened.");
    }
    public void doWork()
    {
        System.out.println("Perform some work on open Resource..");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Resource Closed Automatically.");
    }
}
