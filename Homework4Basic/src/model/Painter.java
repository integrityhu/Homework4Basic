package model;

public class Painter {

    private static final String[] colors = {"black","white","yellow","orange"};
    
    public static void updateFlowerColor(Flower flower, byte colorIdx) throws IndexOutOfBoundsException {
        flower.setColor(colors[colorIdx]);
        colorIdx = 0;
    }

}
