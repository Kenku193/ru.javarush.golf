package Module2.Lesson19;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class Example2 {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress inetAddress1 = InetAddress.getLocalHost();
        System.out.println(inetAddress1);

        InetAddress address1 = InetAddress.getByName("yandex.ru");
        InetAddress address2 = InetAddress.getByName("yandex.com");
        InetAddress address3 = InetAddress.getByName("javarush.ru");
        InetAddress address4 = InetAddress.getByName("localhost");

        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);
        System.out.println(address4);




    }
}
