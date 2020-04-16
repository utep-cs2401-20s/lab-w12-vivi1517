import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class myBinarySearchTreeTester {

    @Test
    /*I chose to pass an array of size 4 to make sure that I properly coded the size method.
     *I wanted to make sure the recursion was not off by one.
     * I also wanted to make sure that my insert method actually was adding the nodes to the tree.
     *My test passed.
    */
    public void insertTest(){
        myBinarySearchTreeNode root = new myBinarySearchTreeNode(10);
        root.insert(15);
        root.insert(5);
        root.insert(4);
        assertEquals(4, root.size());
    }

    @Test
    /*I wanted to see if my program was correctly inserting numbers and also to see if it was
     *correctly calculating the depth of the number we are looking for. I made it look for the number 6.
     * The depth should have been equal to 3.
     * My test passed.
     */
    public void depthTest(){
        int[] array = new int[3];
        array[0] = 7;
        array[1] = 2;
        array[2] = 9;
        myBinarySearchTreeNode root = new myBinarySearchTreeNode(array);
        root.insert(1);
        root.insert(5);
        root.insert(6);
        assertEquals(3, root.depth(6));
    }

    @Test
    /*Now that I know that my program correctly inserts the numbers I wanted to see if it correctly calculated
     *the height of the tree. I chose to pass an array that had was not totally full so that some numbers would
     * be at lower levels than others. I wanted to make sure it was correctly comparing the heights.
     * The height should have been equal to 3.
     * My test passed.
     */
    public void heightTest(){
        int[] array = new int[7];
        array[0] = 7;
        array[1] = 2;
        array[2] = 9;
        array[3] = 1;
        array[4] = 8;
        array[5] = 11;
        array[6] = 12;
        myBinarySearchTreeNode root = new myBinarySearchTreeNode(array);
        assertEquals(3, root.height());
    }

    @Test
    /*I wanted to make sure that my program would not allow any duplicates in the tree.
     *I chose to start a tree and then use the insert method to try to insert a duplicate.
     * My code should give me an error message. As a result the size should be unchanged.
     * My test passed.
     */
    public void constructorTest(){
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(7);
        tree.insert(2);
        tree.insert(9);
        tree.insert(1);
        tree.insert(8);
        tree.insert(11);
        tree.insert(12);
        tree.insert(7);
        assertEquals(7, tree.size());
    }

    @Test
    /*I wanted to make sure that my depth method would return 0 if the number we were looking for was the root.
     *I chose to pass an array with 7 as the root.
     * My test passed.
     */
    public void rootDepthTest(){
        int[] array = new int[7];
        array[0] = 7;
        array[1] = 2;
        array[2] = 9;
        array[3] = 1;
        array[4] = 8;
        array[5] = 11;
        array[6] = 12;
        myBinarySearchTreeNode root = new myBinarySearchTreeNode(array);
        assertEquals(0, root.depth(7));
    }
}
