import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;

public class RentalTest {
    public Movie movie = new Movie("TEST", 0);
    private Rental rental = new Rental(movie, 0);

    @Test
    public void getDaysRented(){
        assertEquals(0, rental.getDaysRented());
    }

    @Test
    public void getMovie(){
        assertEquals(movie, rental.getMovie());
    }
}
