package Rectangle;

import Rectangle.Control.RectangleController;
import Rectangle.Model.RectangleModel;
import Rectangle.Vue.MasterVue;
import Rectangle.Vue.RectangleVue;

public class RectangleMVC {
    public RectangleMVC() {
        RectangleModel model = new RectangleModel();
        RectangleController controller = new RectangleController(model);
        MasterVue master = new MasterVue(model, controller);
        RectangleVue vue = new RectangleVue(model, controller);
    }

    public static void main(String[] args) {
        new RectangleMVC();
    }
}