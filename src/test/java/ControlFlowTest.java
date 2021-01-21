import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControlFlowTest {

    @ParameterizedTest
    @CsvSource({
            "5, red, Maximum number of persons is exceeded",
            "0, red, Maximum number of persons not exceeded",
            "40, yellow, Maximum number of persons is exceeded",
            "20, yellow, Maximum number of persons not exceeded",
            "65, green, Maximum number of persons is exceeded",
            "55, green, Maximum number of persons not exceeded",})
    public void personCapacityAlarmTest(int personNum, String alarmLevel, String expectedResult){
        //WHEN
        String result = ControlFlowApp.personCapacityAlarm(personNum, alarmLevel);
        //THEN
        assertEquals(expectedResult, result);
    }


    /*
    @Test
    //@DisplayName("Clearly below decision threshold")
    public void personCapacityTest(){
        //Input
        int personNum = 20;

        //Actual method
        String result = ControlFlowApp.personCapacityTest(personNum);

        //Comparison
        assertEquals("Maximum number of persons not exceeded", result);

    }

    @Test
    public void personCapacityTest2(){
        //Input
        int personNum = 30;

        //Actual method
        String result = ControlFlowApp.personCapacityTest(personNum);

        //Comparison
        assertEquals("Maximum number of persons not exceeded", result);

    }

    @Test
    public void personCapacityTest3(){
        //Input
        int personNum = 31;

        //Actual method
        String result = ControlFlowApp.personCapacityTest(personNum);

        //Comparison
        assertEquals("Maximum number of persons is exceeded", result);

    }

    @Test
    public void personCapacityTest4(){
        //Input
        int personNum = 40;

        //Actual method
        String result = ControlFlowApp.personCapacityTest(personNum);

        //Comparison
        assertEquals("Maximum number of persons is exceeded", result);

    }
    */

}
