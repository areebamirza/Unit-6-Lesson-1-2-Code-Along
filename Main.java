import java.util.*;

class Main {
  public static void main(String[] args) {
    
    /*
    int[] nums = new int[6];
    nums[0] = 5;
    nums[1] = 10;
    nums[2] = 15;
    nums[3] = 20;
    nums[4] = 25;
    nums[5] = 30;

    for(int i = 0; i < nums.length; i++)
    {
      System.out.println("nums[" + i + "] = " + nums[i]);
    }

    for(int i = nums.length - 1; i >= 0; i--)
    {
      System.out.println("nums[" + i + "] = " + nums[i]);
    }

    //use array elements in a calculation
    int sum = nums[0] + nums[1];
    System.out.println("sum = " + sum);
    nums[5] = nums[5] * 2;
    System.out.println("nums[5] = " + nums[5]);

    for(int i = 0; i < nums.length; i++)
    {
      nums[i] = nums[i]/5;
      System.out.println("nums[" + i + "] = " + nums[i]);
    }

    int[] nums2 = {5, 10, 15, 20, 25, 30};

    for(int i = 0; i < nums2.length; i++)
    {
      nums2[i] = nums2[i] + 100;
      System.out.println("nums2[" + i + "] = " + nums2[i]);
    }
    */


    /*
    Scanner scan = new Scanner(System.in);

    String[] candy = new String[5];
    int index = 0;
    while(index < candy.length)
    {
      System.out.println("Enter a candy:");
      candy[index] = scan.nextLine();
      System.out.println("candy[" + index + "] = " + candy[index]);
      System.out.println();
      index++;
    }
    */

    String[] words2 = {"apple", "banana", "peach", "cherries", "blueberries"};

    for(int i = 0; i < words2.length; i++)
    {
      String first = words2[i].substring(0, 1);
      String last = words2[i].substring(words2[i].length() - 1);
      System.out.println("Index Value " + i + ": " + words2[i] + " " + first + " " + last);
    }

  }
}