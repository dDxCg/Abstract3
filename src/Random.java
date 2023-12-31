import java.awt.*;
import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Random {

    public int int_Random(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public Color random_Color() {
        int r = int_Random(0, 255);
        int g = int_Random(0, 255);
        int b = int_Random(0,255);
        Color out = new Color(r, g, b);
        return out;
    }
}
