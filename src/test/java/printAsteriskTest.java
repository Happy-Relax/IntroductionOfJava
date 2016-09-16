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

        assertThat(printAsterisk.getAsterisk(3),is("***"));
    }
}
