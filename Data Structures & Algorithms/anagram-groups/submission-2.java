class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>>map1 = new HashMap<>();

       

      for (int i = 0 ; i <strs.length; i++){
        int[] count = new int[26];
         for (char c: strs[i].toCharArray() ){
        count[c-'a']++;
        
    }
        String key= Arrays.toString(count);
        if(!map1.containsKey(key)){
            ArrayList<String> wordAdded = new ArrayList<>();
            map1.put(key,wordAdded);
        }

        map1.get(key).add(strs[i]);
      }

        return new ArrayList<>(map1.values());
    }
   

}
