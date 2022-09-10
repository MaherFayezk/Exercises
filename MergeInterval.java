import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeInterval {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        ArrayList<int[]> result = new ArrayList();

        for (int[] interval : intervals) {
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            } else {
                result.get(result.size() - 1)[1] = interval[1];
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
