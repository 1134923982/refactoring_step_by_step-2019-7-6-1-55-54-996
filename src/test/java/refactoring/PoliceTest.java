package refactoring;

import com.tws.refactoring.Driver;
import com.tws.refactoring.Police;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PoliceTest {
    @Test
    public void should_return_true_when_age_is_greater_than_18(){
        //given
        Police police = new Police();
        Driver driver = new Driver(19);
        //when
        Boolean result=police.checkDriver(driver);
        //than
        assertTrue(result);
    }
    @Test
    public void should_return_true_when_age_is_equal_18(){
        //given
        Police police = new Police();
        Driver driver = new Driver(18);
        //when
        Boolean result=police.checkDriver(driver);
        //than
        assertTrue(result);
    }

    @Test
    public void should_return_true_when_age_is_smaller_than_18(){
        //given
        Police police = new Police();
        Driver driver = new Driver(17);
        //when
        Boolean result=police.checkDriver(driver);
        //than

        assertFalse(result);
    }
}


