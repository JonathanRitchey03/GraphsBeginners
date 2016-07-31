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
}
