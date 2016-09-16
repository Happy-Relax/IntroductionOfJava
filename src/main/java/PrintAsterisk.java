import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiaLiu on 9/15/16.
 */
public class PrintAsterisk {

    public String getAsterisks(int i) {
        String asterisks = "";
        for (int j = 0; j < i; j++) {
            asterisks += "*";
        }

        return asterisks;
    }

    public String getAsteriskLines(int i) {
        String lines = "";
        for (int j = 0; j < i; j++) {
            lines += getAsterisks(1) + "\n";
        }
        return lines;
    }

    public List<String> getAsteriskLines2(int i) {
        List<String> lines =new ArrayList<String>();
        for (int j = 0; j < i; j++) {
            lines.add(getAsterisks(1));
        }
        return lines;
    }

    public String getRightTriangle(int i) {
        String rightTriangle = "";
        for (int j = 0; j < i; j++) {
            rightTriangle += getAsterisks(j+1) +"\n";
        }
        return rightTriangle;
    }

    public String getSpace(int i) {
        String space = "";
        for (int j = 0; j < i; j++) {
            space += " ";
        }

        return space;
    }
    public String getIsoscelesTriangle(int i) {
        String isoscelesTriangle = "";
        for (int j = 0; j < i; j++) {
            isoscelesTriangle += getSpace(i-j-1) + getAsterisks(2*j+1) +"\n";
        }
        return isoscelesTriangle;
    }

    public String getDiamond(int i) {
        String diamond = "";
        diamond += getIsoscelesTriangle(i) + getTurnIsoscelesTriangle(i-1);
        return diamond;
    }

    private String getTurnIsoscelesTriangle(int i) {
        String turnIsoscelesTriangle = "";
        for (int j = i-1; j >= 0; j--) {
            turnIsoscelesTriangle += getSpace(i-j-1) + getAsterisks(2*j+1) +"\n";
        }
        return turnIsoscelesTriangle;
    }

    public String getDiamondWithName(int i, String bill) {
        return null;
    }
}
