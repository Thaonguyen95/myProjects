package movingcars;

/**
 *
 * @author thanguyen
 */
import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * An icon that contains multiple moveable shapes.
 */
public class ShapeIcon implements Icon {

    public ShapeIcon(ArrayList<MoveableShape> shapeList,
            int width, int height) {
        this.shapeList = shapeList;
        this.width = width;
        this.height = height;
    }

    public int getIconWidth() {
        return width;
    }

    public int getIconHeight() {
        return height;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        for (MoveableShape s : shapeList) {
            s.draw(g2);
        }
    }

    private int width;
    private int height;
    private ArrayList<MoveableShape> shapeList;
}
