class InputOutput{
  public static String getName(InputStream in){//collects user data
    Scanner userIn = new Scanner(in);
    System.out.println("ENTER ITEM NAME");
    String userName = userIn.nextLine();
    return userName;
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
    String userIn = userIn.nextLine();
    if(userIn.toUpperCase().equals("Y")){
      userCont = true;
    }
    else{
      userCont = false;
    }
    return userCont;
  }
}
