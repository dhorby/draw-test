package view;

import java.util.Arrays;

public class CanvasBorder {

    private static int xLimit(Character[][] canvasArray) {
        return canvasArray.length - 1;
    }

    private static int yLimit(Character[][] canvasArray) {
        return canvasArray[0].length - 1;
    }

    public static Character[][] populateTopBorder(Character[][] canvasArray, Character charVal)  {
        return populateRow(canvasArray, charVal, 0, 0, xLimit(canvasArray));
    };

    public static Character[][] populateBottomBorder(Character[][] canvasArray, Character charVal)  {
        return populateRow(canvasArray, charVal, yLimit(canvasArray), 0, xLimit(canvasArray));
    };


    public static Character[][] populateRightColumn(Character[][] canvasArray, Character charVal)  {
        return populateColumn(canvasArray, charVal, xLimit(canvasArray), 0, yLimit(canvasArray));
    };

    public static Character[][] populateLeftColumn(Character[][] canvasArray, Character charVal)  {
        return populateColumn(canvasArray, charVal, 0, 0, yLimit(canvasArray));
    };

    public static Character[][] populateColumn(Character[][] canvasArray, Character charVal, int column, int from, int to) {
        for (int y = from; y <= to; y++) {
            canvasArray[column][y] = charVal;
        }
        return canvasArray;
    }

    public static Character[][] populateRow(Character[][] canvasArray, Character charVal, int row, int from, int to) {
        for (int x=from; x < to; x++) {
            canvasArray[x][row] = charVal;
        }
        return canvasArray;
    }

    public static void resetArray(Character[][] canvasArray, Character charVal) {
        for (int x=0; x< xLimit(canvasArray); x++)
        Arrays.fill(canvasArray[x], charVal);
    }


}
