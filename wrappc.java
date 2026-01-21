public class wrappc {
    //parshInt is static
    //valuof is static
    //parseDouble is static



    public static void main(String[] args) {
      int x= Integer.parseInt("123");
      Integer i1=Integer.valueOf("101010",2);
      int z=i1.intValue();
      Double x1=Double.valueOf("56");
      double y=x1.doubleValue();
      System.out.println(x);
      System.out.println(y);
      System.out.println(z);
        
    }
}