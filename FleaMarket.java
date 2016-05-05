public class FleaMarket{
  private double orderTotal;
  public void itemPurchase(){
    String name = getName();
    double price = getPrice();
    itemList.add(new Item(name, price);
    orderTotal += price;
  }
  public String getName(){
    private Scanner userIn = new Scanner(System.in);
    System.out.println("ENTER ITEM NAME");
    String userName = userIn.nextLine();
    return userName;
  }
  public double getPrice(){
    private Scanner userIn = new Scanner(System.in);
    System.out.println("ENTER ITEM PRICE");
    double userPrice = userIn.nextInt();
    return userPrice;
  }
}
