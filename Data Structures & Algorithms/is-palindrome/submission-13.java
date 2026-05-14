class Solution {
    public boolean isPalindrome(String s) {
        String isValid = "";
        String copyS = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        for (int i = copyS.length()-1; i >= 0; i--){

            isValid += copyS.charAt(i);
        }


        return copyS.equals(isValid);
    }

       
}
