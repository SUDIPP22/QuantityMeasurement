package quantitymeasurement;

import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void ShouldPrintWelcomeMessage() {
        Feet feet = new Feet();
        feet.printWelcomeMessage();
    }
}
