import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by saxenaaa on 7/24/2017.
 */
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

enum Year {
  YEAR2015,YEAR2016,YEAR2017,YEAR2018,YEAR2019,YEAR2020
}
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.CONSTRUCTOR)
@interface Timestamp{
    Day day();
    Month month();
    Year yerar();

}
