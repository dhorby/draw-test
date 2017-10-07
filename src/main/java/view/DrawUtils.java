package view;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.function.Function;

@Getter
@Setter
public class DrawUtils {

    Character charVal;

    public DrawUtils(Character charVal) {
        this.charVal = charVal;
    }

    public Function<Character[][], Character[][]> drawFrame(Character[][] canvasArray) {
        return drawTopBorder.compose(drawBottomBorder.compose(drawLeftBorder.compose(drawRightBorder)));
    }

    public Function<Character[][], Character[][]> drawTopBorder = (canvasArray) -> {
        return populateRow(canvasArray, charVal, 0, 0, xLimit(canvasArray));
    };

    public Function<Character[][], Character[][]> drawBottomBorder = (canvasArray) -> {
        return populateRow(canvasArray, charVal, yLimit(canvasArray), 0, xLimit(canvasArray));
    };

    public Function<Character[][], Character[][]> drawLeftBorder = (canvasArray) -> {
        return populateColumn(canvasArray, charVal, 0, 0, yLimit(canvasArray));
    };

    public Function<Character[][], Character[][]> drawRightBorder = (canvasArray) -> {
        return populateColumn(canvasArray, charVal, xLimit(canvasArray), 0, yLimit(canvasArray));
    };

    private static int xLimit(Character[][] canvasArray) {
        return canvasArray.length - 1;
    }

    private static int yLimit(Character[][] canvasArray) {
        return canvasArray[0].length - 1;
    }


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
