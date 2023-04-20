//Chase Moskowitz
package com.mycompany.exam2;

public class Parking 
{
    private char parkingType;
    private int levels;
    private int numSpaces;

    public Parking(char newParkingType, int newLevels, 
                                        int newNumSpaces)
    {
        parkingType = newParkingType;
        levels = newLevels;
        numSpaces= newNumSpaces;
    }

    public char getParkingType() 
    {
        return parkingType;
    }

    public int getLevels()
    {
        return levels;
    }

    public int getNumSpaces()
    {
        return numSpaces;
    }
    
    public void setParkingType(char newParkingType) 
    {
        parkingType = newParkingType;
    }

    public void setLevels(int newLevels)
    {
        levels = newLevels;
    }
    
    public void setNumSpaces(int newNumSpaces)
    {
        numSpaces= newNumSpaces;
    }
  
   public double cost()
   {
       double cost=0;
       
       if (parkingType=='L'||parkingType == 'l')
       {
           cost=1685.43 * numSpaces;
       }
       else if (parkingType=='D'||parkingType=='d')
       {
           cost=(26236.71 * numSpaces) + ((levels-1)*1000000);
       }
       
       return cost;
   }
    /**
    * toString method
    */
     public String toString()
   {
       String str=null;
       
       // Create a string describing the stock.
        if (parkingType=='L'||parkingType == 'l')
        {
             str = String.format("Lot: Spaces: %d Cost: %,.2f",
                     numSpaces, cost());
        }
        else if (parkingType=='D'||parkingType=='d')
        {
             str = String.format("Deck: Levels: %d Spaces: %d Cost: %,.2f",
                     levels, numSpaces, cost());
        }
                
      
        // Return the string.
        return str;
   }
    }

