# Abstact 
This project purpose is to show how the sorting algorithms, which in this case are
Bubble, Merge, Selection and Quick sort compare to each other in time of completion.
The project firstly creates arrays that will hold the values of elapsed times, start to
create filled arrays with random values from 1 – 59 and each algorithm starts to sort it.
Before the algorithm starts to sort the arrays the system nano-second time starts and
ends just after the array is finished. With the value of the Elapsed time the software
adds it to the main array and after all the sorts have taken place the software generated
a graph with the use of the open source external Java library called JFREE chart “
http://www.jfree.org/ “. The chart then is displayed for the user and also saved in a
specific folder on a system.

# Product Perspective and Scope
This project is used for a project submission for Programming fundamentals class for Software
Engineer second year. This project is limited on number of interactions a user can have but the
information it provides is very useful in the real world. The objective was for me to create the code
so that the user can have the graph with the algorithms which are Bubble, Selection, Merge and
Quick sort as fast as possible, I managed to do it with just 1 click.
The user will get a 2d graph showing in the Y axis the time and the X axis the size of the array.
I started the array size from 3 because it is logical that sorting should start at that size.
(It is not very impressive that an algorithm can sort 1 or 2 numbers very fast).
I capped the maximum time at 500,000 because anything above that is considered a failure.
Remember the time is in Nano seconds so 500,000 nano-seconds is still 0.5 which is way fast that
what a human can perceive. But in computer time it is very large.
Since we are dealing with a huge numbers I used long data type.

This project is used for a project submission for Programming fundamentals class for Software
Engineer second year. This project is limited on number of interactions a user can have but the
information it provides is very useful in the real world. The objective was for me to create the code
so that the user can have the graph with the algorithms which are Bubble, Selection, Merge and
Quick sort as fast as possible, I managed to do it with just 1 click.
The user will get a 2d graph showing in the Y axis the time and the X axis the size of the array.
I started the array size from 3 because it is logical that sorting should start at that size.
(It is not very impressive that an algorithm can sort 1 or 2 numbers very fast).
I capped the maximum time at 500,000 because anything above that is considered a failure.
Remember the time is in Nano seconds so 500,000 nano-seconds is still 0.5 which is way fast that
what a human can perceive. But in computer time it is very large.
Since we are dealing with a huge numbers I used long data type.

The software has 4 most used sorting algorithms which is the main core of the software.
The program is designed with a simple as possible use. I designed it so that all the calculations are
made with one click.
Here is all the classes that I have used
# Implementation
Quick Explanation for all of the classes.
Main class doesn’t really have any special parts, all it does it creates objects for all the sorting
algorithms and send them data to do calculations, after we have all the data we use the
XYSeriesDemo to show the graph.
Summary of what all the classes do:
Bubble- In this class I implemented the Bubble sort algorithm, it also has a GetAverageTime
method.
Selection- In this class I implemented the Selection sort algorithm, it also has GetAverageTime
method.
Quick- In this class I implemented the Quick sort algorithm, it also has GetAverageTime method
Method- In this class I implemented the Quick sort algorithm, it also has a GetAverageTime
method.
Bogo- This sort is not yet fully implemented because it requires an advanced method that I yet don’t
know how to use.
XYSeriesDemo-This class is a subclass of JFREE library, it is specialized to create the dataset and
show the graph.

Import org.jfree.* library.
Create Object of every sorting Algorithm
`
new Bubble() ......
`
Create arrays that will hold all the time
`
New float []
`
You can set the size to whatever you want but in this case I tried 50 because I want the execution to
be very fast.
Create a for loop
For I from 0 – 50
All sorting algorithm. GetAverageTime ( I )
Push these values to the float arrays
Create a dataset with the arrays
Push this dataset with the name String to XYSeriesDemo Class

# Sorting Classes Explanation
In this section I will talk about Bubble, Merge, Quick and Selection classes.

Page 8
In every class the first method is the implementation of said Class. Also every single of these
classes Extend UsefulMethods and since UsefelMethods has an abstract Class and is obliged to
create GetAverageTime every time;
Get Average Time method.
For I from 0 to 10
Create an array with size from 0 to 50
Fill Array with random values
Start Time in nano seconds
Send this array as a parameter to said Class method
Stop time
Calculate the time
If time is &gt; 500000
Sort will return as a fail
Else
Return the time
# Useful Methods Explanation

This Class has 4 methods that are inherited in the sub classes
StartTime() starts the time
Get Time() returns the time after the
FillArray() fills an array with random values
An abstract method GetAverageTime

# Results
The software saves a .png file into a folder in my desktop with Full HD size. After the software is
executed we get the graph with all the information available at you instantaneously
In this case we see that Bubble data failed at size 19m, Merge and quick sort had the highest time
form 3 to 10 sized arrays. And as we would have guessed Quick Data is the fastest when the size
arrays increases.
