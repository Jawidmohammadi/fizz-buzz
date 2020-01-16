package edu.cnm.deepdive;

public class FizzBuzz {

  private static final int DEFAULT_ROOF = 100;

  public static void main(String[] args) {

    int roof = ;
  for (int i = 0; i <= roof; ++1){
    System.out.println(toString(i));
  }
  }

  public static String toString(int num) {
    String result;

    if (num % 3 == 0 && num % 5 == 0) {
      result = "FizzBuzz";
    } else if (num % 5 == 0) {
      result = "Buzz";
    } else if (num % 3 == 0) {
      result = "Fizz";
    } else {
      result = String.valueOf(num);
    }

    return result;

  }


}
