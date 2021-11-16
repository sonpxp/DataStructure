package Tree;

public class SampleTest {

    public static void main(String[] args) {
        //test BinaryTree
        /*MyBinaryTree myTree = new MyBinaryTree();
        myTree.init();*/

        //test BST - solution 1
        MyBinarySeachTree myBST = new MyBinarySeachTree();
        /*myBST.mRoot = myBST.insert(myBST.mRoot, 5);
        myBST.mRoot = myBST.insert(myBST.mRoot, 1);
        myBST.mRoot = myBST.insert(myBST.mRoot, 6);
        myBST.mRoot = myBST.insert(myBST.mRoot, 0);
        myBST.mRoot = myBST.insert(myBST.mRoot, 3);
        myBST.mRoot = myBST.insert(myBST.mRoot, 7);
        myBST.mRoot = myBST.insert(myBST.mRoot, 2);
        myBST.mRoot = myBST.insert(myBST.mRoot, 4);*/

        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 5);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 1);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 6);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 0);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 3);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 7);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 2);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 4);

        System.out.println("Done");

    }
}
