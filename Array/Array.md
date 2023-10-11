# Array Data Structure

Array vs List

List: is a collection of items takes the same type

Array: is the simplest data structures and we use them to store a list of items like a list of string, numbers and anything. these items get stored sequentially in memory.
for example if we allocate an array of five integers, these integers get stored in memory like this [10,20,30,40,50]. let's say the address of the first integer is 100, integers in java takes 4 bytes of memory so the second item would be stored at the memory location 104,the next ones at 108, 112, 116. so accessing items in array is super fast we give our array an index and it will figure out where exactly in memory it should access.

So if you want to store a list of items and access them by their index arrays are the optimal data structures for you.

### Limitations and weaknesses or arrays

in java and many other languages array s are static which means when we allocate them we should specify their size and this size cannot be change later on, so we need to know ahead how many items we want to store, but what if we don't know exactly then you have to guess, if you guess too large there will be wastage of memory and if you guess too low the array will get filled quickly, then to add another item we'll have to resize the array which means we should allocate a larger array and then copy all the items in the old array into the new array, this operation can be costly and it will take O(n) time to do.

### Array operation complexity

Lookup O(1) // you access by the index
Insert O(n)
Delete O(n) // you delete by the index if you want to delete the last item which is the best case O(1), but the worst case is if you want to delete the first item you have to shift all the items then delete it.

when adding an item to the array at certain index the element at that index get shifted to clear space to the new item
so for ex.
[20,10,12,12 13 14,]
if i want to add element 11 to the array at index 2
the element 14 at index 5 will go to index 6 so
arr[6]=arr[5]
arr[5]=arr[4]
arr[4]=arr[3]
arr[3]=arr[2]
so loop list[i]=list[i-1]

## Array advantages and disadvantages

- adv: fixed access time :O(1)
- dis: fixed size, sequential, bad removal, bad insertion, space wastage.
