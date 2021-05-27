import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private SILab2 object = new SILab2();

    @Test
    void MultipleConditionTest() {
        RuntimeException exception;
        exception = assertThrows(RuntimeException.class, () -> object.function(Collections.singletonList(new Time(-100, 0, 2))));
        assertTrue(exception.getMessage().contains("The hours are smaller than the minimum"));

        exception = assertThrows(RuntimeException.class, () -> object.function(Collections.singletonList(new Time(100, 0, 2))));
        assertTrue(exception.getMessage().contains("The hours are grater than the maximum"));
        
        exception = assertThrows(RuntimeException.class, () -> object.function(Collections.singletonList(new Time(0, 100, 0))));
        assertTrue(exception.getMessage().contains("The minutes are not valid!"));

        exception = assertThrows(RuntimeException.class, () -> object.function(Collections.singletonList(new Time(0, -100, 0))));
        assertTrue(exception.getMessage().contains("The minutes are not valid!"));

        exception = assertThrows(RuntimeException.class, () -> object.function(Collections.singletonList(new Time(0, 0, -100))));
        assertTrue(exception.getMessage().contains("The seconds are not valid"));

        exception = assertThrows(RuntimeException.class, () -> object.function(Collections.singletonList(new Time(24, 0, 100))));
        assertTrue(exception.getMessage().contains("The time is greater than the maximum"));

        exception = assertThrows(RuntimeException.class, () -> object.function(Collections.singletonList(new Time(24, 100, 0))));
        assertTrue(exception.getMessage().contains("The time is greater than the maximum"));
    }

}