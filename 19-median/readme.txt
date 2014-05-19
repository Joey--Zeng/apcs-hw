Hash Map
Implements map interface (tree map)
key - vaule
put(key, value) to store data
values have unique keys
hash value calculated using key object


Hash Set
Implements set interface
uses add(value) to store data
cannot see what order you put the elements in (order not preserved)
does not allow duplicate hash values
hash value calculated based on object.hashcode 
if object.equals(object2) is false then they are different objects

How is a HashMap implemented
HashMap implements hashtable, no order by keys or values
tree map is based on red-black tree structure, there is order by key

Hash maps are faster, probably because they are not ordered by key, 
but if a hash map has a lot of collisions then it can be slow
Tree Maps will always give O(log n) preformance

heap structure 
the java heap structure is the priority queue.