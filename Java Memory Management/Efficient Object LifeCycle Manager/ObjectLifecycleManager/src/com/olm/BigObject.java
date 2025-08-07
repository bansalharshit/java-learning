package com.olm;

// Define Dummy Resource Heavy Object
public class BigObject {
    private byte[] memoryBlock = new byte[10*1024*1024]; // Allocate 10 MB

    public BigObject()
    {
        System.out.println("Big object has been created.");
    }
}
