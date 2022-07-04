package Module2.Lesson16.Example3;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class JsonMapExample {
    @JsonProperty
    private Map<Integer, JsonExample> map;

    public JsonMapExample(Map<Integer, JsonExample> map) {
        this.map = map;
    }

    // БЕЗ ЭТОГО ПУСТОГО КОНСТРУКТОРА НЕ ДЕСЕРИАЛИЗУЕТСЯ, РАСКОММЕНТИРУЙТЕ ЕГО
//    public JsonMapExample() {
//    }

    @Override
    public String toString() {
        return "JsonMapExample{" +
                "map=" + map +
                '}';
    }
}
