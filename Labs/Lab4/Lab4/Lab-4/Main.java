import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      System.out.println(System.getProperty("user.dir"));
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      System.out.println("\n\nBubble sort results ----------------------------------------------");
      long bubbleStart = System.nanoTime();
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      long bubbleEnd = System.nanoTime();
      System.out.println("Bubble sort time: " + (bubbleEnd - bubbleStart) + " ns");
      Lab4.outputList(bubbleSortedList);

      System.out.println("\n\nInsertion sort results -------------------------------------------");
      long insertionStart = System.nanoTime();
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);
      long insertionEnd = System.nanoTime();
      System.out.println("Insertion sort time: " + (insertionEnd - insertionStart) + " ns");
      Lab4.outputList(insertionSortedList);
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here
    ArrayList<Integer> list = new ArrayList<>(integerList);
    for (int i = 1; i < list.size(); i++) {
      int currentValue = list.get(i);

      int j = i - 1;
      while(j >= 0 && list.get(j) > currentValue) {
        list.set(j + 1, list.get(j));
        j--;
      }
      list.set(j + 1, currentValue);
    }
    return list;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here
    ArrayList<Integer> list = new ArrayList<>(integerList);
    boolean swapped = true; 

    while(swapped) {
      swapped = false; 
      for (int i = 0; i < list.size() - 1; i++) {
        if (list.get(i) > list.get(i + 1)) {
          swapped = true; 
          int temp = list.get(i);
          list.set(i, list.get(i + 1));
          list.set(i + 1, temp);

        }
      }
    }

    return list;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
}