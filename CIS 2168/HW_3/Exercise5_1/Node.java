package HW_3.Exercise5_1;

// Generic Node data type
class Node<E> {
   E data;
   Node next;

   // Would a constructor be useful in this small class?

   Node(E e) {
      this(e, null);
   }
   // (A constructor might initialize node data to the value e
   // and the next Node reference to null.)

   Node(E e, Node node) {
      data = e;
      next = node;
   }
}
