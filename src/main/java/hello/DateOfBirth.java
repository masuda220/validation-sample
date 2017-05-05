package hello;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class DateOfBirth {

	@NotNull(message="必須")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	LocalDate date ;

	@Override
	public String toString() {
		return date.toString();
	}
}
