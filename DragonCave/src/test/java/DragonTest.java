import org.junit.Test;
import static org.junit.Assert.assertEquals;


class DragonTest {

    @Test
    public void givenAnIntegerAndTheMethodShouldReturnAString() {
        //When the user Input is equals to 1.
        assertEquals("You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "A large gradon jumps out in front of you! He opens his jaws and ...\n" +
                "Gobbles you down in one bite!",Dragon.guessingTheDragon(1));
        //When the user Input is equals to 2.
        assertEquals("the dragon wants to say Hi!!",Dragon.guessingTheDragon(2));
        //When the user Input enter something different than 2 or 1.
        assertEquals("Please enter a value 1 or 2 !", Dragon.guessingTheDragon(226));
        }
}