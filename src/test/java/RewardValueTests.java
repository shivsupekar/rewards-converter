import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RewardValueTests {
    @Test
    public void testCashToMilesConstructor() {
        // Test the constructor that takes cash value and converts it to miles
        RewardValue rewardValue = new RewardValue(100.0);
        assertEquals(28571.43, rewardValue.getMilesValue(), 0.01);
    }

    @Test
    public void testMilesToCashConstructor() {
        // Test the constructor that takes miles value and converts it to cash
        RewardValue rewardValue = new RewardValue(5000);
        assertEquals(17.5, rewardValue.getCashValue(), 0.01);
    }

    @Test
    public void testCashToMilesConversion() {
        // Test the conversion from cash to miles
        RewardValue rewardValue = new RewardValue(200.0);
        double expectedMiles = 200.0 / 0.0035;
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.01);
    }

    @Test
    public void testMilesToCashConversion() {
        // Test the conversion from miles to cash
        RewardValue rewardValue = new RewardValue(10000);
        double expectedCash = 10000 * 0.0035;
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.01);
    }
}