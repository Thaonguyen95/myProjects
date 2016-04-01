package movingcars;

/**
 *
 * @author thanguyen
 */
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * This program implements an animation that moves multiple cars.
 */
public class MovingCars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        final MoveableShape shape1
                = new CarShape(0, 0, CAR_WIDTH);
        final MoveableShape shape2
                = new CarShape(300, 300, (CAR_WIDTH / 2));
        final MoveableShape shape3
                = new CarShape(400, 50, (CAR_WIDTH / 4));

        final ArrayList<MoveableShape> carList = new ArrayList<MoveableShape>();
        carList.add(shape1);
        carList.add(shape2);
        carList.add(shape3);

        ShapeIcon icon = new ShapeIcon(carList,
                ICON_WIDTH, ICON_HEIGHT);

        final JLabel label = new JLabel(icon);
        frame.setLayout(new FlowLayout());
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        final int DELAY = 100;
        // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                for (MoveableShape s : carList) {
                    s.translate(DX, DY);
                    label.repaint();
                }
            }
        });
        t.start();
    }

    private static final int ICON_WIDTH = 500;
    private static final int ICON_HEIGHT = 500;
    private static final int CAR_WIDTH = 200;
    private static final int DX = 1;
    private static final int DY = 2;
}
