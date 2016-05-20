import java.util.*;
class FleaRunner{
  public static void main(String[] args){
    String dayCont = "Y";
    FleaMarket myMarket = new FleaMarket();
    while ((dayCont.toUpperCase()).equals("Y")){
      myMarket.order();//runs one order
      Scanner user = new Scanner(System.in);
      System.out.println("\nANOTHER ORDER? (ANSWER Y OR N)\n");//allows for more orders throughout the day
      dayCont = user.nextLine();
    }
    System.out.println(myMarket.daysOrders());//outputs what was sold throughout the day
  }
}
