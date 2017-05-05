package hello;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


public class Age {

	@NotNull
    @Min(value=18,message = "１８歳以上")
    Integer age;

	@Override
	public String toString() {
		if(age==null) return "";
		return age.toString()+"歳";
	}
}
