package hello;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class DateOfBirth {

	@NotNull(message="必須")
	LocalDate date ;
}
