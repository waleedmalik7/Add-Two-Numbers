class add_two_numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode header =  new ListNode(0);
        ListNode l3 = header;

        int carry = 0;

        while(l1!= null || l2 != null || carry != 0){

            int first = l1 == null ? 0 :l1.val;
            int second = l2 == null ? 0 :l2.val;
            int sum  = first + second + carry;    
           
            l3.next = new ListNode(sum  % 10);

            carry = sum / 10; 


            l1 = l1 == null ? null: l1.next;
            l2 = l2 == null ? null: l2.next;

            l3 = l3.next;
        }
        return header.next;
        
    }
}