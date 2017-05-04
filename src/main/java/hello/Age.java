package hello;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Age {

    @NotNull
    @Min(18)
    int age;

    public Age(String age) {
        this.age = Integer.valueOf(age);
    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }
}
