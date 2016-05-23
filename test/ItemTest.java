import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ItemTest {

  @Test
  public void addsTax() {
    Item subject = new Item("1", 0.49, 10);
    assertEquals(subject.addTax(10.0, 0.5), 15.0, 0.00001);
  }

  @Test
  public void hasVars(){
    Item subject = new Item("1", .25, 2);
    assertEquals(subject.getBoothNumber(), "1");
    assertEquals(subject.getItemPrice(), 0.25, 0.00001);
    assertEquals(subject.getItemQuantity(), 2);
    assertEquals(subject.getItemTaxedPrice(), .25*1.06, 0.00001);
  }

  @Test
  public void itemToString(){
    Item subject = new Item("1", .25, 2);
    assertEquals(subject.toString(), "1  -  2  -  $0.25");
  }
}
