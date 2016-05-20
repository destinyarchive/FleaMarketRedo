class Item{
  private String itemName;
  private double itemPrice;
  private double taxedPrice;
  private int quantity;

  public Item(String name, double price, int quant){
    itemName = name;
    itemPrice = price;
    quantity = quant;
    taxedPrice = addTax(price , .06);
  }

  public double addTax(double price, double rate){return price + (price*rate);}

  public String getItemName(){return itemName;}
  public double getItemPrice(){return itemPrice;}
  public double getItemTaxedPrice(){return taxedPrice;}
  public int getItemQuantity(){return quantity;}

  public String toString(){return (itemName + "  -  " + quantity + "  -  $" + itemPrice);}
}
