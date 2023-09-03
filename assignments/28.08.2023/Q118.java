import java.util.ArrayList;
import java.util.List;

public class Q118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int num = 1;
            for (int j = 0; j <= i; j++) {
                row.add(num);
                num = num * (i - j) / (j + 1);
            }
            triangle.add(row);
        }
        
        return triangle;
    }
}
