package Module2.Lesson15.Example2;

public class Test {
    public static void main(String[] args) {

        DepartmentB2C departmentB2C = new DepartmentB2C();

        DepartmentB2C.Houses db = new DepartmentB2C.Houses();
        DepartmentB2C.Houses.House h = new DepartmentB2C.Houses.House(1,"s","s","s","s",10);

        SuperVisor superVisor = new SuperVisor();
        superVisor.makeMoney();


    }
}
