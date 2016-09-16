import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by jiaLiu on 9/16/16.
 */
public class fizzBuzzTest {

    @Test
    public void Should_return_Fizz_when_number_just_divisible_by_three(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.divideThreeOrFive(9),is("Fizz"));
    }

    @Test
    public void Should_return_FizzBuzz_when_number_divisible_by_three_and_five(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.divideThreeOrFive(15),is("FizzBuzz"));
    }

    @Test
    public void Should_return_one_to_number_with_Fizz_Buzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        List<String> countNumber = fizzBuzz.countNumber(15);
        assertThat(countNumber.size(),is(15));
        assertThat(countNumber.get(0),is("1"));
        assertThat(countNumber.get(1),is("2"));
        assertThat(countNumber.get(2),is("Fizz"));
        assertThat(countNumber.get(4),is("Buzz"));
        assertThat(countNumber.get(14),is("FizzBuzz"));
    }
}
