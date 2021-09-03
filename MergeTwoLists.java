
public class MergeTwoLists {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoList(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while (l1 != null && l2 != null)
        {
            if (l1.val < l2.val){
                dummy.next = l1;
                l1 = l1.next;
            }else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }
        if (l1 !=null){
            dummy.next = l1;

        }else{
            dummy.next = l2;
        }
        return head.next;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            res.val = l1.val;
            res.next = mergeTwoLists(l1.next, l2);
        }
        else {
            res.val = l2.val;
            res.next = mergeTwoLists(l1, l2.next);
        }
        return res;
    }
}
