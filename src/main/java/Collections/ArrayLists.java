package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum = 0;
        for(int i = 0; i < list1.size(); i++) {
            sum += list1.get(i);
        }
        for(int i = 0; i < list2.size(); i++) {
            sum += list2.get(i);
        }
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (Integer i : original) {
            if (!i.equals(toRemove)) {
                ret.add(i);
            }
        }
        return ret;
    }

    public boolean doesShareCharacter(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (b.indexOf(a.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }

    public boolean happyList(ArrayList<String> original) {
        if (original.size() <= 1) return true;
        if(original.size() == 2 && doesShareCharacter(original.get(0), original.get(1))) {
            return true;
        } else if(original.size() == 2) return false;
        String prevString = original.get(0);
        for (int i = 1; i < original.size() - 1; i++) {
            if (!doesShareCharacter(prevString, original.get(i)) || !doesShareCharacter(original.get(i), original.get(i + 1))) {
                return false;
            }
        }
        return true;
    }
}
