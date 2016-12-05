package com.company;

/**
 * Created by jonathanritchey on 7/31/16.
 */
public class GraphMatrix {

    private int[][] mArray;
    private int mSize = 0;
    public GraphMatrix(int size) {
        this.mSize = size;
        mArray = new int[size][size];
    }
    public void setEdgeFromVertexToVertexWithWeight(int fromVertex, int toVertex, int weight) {
        if (fromVertex >= mSize || toVertex >= mSize ) {
            throw new IndexOutOfBoundsException("fromVertex and/or toVertex out of bounds");
        }
        mArray[fromVertex][toVertex] = weight;
    }
    public void printAdjacencyList() {
        for (int vertex = 0; vertex < mSize; vertex++ ) {
            System.out.print("vertex " + vertex + ": ");
            for ( int to = 0; to < mSize; to++ ) {
                if (mArray[vertex][to] > 0 ) {
                    System.out.print(" " + to + ",");
                }
            }
            System.out.println();
        }
    }
    GraphMatrix makeTestGraph() {
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
        return graph;
    }
}
