import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecoratorPatternTest {

    @Test
    void testCheeseBurguer() {

        Burguer cheeseBurguer = new CheeseBurguer(new DefaultBurguer());
        String expected = "Bread. \n" + "Cow meat.\n" + "Cheese.";
        Assertions.assertEquals(expected, cheeseBurguer.ingredients());
    }

    @Test
    void testBaconTomatoBurguer() {

        Burguer baconTomato = new BaconBurguer(new TomatoBurguer(new DefaultBurguer()));
        String expected = "Bread. \n" + "Cow meat.\n" + "Tomato.\n" + "Bacon.";
        Assertions.assertEquals(expected, baconTomato.ingredients());
    }
}
