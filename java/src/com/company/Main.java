package com.company;

public class Main {

    public static void main(String[] args) {
        B_depthFirstSearch();
        C_breadthFirstSearch();
        D_allPaths();
        //graph.printAdjacencyList();
    }

    public static void B_depthFirstSearch() {
        System.out.println("B. Depth First search");
        Graph g = Graph.makeDFSTestGraph();
        g.dfs(g.start);
    }

    public static void C_breadthFirstSearch() {
        System.out.println("C. Bread First search");
        Graph g = Graph.makeBFSTestGraph();
        g.bfs(g.start, g.goal);
    }

    public static void D_allPaths() {
        System.out.println("D. All paths from SFO to MIAMI");
        Graph g = Graph.makeAllPathsTestGraph();
        g.printAllPathsFromTo(g.start, g.goal);
    }
}
