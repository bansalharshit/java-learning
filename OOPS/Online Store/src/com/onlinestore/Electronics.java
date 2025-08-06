package com.onlinestore;

public class Electronics extends Product{

    private String brand;
    private int warrantyYears;

    public Electronics(int id,String name,double price,String brand,int warrantyYears)
    {
        super(id,name,price);
        this.brand = brand;
        this.warrantyYears = warrantyYears;
    }
    @Override
    public String getDetails(){
        return super.getDetails()+", Brand= "+brand + ", Warranty= "+ warrantyYears + " year"+'}';
    }
}
