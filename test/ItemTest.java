import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ItemTest {

  @Test
  public void addsTax() {
    Item subject = new Item("Banana", 0.49, 10);
    assertEquals(subject.addTax(10.0, 0.5), 15.0, 0.00001);
  }
}
