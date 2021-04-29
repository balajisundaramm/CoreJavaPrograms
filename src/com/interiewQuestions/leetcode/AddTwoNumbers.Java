

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddTwoNumbers {
    /*
        Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
    */
    public static void main(String[] args)
    {
        List<Integer> l1 = new ArrayList<>();
        l1.add(3);
        l1.add(7);
        List<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(9);
        l2.add(5);
        System.out.println(addTwoNumbers(l1, l2));
    }

    public static List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2){
        List<Integer> result = new ArrayList<>();
        int size = (l1.size() > l2.size()) ? l1.size() : l2.size();
        int sum = 0;
        int carry = 0;
        for(int i = 0; i<size; i++) {
            if(i<l1.size() && i<l2.size()) {
                sum = carry + l1.get(i) + l2.get(i);
                carry = sum/10;
            } else if(i<l1.size()) {
                sum = carry + l1.get(i);
                carry = sum/10;
            } else {
                sum = carry + l2.get(i);
                carry = sum/10;
            }
            if(carry==0) {
                result.add(sum);
            } else {
                result.add(sum%10);
            }
            if(i+1 == size & carry !=0) {
                result.add(carry);
            }
        }
        return result;
    }

}
