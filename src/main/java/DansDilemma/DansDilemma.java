package DansDilemma;

import java.util.HashSet;
import java.util.ArrayList;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        HashSet<Double> hset = new HashSet<Double>();
        hset.add(input1 + input2);
        hset.add(input1 * input2);
        hset.add(input1 - input2);
        hset.add(input2 - input1);
        if (input1 != 0) {
            hset.add(input2 / input1);
        }
        if (input2 != 0) hset.add(input1 / input2);
        return hset.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        //array list so that we can double for loop and calculate the sums, diffs combinatorics
        ArrayList<Double> arr = new ArrayList<Double>();
        arr.add(input1);
        arr.add(input2);
        arr.add(input3);
        HashSet<Double> hset = new HashSet<Double>();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = arr.size() - 1; j > i; j--) {
                hset.add(arr.get(i) + arr.get(j));
                hset.add(arr.get(i) - arr.get(j));
                hset.add(arr.get(j) - arr.get(i));
                hset.add(arr.get(i) * arr.get(j));
                if (arr.get(i) != 0) {
                    hset.add(arr.get(j) / arr.get(i));
                }
                if (arr.get(j) != 0) {
                    hset.add(arr.get(i) / arr.get(j));
                }
            }
        }
        return hset.size();
    }

    public Integer dilemmaOfN(Double... args) {
        HashSet<Double> hset = new HashSet<Double>();
        for (int i = 0; i < args.length; i++) {
            for (int j = args.length - 1; j > i; j--) {
                hset.add(args[i] + args[j]);
                hset.add(args[i] - args[j]);
                hset.add(args[j] - args[i]);
                hset.add(args[i] * args[j]);
                if (args[i] != 0) {
                    hset.add(args[j] / args[i]);
                }
                if (args[j] != 0) {
                    hset.add(args[i] / args[j]);
                }
            }
        }
        return hset.size();
    }
}
