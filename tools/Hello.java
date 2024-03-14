package tools;

import java.util.Arrays;
import java.util.List;

public class Hello {

  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(4, 5, 7, 2);
     
    nums
      .stream()
      .map(n -> n *2)
      .filter(n -> n != 8)
      .sorted()
      .forEach(System.out::println);
  }
}
