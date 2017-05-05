package hello;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {

    @NotEmpty(message = "必須")
    @Size(min=2, max=30, message = "{min}字以上 {max}字以下")
    private String name;
    
    @Valid
    Age age;

    @Valid
    DateOfBirth dateOfBirth;

    @Override
    public String toString() {
        return "PersonForm{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }


}
