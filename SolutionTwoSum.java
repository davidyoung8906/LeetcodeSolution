public class SolutionTwoSum {
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int output [] = new int [2];
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i == j) continue;
                if (numbers[i] + numbers[j] == target){
                    output[0] = i+1;
                    output[1] = j+1;
                    return output;
                }
            }
        }
        return null;
        
    }
}