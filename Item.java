class Item{
  private String boothNumber;
  private double itemPrice;
  private double taxedPrice;
  private int quantity;

  public Item(String booth, double price, int quant){
    boothNumber = booth;
    itemPrice = price;
    quantity = quant;
    taxedPrice = addTax(price , .06);
  }

  public double addTax(double price, double rate){return price + (price*rate);}

  public String getBoothNumber(){return boothNumber;}
  public double getItemPrice(){return itemPrice;}
  public double getItemTaxedPrice(){return taxedPrice;}
  public int getItemQuantity(){return quantity;}

  public String toString(){return (boothNumber + "  -  " + quantity + "  -  $" + itemPrice);}
}
