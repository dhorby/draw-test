import controller.CommandController;
import model.Canvas;
import model.Command;
import view.CanvasView;
import view.DrawUtils;

import java.util.Scanner;
import java.util.function.Function;

public class DrawApp {

    public static void main(String[] args) {

        System.out.println("Started");
        Boolean finished = false;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("enter command: ");
            String line = scanner.nextLine();
            Command command = CommandController.parseCommand(line);
//            Character charVal = (char)0xF09F98A0;
            Canvas canvas = new Canvas(command.getWidth(), command.getHeight());
            final Character[][] canvasArray = canvas.getArray();
            final Function<Character[][], Character[][]> drawFrame = new DrawUtils('*').drawFrame(canvasArray);
            final Character[][] frame = drawFrame.apply(canvasArray);

            new CanvasView(frame).draw();


//
//            final Function<Character[][], Character[][]> drawCrossFunction = new DrawUtils('*').drawCross(canvasArray, new Span(2, 19, 10, 0), new Span(2, 16, 0, 10));
//            final Character[][] results = drawCrossFunction.apply(canvasArray);
//
//            new CanvasView(results).draw();


            finished = true;
        } while (!finished);

        System.out.println("Finished");

    }
}
