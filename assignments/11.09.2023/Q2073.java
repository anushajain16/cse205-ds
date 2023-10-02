import java.util.LinkedList;
import java.util.Queue;

public class Q2073 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int ans = 0;
        for(int i=0;i<tickets.length;i++)
        {
            q.add(i);
        }
        while(!q.isEmpty())
        {
            int index = q.poll();
            tickets[index]--;
            ans++;
            if(tickets[index]==0 && index==k)
            {
                return ans;
            }
            if(tickets[index]>0)
            {
                q.add(index);
            }
        }
        return ans;
    }
}
