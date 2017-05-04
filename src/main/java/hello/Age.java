package hello;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Age {

    @NotNull(message = "必須")
    @Min(value=18,message = "１８歳以上")
    int age;

    public Age(String age) {
        this.age = Integer.valueOf(age);
    }

}
