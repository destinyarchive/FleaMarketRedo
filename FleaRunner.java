import java.util.*;
class FleaRunner{
  public static void main(String[] args){
    String dayCont = "Y";
    FleaMarket myMarket = new FleaMarket();
    while ((dayCont.toUpperCase()).equals("Y")){
      myMarket.order();
      Scanner user = new Scanner(System.in);
      System.out.println("\nANOTHER ORDER? (ANSWER Y OR N)\n");
      dayCont = user.nextLine();
    }
    System.out.println(myMarket.daysOrders());
  }
}
