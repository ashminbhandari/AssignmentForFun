package CollectionsTests;

import Collections.MapPractice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

// Please rewrite the test part as the format I gave here.

public class MapPracticeTests {
    private MapPractice mapPractice;
    private Map map1;

    @Before
    public void setup(){
        mapPractice = new MapPractice();
        map1 = new TreeMap<String, String>();
        map1.put("Hero", "Dark Knight");
        map1.put("Orwell", "1984");
        map1.put("Link", "Legend of Zelda");
    }

    @Test
    public void findValueOfTest1(){
        String key = "Hero";
        String expected = "Dark Knight";
        String actual = (String) mapPractice.findValueOf(map1, key);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findValueOfTest2(){
        String key = "Orwell";
        String expected = "1984";
        String actual = (String) mapPractice.findValueOf(map1, key);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findValueOfTest3(){
        String key = "non existent key";
        String expected = null;
        String actual = (String) mapPractice.findValueOf(map1, key);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest1(){
        String value = "Dark Knight";
        Object[] expected = {"Hero"};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest2(){
        String value = "Ratatouille";
        Object[] expected = {};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest3(){
        String value = "Pokemon";
        Object[] expected = {};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest1(){
        Integer upTo = 2;
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest2(){
        Integer upTo = 5;
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 2);
        expected.put(4, 3);
        expected.put(5, 5);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest3(){
        Integer upTo = 4;
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 2);
        expected.put(4, 3);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest4(){
        Integer upTo = 1;
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest5(){
        Integer upTo = 0;
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        Assert.assertEquals(new TreeMap<Integer, Integer>(), actual);
    }

    @Test
    public void crazySpiralTest1(){
        Integer upTo = 10;
        Integer first = 2;
        Integer second = 2;
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 2);
        expected.put(2, 2);
        expected.put(3, 4);
        expected.put(4, 6);
        expected.put(5, 10);
        expected.put(6, 16);
        expected.put(7, 26);
        expected.put(8, 42);
        expected.put(9, 68);
        expected.put(10, 110);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest2(){
        Integer upTo = 8;
        Integer first = 5;
        Integer second = 2;
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 5);
        expected.put(2, 2);
        expected.put(3, 7);
        expected.put(4, 9);
        expected.put(5, 16);
        expected.put(6, 25);
        expected.put(7, 41);
        expected.put(8, 66);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest3(){
        Integer upTo = 12;
        Integer first = 3;
        Integer second = -4;
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 3);
        expected.put(2, -4);
        expected.put(3, -1);
        expected.put(4, -5);
        expected.put(5, -6);
        expected.put(6, -11);
        expected.put(7, -17);
        expected.put(8, -28);
        expected.put(9, -45);
        expected.put(10, -73);
        expected.put(11, -118);
        expected.put(12, -191);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest4(){
        Integer upTo = 1;
        Integer first = 56;
        Integer second = -4;
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 56);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest5(){
        Integer upTo = 0;
        Integer first = 334124535;
        Integer second = -413141793;
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        Assert.assertEquals(expected, actual);
    }



}
