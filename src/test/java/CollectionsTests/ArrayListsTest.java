package CollectionsTests;

import Collections.ArrayLists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

// Please rewrite the test part as the format I gave here.

public class ArrayListsTest {
    private ArrayLists arrayLists;

    @Before
    public void setup(){
        arrayLists = new ArrayLists();
    }

    @Test
    public void addShitTest1(){
        ArrayList<Integer> t = new ArrayList<Integer>();
        t.add(1);
        t.add(2);

        ArrayList<Integer> tx = new ArrayList<Integer>();
        tx.add(3);

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);

        ArrayList<Integer> ax = arrayLists.addShit(t, tx);

        Assert.assertEquals(ax, a);
    }

    @Test
    public void addShitTest2(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);

        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(1);

        a = arrayLists.addShit(a,b);

        b.add(1);

        Assert.assertEquals(a, b);
    }

    @Test
    public void addShitTest3(){
        ArrayList<Integer> x = new ArrayList<Integer>();

        ArrayList<Integer> y = new ArrayList<Integer>();

        ArrayList<Integer> a = arrayLists.addShit(x, y);

        Assert.assertEquals(a, new ArrayList<Integer>());
    }

    @Test
    public void addShitTogetherTest1(){
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(2);
        x.add(3);
        ArrayList<Integer> y = new ArrayList<Integer>();
        y.add(5);
        Integer z = arrayLists.addShitTogether(x, y);
        Integer expected = 10;
        Assert.assertEquals(expected, z);
    }

    @Test
    public void addShitTogetherTest2(){
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        x.add(2);
        x.add(2);
        Integer z = arrayLists.addShitTogether(x, y);
        Integer expected = 4;
        Assert.assertEquals(expected, z);
    }

    @Test
    public void addShitTogetherTest3(){
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        Integer z = arrayLists.addShitTogether(x,y);
        Integer expected = 0;
        Assert.assertEquals(expected, z);
    }

    @Test
    public void removeAllTest1(){
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(2);
        x.add(2);

        Integer toRemove = 2;
        ArrayList<Integer> y = arrayLists.removeAll(x, toRemove);
        x.remove(0);
        x.remove(0);

        Assert.assertEquals(x, y);
    }

    @Test
    public void removeAllTest2(){
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(2);
        x.add(3);
        x.add(2);
        x.add(4);
        x.add(4);

        Integer toRemove = 4;
        ArrayList<Integer> y = arrayLists.removeAll(x, toRemove);
        x.remove(3);
        x.remove(3);

        Assert.assertEquals(x, y);
    }

    @Test
    public void removeAllTest3(){
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(5);
        x.add(5);
        x.add(5);
        x.add(7);
        x.add(7);

        Integer toRemove = null;
        ArrayList<Integer> y = arrayLists.removeAll(x, toRemove);

        Assert.assertEquals(x, y);
    }

    @Test
    public void happyListTest1(){
        ArrayList<String> x = new ArrayList<String>();
        x.add("testing");
        x.add("this");
        x.add("function");
        x.add("is");
        x.add("fun,iguess");

        boolean y = arrayLists.happyList(x);

        Assert.assertTrue(y);
    }

    @Test
    public void happyListTest2(){
        // Given
        ArrayList<String> x = new ArrayList<String>();
        x.add("you");
        x.add("aint");
        x.add("never");
        x.add("seen a pretty best friend, why always one gotta be ugly");

        // When
        boolean y = arrayLists.happyList(x);
        // Then
        Assert.assertFalse(y);
    }

    @Test
    public void happyListTest3(){
        // Given
        ArrayList<String> x = new ArrayList<String>();
        // When
        boolean y = arrayLists.happyList(x);
        // Then
        Assert.assertTrue(y);
    }

    @Test
    public void happyListTest4(){
        // Given
        ArrayList<String> x = new ArrayList<String>();
        x.add("We got this!");
        // When
        boolean y = arrayLists.happyList(x);
        // Then
        Assert.assertTrue(y);
    }

    @Test
    public void happyListTest5(){
        // Given
        ArrayList<String> x = new ArrayList<String>();
        x.add("Believe");
        x.add("and");
        x.add("Achieve!");
        // When
        boolean y = arrayLists.happyList(x);
        // Then
        Assert.assertFalse(y);
    }

}
