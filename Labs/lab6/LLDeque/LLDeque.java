public class LLDeque<T> {

    private class Node {
        Node prev;
        T item;
        Node next;

        Node(Node p, T i, Node n) {
            prev = p;
            item = i;
            next = n;
        }
    }

    private Node sentinel;
    private int size;

    /**
     * @return the number of items in the deque.
     */
    public int size() {
        return size;
    }

    /**
     * @return true if deque is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    // EXERCISE 6.1 COPY CONSTRUCTOR

    /**
     * Creates a (deep) copy of another Deque object.
	 * @param other is another LLDeque<T> object.
     */
    public LLDeque(LLDeque<T> other) {
//       if(other==null)
//           throw new IllegalArgumentException("other is null");
//
//       sentinel=new Node(null,null,null);
//       sentinel.prev=sentinel;
//       sentinel.next=sentinel;
//
//       size=0;
//
//       Node p=sentinel;
//       Node q=other.sentinel;
//       while(q.next!=null){
//          p.next=new Node(p,q.next.item,sentinel);
//          p=p.next;
//          q=q.next;
//          size++;
//
//       }
        if(other==null){
            throw new IllegalArgumentException("Other cannot be null!");
        }
        sentinel = new Node(null,null,null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size=0;

        Node p =sentinel;
        Node otherSentinel = other.sentinel;
        Node q=otherSentinel;
        while(q.next!=otherSentinel){
            p.next=new Node(p, q.next.item,sentinel);
            sentinel.prev=p.next;
            p=p.next;
            q=q.next;
            size++;
        }





//        this();
//        Node p = other.sentinel.next;
//        while (!p.equals(other.sentinel)) {
//            this.addLast(p.item);
//            p = p.next;
//        }







//        if(other==null){ throw new IllegalArgumentException("other is null");}
//        sentinel=new Node(null,null,null);
//        sentinel.prev=sentinel;
//        sentinel.next=sentinel;
//        size=0;
//
//
//        Node p=sentinel;
//        Node q=other.sentinel;
//        while(q.next!=null){
//            p.next=new Node(p,q.next.item,sentinel);
//            p=p.next;
//            q=q.next;
//            size++;
//
//        }
    }


    // EXERCISE 6.2 ADD NOT NULL TO FRONT

    /**
     * Adds an non-null item of type T to the front of the deque.
     * @param item is a type T object.
     * @throws IllegalArgumentException if the item is null.
     */
    public void addFirst(T item) {
        if(item==null){throw  new IllegalArgumentException("item is null");}
        Node p=new Node(sentinel,item,sentinel.next);
        sentinel.next.prev=p;
        sentinel.next=p;
        size++;
		
		
    }


    // EXERCISE 6.3 ADD LEGAL ITEM TO FRONT

    /**
     * Adds the first item of type T to the front of the deque,
     * or the second item of type T instead if the first item is illegal.
     * @param item1 is a type T object.
     * @param item2 is a type T object.
     */
    public void addLegalFirst(T item1, T item2) {
        try{
            addFirst(item1);
        }
		catch (IllegalArgumentException iae){
            addFirst(item2);
        }
    }
	

	
    /*
     *************************************************************
     * You can copy paste Lab 5 codes below if you want to use it
     *************************************************************
     */
// LAB EXERCISE 5.1 EMPTY CONSTRUCTOR

    /**
     * Creates an empty deque.
     */
    public LLDeque() {
        sentinel=new Node(null,null,null);
        sentinel.prev=sentinel;
        sentinel.next=sentinel;
        size=0;
    }


    // LAB EXERCISE 5.2 ADD TO FRONT

    /**
     * Adds an item of type T to the front of the deque.
     * @param item is a type T object added to the deque.
     */
    /*public void addFirst(T item) {
        Node p=new Node(sentinel,item,sentinel.next);
        sentinel.next.prev=p;
        sentinel.next=p;
        size++;

    }
*/

    // LAB EXERCISE 5.3 PRINT ITEMS

    /**
     * Prints the items in the deque from first to last,
     * separated by a space, ended with a new line.
     */
    public void printDeque() {
        Node p=sentinel.next;
        while(p!=sentinel){
            System.out.print(p.item+" ");
            p=p.next;
        }
        System.out.println();

    }


    // LAB EXERCISE 5.4 ITERATIVE GET ITEM

    /**
     * Gets the item at the given index.
     * If no such item exists, returns null.
     * Does not mutate the deque.
     * @param index is an index where 0 is the front.
     * @return the ith item of the deque, null if it does not exist.
     */
    public T iterGet(int index) {
        if(size==0||index<0||index>+size){ return null; }
        Node p=sentinel.next;
        while(index>0){
            p=p.next;
            index--;

        }
        return p.item;
    }


    // EXERCISE 5.1 ADD TO BACK

    /**
     * Adds an item of type T to the back of the deque.
     * @param item is a type T object added to the deque.
     */
    public void addLast(T item) {
        Node p=new Node(sentinel.prev,item,sentinel);
        sentinel.prev.next=p;
        sentinel.prev=p;
        size++;
    }



    // EXERCISE 5.2 DELETE FRONT

    /**
     * Deletes and returns the item at the front of the deque.
     * If no such item exists, returns null.
     * @return the first item of the deque, null if it does not exist.
     */
    public T delFirst() {
        Node p=sentinel.next;
        sentinel.next=p.next;
        p.next.prev=sentinel;

        return p.item;
    }


    // EXERCISE 5.3 DELETE BACK

    /**
     * Deletes and returns the item at the back  of the deque.
     * If no such item exists, returns null.
     * @return the last item of the deque, null if it does not exist.
     */
    public T delLast() {
        Node p=sentinel.prev;
        p.prev.next=sentinel;
        sentinel.prev=p.prev;

        return p.item;
    }


    // EXERCISE 5.4 RECURSIVE GET ITEM

    /**
     * Gets the item at the given index.
     * If no such item exists, returns null.
     * Does not mutate the deque.
     * @param index is an index where 0 is the front.
     * @return the ith item of the deque, null if it does not exist.
     */
    public  T recGet(int index) {

        return recGetHelper(index,sentinel.next);

    }
    private T recGetHelper(int i, Node node) {
        if(node==null||size<0||i>size||i<0){
            return null;
        }
        if (i == 0) {
            return node.item;
        }
        return recGetHelper(i - 1, node.next);
    }


    public static void main(String[] args) {
        LLDeque<String> deque = new LLDeque<>();
        deque.addLast("b");
        deque.addLast("a");
        deque.printDeque();
        System.out.println(deque);
    }
	

}
