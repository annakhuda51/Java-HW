package com.groupqa1;

public class Main {
    public static void main(String[] args) {
        triangle1(5);
        System.out.println();
        triangle2(4);
        System.out.println();
        triangle3(4);
        System.out.println();
        triangle4(5);
        System.out.println();
        triangle5(5);
    }

    public static void triangle1(int centerLine) {
        int height = centerLine * 2;
        int i = 0;
        while (i < height) {
            int j = 0;
            while (j < centerLine) {
                if (j < i && height > i + j) {
                    System.out.print("*");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void triangle2(int side) {
        int i = 0;
        while (i < side) {
            int j = 0;
            while (j < side) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            i++;
            System.out.println();
        }
    }

    public static void triangle3(int side) {
        int i = 0;
        while (i < side) {
            int j = 0;
            while (j < side) {
                if (side <= i + j + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            i++;
            System.out.println();
        }
    }

    public static void triangle4(int centerLine) {
        int height = centerLine * 2;
        int i = 0;
        while (i < height) {
            int j = 0;
            while (j < centerLine) {
                if (centerLine < i + j + 1 && centerLine >= i - j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void triangle5(int height) {
        helperTriangle(height);
        helperTriangle(height);
    }

    public static void helperTriangle(int height) {
        int centerLine = height * 2;
        int i = 0;
        while (i < height) {
            int j = 0;
            while (j < centerLine) {
                if (height < i + j + 1 && height >= j - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

