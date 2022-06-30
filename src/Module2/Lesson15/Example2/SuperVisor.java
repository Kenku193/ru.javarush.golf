package Module2.Lesson15.Example2;

public class SuperVisor extends SalesAgent{

    Customer customer = new Customer(){
        @Override
        public int getClientID() {
            return 777;
        }
    };


    @Override
    public void makeMoney() {
        System.out.println("Предъявлен clienID: " + customer.getClientID());
        System.out.println("Качество проверено!");
    }
}
