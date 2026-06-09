class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> temp = new Stack<>();
        int i = 0;
        int[] answer = new int[temperatures.length];

       
       for (int j = 0; j < temperatures.length; j++) {

            while (!temp.isEmpty() && temperatures[j] > temperatures[temp.peek()]) {

                int ancienIndex = temp.pop();

                answer[ancienIndex] = j - ancienIndex;

            }

            temp.push(j);

        }
        return answer;
    }
}
