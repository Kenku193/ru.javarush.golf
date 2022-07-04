package Module2.Lesson16.Example4XML;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


public class Human {

    // ОБРАТИТЕ ВНИМАНИЕ НА АННОТАЦИЮ - @JsonProperty
    // C АННОТАЦИЕЙ @JacksonXmlProperty ВЫЛЕТАЛА ОШИБКА
    @JsonProperty

    private String name;
    @JsonProperty
    private int age;
    @JsonProperty
    Pet pet;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }
}
