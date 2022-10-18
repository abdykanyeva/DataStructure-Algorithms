public class SingleLinkedListApp {

    public static void main(String[] args) {

        MySinglyLinkedList ssl = new MySinglyLinkedList();
        System.out.println(ssl.isEmpty());

        for (int i = 0; i < 10; i++) {
            ssl.add(i);

        }

        ssl.printNodes();
        System.out.println(ssl.getKthItemFromTheLast(3));

        ssl.removeKthNodeFromTheEnd(2);
        ssl.printNodes();


    }




}
