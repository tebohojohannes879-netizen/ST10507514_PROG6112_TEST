/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runapplication;

/**
 *
 * @author Student
 */
// Subclass of Consoles that prints the sales details
public class ConsoleSales extends Consoles
{
    // Constructor passes the values up to the Consoles class
    public ConsoleSales(String deviceType, String storeName, double totalSales)
    {
        super(deviceType, storeName, totalSales);
    }

    // Displays the device type, store name and total sales
    public void printSales()
    {
        System.out.println("*********************************");
        System.out.println("DEVICE TYPE: " + getConsoleType());
        System.out.println("STORE NAME: " + getStore());
        System.out.println("TOTAL SALES: R " + String.format("%.2f", getTotalSales()));
        System.out.println("*********************************");
    }
}
