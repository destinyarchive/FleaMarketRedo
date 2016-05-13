class Item{
  private String itemName;
  private double itemPrice;
  private int quantity;
  public Item(String name, double price, int quant){
    itemName = name;
    itemPrice = price;
    quantity = quant;
  }
  public String getItemName(){return itemName;}
  public double getItemPrice(){return itemPrice;}
  public int getItemQuantity(){return quantity;}
  public String toString(){return (itemName + "  -  " + quantity + "  -  $" + (itemPrice*quantity));}
}
