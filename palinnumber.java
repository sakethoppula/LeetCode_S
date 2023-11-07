class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int n = x;
        int ct = 0;
        while (n != 0) {
            n = n / 10;
            ++ct;
        }
        System.out.println(ct);
        int[] arr = new int[ct];
        for (int i = 0; i < ct; i++){
            arr[i] = x%10;
            x = x /10;
        }

        int i = 0;
        int j = ct-1;

        while(i<j){
            if (arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
