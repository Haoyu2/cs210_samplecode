package umb.edu.cs210.test1;

/*
*   Write your answer in the main function. Change the "Z" to your answer.
*
*   Problem 1.
*   Insert the following keys in that order into a maximum-oriented heap-ordered binary tree
*   (starting index of 1 based):
*
*       7   3   8   5   2   4   1   6
*
*  a. What is the Key with index 1?
*
*   A.  7
*   B.  3
*   C.  8
*   D.  2
*   E.  6
*
*   Your Answer:
*
*   b. What is the key with index 5?
*
*   A.  7
*   B.  3
*   C.  8
*   D.  2
*   E.  6
*   Your Answer:
*
*   c. If we perform a delMax() operation on the tree, what is the key that will replace
*       the current maximum before it is sunk down?
*
*   A.  7
*   B.  3
*   C.  8
*   D.  2
*   E.  6
*
*   Your Answer:
*
*   Problem 2. Consider inserting the following key-value pairs in that order
*   into a symbol table st .
*
*   key:    A   S   D   A   B   B   A   C   D   E
*   value:  7   3   8   5   2   4   1   6   0   9
*
*   a. What is the value returned by st.size() ?
*
*   A.  10
*   B.  8
*   C.  6
*   D.  4
*   E.  2
*
*   b. What is the value returned by st.get("A") ?
*
*   A.  1
*   B.  2
*   C.  3
*   D.  4
*   E.  5
*
*   Problem 3. Consider inserting the following keys (assume values to be
*   non null and arbitrary) into a binary search tree (BST) symbol table st,
*   an object of type BST .
*       8   3   1   7   11  9   4   6   10
*
* a. What is the height of the BST (assume root to be at height 0)?
*   A.  1
*   B.  2
*   C.  3
*   D.  4
*   E.  5
*
* b.    What is the value returned by st.rank(4) ?
*   A.  1
*   B.  2
*   C.  3
*   D.  4
*   E.  5
*
* c. What is the order in which the keys are visited if we traverse the BST in pre-order?
*
*   A.  8   3   1   7   11  9   4   6   10
*   B.  8   3   1   7   4   6   11  9   10
*   C.  1	6	4	7	3	10	9	11  8
*   D.  1	3   4	6	7	8	9	10	11
*   E.  1	7	4	3	6	10	 9	 8	11
*
* ｄ. What is the order in which the keys are visited if we traverse the BST in in-order?
*
*   A.  8   3   1   7   11  9   4   6   10
*   B.  8   3   1   7   4   6   11  9   10
*   C.  1	6	4	7	3	10	9	11  8
*   D.  1	3   4	6	7	8	9	10	11
*   E.  1	7	4	3	6	10	 9	 8	11
*
* ｄ. What is the order in which the keys are visited if we traverse the BST in post-order?
*
*   A.  8   3   1   7   11  9   4   6   10
*   B.  8   3   1   7   4   6   11  9   10
*   C.  1	6	4	7	3	10	9	11  8
*   D.  1	3   4	6	7	8	9	10	11
*   E.  1	7	4	3	6	10	 9	 8	11
*
*
*
*
* Problem 4. Consider inserting the following keys into an initially empty 2-3 search tree.
*
*       8   3   1   7   11  9   4   6   10
*
* a. What is the height of the BST (assume root to be at height 0)?
*   A.  1
*   B.  2
*   C.  3
*   D.  4
*   E.  5
*
* a. How many 2-nodes does the tree contain?
*   A.  1
*   B.  2
*   C.  3
*   D.  6
*   E.  7
*
* c.How many 3-nodes does the tree contain?
*   A.  1
*   B.  2
*   C.  3
*   D.  4
*   E.  5
*
*
Problem 4. Consider inserting the following keys into a left-leaning red-black BST(LLRBT):
*
*       8   3   1   7   11  9   4
*
* a. What is the height of this LLRBT (assume root to be at height 0)?
*   A.  1
*   B.  2
*   C.  3
*   D.  4
*   E.  5
*
* b. What is the key for 7's left child?
*   A.  1
*   B.  4
*   C.  3
*   D.  8
*   E.  NULL
*
* c.What is the color of key 3?
*   A.  RED
*   B.  BLACK
*
*
* Problem 6. Consider inserting the following keys (assume values to be non null and arbitrary)
*  into an initially empty hash table of M = 5 lists, using separate chaining. Use the hash
*  function h(k) = k mod M to transform the kth letter of the alphabet into a table index,
*   where 1 ≤ k ≤ 26.
*   B	Q	P	F	N	W	G	J	L	H	U	X
*   2   17  16  6   14  23  7   10  12  8   21  24
* a.  What is the length of the longest chain?
*   A.  1
*   B.  2
*   C.  3
*   D.  4
*   E.  5
*
*
* b. Which of the following keys is in the shortest chain?
*
*   A.  P
*   B.  B
*   C.  L
*   D.  W
*   E.  N
*
*
*Problem 7. Consider the  adjacency list below:
*
*           0:  2   5   1
*           1:  0   4
*           2:  0   5   3
*           3:  4   2   5   6
*           4:  1   3   6
*           5:  0   2   3
*           6:  3   4   0
*           7:  8   9
*           8:  7
*           9:  7
*
*
*a. Do a depth-first search with 0 as the source vertex, what would be the first path to 6,
*   it will find?
*
* A. Not reachable
* B. 0->1->4->3->6
* C. 0->2->5->3->4->6
* D. 0->5->3->4->6
* E. 0->5->2->3->4->6
*
* b. Do a breath-first search with 0 as the source vertex, what would be path to 6,
*   it will find?
*
* A. Not reachable
* B. 0->6
* C. 0->2->3->6
* D. 0->2->5->3->4->6
* E. 0->5->2->3->4->6
*
*
*
* */


import java.util.HashMap;
import java.util.Map;


public class MutiChoice {
    Map<String, String> answers = new HashMap<>() {
        {
            put("1.a", "Z");
            put("1.b", "Z");
            put("1.c", "Z");

            put("2.a", "Z");
            put("2.b", "Z");

            put("3.a", "Z");
            put("3.b", "Z");
            put("3.c", "Z");
            put("3.d", "Z");
            put("3.e", "Z");


            put("4.a", "Z");
            put("4.b", "Z");
            put("4.c", "Z");

            put("5.a", "Z");
            put("5.b", "Z");
            put("5.c", "Z");


            put("6.a", "Z");
            put("6.b", "Z");


            put("7.a", "Z");
            put("7.b", "Z");




        }
    };
}

