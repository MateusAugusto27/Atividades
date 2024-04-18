// Classe para representar os nós da lista
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

// Classe para representar a lista ligada
class LinkedList {
    private ListNode head;

    public LinkedList() {
        this.head = null;
    }

    // Método para inserir um novo nó no início da lista
    public void insertAtBeginning(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    // Método para inserir um novo nó no final da lista
    public void insertAtEnd(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // Método para remover um nó específico da lista
    public void deleteNode(int val) {
        if (head == null) return;
        if (head.val == val) {
            head = head.next;
            return;
        }
        ListNode prev = null;
        ListNode current = head;
        while (current != null && current.val != val) {
            prev = current;
            current = current.next;
        }
        if (current == null) return;
        prev.next = current.next;
    }

    // Método para imprimir os elementos da lista
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Inserindo elementos na lista
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.insertAtEnd(4);
        
        // Imprimindo a lista
        System.out.print("Lista: ");
        list.printList(); // Saída esperada: 1 2 3 4
        
        // Removendo um elemento da lista
        list.deleteNode(2);
        
        // Imprimindo a lista após a remoção
        System.out.print("Lista após remoção: ");
        list.printList(); // Saída esperada: 1 3 4
    }
}