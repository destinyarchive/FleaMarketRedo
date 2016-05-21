import java.util.*;
class FleaRunner{
  public static void main(String[] args){
    boolean dayCont = true;
    FleaMarket myMarket = new FleaMarket();
    while ((dayCont.toUpperCase()).equals("Y")){
      myMarket.order();//runs one order
      dayCont = InputOutput.getCont(System.in, "ANOTHER ORDER?")
    }
    System.out.println(myMarket.daysOrders());//outputs what was sold throughout the day
  }
}
