import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;

public class MovieTest {
    public Movie movie;

    @BeforeEach
    public void beforeEach() {
        this.movie = new Movie("Film", 0);
    }

    @Test
     public void getPriceCode() {
        assertEquals(0, this.movie.getPriceCode());
    }

    @Test
    public void setPriceCode() {
        this.movie.setPriceCode(0);
        assertEquals (0, this.movie.getPriceCode());
    }

    @Test
    public void getTitle() {
        assertEquals("Film", this.movie.getTitle());
    }
}
