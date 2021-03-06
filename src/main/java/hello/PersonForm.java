package hello;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {

    @NotNull
    @Size(min=2, max=30)
    private String name;

    @Valid
    private Age age;

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}
