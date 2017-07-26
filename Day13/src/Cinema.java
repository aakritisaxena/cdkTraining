/**
 * Created by saxenaaa on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        User user = new User(121,"Aakriti", 12,2);
        try {

            MovieService.watch(user);
            MovieService.buy(user,100.00);
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        } catch (AgeLessThan10Exception e) {
            System.out.println(e.getMessage());
        } catch (PriceLessThan2000Exception e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (AgeLessThan20Exception e) {
            System.out.println(e.getMessage());
        } catch (UserRatingBelow3Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
