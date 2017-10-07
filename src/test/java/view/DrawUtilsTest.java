package view;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.function.Function;

public class DrawUtilsTest {

    @Test
    public void drawFrame() throws Exception {
        Character[][] testArray = new Character[5][4]  ;
        DrawUtils.resetArray(testArray, ' ');
        final Function<Character[][], Character[][]> drawFrameFunction = new DrawUtils('*').drawFrame();
        final Character[][] results = drawFrameFunction.apply(testArray);
        final Object[] objects = Arrays.stream(results).flatMap(Arrays::stream).toArray();
        Character[][] expectedResults = new Character[][] {
            {'*', '*','*','*'},
            {'*', ' ',' ','*'},
            {'*', ' ',' ','*'},
            {'*', ' ',' ','*'},
            {'*', '*','*','*'}
        };
        System.out.println(expectedResults.length +":" + expectedResults[0].length);
        Assert.assertArrayEquals(expectedResults, results);



    }

    @Test
    public void drawCross() throws Exception {
    }

    @Test
    public void partialColumnFunction() throws Exception {
    }

    @Test
    public void partialRowFunction() throws Exception {
    }

    @Test
    public void populateColumn() throws Exception {
    }

    @Test
    public void populateRow() throws Exception {
    }

    @Test
    public void resetArray() throws Exception {
    }

    @Test
    public void getCharVal() throws Exception {
    }

    @Test
    public void getDrawTopBorder() throws Exception {
    }

    @Test
    public void getDrawBottomBorder() throws Exception {
    }

    @Test
    public void getDrawLeftBorder() throws Exception {
    }

    @Test
    public void getDrawRightBorder() throws Exception {
    }

    @Test
    public void getPopulateColumnFunction() throws Exception {
    }

    @Test
    public void getPopulateRowFunction() throws Exception {
    }

    @Test
    public void setCharVal() throws Exception {
    }

    @Test
    public void setDrawTopBorder() throws Exception {
    }

    @Test
    public void setDrawBottomBorder() throws Exception {
    }

    @Test
    public void setDrawLeftBorder() throws Exception {
    }

    @Test
    public void setDrawRightBorder() throws Exception {
    }

    @Test
    public void setPopulateColumnFunction() throws Exception {
    }

    @Test
    public void setPopulateRowFunction() throws Exception {
    }

}