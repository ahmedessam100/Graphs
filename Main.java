package com.company;
import java.util.Scanner;
import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        int graph4[][] = new int[][] {{0, 4, 0, 1, 2,0},
                {4, 0, 8, 0, 0, 0},
                {0, 8, 0, 0, 4, 10},
                {1, 0, 0, 0, 5, 0},
                {2, 0, 4, 5, 0, 7},
                {0, 0, 10, 0, 7, 0}
        };
        int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0,5},
                {4, 0, 8, 0, 0, 0, 0, 11, 0,2},
                {0, 8, 0, 7, 0, 4, 0, 0, 2,0},
                {0, 0, 7, 0, 9, 14, 0, 0, 0,9},
                {0, 0, 0, 9, 0, 10, 0, 0, 0,13},
                {0, 0, 4, 14, 10, 0, 2, 0, 0,3},
                {0, 0, 0, 0, 0, 2, 0, 1, 6,5},
                {8, 11, 0, 0, 0, 0, 1, 0, 7,7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0,0},
                {5, 2, 0, 9, 13, 3, 5, 7, 0, 0}
        };
        int graph3[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        int graph2[][] = new int[][] {{0, 4, 2, 0, 0,0,0},
                {0, 0, 3, 2, 3,0,6},
                {0, 1, 0, 4, 5,8,0},
                {0, 0, 0, 0, 0,0,0},
                {0, 0, 0, 1, 0,0,0},
                {0,0, 0, 0, 0, 0,0},
                {0,0, 0, 0, 0, 0, 0}
        };
        Dijkstra_algo dijkstra = new Dijkstra_algo();
        Prim prim = new Prim();
        while (true) {
            System.out.println("\n*************Enter Your Adjacency matrix graph**************\n");
           Scanner input = new Scanner(System.in);
            System.out.println("Enter number of nodes : ");
            int nodes = input.nextInt();
            int rows = nodes;
            int columns = nodes;
            int adjacency_matrix[][] = new int[rows][columns];
            for (int i = 0; i < adjacency_matrix.length; i++) {
                System.out.printf("Enter %d integers for row %d/%d (delimeted by spaces): \n",
                        columns, i + 1, rows);
                for (int j = 0; j < adjacency_matrix[i].length; j++)
                    adjacency_matrix[i][j] = input.nextInt();
            }
            System.out.println("Enter Your choice : \n(1)MST prim's algorithm\n(2)Shortest path Dijkstra algorithm\n(3)Termninate program");
            int choice = input.nextInt();
            switch (choice){
                case 1:
                        prim.prim_algo(adjacency_matrix);
                        break;
                case 2:
                        System.out.println("You choose dijkstra shortest path algorithm\nEnter Your start node : ");
                        int start = input.nextInt();
                        dijkstra.dijkstra_algo(adjacency_matrix,start);
                        break;
                case 3:
                        exit(0);
            }
        }
    }
}
