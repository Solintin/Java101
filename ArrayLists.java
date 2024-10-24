
// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ArrayLists {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        // for (int i = 0; i < 10; i++) {
        // nums.add(i * 2);
        // }
        // for (Integer i : nums) {

        // System.out.println(i);
        // }

        // Set<Integer> nums = new TreeSet<Integer>();
        // nums.add(130);
        // nums.add(12);
        // nums.add(123);
        // nums.add(1);

        // Iterator<Integer> values = nums.iterator();
        // while (values.hasNext()) {
        // System.out.println(values.next());
        // }

        Map<String, Integer> records = new HashMap<>();
        records.put("John", 25);
        records.put("Alice", 30);
        records.put("Bob", 35);
        records.put("Doe", 50);

        // for (String student : records.keySet()) {
        // System.out.println(String.format("%s Scored %s", student,
        // records.get(student)));
        // }
        Collection<Integer> scores = records.values();
        List<Integer> newScore = new ArrayList<Integer>();
        for (Integer i : scores) {
            newScore.add(i);
        }
        Comparator<Integer> compare = (a, b) -> a > b ? 1 : -1;

        Collections.sort(newScore, compare);
        for (Integer student : newScore) {
            System.out.println(String.format("%s Scored %s", student,
                    records.entrySet()));
        }

        // System.out.println(newScore);

    }
}