import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by jiaLiu on 9/15/16.
 */
public class printAsteriskTest {

    @Test
    public void Should_return_many_asterisk(){
        PrintAsterisk printAsterisk = new PrintAsterisk();

        assertThat(printAsterisk.getAsterisks(3),is("***"));
    }

    @Test
    public void Should_return_three_lines_asterisk(){
        PrintAsterisk printAsterisk = new PrintAsterisk();

        assertThat(printAsterisk.getAsteriskLines(3),is("*\n*\n*\n"));
    }

    @Test
    public void Should_return_right_triangle(){
        PrintAsterisk printAsterisk = new PrintAsterisk();

        assertThat(printAsterisk.getRightTriangle(3),is("*\n**\n***\n"));
    }

    @Test
    public void Should_return_isosceles_triangle(){
        PrintAsterisk printAsterisk = new PrintAsterisk();

        assertThat(printAsterisk.getRightTriangle(3),is("  *\n ***\n*****\n"));
    }
}
