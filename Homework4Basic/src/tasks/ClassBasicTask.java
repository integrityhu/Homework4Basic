package tasks;

import java.math.BigDecimal;

import model.Painter;
import model.Flower;

public class ClassBasicTask {

    private static final String testColor = "blue";
    
    public static void passParam() {
        Flower flower1 = new Flower();
        Flower flower2 = new Flower();
        Flower flower3 = new Flower(testColor);
        byte color = Flower.COLOR_IDX_YELLOW;
        Painter.updateFlowerColor(flower2, color); //difference between references and values
        System.out.println("color value = ["+ color + "]");
        System.out.println("flower1.color = ["+flower1.getColor() + "]");
        System.out.println("flower2.color = ["+flower2.getColor() + "]");
        System.out.println("flower3.color = ["+flower3.getColor() + "]");
        System.out.println("Flower.count = [" + Flower.getFlowerCount() + "]");
        if (flower3.getStatus() == Flower.STATUS.BLOSSOM) {
            System.out.println("flower3.status = [" + flower3.getStatus() + "]");
        }
    }
    
    public static void references() {
        BigDecimal a = new BigDecimal(100);
        BigDecimal b = a;
        a = a.add(BigDecimal.valueOf(10));
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        String x = "my";
        String m = "my";
        if (x == m) {
            System.out.println("x and m objects equals");
        }
        String n = new String("my");
        if (n == m) {
            System.out.println("n and m objects equals");
        }
        if (n.equals(m)) {
            System.out.println("String content same");
        }
    }
}
