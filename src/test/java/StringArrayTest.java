import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringArrayTest {

    @ParameterizedTest
    @MethodSource
    public void studentArrayTest(int arraySize, String[] expectedArray){
        //WHEN
        String[] resultArray = StringArrayApp.arrayCreation(arraySize);
        //THEN
        assertArrayEquals(expectedArray, resultArray);
    }
    private static Stream<Arguments> studentArrayTest(){
        return Stream.of(
                Arguments.of(2, new String[]{"Student 1","Student 2"}),
                Arguments.of(1, new String[]{"Student 1"})
                //Arguments.of(2,2),
                //Arguments.of(3,6),
                //Arguments.of(4,24)
        );
    }

}