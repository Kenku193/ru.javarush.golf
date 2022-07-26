package Module2.Lesson19.ClientServer;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 25000);

        int port = socket.getPort();

        System.out.println("Клиент начал работу");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));


        String request = "Дядя Веня\n";
        bufferedWriter.write(request);

        bufferedWriter.flush();

        String answer = bufferedReader.readLine();
        System.out.println("Получен ответ " + answer);
        bufferedReader.close();




    }
}
