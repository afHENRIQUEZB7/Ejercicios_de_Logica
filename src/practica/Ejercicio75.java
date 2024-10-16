/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Arrays;
import java.util.Scanner;

enum Movement {
    DOWN,
    RIGHT,
    LEFT,
    ROTATE
}

public class Ejercicio75 {

    public static void main(String[] args) {
        String[][] screen = {
            {"🔳", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲"},
            {"🔳", "🔳", "🔳", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲"},
            {"🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲"},
            {"🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲"},
            {"🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲"},
            {"🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲"},
            {"🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲"},
            {"🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲"},
            {"🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲"},
            {"🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲", "🔲"}
        };

        printScreen(screen);

        int rotation = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("esc")) {
                break;
            }

            Movement movement = null;
            switch (input) {
                case "down":
                    movement = Movement.DOWN;
                    break;
                case "right":
                    movement = Movement.RIGHT;
                    break;
                case "left":
                    movement = Movement.LEFT;
                    break;
                case "space":
                    movement = Movement.ROTATE;
                    break;
                default:
                    System.out.println("Invalid input");
                    continue;
            }

            Object[] result = movePiece(screen, movement, rotation);
            screen = (String[][]) result[0];
            rotation = (int) result[1];
        }

        scanner.close();
    }

    private static Object[] movePiece(String[][] screen, Movement movement, int rotation) {
        String[][] newScreen = new String[10][10];
        for (String[] row : newScreen) {
            Arrays.fill(row, "🔲");
        }

        int[][][] rotations = {
            {{1, 1}, {0, 0}, {-2, 0}, {-1, -1}},
            {{0, 1}, {-1, 0}, {0, -1}, {1, -2}},
            {{0, 2}, {1, 1}, {-1, 1}, {-2, 0}},
            {{0, 1}, {1, 0}, {2, -1}, {1, -2}}
        };

        int newRotation = rotation;
        if (movement == Movement.ROTATE) {
            newRotation = (rotation == 3) ? 0 : rotation + 1;
        }

        int rotationItem = 0;
        for (int rowIndex = 0; rowIndex < screen.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < screen[rowIndex].length; columnIndex++) {
                if (screen[rowIndex][columnIndex].equals("🔳")) {
                    int newRowIdx = rowIndex;
                    int newColIdx = columnIndex;

                    switch (movement) {
                        case DOWN:
                            newRowIdx = rowIndex + 1;
                            break;
                        case RIGHT:
                            newColIdx = columnIndex + 1;
                            break;
                        case LEFT:
                            newColIdx = columnIndex - 1;
                            break;
                        case ROTATE:
                            newRowIdx = rowIndex + rotations[newRotation][rotationItem][0];
                            newColIdx = columnIndex + rotations[newRotation][rotationItem][1];
                            rotationItem++;
                            break;
                    }

                    if (newRowIdx > 9 || newColIdx > 9 || newColIdx < 0) {
                        System.out.println("\nNo se puede realizar el movimiento");
                        return new Object[]{screen, rotation};
                    } else {
                        newScreen[newRowIdx][newColIdx] = "🔳";
                    }
                }
            }
        }

        printScreen(newScreen);
        return new Object[]{newScreen, newRotation};
    }

    private static void printScreen(String[][] screen) {
        System.out.println("\nPantalla Tetris:\n");
        for (String[] row : screen) {
            for (String cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

}
