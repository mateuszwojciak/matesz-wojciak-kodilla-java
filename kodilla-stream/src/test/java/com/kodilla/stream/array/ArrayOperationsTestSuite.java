package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] nums = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            nums[i] = 2;
            sum += nums[i];
        }

        //When
        double expected = sum / nums.length;
        double actual = ArrayOperations.getAverage(nums);

        //Then
        System.out.println("Pokaz mi liczby, 'sum': '" + sum + "'. i 'Nums.length': '"
                + nums.length + "'");
        Assert.assertEquals(expected, actual, 0);
        Assert.assertEquals(10, nums.length, 0);
    }
}