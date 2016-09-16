import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by jiaLiu on 9/16/16.
 */
public class primeFactorTest {

    @Test
    public void Should_return_true_when_give_an_prime_number(){
        PrimeFactor primeFactor = new PrimeFactor();

        assertThat(primeFactor.IsPrimeNumber(13),is(true));
        assertThat(primeFactor.IsPrimeNumber(2),is(true));
        assertThat(primeFactor.IsPrimeNumber(12),is(false));
    }

    @Test
    public void Should_return_all_factors(){
        PrimeFactor primeFactor = new PrimeFactor();

        List<Integer> factors = primeFactor.GetAllFactors(12);
        assertThat(factors.size(),is(4));
        assertThat(factors.contains(2),is(true));
        assertThat(factors.contains(3),is(true));
        assertThat(factors.contains(4),is(true));
        assertThat(factors.contains(6),is(true));
    }

    @Test
    public void Should_return_prime_factors_with_sort(){
        PrimeFactor primeFactor = new PrimeFactor();

        List<Integer> factors = primeFactor.GetPrimeFactors(30);
        assertThat(factors.size(),is(3));
        assertThat(factors.get(0),is(2));
        assertThat(factors.get(1),is(3));
        assertThat(factors.get(2),is(5));
    }
}
