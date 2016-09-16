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

    public String getRightTriangle(int i) {
        String triangle = "";
        for (int j = 0; j < i; j++) {
            triangle += getAsterisks(j+1) +"\n";
        }
        return triangle;
    }

    public String getSpace(int i) {
        String asterisks = "";
        for (int j = 0; j < i; j++) {
            asterisks += " ";
        }

        return asterisks;
    }
    public String getIsoscelesTriangle(int i) {
        String triangle = "";
        for (int j = 0; j < i; j++) {
            triangle += getSpace(i-j-1) + getAsterisks(2*j+1) +"\n";
        }
        return triangle;
    }
}
