class Solution {
    public int sumofsquare(int n)
    {
        int sum=0;
        while(n>0)
        {
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer>seennum=new HashSet<>();
        while(n!=1)
        {
            n=sumofsquare(n);
            if(seennum.contains(n))
            {
                return false;
            }
            seennum.add(n);
        }
        return true;
        
    }
}
