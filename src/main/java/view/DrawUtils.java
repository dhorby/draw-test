package view;

import lombok.Getter;
import lombok.Setter;
import model.Span;

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
        return drawTopBorder.andThen(drawBottomBorder.andThen(drawLeftBorder.andThen(drawRightBorder)));
    }

    public Function<Character[][], Character[][]> drawTopBorder = (canvasArray) -> {
        return populateRow(canvasArray, 0, new Span(0, xLimit(canvasArray)));
    };

    public Function<Character[][], Character[][]> drawBottomBorder = (canvasArray) -> {
        return populateRow(canvasArray, yLimit(canvasArray), new Span(0, xLimit(canvasArray)));
    };

    public Function<Character[][], Character[][]> drawLeftBorder = (canvasArray) -> {
        return populateColumn(canvasArray, 0, new Span(0, yLimit(canvasArray)));
    };

    public Function<Character[][], Character[][]> drawRightBorder = (canvasArray) -> {
        return populateColumn(canvasArray, xLimit(canvasArray), new Span(0, yLimit(canvasArray)));
    };

    private static int xLimit(Character[][] canvasArray) {
        return canvasArray.length - 1;
    }

    private static int yLimit(Character[][] canvasArray) {
        return canvasArray[0].length - 1;
    }

//    public  Function<Character[][], Character[][]> populateColumn(Character[][] canvasArray, Character charVal, int column, int from, int to) {
//        for (int y = from; y <= to; y++) {
//            canvasArray[column][y] = charVal;
//        }
//        return canvasArray;
//    }



    public  Character[][] populateColumn(Character[][] canvasArray, int column, Span span) {
        for (int y = span.getFrom(); y <= span.getTo(); y++) {
            canvasArray[column][y] = charVal;
        }
        return canvasArray;
    }


    public  Character[][] populateRow(Character[][] canvasArray, int row, Span span) {
        for (int x=span.getFrom(); x < span.getTo(); x++) {
            canvasArray[x][row] = charVal;
        }
        return canvasArray;
    }

    public static void resetArray(Character[][] canvasArray, Character charVal) {
        for (int x=0; x< xLimit(canvasArray); x++)
        Arrays.fill(canvasArray[x], charVal);
    }


}
