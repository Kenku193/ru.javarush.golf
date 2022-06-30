package Module2.Lesson15.Example2;

import java.util.ArrayList;

public class Customer {

    private int clientID;
    private int groupID;
    private int number;
    private ArrayList<Service> services;
    private Passport passport;
    private Credentials credentials;


    public Customer() {
        passport = new Passport();
        credentials = new Credentials();
    }

        public int getClientID () {
            return clientID;
        }

        public int getNumber () {
            return number;
        }

        public void setNumber (int number){
            this.number = number;
    }

    class Passport{
        private static int passType;
        private int number;
        private String name;
        private String address;

        public static int getPassType() {
            return passType;
        }

        public int getNumber() {
            System.out.println(clientID);
            return number;
        }



        public void setNumber(int number) {
            this.number = number;               // ОБРАЩАЕМСЯ К ПОЛЮ КЛАССА Passport
        }

        public void setClientNumber(int number){
            Customer.this.number = number;         // ОБРАЩАЕМСЯ К ПОЛЮ КЛАССА Customer
        }

    }

    class Credentials {
        private String login;
        private String password;

        public void setLogin(String login) {
            this.login = login;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getLogin() {
            return login;
        }

        public String getPassword() {
            return password;
        }
    }


}

class Service {}
