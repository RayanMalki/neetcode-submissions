class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
        (a, b) -> map.get(a) - map.get(b)
    );

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int n : map.keySet()){
            maxHeap.add(n);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }

        int[] resultat = new int[k];
        for (int i = 0; i < k; i++) {
            resultat[i] = maxHeap.poll();
        }

        return resultat;

    }
}

