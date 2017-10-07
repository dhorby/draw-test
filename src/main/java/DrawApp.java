import model.Canvas;
import model.Span;
import view.CanvasView;
import view.DrawUtils;

import java.util.function.Function;

public class DrawApp {

    public static void main(String[] args) {

        System.out.println("Started");
        Boolean finished = false;

        do {
            System.out.print("enter command: ");
//            String command = scanner.nextLine();
//            CommandParser.parseCommand(command);
            Canvas canvas = new Canvas(21,20);
            final Character[][] canvasArray = canvas.getArray();
            final Function<Character[][], Character[][]> drawFrame = new DrawUtils('*').drawFrame(canvasArray);
            final Character[][] frame = drawFrame.apply(canvasArray);

            new CanvasView(frame).draw();


            final Function<Character[][], Character[][]> drawCrossFunction = new DrawUtils('*').drawCross(canvasArray, new Span(2, 19, 7, 0), new Span(2, 16, 0, 10));
            final Character[][] results = drawCrossFunction.apply(canvasArray);

            new CanvasView(results).draw();


            finished = true;
        } while (!finished);

        System.out.println("Finished");

    }
}
