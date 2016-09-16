/**
 * Created by jiaLiu on 9/15/16.
 */
public class PrintAsterisk {

    public String getAsterisk(int i) {
        String asterisks = "";
        for (int j = 0; j < i; j++) {
            asterisks += "*";
        }

        return asterisks;
    }
}
