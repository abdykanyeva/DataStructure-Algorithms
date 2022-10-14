public class SingleLinkedListApp {

    public static void main(String[] args) {

        MySinglyLinkedList ssl = new MySinglyLinkedList();
        System.out.println(ssl.isEmpty());

        for (int i = 0; i < 10; i++) {
            ssl.add(i);

        }

        ssl.printNodes();
        ssl.deleteById(7);
        ssl.printNodes();
        System.out.println(ssl.indexOf(1));
        ssl.addFirst(5);
    }




}
