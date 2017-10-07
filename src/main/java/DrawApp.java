import model.Canvas;
import view.DrawUtils;
import view.CanvasView;

import java.util.function.Function;

public class DrawApp {

    public static void main(String[] args) {

        System.out.println("Started");
        Boolean finished = false;

        do {
            System.out.print("enter command: ");
//            String command = scanner.nextLine();
//            CommandParser.parseCommand(command);
            Canvas canvas = new Canvas(10,5);
            final Character[][] canvasArray = canvas.getArray();
            final Function<Character[][], Character[][]> drawFrame = new DrawUtils('*').drawFrame(canvasArray);
            final Character[][] frame = drawFrame.apply(canvasArray);
            new CanvasView(frame).draw();

            finished = true;
        } while (!finished);

        System.out.println("Finished");

    }
}
