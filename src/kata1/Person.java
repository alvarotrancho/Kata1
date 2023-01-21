package kata1;

import java.time.LocalDate; 
import java.time.Period;

public class Person {
    private final String name;
    private final LocalDate birthdate;
    private final LocalDate actualDate;

    public Person(String name, LocalDate birthdate, LocalDate actualDate) {
        this.name = name;
        this.birthdate = birthdate;
        this.actualDate = actualDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public LocalDate getActualDate() {
        return actualDate;
    }
    
    public int getYears(LocalDate birthdate, LocalDate actualDay){
        Period period = Period.between(birthdate, actualDay);
        return period.getYears();
    }
    
    @Override
    public String toString(){
        return this.getName() + " is " + getYears(this.birthdate, this.actualDate) + " years old";
    }
}