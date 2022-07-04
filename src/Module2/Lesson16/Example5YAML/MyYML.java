package Module2.Lesson16.Example5YAML;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyYML {
    @JsonProperty
    int a;
    @JsonProperty
    int b;

    @Override
    public String toString() {
        return "MyYML{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
