import java.util.HashMap;
import java.util.Map;

class Main {
  public static void main(String[] args) {
    // Use the instructions in Blackboard or instructions.md to complete Lab 6
    // Creating map called creditHours
    HashMap<String, Integer> creditHours = new HashMap<>();
   
    // Step 4: put() the course in credit hour pairs
    creditHours.put("IT-1025", 3);        creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);
  
    // Step 5: Check if the map contains keys
    System.out.println("Contains IT-1025: " + creditHours.containsKey("IT-1025"));
    System.out.println("Contains IT-2110: " + creditHours.containsKey("IT-2110"));

    //Print all key value pairs
    System.out.println("\nCourse credit hours:");
      for (Map.Entry<String, Integer> entry : creditHours.entrySet()) {
        System.out.println(entry.getKey() + " → " + entry.getValue());
      }
    
    //Remove courses 
    creditHours.remove("IT-2030"); 
    creditHours.remove("IT-1150");

    //Print values 
    System.out.println("\nCredit hour `1values:");
    for (Integer hours : creditHours.values()) {
      System.out.println(hours);
    }

  }
}