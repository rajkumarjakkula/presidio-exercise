import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {
    @Test
    public void toGetTenWhenAddingFourAndSix(){
        Arithmetic arithmetic=new Arithmetic(4,6);
        int actualOutput=arithmetic.sum();
        int expectedOutput=10;
        assertEquals(actualOutput,expectedOutput);
    }
    @Test
    public void toGetTwoWhenAddingNegativeFourAndSix(){
        Arithmetic arithmetic=new Arithmetic(-4,6);
        int actualOutput=arithmetic.sum();
        int expectedOutput=2;
        assertEquals(actualOutput,expectedOutput);
    }
    @Test
    public void toGetTwoWhenSubstractSixAndFour(){
        Arithmetic arithmetic=new Arithmetic(6,4);
        int actualOutput=arithmetic.substract();
        int expectedOutput=2;
        assertEquals(actualOutput,expectedOutput);
    }
    @Test
    public void toGetNegativeTenWhenSubstracNegativeFourAndSix(){
        Arithmetic arithmetic=new Arithmetic(-4,6);
        int actualOutput=arithmetic.substract();
        int expectedOutput=-10;
        assertEquals(actualOutput,expectedOutput);
    }
    @Test
    public void toGetTwentyFourWhenMultiplyFourAndSix(){
        Arithmetic arithmetic=new Arithmetic(4,6);
        int actualOutput=arithmetic.multiply();
        int expectedOutput=24;
        assertEquals(actualOutput,expectedOutput);
    }
    @Test
    public void toGetNegativeTwentyFourWhenAddingNegativeFourAndSix(){
        Arithmetic arithmetic=new Arithmetic(-4,6);
        int actualOutput=arithmetic.multiply();
        int expectedOutput=-24;
        assertEquals(actualOutput,expectedOutput);
    }
    @Test
    public void toGetTwoWhenDividingFourAndTwo(){
        Arithmetic arithmetic=new Arithmetic(4,2);
        int actualOutput=arithmetic.divide();
        int expectedOutput=2;
        assertEquals(actualOutput,expectedOutput);
    }
    @Test
    public void toGetTwoWhenDividingNegativeFourAndTwo(){
        Arithmetic arithmetic=new Arithmetic(-4,2);
        int actualOutput=arithmetic.sum();
        int expectedOutput=-2;
        assertEquals(actualOutput,expectedOutput);
    }

}
