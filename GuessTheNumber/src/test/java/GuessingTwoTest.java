import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;



class GuessingTwoTest {


    @Test
    void givenTwoIntegersAndTheMethodShouldReturnFalseAllTheTime() {
    //the first parameter is superior to the second
        assertFalse(GuessingTwo.guessedLoop(14,3));
    //the first parameter is inferior to the second
        assertFalse(GuessingTwo.guessedLoop(1,16));
    }

    @Test
    void givenANameAsAStringAndTheMethodShouldReturnABoolean() {
        Boolean expected = true;
        Boolean actual = GuessingTwo.winner("John",9);
        assertTrue(actual);
    }

    @Test
    void doYouWannaPlayAgain() {
        //Still searching on how to Mock a User Input in a test;
    }
}