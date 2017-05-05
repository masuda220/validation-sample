package hello;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


public class Age {

    @Min(value=18,message = "１８歳以上")
    Integer age;

	@Override
	public String toString() {
		return age.toString()+"歳";
	}
}
