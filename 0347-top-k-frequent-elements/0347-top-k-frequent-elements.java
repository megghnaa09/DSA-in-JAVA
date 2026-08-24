class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp= new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        PriorityQueue<int[]> minHeap= new PriorityQueue<>(
            (a,b)->a[0]-b[0]
        );
        //put all ele in nin heap
        for(Map.Entry<Integer,Integer>ent:mp.entrySet()){
            int num=ent.getKey();
            int freq = ent.getValue();
            minHeap.add(new int[]{freq,num});
            //keep only k ele
            if(minHeap.size()>k) minHeap.poll();
            
            
        }
        int ans[]= new int[k];
     for(int i=0; i<k; i++){
        ans[i]=minHeap.poll()[1];
    } return ans;
     }
     
}