# Queue Data Structure

Queue is the opposite of Stack it features FIFO "First In First Out"

Using array to implement queue

- In the stack DS we used push to add elements in the queue its called enqueue
- In the stack DS we used another variable "top" to add elements in the queue we need two variables front and rear

for example adding the element 2 4 6 to array
enqueue(2)
enqueue(4)
enqueue(6)

- The rear variable should point at 6 since its the last element added, and the front variable should point at 2 since its the first element added
- So if you want to dequeue() the element 2 should be out first, so the element 6 became the front element
- The dequeue should be at the front only
- The initial index for the front and rear should be the same like -1 -1 or 0 0 but when you work with the queue you should know the initial values
- for the same example arrayQueue[] max size is 5[null,null,null,null,null]

  1. enqueue(2) [2,null,null,null,null]
     when adding the first element it become the front and the rear since its the only element in the queue
  2. enqueue(4)  
     after adding 4 then increase the rear index by 1 but keep the front as it is pointing at the element 2 [2,4,null,null,null]
  3. enqueue(6)
     after adding 6 then increase the rear index by 1 but keep the front as it is pointing at the element 2 [2,4,6,null,null]
  4. dequeue()
     remove the front 2 [null,4,6,null,null]
     the front here pointing at element 4 index 1 , rear at 6 index2
  5. dequeue()
     remove the front 4 [null,null,6,null,null]
     the front here pointing at element 6 index 2 , rear at 6 index 2
  6. dequeue()
     remove the front 6 [null,null,null,null,null]
     the front here pointing at element null index 3 , rear at null index 2
  7. enqueue(7)
     after adding 7 then increase the rear index by 1 [nll,null,null,7,null]
     the front here pointing at element 7 index 3 , rear at 7 index 3
  8. enqueue(9)
     after adding 9 then increase the rear index by 1 [nll,null,null,7,9]
     the front here pointing at element 7 index 3 , rear at 9 index 4

     now there is a problem when reaching the end of the queue max size
     `Pre condition:` if(rear==MAXSIZE-1)// -1 because we started the initial index for the front and rear at -1
     `Post condition:` element enqueue if the queue is not full else element can't enqueue
     to fix this issue use the modulus operator %
     `rear=(rear+1)%MAXSIZE`
     so when the rear equals 4 at the end of the queue
     (4+1)%5=0 so the rear go back at the start of the queue
     now the rear =0 after adding another element (0+1)%5=1 so the rear goes to 1, after adding another element (1+1)%5=2 and like this it goes in a circular way

     same this applies to the front index
     `front=(front+1)%MAXSIZE`

     ### best case for initial value

     make the front variable equals the index 0 and the rear equals the last index
     [front,......,rear] max size 5
     so when enqueuing an element the rear becomes (4+1)%5=0
     so it point at the first element and we know since its the only element in the queue it becomes the front and rear at the same time
     adding another element (0+1)%5=1 and like so
     after dequeuing from the queue the front (0+1)%5=1 and like so

  Now there is a problem if you want to delete an element but the queue is empty, to solve this make a third variable count
  increase the count by 1 when adding element and decrease it by 1 when removing elements
  now by making a check
  if(count == MAXSIZE)// queue full
  if(count==0)// queue empty

  ### Questions about queue

  1. if you have a queue with max size of 100 the front is at 50 and the rear is at 70 what are the element in this queue at? we should start from the front to the rear so 50,51,52.....70
  2. if you have a queue with max size of 100 the front is at 99 and the rear is at 5 what are the element in this queue at?we should start from the front to the rear so 99,0,1.....5

  3. if you have a queue with max size of 15 the front is at 13 and the count is 5 where is the rear at ? since we start counting from the front, there is elements at the following indexes [13,14,0,1,2] so the rear is at index 2
  4. if the front and rear has the same index how many elements there is in the queue? 1

note: if the front leads the rear by 1 ex. "front =2 , rear=1 there is to possibility either the queue is full or empty

## Queue Applications

1.  Networking: for example the printer, if there is more than one device connected to the printer the request will be handled is a queue the first request will be don't first the like so
2.  Calling Center: if theres more than one call and there is only one person to respond to these calls you will be put on hold.
3.  Operating systems: the cpu handles every task coming to it one by one

#### Array-Based Implementation of the ADT Queue

functions:

- isEmpty()
- isFUll()
- enqueue()
- dequeue()
- getFront()
- getRear()
- getSize()
- clear()
