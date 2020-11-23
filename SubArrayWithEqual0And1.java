 int maxLen(int[] arr, int N)
    {
       Map<Integer,Integer>map=new HashMap<Integer,Integer>();
       map.put(0,-1);
       int ans=0;
       int sum=0;
       for(int i=0; i<N; i++){
           if(arr[i]==1)
                sum+=1;
            else if(arr[i]==0)
                sum+=-1;
            if(map.containsKey(sum)){
                int idx=map.get(sum);
                int len=i-idx;
                if(ans<len)
                    ans=len;
            }
            else
                map.put(sum,i);
       }
       return ans;
    }
}
