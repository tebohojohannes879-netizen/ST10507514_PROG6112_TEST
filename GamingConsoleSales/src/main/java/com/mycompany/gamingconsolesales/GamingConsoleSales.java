/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolesales;

/**
 *
 * @author Student
 */
public class GamingConsoleSales
{
    public static void main(String[] args)
    {
        // Two dimensional array of sales
        int[][] sales = {{1000, 2000, 3000},
                         {2000, 3000, 4000},
                         {1500, 1100, 1200}};

        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Array to store the total sales for each city
        int[] cityTotals = new int[cities.length];

        System.out.println("-------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-------------------------------------------");

        // Print the console headings
        System.out.printf("%-16s", "");
        for (String console : consoles)
        {
            System.out.printf("%-10s", console);
        }
        System.out.println();

        // Loop through each city (row) and each console (column)
        for (int i = 0; i < sales.length; i++)
        {
            System.out.printf("%-16s", cities[i]);

            for (int j = 0; j < sales[i].length; j++)
            {
                System.out.printf("%-10s", sales[i][j]);

                // Add this value to the city's total
                cityTotals[i] += sales[i][j];
            }
            System.out.println();
        }

        // Find the city with the highest total sales
        int highestIndex = 0;
        for (int i = 1; i < cityTotals.length; i++)
        {
            if (cityTotals[i] > cityTotals[highestIndex])
            {
                highestIndex = i;
            }
        }

        System.out.println("-------------------------------------------");
        System.out.println("CONSOLE SALE TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < cities.length; i++)
        {
            System.out.println(cities[i] + ": " + cityTotals[i]);
        }
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cities[highestIndex] + " (" + cityTotals[highestIndex] + ")");
        System.out.println("-------------------------------------------");
    }
}
