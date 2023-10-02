import java.util.Stack;

public class Q2390 {
    public String removeStars(String s) {
        Stack<Character> st = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }      
        }
        char[] resultArray = new char[st.size()];
        for (int i = resultArray.length - 1; i >= 0; i--) {
            resultArray[i] = st.pop();
        }
        String result = new String(resultArray);
        return result;
    }
}
