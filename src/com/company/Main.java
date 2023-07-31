package com.company;

public class Main {
    public static void main(String[] args) {
        MyDirectedGraph<Integer> graph = new MyDirectedGraph<>();

        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 0);

        System.out.println("Graph:");
        graph.printGraph();

        System.out.println("Has Edge (0 -> 2): " + graph.hasEdge(0, 2));
        System.out.println("Has Edge (2 -> 1): " + graph.hasEdge(2, 1));

        System.out.println("Neighbors of vertex 0: " + graph.getNeighbors(1));
        System.out.println("Neighbors of vertex 4: " + graph.getNeighbors(4));

        System.out.print("DFS starting from vertex 1: ");
        graph.DFS(1);
        System.out.println();

        System.out.print("BFS starting from vertex 1: ");
        graph.BFS(1);
        System.out.println();
    }
}
