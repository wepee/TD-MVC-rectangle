package Rectangle.Control;

import Rectangle.Model.RectangleModel;

public class RectangleController {

    private RectangleModel model = new RectangleModel();

    public RectangleController(RectangleModel model) {
        this.model = model;
    }

    public void addHeight() {
        if (model.getHeight() < 400)
            model.setHeight(model.getHeight() + 1);
    }

    public void minusHeight() {
        if (model.getHeight() > 0)
            model.setHeight(model.getHeight() - 1);
    }

    public void addWidth() {
        if (model.getWidth() < 400)
            model.setWidth(model.getWidth() + 1);
    }

    public void minusWidth() {
        if (model.getWidth() > 0)
            model.setWidth(model.getWidth() - 1);
    }

}
