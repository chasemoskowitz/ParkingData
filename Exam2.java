//Chase Moskowitz
package com.mycompany.exam2;

import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Exam2 
{

    public static void main(String[] args) throws IOException 
    {
       char parkingType;
       String parkingHolder;
       int levels;
       int numSpaces;
        String lineRead = null;
        String[] tokens;
        int index = 0;
        int counter = 0;
        double totalCost=0;
        double percentTotal;

        Parking[] myParking = new Parking[6];

        File file = new File("Parkingdata.txt");
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {
            // get a line from the file
            lineRead = inputFile.nextLine();
            // parse it
            tokens = lineRead.split(",");
            parkingHolder =tokens[0];
            parkingType=parkingHolder.charAt(0);
            levels = Integer.parseInt(tokens[1]);
            numSpaces=Integer.parseInt(tokens[2]);
            // instantiate object at element
            myParking[counter] = new Parking(parkingType, levels, numSpaces);
            counter++;
        }

        for (index = 0; index < counter; index++)
        {
            totalCost += myParking[index].cost();
        }
        
        for (index = 0; index < counter; index++)
        {
            percentTotal=(myParking[index].cost()/totalCost)*100;
            System.out.printf("\n%d ", index);
            System.out.printf(myParking[index].toString());
            System.out.printf(" %% of total cost %.1f", percentTotal);
        }
        System.out.printf("\n\nTotal Costs = %,.2f ", totalCost);
    }
}
