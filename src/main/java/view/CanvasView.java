package view;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CanvasView {

    private Character[][] canvasMap;

    public void draw() {
        System.out.println();
        for (int y=0; y<canvasMap[0].length; y++) {
            for (int x=0; x<canvasMap.length; x++) {
                System.out.print(canvasMap[x][y]);
            }
            System.out.print("\n");
        }
        System.out.println();
    }

}
