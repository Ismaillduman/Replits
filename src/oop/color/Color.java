package oop.color;

import java.util.Arrays;

public class Color {

    private int[] rgb = new int[3]; //rgb array with 3 int numbers are used to hold r,g,b values

    /**
     * Available colors - ready with rgb code
     */

    public final static int[] WHITE = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY = new int[]{64, 64, 64};
    public final static int[] BLACK = new int[]{0, 0, 0};
    public final static int[] RED = new int[]{255, 0, 0};
    public final static int[] PINK = new int[]{255, 175, 175};
    public final static int[] ORANGE = new int[]{255, 200, 0};
    public final static int[] YELLOW = new int[]{255, 255, 0};
    public final static int[] GREEN = new int[]{0, 255, 0};
    public final static int[] MAGENTA = new int[]{255, 0, 255};
    public final static int[] CYAN = new int[]{0, 255, 255};
    public final static int[] BLUE = new int[]{0, 0, 255};


    /**
     * Public constructor accepts 3 ints that represent color code.
     * assign 3 int parameters to rgb array indexes(0,1,2)
     *
     * @param r
     * @param g
     * @param b
     */


    public Color(int r, int g, int b) {
        //TODO: Assign rgb values to the rgb array

       this.rgb[0]=r;
       this.rgb[1]=g;
       this.rgb[2]=b;

    }

    /**
     * Public no- args constructor: sets default color as "white" (255,255,255)
     * Hint: use this() keyword to call above constructor to set white color
     */
    public Color() {
        //TODO: Set rgb values to default color of white
//
        this(255,255,255);

    }

 

    public String toString() {
        //TODO
        if (Arrays.equals(rgb, WHITE)) {
            return "WHITE";
        } else if (Arrays.equals(rgb, LIGHT_GRAY)) {
            return "LIGHT_GRAY";
        } else if (Arrays.equals(rgb, GRAY)) {
            return "GRAY";
        } else if (Arrays.equals(rgb, DARK_GRAY)) {
            return "DARK_GRAY";
        } else if (Arrays.equals(rgb, BLACK)) {
            return "BLACK";
        } else if (Arrays.equals(rgb, RED)) {
            return "RED";
        } else if (Arrays.equals(rgb, PINK)) {
            return "PINK";
        } else if (Arrays.equals(rgb, ORANGE)) {
            return "ORANGE";
        } else if (Arrays.equals(rgb, YELLOW)) {
            return "YELLOW";
        } else if (Arrays.equals(rgb, GREEN)) {
            return "GREEN";
        } else if (Arrays.equals(rgb, MAGENTA)) {
            return "MAGENTA";
        } else if (Arrays.equals(rgb, CYAN)) {
            return "CYAN";
        } else if (Arrays.equals(rgb, BLUE)) {
            return "BLUE";
        } else {
            return "n/a";
        }
    }

    }

