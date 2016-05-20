import java.util.*;
class FleaMarket{
  public List<Item> orderList;
  private List<Item> dayOrderList;
  private double orderTotal;
  private double dayOrderSum;
  private double orderTotalNet;

  public FleaMarket(){//initializes ArrayLists itemList and itemSum
    orderList = new ArrayList<Item>();
    dayOrderList = new ArrayList<Item>();
  }

  public void clearList(){//clears itemList and adds all contents to itemSum
    while (orderList.size() > 0){
      dayOrderList.add(orderList.remove(0));
    }
    orderTotal = 0;
  }

  public void order(){//Runs one order
    String cont = "Y";
    while ((cont.toUpperCase()).equals("Y")){
      itemPurchase();
      Scanner userIn = new Scanner(System.in);
      System.out.println("CONTINUE? (please answer Y or N)");
      cont = userIn.nextLine();
    }
    dayOrderSum += orderTotal;
    clearList();
    System.out.println(receipt());
  }

  private String receipt(){
    //Prints out a receipt
    String result = "";
    for (int c = 0; c < orderList.size(); c++){
      Item temp = orderList.get(c);
      result += (temp.toString());
      result += "\n";
    }
    result+=("                             Order Total: $" + orderTotal);
    return result;
  }

  public void itemPurchase(){//creates a new item in itemList and adds to orderTotal
    String name = getName();
    double price = getPrice();
    int quant = getQuant();
    orderList.add(new Item(name, price, quant));
    Item item = orderList.get(orderList.size() - 1);
    orderTotal += (item.getItemTaxedPrice()*quant);
    orderTotalNet += (price * quant);
  }

  public String daysOrders(){//printout for end of day
    String result = "";
    double totalSumItems = 0.0;
    for (int x = 0; x < dayOrderList.size(); x++){
      result += (dayOrderList.get(x)).getItemName() + " - $" + (dayOrderList.get(x)).getItemPrice() + "\n";
    }
    result += "                                  Total Sum: $" + dayOrderSum;
    result += ("\n                                   Toatal tax is - $" + (dayOrderSum - orderTotalNet));
    return result;
  }

  public String getName(){//collects user data
    Scanner userIn = new Scanner(System.in);
    System.out.println("ENTER ITEM NAME");
    String userName = userIn.nextLine();
    return userName;
  }
  public double getPrice(){//collects user data
    Scanner userIn = new Scanner(System.in);
    System.out.println("ENTER ITEM PRICE");
    double userPrice = Double.parseDouble(userIn.nextLine());
    return userPrice;
  }
  public int getQuant(){//collects user data
    Scanner userIn = new Scanner(System.in);
    System.out.println("ENTER ITEM QUANTITY");
    int userQuant = Integer.parseInt(userIn.nextLine());
    return userQuant;
  }
}
