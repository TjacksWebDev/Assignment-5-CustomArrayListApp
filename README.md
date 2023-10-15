# Assignment 5

 
This assignment will focus on algorithms, specifically around coding your own implementation of the ArrayList data structure.

Note: No cheating and looking at Java’s source code to see how they solved it!

Your task is to implement all the abstract methods in the CustomList interface via the CustomArrayList class.

While you’re implementing code inside of the CustomArrayList class, you should test it inside of a CustomListApplication class with a main method.

Please make sure you try adding more than 10 elements to your CustomList.


How to grow the backing Object array
When adding a new element, if the backing Object array is full, you should have the array double in size.

So, when adding the 11th element, the backing Object array will grow from 10 to 20 elements in size.

When adding the 21st element, it should grow from 20 to 40 elements in size, etc.

For this assignment, we won’t worry about the ability to remove elements from our array.


Testing your code
The purpose of the assignment is to add code to the CustomArrayList class, but in order to make sure that your code works, you'll need to test it.

I'd recommend testing it by instantiating your class and inserting elements into it.

CustomList<String> myCustomList = new CustomArrayList<>();
myCustomList.add("element 1"); // and continue to add another 10, 20 or 40 more elements

// then you should validate that all the elements you've inserted actually exist in your data structure
for (int i=0; i<myCustomList.getSize(); i++) {
    System.out.println(myCustomList.get(i));
}
