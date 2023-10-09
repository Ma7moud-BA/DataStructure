# Stack Data Structure

First type of the stack is Array
meaning that we are going to deal with an array that has the stack features

One of these features is LIFO `Last in first out`

if you declare an array with a size of 5, then you added the first element to it for example adding 5.
add(5), this will make the `top` of the stack is 5, now if you add another element "10" the top of the stack will be 10, ...
in this array the top of the stack is tha last element that entered the stack and now if you delete an element the first one out is the 25 element because its the top of the stack and the last one added, then the top will be the '20' element
[5,10,15,20,25]
so if you want to access the first element '5' you will have to delete all the elements on top of it.

so why using `Stack`?
One of the stack usage is in the machine undo and redo "ctrl+z", like you were writing a thing and you deleted something by mistake you undo it this is possible because every letter you write is stored in a stack way.

another usage is in the browser when you want to go to the previous page etc...

# Array-Based Implementation of the ADT Stack

what are the functions to build this stack

- push(val)

  ```java
  top++; // increasing the index to the top of the stack
  Stack[top]=val; // setting the value
  ```

- pop()

```java
top--;
```

- getTop()

```java
return Stack[top];
```

- isEmpty()

[Stack Implementation](./Stack/stack/src/MyStack.java)
