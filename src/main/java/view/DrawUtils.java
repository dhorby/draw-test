package view;

import lombok.Getter;
import lombok.Setter;
import model.Span;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

@Getter
@Setter
public class DrawUtils {

    Character charVal;
//    Span span;

    public DrawUtils(Character charVal) {
        this.charVal = charVal;
    }

    public Function<Character[][], Character[][]> drawFrame() {
        return drawTopBorder.andThen(drawBottomBorder.andThen(drawLeftBorder.andThen(drawRightBorder)));
    }

    public Function<Character[][], Character[][]> drawCross(Character[][]canvasArray, Span spanX, Span spanY)   {
        return partialColumnFunction(populateColumnFunction, spanY).andThen(partialRowFunction(populateRowFunction, spanX));
    };

    public Function<Character[][], Character[][]> partialColumnFunction(BiFunction<Character[][], Span, Character[][]> func, Span span) {
        return (Character[][] canvasArray) -> populateColumnFunction.apply(canvasArray, span);
    }

    public Function<Character[][], Character[][]> partialRowFunction(BiFunction<Character[][], Span, Character[][]> func, Span span) {
        return (Character[][] canvasArray) -> populateRowFunction.apply(canvasArray, span);
    }


    public Function<Character[][], Character[][]> drawTopBorder = (canvasArray) -> {
        return populateRow(canvasArray, new Span(0, xLimit(canvasArray), 0, 0));
    };

    public Function<Character[][], Character[][]> drawBottomBorder = (canvasArray) -> {
        return populateRow(canvasArray, new Span(0, xLimit(canvasArray), yLimit(canvasArray), 0));
    };

    public Function<Character[][], Character[][]> drawLeftBorder = (canvasArray) -> {
        return populateColumn(canvasArray, new Span(0, yLimit(canvasArray),0 , 0));
    };

    public Function<Character[][], Character[][]> drawRightBorder = (canvasArray) -> {
        return populateColumn(canvasArray, new Span(0, yLimit(canvasArray), 0, xLimit(canvasArray)));
    };

    private static int xLimit(Character[][] canvasArray) {
        return canvasArray.length - 1;
    }

    private static int yLimit(Character[][] canvasArray) {
        return canvasArray[0].length - 1;
    }

    public BiFunction<Character[][], Span, Character[][]> populateColumnFunction = (canvasArray, span)  -> {
        for (int y = span.getFrom(); y <= span.getTo(); y++) {
            canvasArray[span.getColumn()][y] = charVal;
        }
        return canvasArray;
    };

    public BiFunction<Character[][], Span, Character[][]> populateRowFunction = (canvasArray, span)  -> {
        for (int x=span.getFrom(); x < span.getTo(); x++) {
            canvasArray[x][span.getRow()] = charVal;
        }
        return canvasArray;
    };


    public  Character[][] populateColumn(Character[][] canvasArray, Span span) {
        for (int y = span.getFrom(); y <= span.getTo(); y++) {
            canvasArray[span.getColumn()][y] = charVal;
        }
        return canvasArray;
    }


    public  Character[][] populateRow(Character[][] canvasArray,Span span) {
        for (int x=span.getFrom(); x < span.getTo(); x++) {
            canvasArray[x][span.getRow()] = charVal;
        }
        return canvasArray;
    }

    public static void resetArray(Character[][] canvasArray, Character charVal) {
        for (int x=0; x< xLimit(canvasArray); x++)
        Arrays.fill(canvasArray[x], charVal);
    }


}
