package Module2.Lesson19;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Example {

    public static void main(String[] args) throws IOException {

        // СОЗДАЕМ СОКЕТ
        Socket socket = new Socket("javarush.ru", 80);

        // ДЛЯ ОБМЕНА ДАННЫМИ НУЖНЫ ВХОДНОЙ И ВЫХОДНОЙ ПОТОКИ
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();


        // ЗАПРОС
        String request = "GET /sitemap.xml HTTP/1.1\\r\\nHost:javarush.ru\\r\\n\\r\\n\"";

        // ЗАПИСЫВАЕМ В ПОТОК НАБОР БАЙТОВ
        outputStream.write(request.getBytes());

        outputStream.flush();

        // МЫ ОТПРАВИЛИ ЗАПРОС, СЕРВЕР СРЕАГИРУЕТ ВЕРНЕТ КАКОЙ_ТО ОВТЕТ, ЕГО НУЖНО ПРОЧИТАТЬ

        //ЧИТАТЬ ОТВЕТ
        int value = 0;


        while ((value=inputStream.read()) != -1){
            System.out.print((char) value);
        }

        // ВСЕ ЗАКРЫТЬ
        socket.close();
        inputStream.close();
        outputStream.close();

    }

}
