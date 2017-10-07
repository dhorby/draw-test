package view;

import java.util.Arrays;

public class CanvasBorder {

    public static Character[][] populateTopBorder(Character[][] canvasArray, Character charVal)  {
        return populateRow(canvasArray, charVal, 0);
    };

    public static Character[][] populateBottomBorder(Character[][] canvasArray, Character charVal)  {
        return populateRow(canvasArray, charVal, canvasArray[0].length - 1);
    };

    private static Character[][] populateRow(Character[][] canvasArray, Character charVal, int row) {
        for (int x=0; x < canvasArray.length; x++) {
            canvasArray[x][row] = charVal;
        }
        return canvasArray;
    }

    public static Character[][] populateRightColumn(Character[][] canvasArray, Character charVal)  {
        return populateColumn(canvasArray, charVal, canvasArray.length - 1);
    };

    public static Character[][] populateLeftColumn(Character[][] canvasArray, Character charVal)  {
        return populateColumn(canvasArray, charVal, 0);
    };

    private static Character[][] populateColumn(Character[][] canvasArray, Character charVal, int column) {
        for (int y = 0; y < canvasArray[0].length; y++) {
            canvasArray[column][y] = charVal;
        }
        return canvasArray;
    }


    public static void resetArray(Character[][] canvasArray, Character charVal) {
        for (int x=0; x<canvasArray.length -1; x++)
        Arrays.fill(canvasArray[x], charVal);
    }


}
