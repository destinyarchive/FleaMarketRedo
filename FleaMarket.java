import java.util.*;
class FleaMarket{
  public List<Item> itemList;
  private List<Item> itemSum;
  private double orderTotal;

  public FleaMarket(){//initializes ArrayLists itemList and itemSum
    itemList = new ArrayList<Item>();
    itemSum = new ArrayList<Item>();
  }

  public void clearList(){//clears itemList and adds all contents to itemSum
    while (itemList.size() > 0){
      itemSum.add(itemList.remove(0));
    }
  }
  public void order(){//Runs one order
    String cont = "Y";
    while ((cont.toUpperCase()).equals("Y")){
      itemPurchase();
      Scanner userIn = new Scanner(System.in);
      System.out.println("CONTINUE? (please answer Y or N)");
      cont = userIn.nextLine();
    }

    //Prints out a receipt
    for (int c = 0; c < itemList.size(); c++){
      Item temp = itemList.get(c);
      System.out.println(temp.toString());
    }
    System.out.print("                             Order Total: $" + orderTotal);
    clearList();
  }

  public void itemPurchase(){//creates a new item in itemList and adds to orderTotal
    String name = getName();
    double price = getPrice();
    int quant = getQuant();
    itemList.add(new Item(name, price, quant));
    orderTotal += (price*quant);
  }

  public String daysOrders(){//printout for end of day
    String result = "";
    int totalSumItems = 0;
    for (int x = 0; x < itemSum.size(); x++){
      result += (itemSum.get(x)).getItemName() + " - $" + (itemSum.get(x)).getItemPrice() + "\n";
      totalSumItems += (itemSum.get(x)).getItemPrice();
    }
    result += "                                  Total Sum: $" + totalSumItems;
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
