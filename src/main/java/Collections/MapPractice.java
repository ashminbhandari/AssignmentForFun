package Collections;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.ArrayList;

public class MapPractice {
    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        ArrayList<Object> ret = new ArrayList<Object>();
        Set<Object> keys = map.keySet();
        for(Object key : keys) {
            if (map.get(key) == value) {
                ret.add(key);
            }
        }
        return ret.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> fibTree = new TreeMap<Integer, Integer>();
        if (size == 0) return fibTree;
        if (size == 1) {
            fibTree.put(1, 1);
            return fibTree;
        }
        fibTree.put(1, 1);
        fibTree.put(2, 1);
        for (int i = 3; i <= size; i++) {
            fibTree.put(i, fibTree.get(i - 1) + fibTree.get(i - 2));
        }
        return fibTree;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> fibTree = new TreeMap<Integer, Integer>();
        if(size >= 1) fibTree.put(1, first);
        if(size >= 2) fibTree.put(2, second);
        for (int i = 3; i <= size; i++) {
            fibTree.put(i, fibTree.get(i - 1) + fibTree.get(i - 2));
        }
        return fibTree;
    }
}