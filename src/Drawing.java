import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Drawing extends Canvas{

    private static final int canvasHeight = 500;
    private static final int canvasWidth = 500;
    public static void main(String[] args){
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(canvasWidth,canvasHeight);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(false);
    }

    public ArrayList bigTriangle(){
        java.util.List<Integer> bottomLeft = new ArrayList<Integer>();
        bottomLeft.add(10);
        bottomLeft.add(10);

        java.util.List<Integer> bottomRight = new ArrayList<Integer>();
        bottomRight.add(10);
        bottomRight.add(10);

        java.util.List<Integer> triangleTop = new ArrayList<Integer>();
        triangleTop.add(canvasWidth / 2);
        triangleTop.add(canvasHeight - 10);

        ArrayList<Object> bigTrianCoor = new ArrayList<>();

        bigTrianCoor.add(bottomLeft);
        bigTrianCoor.add(bottomRight);
        bigTrianCoor.add(triangleTop);

        System.out.println("Hi");
        Test.hulu();

        return bigTrianCoor;
    }

    public void paint(Graphics g){
        //g.fillOval(0,0, 10, 10);
        //g.drawLine(100,100, 0, 300);
        //g.setColor(Color.red);
        //g.fillOval(100,100, 10, 10);
        bigTriangle();
    }
}
