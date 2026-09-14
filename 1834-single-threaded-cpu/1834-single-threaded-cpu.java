class Solution {
    public int[] getOrder(int[][] tasks) {
        int n= tasks.length;
        int arr[][] = new int[n][3];
        for(int i=0; i<n; i++){
            arr[i][0]=tasks[i][0];
            arr[i][1]=tasks[i][1];
            arr[i][2]=i;
        }
        Arrays.sort(arr,(a,b)-> a[0]-b[0]);
        //min heap
        //processing time
        //second: index (original)
        PriorityQueue<int[]> mnh= new PriorityQueue<>(
            (a,b)->{
                if(a[0]!=b[0] )return a[0]-b[0];
                return a[1]-b[1];
            }
        );
        int ans[]= new int[n];
        int i=0, cnt=0;
        long time=0;
        while(cnt<n){
            //if heap is empty
            if(mnh.isEmpty() && time<=arr[i][0]){
                time= arr[i][0];
            }
            //add all task that arrived and in queue to min heap
            while(i<n && arr[i][0] <=time){
                mnh.add(new int[]{arr[i][1], arr[i][2]});
                i++;
            }
            // take task with min processing time
            int curr[]= mnh.poll();
            ans[cnt]= curr[1];
            //processing time need to add (process the task)
            time+= curr[0];
            cnt++;

        }
        return ans;
    }
}