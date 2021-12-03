package com.nilesh.ds.karumanchi.graph;

import java.sql.SQLOutput;

 class GraphAdjacencyMatrix {
    public boolean adjMatrix[][];
    public int vertexCount;

    public GraphAdjacencyMatrix(int vertexCount){
        this.vertexCount = vertexCount;
        this.adjMatrix = new boolean[vertexCount][vertexCount];
    }

    public void addEdge(int i, int j){
        if(i >= 0 && i < vertexCount && j >= 0 && j < vertexCount){
            adjMatrix[i][j] = true;
            adjMatrix[j][i] = true;
        }
    }

    public void removeEdge(int i, int j){
        if(i >= 0 && i < vertexCount && j >= 0 && j < vertexCount){
            adjMatrix[i][j] = false;
            adjMatrix[i][j] = false;
        }
    }

    public boolean isEdge(int i, int j){
        if(i >= 0 && i < vertexCount && j >= 0 && j < vertexCount){
            return adjMatrix[i][j];
        }
        return false;
    }
}

// 0-----1------
// |     |     |
// |     |     |
// 3-----2-----4
public class AdjacencyMatrix {
    public static void main() {
        GraphAdjacencyMatrix adjMatrix = new GraphAdjacencyMatrix(5);

        adjMatrix.addEdge(0,1);
        adjMatrix.addEdge(0,3);
        adjMatrix.addEdge(3,2);
        adjMatrix.addEdge(2,4);
        adjMatrix.addEdge(1,2);
        adjMatrix.addEdge(1,4);

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println("IsEdge between: " + i + "," + j + ":" + adjMatrix.isEdge(i,j));
            }
        }
    }
}
