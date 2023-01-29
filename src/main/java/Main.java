public class Main {
    public static void main(String[] args) {


    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode car = head;
            while (car != null && car.next != null) {
                if (car.val == car.next.val) {
                    car.next = car.next.next;
                } else {
                    car = car.next;
                }
            }
            return head;
        }
    }
}
