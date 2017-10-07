package model;


import lombok.Getter;
import view.CanvasBorder;

@Getter
public class Canvas {

    int width;
    int height;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Character[][] getArray()  {
        Character[][] canvasArray = new Character[width][height];
        CanvasBorder.resetArray(canvasArray, ' ');
        return canvasArray;
    }

}
