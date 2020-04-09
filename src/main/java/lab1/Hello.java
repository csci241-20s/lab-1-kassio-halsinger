package lab1;

public class Hello {
  public static void main(String[] args) {
    System.out.print("Hello, ");
    for (String arg: args) {
      System.out.println(arg+"!");
    }
  }
}
