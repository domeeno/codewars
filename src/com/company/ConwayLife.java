package com.company;

public class ConwayLife {
    public static int[][] getGeneration(int[][] cells, int generations) {
        //any live cell with fewer than two live neighbours dies because of underpopulation
        //any live cell with more than three live neighbours dies because of overpopulation
        //any live cell with two or three live neighbours lives to the next generation
        //any dead cell with exactly three neighbours becomes a live cell
        int neighbours = 0;
        int step = 1;

        while(step < generations) {
            try {
                for (int row = 0; row <= cells.length; row++) {
                    for (int column = 0; column < cells[row].length; column++) {
                        neighbours = getNeighboursCount(cells, row, column);
                        if (neighbours < 2 || neighbours > 3) {
                            cells[row][column] = 0;
                        }
                        if (neighbours == 3) {
                            cells[row][column] = 1;
                        }
                        neighbours = 0;
                    }
                }
            } catch (Exception e) {
                System.out.println("Something went terribly wrong, Cowboy");
            }
            step++;
        }

        System.out.println(cells);
        return cells;
    }

    private static int getNeighboursCount(int[][] cells, int row, int column){
        int neighboursCount = 0;
        for(int i = row - 1; i <= (row + 1); row++ ){
            for(int j = column - 1; i <= (column + 1); column++ ){
                if(i >= 0 && j >= 0 && i < cells.length && j < cells[i].length) {
                    if (!(cells[i][j] == 0)) {
                        neighboursCount++;
                    }
                }
            }
        }

        return neighboursCount;
    }
}
