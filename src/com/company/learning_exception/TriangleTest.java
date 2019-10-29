package com.company.learning_exception;

public class TriangleTest {
    private int[] side = new int[3];

    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.side[0] = 4;
        triangleTest.side[1] = 1;
        triangleTest.side[2] = 1;
        try {
            triangleTest.checkTriangle();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void checkTriangle() {
        for (int i = 0; i < this.side.length; i++) {
            if (this.side[i] <= 0)
                throw new IllegalArgumentException("Length of side larger than 0");
        }
        if (this.side[0] > (this.side[1] + this.side[2])
                || this.side[1] > (this.side[0] + this.side[2])
                || this.side[2] > (this.side[1] + this.side[0]))
            throw new IllegalArgumentException("Length of side smaller sum of two another side");
    }
}
