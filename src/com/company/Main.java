package com.company;

public class Main {
    public static void main(String[] args) {
        int[][][] gliders = {
                {{1,0,0},
                {0,1,1},
                {1,1,0}},
                {{0,1,0},
                {0,0,1},
                {1,1,1}}
        };

        ConwayLife.getGeneration(gliders[0], 3);
    }
}
