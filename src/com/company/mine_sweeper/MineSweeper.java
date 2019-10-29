package com.company.mine_sweeper;

import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        int width = 5;
        int height = 5;
        int percentMine = 20;
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Map 5x5");
            System.out.println("2. Map 10x10");
            System.out.println("3. Random map");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    width = 5;
                    height = 5;
                    percentMine = 20;
                    playGame(width, height, percentMine);
                    break;
                case 2:
                    width = 10;
                    height = 10;
                    percentMine = 20;
                    playGame(width, height, percentMine);
                    break;
                case 3:
                    System.out.println("Enter height of map: ");
                    height = scanner.nextInt();
                    System.out.println("Enter width of map: ");
                    width = scanner.nextInt();
                    System.out.println("Enter percent of mines: ");
                    percentMine = scanner.nextInt();
                    playGame(width, height, percentMine);
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }

    private static void playGame(int width, int height, int percentMine) {
        String[][] map = getMap(width, height, percentMine);
        final int MAP_HEIGHT = map.length;
        final int MAP_WIDTH = map[0].length;
        drawMap(map, MAP_HEIGHT, MAP_WIDTH);
        String[][] reportMap = getReportMap(map, MAP_HEIGHT, MAP_WIDTH);
        drawReportMap(MAP_HEIGHT, MAP_WIDTH, reportMap);
    }

    private static String[][] getMap(int width, int height, int percentMine) {
        String[][] map = new String[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int random = (int) (Math.random() * (100 / percentMine) + 1);
                if (random == 1) {
                    map[i][j] = "*";
                } else {
                    map[i][j] = ".";
                }
            }
        }
        return map;
    }

    private static void drawMap(String[][] map, int MAP_HEIGHT, int MAP_WIDTH) {
        for (int i = 0; i < MAP_HEIGHT; i++) {
            for (int j = 0; j < MAP_WIDTH; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    private static String[][] getReportMap(String[][] map, int MAP_HEIGHT, int MAP_WIDTH) {
        String[][] reportMap = new String[MAP_HEIGHT][MAP_WIDTH];
        for (int yPosition = 0; yPosition < MAP_HEIGHT; yPosition++) {
            for (int xPosition = 0; xPosition < MAP_WIDTH; xPosition++) {
                String currentCell = map[yPosition][xPosition];
                if (currentCell.equals("*")) {
                    reportMap[yPosition][xPosition] = "*";
                } else {
                    int mineAround = getMineAround(map, MAP_HEIGHT, MAP_WIDTH, yPosition, xPosition);
                    reportMap[yPosition][xPosition] = String.valueOf(mineAround);
                }
            }
        }
        return reportMap;
    }

    private static int getMineAround(String[][] map, int MAP_HEIGHT, int MAP_WIDTH, int yPosition, int xPosition) {
        int mineAround = 0;
        final int[][] NEIGHBOURS_CELL = {
                {yPosition, xPosition - 1}, {yPosition, xPosition + 1},
                {yPosition - 1, xPosition}, {yPosition + 1, xPosition},
                {yPosition - 1, xPosition - 1}, {yPosition + 1, xPosition + 1},
                {yPosition - 1, xPosition + 1}, {yPosition + 1, xPosition - 1}
        };
        for (int i = 0; i < NEIGHBOURS_CELL.length; i++) {
            int[] neighbourCell = NEIGHBOURS_CELL[i];
            int yPositionNeighbour = neighbourCell[0];
            int xPositionNeighbour = neighbourCell[1];
            boolean isOutOfWidth = xPositionNeighbour >= MAP_WIDTH || xPositionNeighbour < 0;
            boolean isOutOfHeight = yPositionNeighbour >= MAP_HEIGHT || yPositionNeighbour < 0;
            if (isOutOfWidth || isOutOfHeight) continue;
            boolean isMineNeighbour = map[yPositionNeighbour][xPositionNeighbour].equals("*");
            if (isMineNeighbour) mineAround++;
        }
        return mineAround;
    }

    private static void drawReportMap(int MAP_HEIGHT, int MAP_WIDTH, String[][] reportMap) {
        for (int yPosition = 0; yPosition < MAP_HEIGHT; yPosition++) {
            for (int xPosition = 0; xPosition < MAP_WIDTH; xPosition++) {
                String currentCell = reportMap[yPosition][xPosition];
                System.out.print(currentCell + "\t");
            }
            System.out.print("\n");
        }
    }
}
