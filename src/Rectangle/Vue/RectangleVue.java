package Rectangle.Vue;

import Rectangle.Control.RectangleController;
import Rectangle.Model.RectangleModel;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class RectangleVue implements Observer {
    private RectangleModel model;
    private RectangleController control;
    private JPanel mainWindow;
    private JPanel rectangle;

    public RectangleVue(RectangleModel _model, RectangleController _control) {

        this.model = _model;
        this.control = _control;

        JFrame frame = new JFrame("rectangle");
        frame.setContentPane(this.mainWindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        //frame.pack();
        frame.setLocation(150, 150);
        frame.setVisible(true);

        model.addObserver(this); // Connexion entre la vue et le modele

    }

    @Override
    public void update(Observable o, Object arg) {
        rectangle.setSize(new Dimension(model.getWidth(), model.getHeight()));
        rectangle.repaint(0);
    }
}