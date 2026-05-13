class Solution {
    public boolean hasDuplicate(int[] nums) {

        int cpt=0;
        int num=0;

        for (int i=0 ;i< nums.length;i++){
             num= nums[i];
             cpt=0;

            for (int j=0 ;j< nums.length;j++){

                if (nums[j]==num){

                   cpt++;
                }
                 if(cpt>1){
                        return true;
                    }
            }


        }
        return false;
 
    }
}
