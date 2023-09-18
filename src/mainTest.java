import java.util.ArrayList;
import java.lang.Math;

public class mainTest {

    public static ArrayList<ArrayList<Float>> bigTriangle(int height, int width){
        ArrayList<Float> bottomLeft = new ArrayList<>();
        bottomLeft.add((float) 10);
        bottomLeft.add((float) 10);

        ArrayList<Float> bottomRight = new ArrayList<>();
        bottomRight.add((float) width - 10);
        bottomRight.add((float) 10);

        ArrayList<Float> triangleTop = new ArrayList<>();
        float half = (bottomRight.get(0) - bottomLeft.get(1)) / 2;
        float sideLength = bottomRight.get(0) - bottomLeft.get(0);

        triangleTop.add((float) width / 2);
        triangleTop.add((float) Math.sqrt(Math.pow(sideLength, 2) - Math.pow(half, 2)));

        ArrayList<ArrayList<Float>> bigTrianCoor = new ArrayList<>();

        bigTrianCoor.add(bottomLeft);
        bigTrianCoor.add(bottomRight);
        bigTrianCoor.add(triangleTop);
        bigTrianCoor.add(bottomLeft);

        return bigTrianCoor;
    }

    public static ArrayList<ArrayList<Float>> invertY(ArrayList<ArrayList<Float>> array){
        ArrayList<ArrayList<Float>> newArray;
        newArray = array;
        for (int i = 0; i < array.size(); i++){
            float newElement = - (newArray.get(i)).get(1);
            (newArray.get(i)).set(1, newElement);
        }
        return newArray;
    }

    public ArrayList<ArrayList<Float>> ListOfPoint(int height, int width){

        float fWidth = width;
        float fHeight = height;
        ArrayList<Float> xCoor = new ArrayList<>();
        xCoor.add((float) 10);
        xCoor.add(fWidth - 10);
        xCoor.add(fWidth / 2);

        ArrayList<Float> yCoor = new ArrayList<>();
        yCoor.add((float) 10);
        yCoor.add((float) 10);
        yCoor.add(fHeight - 10);


        ArrayList<ArrayList<Float>> allCoor = new ArrayList<>();
        allCoor.add(xCoor);
        allCoor.add(yCoor);
        return allCoor;
    }
}
