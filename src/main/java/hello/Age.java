package hello;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;


public class Age {

    @NotEmpty(message = "必須")
    @Min(value=18,message = "１８歳以上")
    int age;

    public Age(String age) {
        this.age = Integer.valueOf(age);
    }

    public Age() {
        ;
    }
}
