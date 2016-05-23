import java.util.*;
import java.io.*;
class InputOutput{
  public static String getBooth(InputStream in){//collects user data
    Scanner userIn = new Scanner(in);
    System.out.println("ENTER BOOTH NUMBER");
    String userBooth = userIn.nextLine();
    return userBooth;
  }
  public static double getPrice(InputStream in){//collects user data
    Scanner userIn = new Scanner(in);
    System.out.println("ENTER ITEM PRICE");
    double userPrice = Double.parseDouble(userIn.nextLine());
    return userPrice;
  }
  public static int getQuant(InputStream in){//collects user data
    Scanner userIn = new Scanner(in);
    System.out.println("ENTER ITEM QUANTITY");
    int userQuant = Integer.parseInt(userIn.nextLine());
    return userQuant;
  }

  public static boolean getCont(InputStream in, String message){
    Scanner userIn = new Scanner(in);
    System.out.println(message);
    String userCont = userIn.nextLine();
    if(userCont.toUpperCase().equals("Y")){
      return true;
    }
    else{
      return false;
    }
  }
}
