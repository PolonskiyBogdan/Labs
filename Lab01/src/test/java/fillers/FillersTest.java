package fillers;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import static fillers.Fillers.*;


public class FillersTest {

    @Test
    public void getRandomlyGeneratedArray_Null() {
         Assert.assertNotNull("Error",getRandomlyGeneratedArray());
    }
    @Test
    public void getArraySortedMaximumToMinimum_Null() {
        Assert.assertNotNull("Error Filler has null",getArraySortedMaximumToMinimum());
    }
    @Test
    public void getArraySortedMinimumToMaximum_Null() {
        Assert.assertNotNull("Error Filler has null",getArraySortedMinimumToMaximum());
    }
    @Test
    public void getArraySortedMinimumMaximumPlusRandNum_Null() {
        Assert.assertNotNull("Error Filler has null",getArraySortedMinimumMaximumPlusRandNum());
    }



    @Test(timeout = 100)
    public  void getRandomlyGeneratedArray_Time(){
        System.out.println(Arrays.toString(getRandomlyGeneratedArray()));
    }
    @Test(timeout = 100)
    public void getArraySortedMaximumToMinimum_Time(){
        System.out.println(Arrays.toString(getArraySortedMaximumToMinimum()));


    }
    @Test(timeout = 100)
    public  void getArraySortedMinimumToMaximum_Time(){
        System.out.println(Arrays.toString(getArraySortedMinimumToMaximum()));

    }
    @Test(timeout = 100)
    public void getArraySortedMinimumMaximumPlusRandNum_Time(){
        System.out.println(Arrays.toString(getArraySortedMinimumMaximumPlusRandNum()));
        getArraySortedMinimumMaximumPlusRandNum();
    }

}