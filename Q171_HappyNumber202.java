// link to the question --> https://leetcode.com/problems/happy-number/description/


//  fast and slow pointer ------------------------------------
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);

        if(slow == 1)
        {
            return true;
        }
        return false;
    }
    private int findSquare(int num){
        int ans = 0;
        while(num > 0){
            int rem = num%10;
            ans += rem*rem;
            num /= 10;
        }
        return ans;
    }
}


//  HashSet ------------------------------------

class Solution {
    public boolean isHappy(int n) {
        // Create a set to keep track of the numbers that have already been seen
        Set<Integer> seen = new HashSet<>();
        
        // Loop until either n becomes 1 (in which case n is a happy number) or n is seen again (in which case n is not a happy number)

        while (n != 1 && !seen.contains(n)) {
            // Add n to the set of seen numbers
            seen.add(n);
            
            // Compute the sum of the squares of the digits of n
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            
            // Update n with the sum of the squares of its digits
            
            n = sum;
        }
        
        // If n is 1, it is a happy number; otherwise, it is not
        return n == 1;
    }
}