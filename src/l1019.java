import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class l1019 {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);

        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(5);
        head.next = head1;
        head1.next = head2;

        int[] arr = nextLargerNodes(head);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static int[] nextLargerNodes(ListNode head) {

        List<Integer> list = new LinkedList<>();
        ListNode current = head.next;
        ListNode previous = head;

        while(previous!=null){
            while(current!=null){
                if(previous.val<current.val){
                    list.add(current.val);
                    break;
                }else if(current.next==null){
                    list.add(0);
                    break;
                }
                current = current.next;
            }
            current = previous.next;
            previous = previous.next;
        }

       return list.stream().flatMapToInt(i -> IntStream.of(i)).toArray();
    }

}
