/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runapplication;

/**
 *
 * @author Student
 */
// Abstract class that stores the console sales details
public abstract class Consoles implements IConsoles
{
    // Variables for device type, store name and total sales
    private String deviceType;
    private String storeName;
    private double totalSales;

    // Constructor accepts the device type, store name and total sales
    public Consoles(String deviceType, String storeName, double totalSales)
    {
        this.deviceType = deviceType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Get methods for the variable
    @Override
    public String getConsoleType()
    {
        return deviceType;
    }

    @Override
    public String getStore()
    {
        return storeName;
    }

    @Override
    public double getTotalSales()
    {
        return totalSales;
    }
}