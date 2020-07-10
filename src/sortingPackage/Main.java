package sortingPackage;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);

        //var kth = list.getKthFromTheEnd(4);
        //System.out.println(kth);
        list.printMiddle();

        var list2 = LinkedList.createWithLoop();
        System.out.println(list2.hasLoop());
    }
}