import java.util.*;
class FleaMarket{
  public List<Item> orderList;
  private List<Item> dayOrderList;
  private double orderTotal;
  private double dayOrderSum;
  private double orderTotalNet;

  public FleaMarket(){//initializes ArrayLists orderList and dayOrderList
    orderList = new ArrayList<Item>();
    dayOrderList = new ArrayList<Item>();
  }

  public void clearList(){//clears orderList into dayOrderList and sets orderTotal to 0
    System.out.println(receipt());
    dayOrderSum += orderTotal;
    while (orderList.size() > 0){
      dayOrderList.add(orderList.remove(0));
    }
    orderTotal = 0;
  }

  public void order(){//loops over itemPurchase and outputs a call to receipt.
    boolean cont = true;
    while (cont){
      itemPurchase();
      cont = InputOutput.getCont(System.in, "ANOTHER ITEM?");
    }
    clearList();
  }

  private String receipt(){//creates and returns a receipt
    String result = "";
    for (int c = 0; c < orderList.size(); c++){
      Item temp = orderList.get(c);
      result += (temp.toString());
      result += "\n";
    }
    result+=("                             Order Total: $" + orderTotal);
    return result;
  }

  public void itemPurchase(){//creates a new item in orderList and adds to orderTotal and orderTotalNet
    String booth = InputOutput.getBooth(System.in);
    double price = InputOutput.getPrice(System.in);
    int quant = InputOutput.getQuant(System.in);
    orderList.add(new Item(booth, price, quant));
    Item item = orderList.get(orderList.size() - 1);
    orderTotal += (item.getItemTaxedPrice()*quant);
    orderTotalNet += (price * quant);
  }

  public String daysOrders(){//printout for end of day
    String result = "";
    double totalSumItems = 0.0;
    for (int x = 0; x < dayOrderList.size(); x++){
      result += (dayOrderList.get(x)).toString() + "\n";
    }
    result += "                                Total before tax  - $" + orderTotalNet;
    result += ("\n                                   Toatal tax is - $" + (dayOrderSum - orderTotalNet));
    result += ("\n                                   Total Sum is  - $" + dayOrderSum);
    return result;
  }
}
