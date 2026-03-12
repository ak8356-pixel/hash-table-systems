package hashtablesystems;

import java.util.*;

public class Q8_ParkingLotOpenAddressing {

    String[] parking = new String[20];

    public int parkVehicle(String plate){

        int index = Math.abs(plate.hashCode()) % parking.length;

        while(parking[index] != null){
            index = (index+1) % parking.length;
        }

        parking[index] = plate;

        return index;
    }

    public static void main(String[] args){

        Q8_ParkingLotOpenAddressing obj = new Q8_ParkingLotOpenAddressing();

        System.out.println("Vehicle parked at spot "+obj.parkVehicle("ABC123"));
    }
}
