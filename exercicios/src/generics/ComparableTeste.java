package generics;

import java.util.TreeSet;

public class ComparableTeste {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(10);
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(18);
        nums.add(20);
        nums.add(9);
        nums.add(152);
        nums.add(-4);

        for (Integer n: nums) {
            System.out.println(n);
        }


    }
}
