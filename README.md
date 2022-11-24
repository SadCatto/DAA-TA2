# DAA TA2 
---
## **Problem Statement :**
---
####  Step 1: Let “n” be the size of an array.Step 2: Accept “n” input from keyboard
#### Step 3: Create a Dqueue with insertion of element alternately from front and rear end. For example: if elements in array are: [1, 5, 2, 9, 11] etc..
#### If element insertion start with F-R-F-R combination, then values stored will be [1] [1,5], [2,1,5], [2,1,5,9], [11,2,1,5,9]
#### Create the code and demonstrate execution with 03 test cases
#### Step 4: The insertion on Dqueue is carried with certain condition.
#### Condition 1: If the element present at front is less than the new element, then new element will be inserted in front. [Otherwise]
#### Condition 2: If element present at rear is less than the new element, then new element will be inserted at rear.
#### Condition 3: If both condition 1 and condition 2 not satisfied, ignore the element and consider new element.
#### Find out difference between size of Dqueue and size of array. [The difference will be number of elements in array not inserted in the Dqueue].
#### Comment on shape of Dqueue: How the elements present in the Dqueue look like. [Ascending/Descending/or …]
## **Solution Logic**
---
#### In this problem we have to insert certain elements into dequeue in respective order by altering the entry point of the element. If the first element is inserted from the front then the next element is inserted form the rear and so on.
#### We are also checking certain conditions based on which we decide if the element is to be inserted from the front rear or should be ignored completely.
#### There are two conditions which we have to check for insertion of an element. If the insertion is from front then we check if the element to be inserted is greater than the element in the front. If the new element is greater than the first element then we insert it from the front else we check if the new element is greater than the element at rear, if it is greater then we insert the new element from the rear. Else we ignore the element and move to the next element.
#### To check whether new element should be inserted from the front or rear i have maintained a flag variable. Whenever the flag variable is true the element is inserted from front(checks front insertion condition first) else if the flag is false then the element is tried to insert from the rear first.
## Test Cases:
---
### Test Case 1 : Insertion in Ascending Order
```
Input Size : 5
Input (in order) : 2 4 5 7 8
Output : 8 5 2 4 7
```
![image](https://user-images.githubusercontent.com/39466756/203856692-f32389cb-319f-41aa-bf32-0c9f5ca3a727.png)
```
Observation : All the elements are inserted in the dequeue in order F-R-F-R-F.
```
### Test Case 2 : Insertion in Descending Order
```
Input Size : 6
Input (in order) : 12 9 7 6 4 2
Output : 12
```
![image](https://user-images.githubusercontent.com/39466756/203858012-8c572846-5a80-46b3-a300-5212030847bb.png)

```
Observation : Only the first element is inserted into the dequeue and after that no element is inserted as the 
insertion conditions are not met as every new input is smaller than the first element.
```
### Test Case 3 : Insertion in Random Order
```
Input Size : 7
Input (in order) : 15 22 1 16 99 5 152
Output : 152 99 16 15 22
```
![image](https://user-images.githubusercontent.com/39466756/203858287-4b1d0bcb-53e9-428a-9870-2bd77b29235d.png)

```
Observation : Elements are inserted randomly based on the two conditions. 
There is a trend which shows that till the element which was inserted first the deueue is in descending order and 
after that it is in ascending order.
```
