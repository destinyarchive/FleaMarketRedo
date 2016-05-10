import java.util.*;
class FleaMarket{
  public List<Item> itemList;
  private List<Item> itemSum;
  private double orderTotal;
  public void itemPurchase(){
    String name = getName();
    double price = getPrice();
    int quant = getQuant();
    itemList.add(new Item(name, price, quant));
    orderTotal += (price*quant);
  }
  public String getName(){
    Scanner userIn = new Scanner(System.in);
    System.out.println("ENTER ITEM NAME");
    String userName = userIn.nextLine();
    return userName;
  }
  public double getPrice(){
    Scanner userIn = new Scanner(System.in);
    System.out.println("ENTER ITEM PRICE");
    double userPrice = (double)(userIn.nextInt());
    return userPrice;
  }
  public int getQuant(){
    Scanner userIn = new Scanner(System.in);
    System.out.println("ENTER ITEM QUANTITY");
    int userQuant = userIn.nextInt();
    return userQuant;
  }
  public void clearList(){
    while (itemList.size() > 0){
      itemSum.add(itemList.remove(0));
    }
  }
  public void order(){
    String cont = "Y";
    while ((cont.toUpperCase()).equals("Y")){
      itemPurchase();
      Scanner userIn = new Scanner(System.in);
      System.out.println("CONTINUE? (please answer Y or N)");
      cont = userIn.nextLine();
    }
    for (int c = 0; c < itemList.size(); c++){
      Item temp = itemList.get(c);
      temp.toString();
    }
    System.out.print("                             Order Total: $" + orderTotal);
    clearList();
  }
}
