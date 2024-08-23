class Solution
{
    
    static int findCandidate(int a[], int n)
    {
        int major_index = 0;
        int count = 1;
        for(int i = 1; i < n; i++)
        {
            if(a[major_index] == a[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count == 0)
            {
                major_index = i;
                count = 1;
            }
        }
        return a[major_index];
    }

  
    static boolean isMajorityElement(int a[], int n, int candidate)
    {
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            if(a[i] == candidate)
            {
                count++;
            }
        }
        return count > n / 2;
    }

    
    static int majorityElement(int a[], int size)
    {
       
        int candidate = findCandidate(a, size);

    
        if(isMajorityElement(a, size, candidate))
        {
            return candidate;
        }
        else
        {
            return -1;
        }
    }
}
