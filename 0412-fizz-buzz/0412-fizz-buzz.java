class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            String currStr = "";

            if (divisibleBy3){ 
                currStr += "Fizz";
            }

            if (divisibleBy5){
                currStr += "Buzz";
            }

            if (currStr.isEmpty()){
                currStr += String.valueOf(i);
            }

            list.add(currStr);
        }
        
        return list;
    }
}
