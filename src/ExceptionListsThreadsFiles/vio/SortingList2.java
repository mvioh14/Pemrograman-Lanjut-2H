package ExceptionListsThreadsFiles.vio;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingList2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(36);
        nums.add(73);
        nums.add(40);
        nums.add(1);

        Collections.sort(nums);
        System.out.println(nums);
    }
}
