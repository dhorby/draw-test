import model.Canvas;
import view.CanvasBorder;
import view.CanvasView;

public class DrawApp {

    public static void main(String[] args) {

        System.out.println("Started");
        Boolean finished = false;

//        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("enter command: ");
//            String command = scanner.nextLine();
//            CommandParser.parseCommand(command);
            Canvas canvas = new Canvas(10,5);
            final Character[][] canvasArray = canvas.getArray();
            final Character[][] characters = CanvasBorder.populateTopBorder(canvasArray, '*');
            final Character[][] characters1 = CanvasBorder.populateBottomBorder(canvasArray, '*');
            final Character[][] characters2 = CanvasBorder.populateLeftColumn(canvasArray, '*');
            final Character[][] characters3 = CanvasBorder.populateRightColumn(canvasArray, '*');
            new CanvasView(characters3).draw();

            finished = true;
        } while (!finished);

        System.out.println("Finished");

    }
}
