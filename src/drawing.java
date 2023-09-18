import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.awt.geom.Line2D;

public class drawing extends Canvas {

    private static final int canvasWidth = 500;
    private static final int canvasHeight = 500;

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        AffineTransform tform = AffineTransform.getTranslateInstance(0, canvasHeight);
        tform.scale(1, -1);
        g2.setTransform(tform);
        ArrayList<ArrayList<Float>> coor = mainTest.bigTriangle(canvasHeight, canvasWidth);
        for (int i=0; i < coor.size() - 1; i++){
            System.out.println((coor.get(i)).get(0) + " " + (coor.get(i)).get(1) + " " + (coor.get(i + 1)).get(0) + " " + (coor.get(i + 1)).get(1));
            Line2D lin = new Line2D.Float((coor.get(i)).get(0), (coor.get(i)).get(1), (coor.get(i + 1)).get(0), (coor.get(i + 1)).get(1));
            System.out.println(lin);
            g2.draw(lin);
        }
    }
    public static void main(String[] args){
        if (true){
            drawing m = new drawing();
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.add(m);
            f.setSize(canvasWidth, canvasHeight);
            f.setVisible(true);
        }
        test();
    }
    public static void test(){
        ArrayList<ArrayList<Float>> coor = mainTest.bigTriangle(canvasHeight, canvasWidth);
        System.out.print(coor + "\n");
        System.out.print(coor.size() + "\n");
    }
}
