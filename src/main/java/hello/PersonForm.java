package hello;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {

    @NotEmpty(message = "必須")
    @Size(min=2, max=30, message = "以上 以下")
    private String name;
    
    @Valid
    Age age;

    @Valid
    DateOfBirth dateOfBirth;

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}
