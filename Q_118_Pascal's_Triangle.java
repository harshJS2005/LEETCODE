import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) {
            return triangle;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                int sum = previousRow.get(j - 1) + previousRow.get  (j);
                currentRow.add(sum);
            }
            currentRow.add(1);
                        triangle.add(currentRow);
        }
        return triangle;
    }
}
