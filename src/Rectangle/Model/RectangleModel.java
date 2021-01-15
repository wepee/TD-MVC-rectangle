package Rectangle.Model;

import java.util.Observable;

public class RectangleModel extends Observable {
    private int width = 10;
    private int height = 10;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        setChanged();
        notifyObservers();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        setChanged();
        notifyObservers();
    }
}
