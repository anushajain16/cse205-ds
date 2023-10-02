import java.util.Stack;

public class Q682 {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int a = s.pop();
                int b = a+s.peek();
                s.push(a); 
                s.push(b);
            } else if (operations[i].equals("D")) {
                s.push(s.peek() * 2);
            } else if (operations[i].equals("C")) {
                s.pop();
            } else {
                String op = operations[i];
                s.push(Integer.parseInt(op));
            }
        }
        
        int sum = 0;
        while (!s.isEmpty()) {
            sum += s.pop();
        }
        
        return sum;
    }
}
