package Module2.Lesson19.ClientServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(25000);

        int localPort = serverSocket.getLocalPort();
        System.out.println(localPort);



        System.out.println("Сервер запущен");

        while (true){
            Socket accept = serverSocket.accept();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));

            String query = bufferedReader.readLine();
            System.out.println("Запрос получен");

            String answer = "Привет " + query.toUpperCase();

            bufferedWriter.write(answer);

            bufferedWriter.flush();
            accept.close();
            bufferedReader.close();
            bufferedWriter.close();
        }


    }
}
