package Module2.Lesson16.Example4XML;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;

import java.io.File;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        // СОЗДАЕМ JACKSON OBJECTMAPPER
        ObjectMapper objectMapper = new ObjectMapper(new XmlFactory());


        // ДЕСЕРИАЛИЗАЦИЯ
        Human human = objectMapper.readValue(new File("src/Module2/Lesson16/Example4XML/proto.xml"), Human.class);
        System.out.println(human);





    }


}
