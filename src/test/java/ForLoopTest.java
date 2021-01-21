import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForLoopTest {

    @ParameterizedTest
    @MethodSource
    public void facultyTest(int num, int expectedResult){
        //WHEN
        int resultR = ForLoopApp.facultyRec(num);
        int resultW = ForLoopApp.faculty(num);
        //THEN
        assertEquals(resultR, expectedResult);
        assertEquals(resultW, expectedResult);
    }
    private static Stream <Arguments> facultyTest(){
        return Stream.of(
                Arguments.of(0,1),
                Arguments.of(1,1),
                Arguments.of(2,2),
                Arguments.of(3,6),
                Arguments.of(4,24)
        );
    }

}
