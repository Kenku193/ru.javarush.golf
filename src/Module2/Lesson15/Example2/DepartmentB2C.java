package Module2.Lesson15.Example2;

import java.util.ArrayList;
import java.util.Arrays;

public class DepartmentB2C {

    int a = 10;



    public void getInfo(){
        System.out.println(Houses.val3);
    }

    public static class Houses{



        int val2 = 20;
        static int val3 = 30;

        static private ArrayList<House> houses = new ArrayList<>();

        public House getHouses(int houseID){
            return this.houses.get(houseID);

        }

        public void setHouse(House house){
            this.houses.add(house);
        }

        static class House {
            int postalCode;
            String city;
            String area;
            String street;
            String buildingNumber;

            int numberOfInhabitants;
            boolean isConnected;

            public House(int postalCode, String city, String area, String street, String buildingNumber, int numberOfInhabitants) {
                this.postalCode = postalCode;
                this.city = city;
                this.area = area;
                this.street = street;
                this.buildingNumber = buildingNumber;
                this.numberOfInhabitants = numberOfInhabitants;
                this.isConnected = false;
            }
        }

    }


}
