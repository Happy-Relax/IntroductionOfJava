import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiaLiu on 9/16/16.
 */
public class FizzBuzz {
    public String divideThreeOrFive(int number) {
        String string = "";
        if (number % 3 == 0){
            string = "Fizz";
        }
        if(number % 5 == 0){
            string += "Buzz";
        }
        return string == "" ? string+number : string;
    }


    public List<String> countNumber(int number) {
        List<String> numbers = new ArrayList<String>();
        for (int i = 1; i <= number; i++) {
            numbers.add(divideThreeOrFive(i));
        }
        return numbers;
    }
}
