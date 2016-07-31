package com.company;

public class Main {

    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(5);
        graph.setEdgeFromVertexToVertexWithWeight(0,1,50);
        graph.setEdgeFromVertexToVertexWithWeight(0,3,30);
        graph.setEdgeFromVertexToVertexWithWeight(0,4,30);

        graph.setEdgeFromVertexToVertexWithWeight(2,2,10);
        graph.setEdgeFromVertexToVertexWithWeight(2,3,20);
        graph.setEdgeFromVertexToVertexWithWeight(2,4,90);

        graph.setEdgeFromVertexToVertexWithWeight(3,1,10);
        graph.setEdgeFromVertexToVertexWithWeight(3,4,20);

        graph.setEdgeFromVertexToVertexWithWeight(4,4,90);

        graph.printAdjacencyList();
    }
}
