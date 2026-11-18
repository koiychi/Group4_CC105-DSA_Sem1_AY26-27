public class Problem5_Estrella {
  public static void main(String[] lj)  {
   int[] num = {1, 2, 3, 4, 5};
System.out.println("Array elements: ");

for (int i = 0; i < num.length; i++) {
   System.out.print(num[i]);
  if (i < num.length - 1) {
      System.out.print(", ");
       }
      }
    }
  }


/* 1. Can you use a For-Each loop with reverse traversal? 
   - No, because it only moves from start to the end, also
    it does not show index number so it won't let you count
    backward.

   2. Which is better: For-Each loop or For loop?
   - for me, They are both important. Because we use both of them
     for different problems, and they do different jobs. An example
     are the problems today, we use for loop whenever we need backward steps,
     and we need for-each loop to read the code easily without needing index numbers.

   3. What are the common use cases of array traversal?
    - The common use for this is to help programs to check and use all the data 
     that we input to find items, add totals, and print them out.

    */