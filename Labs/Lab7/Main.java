
import java.util.List;

class Main {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
    String[] vertices = {
      "Liberal Arts",                  
      "Student Services",             
      "Health Careers & Sciences",     
      "Health Technologies Center",    
      "Recreation Center",             
      "Technology Learning Center",    
      "Business & Technology",         
      "Theatre" 
    };

    // 2-Define Edges
    int[][] edges = {

    // Had trouble finding exact edges on campus map. Did my best to make logical connections

      {0, 7}, {7, 0},   // Liberal Arts -> Theatre

      {0, 6}, {6, 0},   // Liberal Arts -> Business & Technology
        {6, 5}, {5, 6},   // Business & Technology -> Technology Learning Center
          {5, 4}, {4, 5},   // Technology Learning Center -> Recreation Center

      {0, 1}, {1, 0},   // Liberal Arts -> Student Services
        {1, 2}, {2, 1},   // Student Services > Health Careers & Sciences
        {1, 3}, {3, 1}    // Student Services -> Health Technologies Center

    };

    // 3. Create the graph (name "graph") using the vertices and edges
    UnweightedGraph<String> graph = new UnweightedGraph<>(vertices, edges);

    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business & Technology" building
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(6);

    // 5. Retrieve and print the search order of the DFS traversal
    System.out.println("DFS Search Order:");
    List<Integer> searchOrder = dfs.getSearchOrder(); 

    for (int i = 0; i < searchOrder.size(); i++) {
      int vertexIndex = searchOrder.get(i);
      System.out.println("The vertex of the DFS traversal: " + vertexIndex); 
    }

    // 6. Print the parent-child relationships for each vertex during the DFS traversal
    System.out.println("\nParent-Child Relationships in DFS Tree:");

    for (int i = 0; i < graph.getSize(); i++) {
      int parent = dfs.getParent(i);

      if (parent == -1) {
        System.out.println(i + " is the root of the DFS tree.");
      } else {
        System.out.println(parent + " -> " + i);
      }
    }

    // 7. Call the printPath method (assuming this method exists in the UnweightedGraph class)
    System.out.println("\nPaths:");

    dfs.printPath(3); // Health Technologies Center
    System.out.println();

    dfs.printPath(1); // Student Services
    System.out.println();

    dfs.printPath(4); // Recreation Center
    System.out.println();

     // 8. Call printTree() to print the entire DFS tree (assuming this method exists in the UnweightedGraph class)
    System.out.println("\nDFS Tree:");
    dfs.printTree();
  }
}