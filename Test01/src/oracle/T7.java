package oracle;


public class T7 {
   public enum Days { SUN, MON, TUE, WED };
   public static void main(String[] args) {
    for (Days d : Days.values())
      ;
    Days [] d = Days.values();
    System.out.println(d[3]);
  }
}