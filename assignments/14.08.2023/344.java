class S344 {
    public void reverse(char[] s, int start, int end) {
       if(start >= s.length/2)  
            return;
        char temp = s[start];
        s[start] = s[s.length-1-start];
        s[s.length-1-start] = temp;
        reverse(s, start+1 , end-1);
    }
    public void reverseString(char[] s) {
        reverse(s,0, s.length-1);
    } 
}
