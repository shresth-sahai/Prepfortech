// https://binarysearch.com/problems/Linked-List-to-Integer

import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int len(LLNode head){
        while(head!=null){
            return 1+len(head.next);
        }
        return 0;
    }
    public int solve(LLNode node) {
        int len = len(node)-1;
        int num = 0;
        while(node!=null){
            num += (Math.pow(2,len)*node.val);
            node = node.next;
            len--;
        }
        return num;
    }
}
