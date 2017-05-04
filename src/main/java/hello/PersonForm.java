package hello;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {

    @NotNull
    @Size(min=2, max=30, message = "{min}以上 {max}以下")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Valid
    Age age;

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }
    //    @NotNull
//    @Min(value=18,message = "１８歳以上")
//    int age;
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    //    public Age getAge() {
//        return age;
//    }
//
//    public void setAge(Age age) {
//        this.age = age;
//    }

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}
