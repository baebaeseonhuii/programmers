class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if(number%n == 0 && number%m == 0 && number <= 100 && number >= 10 && n >= 2 && m < 10) {
            answer = 1;
        } 
        return answer;
    }
}