/**
 * Created by saxenaaa on 7/26/2017.
 */
public class MovieService {

    static void  buy(User user, Double price) throws InvalidPriceException, PriceLessThan2000Exception {


        if(price<0)   {
            throw new InvalidPriceException("Invalid Price");
        } else if(price < 2000) {
            throw new PriceLessThan2000Exception("Price is less than 2000");
        } else {
            System.out.println("Enjoy Movie with popcorn");
        }
    }

    static void watch(User user) throws InvalidAgeException, AgeLessThan10Exception, AgeLessThan20Exception, UserRatingBelow3Exception {

        int age = user.getAge();
        int rating = user.getRating();

        if(age < 0){
            throw new InvalidAgeException("Age is invalid");
        } else if (age > 0 && age < 10) {
            throw new AgeLessThan10Exception();
        } else if (age > 10 && age < 20) {
            throw new AgeLessThan20Exception("Age less than 20");
        } else {
            System.out.println("Enjoy movie with popcorn");
        }
    }
}
