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

    public List<String> getAsteriskLines(int i) {
        List<String> lines =new ArrayList<String>();
        for (int j = 0; j < i; j++) {
            lines.add(getAsterisks(1));
        }
        return lines;
    }

    public List<String> getRightTriangle(int i) {
        List<String> lines =new ArrayList<String>();
        for (int j = 0; j < i; j++) {
            lines.add(getAsterisks(j+1));
        }
        return lines;
    }

    public String getSpace(int i) {
        String space = "";
        for (int j = 0; j < i; j++) {
            space += " ";
        }

        return space;
    }


    public List<String> getIsoscelesTriangle(int i) {
        List<String> lines =new ArrayList<String>();
        for (int j = 0; j < i; j++) {
            lines.add(getSpace(i-j-1)+getAsterisks(2*j+1));
        }
        return lines;
    }


    public List<String> getDiamond(int i) {
        List<String> isoscelesTriangle = getIsoscelesTriangle(3);
        List<String> turnIsoscelesTriangle = getTurnIsoscelesTriangle(2);

        for (int j = 0; j < turnIsoscelesTriangle.size(); j++) {
            String item = turnIsoscelesTriangle.get(j);
            turnIsoscelesTriangle.set(j," " + item);
        }
        isoscelesTriangle.addAll(turnIsoscelesTriangle);
        return isoscelesTriangle;
    }

    private List<String> getTurnIsoscelesTriangle(int i) {
        List<String> turnIsoscelesTriangle =new ArrayList<String>();
        for (int j = i-1; j >=0 ; j--) {
            turnIsoscelesTriangle.add(getSpace(i-j-1)+getAsterisks(2*j+1));
        }
        return turnIsoscelesTriangle;
    }

    public String getDiamondWithName(int i, String bill) {
        return null;
    }


}
