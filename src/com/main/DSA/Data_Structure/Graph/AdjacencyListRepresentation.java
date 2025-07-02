package com.main.DSA.Data_Structure.Graph;

import java.util.*;

public class AdjacencyListRepresentation {
    private Map<Integer, List<Integer>> adjList;

    // Constructor
    public AdjacencyListRepresentation() {
        adjList = new HashMap<>();
    }

    // Add an edge to the graph
    public void addEdge(int u, int v, boolean isDirected) {
        // Add edge from u to v
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.get(u).add(v);

        // If the graph is undirected, add an edge from v to u
        if (!isDirected) {
            adjList.putIfAbsent(v, new ArrayList<>());
            adjList.get(v).add(u);
        }
    }

    // Print the adjacency list
    public void printAdjList() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Integer neighbor : entry.getValue()) {
                System.out.print(neighbor + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter the number of edges: ");
        int m = sc.nextInt();

        AdjacencyListRepresentation graph = new AdjacencyListRepresentation();

        System.out.println("Enter the edges (u v):");
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            // Creating an undirected graph
            graph.addEdge(u, v, false);
        }

        // Print the graph
        graph.printAdjList();

        sc.close();
    }
}
