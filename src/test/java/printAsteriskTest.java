import org.junit.Test;

import java.util.List;

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

        List<String> asteriskLines = printAsterisk.getAsteriskLines2(3);
        assertThat(asteriskLines.size(),is(3));
        assertThat(asteriskLines.get(0),is("*"));
        assertThat(asteriskLines.get(0),is("*"));
        assertThat(asteriskLines.get(0),is("*"));
    }

    @Test
    public void Should_return_right_triangle(){
        PrintAsterisk printAsterisk = new PrintAsterisk();

        assertThat(printAsterisk.getRightTriangle(3),is("*\n**\n***\n"));
    }

    @Test
    public void Should_return_isosceles_triangle(){
        PrintAsterisk printAsterisk = new PrintAsterisk();

        assertThat(printAsterisk.getIsoscelesTriangle(3),is("  *\n ***\n*****\n"));
    }

    @Test
    public void Should_return_diamond(){
        PrintAsterisk printAsterisk = new PrintAsterisk();

        assertThat(printAsterisk.getDiamond(3),is("  *\n ***\n*****\n ***\n  *\n"));
    }

    @Test
    public void Should_return_diamond_with_Name(){
        PrintAsterisk printAsterisk = new PrintAsterisk();

        assertThat(printAsterisk.getDiamondWithName(3,"Bill"),is("  *\n ***\nBill\n ***\n  *\n"));
    }
}
