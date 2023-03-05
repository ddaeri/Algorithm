class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        if(n % slice == 0) {
            answer = n / slice;
        } else {
            // 0 으로 떨어지지 않으면 무조건 1판 더 시켜야하므로 + 1 해준다.
            answer = n / slice + 1;
        }
        return answer;
    }
}