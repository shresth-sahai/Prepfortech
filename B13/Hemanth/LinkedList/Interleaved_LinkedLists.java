// https://binarysearch.com/problems/Interleaved-Linked-List

import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode l0, LLNode l1) {
        LLNode ans = new LLNode();
        LLNode head = ans;
        while(l0!=null && l1!=null){
            ans.next = l0;
            l0 = l0.next;
            ans = ans.next;

            ans.next = l1;
            l1 = l1.next;
            ans = ans.next;
        }

        ans.next = (l0!=null) ? l0:l1;
        return head.next;
    }
}
