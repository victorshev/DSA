//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Victor Shevchenko
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    // Lab1 class
    Lab1 lab = new Lab1();

    // Array
    int[] numbers = {5, 9, 3, 12, 7, 3, 11, 5};

    // Outputting array in order using while loop
    int ind = 0; 
    while(ind < numbers.length) {
      System.out.println("Value of " + ind + " is " + numbers[ind]);
      ind++;
    }

    // Outputting array in reverse using a for loop 
    for(int i = numbers.length - 1; i >= 0; i--) {
      System.out.println("Value of " + i + " is " + numbers[i]);
    }

    // Outputting first and last elements of the array
    System.out.println("First # in array is " +numbers[0]);
    System.out.println("Last # in array is " + numbers[7]);

    // Calling methods created in Lab1 class
    System.out.println(lab.increment(1));
    System.out.println(lab.max(5, 10));
    System.out.println(lab.min(5, 10));
    System.out.println(lab.sum(numbers));    
    System.out.println(lab.average(numbers));
    System.out.println(lab.max(numbers));
    System.out.println(lab.min(numbers));
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b) {
    return (a > b) ? a : b;
  }

  public int min(int a, int b) {
    return (a < b) ? a : b;
  }

  public int sum(int[] nums) {
    int total = 0; 
    for (int n : nums) {
      total += n;
    }
    return total;
  } 

  public double average(int[] nums) {
    int total = 0;
    for (int n : nums) {
      total += n;
    }
    return (double) total / nums.length;
  }

  public int max(int[] nums) {
    int max = nums[0];
    for (int n : nums) {
      if (n > max) {
        max = n;
      }
    }
    return max;
  }
  public int min(int[] nums) {
    int min = nums[0];
    for (int n : nums) {
      if (n < min) {
        min = n;
      }
    }
    return min;
  }
}
  