package kata1;

import java.time.LocalDate; 
import java.time.Month;
import java.time.Period;
import static java.util.Calendar.MONTH;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1999, Month.AUGUST,27);
        LocalDate actualDay = LocalDate.now(); 
        
        Person person = new Person("Alvaro ", birthdate, actualDay);
        System.out.println(person.getName() + "tiene " + person.getYears(birthdate, actualDay) + " años");
    }
    
}
