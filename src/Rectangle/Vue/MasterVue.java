package Rectangle.Vue;

import Rectangle.Control.RectangleController;
import Rectangle.Model.RectangleModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class MasterVue implements Observer {

    private JButton plusHeight;
    private JButton minusHeight;
    private JPanel mainWindows;
    private JPanel widthPanel;
    private JPanel heightPanel;
    private JLabel heightLabel;
    private JLabel widthLabel;
    private JButton plusWidth;
    private JButton minusWidth;

    RectangleModel model;
    RectangleController control;

    public MasterVue(RectangleModel _model, RectangleController _control) {
        this.model = _model;
        this.control = _control;
        JFrame frame = new JFrame("Control");
        frame.setContentPane(this.mainWindows);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        model.addObserver(this); // Connexion entre la vue et le modele


        plusHeight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control.addHeight();
            }
        });
        minusHeight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control.minusHeight();
            }
        });
        plusWidth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control.addWidth();
            }
        });
        minusWidth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control.minusWidth();
            }
        });
    }

    @Override
    public void update(Observable o, Object arg) {
        mainWindows.repaint();
    }
}
