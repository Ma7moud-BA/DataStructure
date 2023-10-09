# Array Data Structure

Array vs List

List: is a collection of items takes the same type

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
