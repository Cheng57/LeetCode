class Solution {
    public int maximumWealth(int[][] accounts) {
        int i = 0;
        int[] sumAccounts = new int[accounts.length];
        
        while (i < accounts.length){
            int j = 0;
            int sum = 0;
            
            while (j < accounts[i].length){
                sum += accounts[i][j];
                j++;
            }
            sumAccounts[i] = sum;
            i++;
        }
        int k = 1;
        int max = sumAccounts[0];
        
        while (k < sumAccounts.length){
            if (sumAccounts[k] >= max){
                max = sumAccounts[k];
            }
            k++;
        }
        return max;
    }
}