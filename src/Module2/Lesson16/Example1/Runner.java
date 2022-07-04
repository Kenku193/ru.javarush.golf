package Module2.Lesson16.Example1;

import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Standart standart = new Standart(); // ОБЪЕКТ


        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("result.txt"));
        out.writeObject(standart);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("result.txt"));
        Standart o = (Standart) in.readObject();
        System.out.println(o);




    }
}
