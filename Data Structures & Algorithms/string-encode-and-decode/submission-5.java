class Solution {

    public String encode(List<String> strs) {
        String answer = ""; 
       for (String word : strs){
        answer += String.valueOf(word.length());
        answer += "#";
        answer += word;
       }
       return answer;
    }
    public List<String> decode(String str) {
        ArrayList<String> answer = new ArrayList<>();
        int i = 0;
         while (i < str.length()) {
            int posHashtag = i;
            while (str.charAt(posHashtag) != '#') {
                posHashtag++;
            }
            int wordLength = Integer.parseInt(str.substring(i, posHashtag));
            int debutMot = posHashtag + 1;
            int finMot = debutMot + wordLength;
            String mot = str.substring(debutMot, finMot);
            answer.add(mot);
            i = finMot;
        }
        return answer;
    }

}
