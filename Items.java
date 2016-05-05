public class Item{
  public List<Item> itemList;
  public Items(String name, double price){
    private String itemName = name;
    private double itemPrice = price;
  }
  public String getItemName(){
    return itemName;
  }
  public double getItemPrice(){
    return itemPrice;
  }
  public String toString(){
    return (itemName + "  -  $" + itemPrice);
  }
}
