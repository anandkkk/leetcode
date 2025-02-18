//https://leetcode.com/problems/add-two-numbers/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        int topup = 0;
        ListNode previous = null;
        ListNode current = null;
        while(l1!=null && l2!= null){
            int currentVal = l1.val + l2.val + topup;
            topup = currentVal/10;
            int finalVal = currentVal % 10;
            current = new ListNode(finalVal,null);
            if(result == null){
                result = current;
                previous = current;
            }else{
                previous.next = current;
                previous = current;
            }  
            l1 = l1.next;
            l2 = l2.next; 
            }
            ListNode remaining = (l1 != null) ? l1 : l2;
            while(remaining!=null){
            int currentVal = remaining.val + topup;
            topup = currentVal/10;
            int finalVal = currentVal % 10;
            current = new ListNode(finalVal,null);
            if(result == null){
                result = current;
                previous = current;
            }else{
                previous.next = current;
                previous = current;
            }
            remaining = remaining.next; 
            }
            if(topup > 0){
                current = new ListNode(topup,null);
                previous.next = current;
            }
            return result;
        }
    }
