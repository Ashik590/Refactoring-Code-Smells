import java.time.LocalDate;
import java.time.Period;

public class LocalDateUtils {
    public int getAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
