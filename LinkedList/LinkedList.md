# Linked List

Linked List advantages vs disadvantages

- adv: Dynamic size
- adv: Sequential space isn't not required,
- adv: Good Removal,
- adv: Good Insertion,
- adv: No space wastage,
- dis: Random access is not allow
- We use linked lists to store a list of objects in sequence but unlike arrays linked lists can grow and shrink automatically, a link list consists of a group of nodes in sequence each node holds two pieces of data one is the value and the other is the address of the next node in the list.
  the first node is called head and the last node called tail.

### Linked list operations time complexity

- `lookup by value O(n)`// because the value that we are looking for may be stored in the last node and that is the worst case
- `lookup by index O(n)` // unlike arrays where items are stored sequentially the nodes of a linked list can be all over the place in memory they may not be exactly next to each other, that's why each node need to keep a reference to the next node for this reason we can not quickly look up an item by its index we have to traverse the list until we find the item, in the worst case scenario that item can be at the end of the list so once again here we have O(n)
- `insert at the end O(1)` // because simple create a new node and make the last node point to it
- `insert at the beginning O(1)`// because again make a new node link it to the first node and change the head to point to this new node again.
- `insert at the middle O(n)`//for example at the 10th node, first we have to find that node and thats take an O(n) and then updating take O(1) so the worst case is O(n).
- `delete the first item O(1)` // super fast we simply set the head to point at the second note, that is O(1) operation, then we should also remove the link from the previous head so it doesn't reference the second node anymore, if we don't do this the java's garbage collector will think this object still in use and it wont remove it from the memory.
- `delete the last item O(n)`// we have to traverse the list all the way to the tail as soon as we get to the node before the last node we keep a reference to it as the previous node then we'll unlink this node from the final node and make the tail point to the previous node
- `delete from the middle O(n)`// we have to traverse the list to find out the node as well as its previous node we should link the previous node to the node after this node and then remove its link.

If the last element in the linked list points at the first element this is called circular linked list.
