package test;

import static org.testng.Assert.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

import lab0.Variant1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 *
 */
public class TestVariant1 {

    @Test(dataProvider = "integerProvider")
    public void integerNumbersTask(int n1, int n2) {assertEquals (new Variant1().integerNumbersTask(n1),n2);

    }
    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][] { { 52, 25 }, { 41,14 }, { 86, 68 } };
    }

    @Test(expectedExceptions = AssertionError.class, dataProvider = "negativeIntegerProvider")
    public void negativeIntegerTest(int n1) {
        new Variant1().integerNumbersTask(n1);
    }

    @DataProvider
    public Object[][] negativeIntegerProvider() {
        return new Object[][] { {1256}, {589}, {125}};
    }

    ////////////////////////////////////////////////

    @Test(dataProvider = "ifProvider")
    public void ifTest(int p1,int p2, int[] rez) {
        assertEquals(new Variant1().ifTask(p1 , p2),rez);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][] { { 25, 36, new int[]{36, 25} }, {15,17, new int[]{17, 15} }, { 22,44, new int[]{44, 22} } };
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int p1,int p2, boolean p3) {
        assertEquals(new Variant1().booleanTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][] { {3, 5,  true}, { 4, 2, false}, { 5, 2, false } };
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "switchProvider")
    public void switchTest(int p1, int p2, int[] res) {
        assertEquals(new Variant1().switchTask (p1, p2) , res );
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][] { { 2, 1, new int[]{1, 1} }, { 1, 3, new int[]{28, 2}}, {9, 9, new int[]{8, 9}} };
    }

    @Test(expectedExceptions = AssertionError.class, dataProvider = "switchNegativeTestProvider")
    public void switchNegativeTest(int p1, int p2) {
        new Variant1().switchTask(p1, p2);
    }

    @DataProvider
    public Object[][] switchNegativeTestProvider(){
        return new Object[][] { {0, 2}, {-5, 4}, {30, 13}};
    }

    ///////////////////////////////////////////////////



///////////////////////////////////////////////////

    @Test(dataProvider = "forProvider")
    public void forTest(int a, int b, int sum) {
        assertEquals(new Variant1().forTask(a , b), sum);

    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][] { { 4, 8, 6720},{ 1, 4, 24} , {-1, 3, 0}};
    }


    @Test(expectedExceptions = AssertionError.class, dataProvider = "forNegativeTestProvider")
    public void forNegativeTest(int p1, int p2) {
        new Variant1().forTask(p1, p2);
    }

    @DataProvider
    public Object[][] forNegativeTestProvider(){
        return new Object[][] {{0, -1}, {10, 5}};
    }

    ///////////////////////////////////////////////////


    @Test(dataProvider = "whileProvider")
    public void whileTest(int n, int k) {
        assertEquals(new Variant1().whileTask(n), k);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][] { { 5, 2}, { 8, 2}, { 16,4 }};
    }

    @Test(expectedExceptions = AssertionError.class, dataProvider = "negativeWhileProvider")
    public void negativeWhileTest(int n) {
        new Variant1().whileTask(n);
    }

    @DataProvider
    public Object[][] negativeWhileProvider() {
        return new Object[][] { { -1}, { 0 }, {-30} };
    }

    //////////////////////////////////////////

    @Test(dataProvider = "minMaxProvider")
    public void minMaxTest(int p1, int[] p2, int[] res){
        assertArrayEquals(new Variant1().minMaxTask(p1, p2),res);
    }

    @DataProvider
    public Object[][] minMaxProvider() {
        return new Object[][] { {3, new int[]{2, 2, 4}, new int[]{1, 2}}, {4, new int[]{3, 2, 4, 2}, new int[]{2, 4}}};
    }


    //////////////////////////////////////////
    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int p1, int[] p2, int[] res) {
        assertArrayEquals(new Variant1().arrayTask(p1, p2), res);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][] { {3, new int[]{2, 2, 4}, new int[]{0}}, {4, new int[]{3, 2, 4, 2}, new int[]{3, 1}}};
    }



    //////////////////////////////////////////

    @Test(dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int p1, int p2, int p3, int[][] p4, int[] res) {
        assertArrayEquals(new Variant1().twoDimensionArrayTask(p1, p2, p3, p4), res);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        int[][] input1 = {
                {4, 4, 4, 4},
                {5, 5, 5, 5},
                {8, 8, 8, 8},
                {7, 7, 7, 7}};

        int[][] input2 = {
                {-4, -4, -4},
                {2, 2, 3},
                {1, 1, 1}};

        int[][] input3 = {
                {8, 8, 8},
                {2, 2, 2},
                {4, 4, 4}};

        return new Object[][] { {1, 4, 4, input1, new int[]{4, 5, 8, 7}}, {3, 3, 3, input2, new int[]{-4, 3, 1}},
                {2, 3, 3, input3, new int[]{8, 2, 4}}};

    }



}