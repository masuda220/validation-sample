package hello;

import javax.validation.Valid;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {

    @NotNull
    @Size(min=2, max=30, message = "{min}以上 {max}以下")
    private String name;

    @Valid
    Age age;

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}
