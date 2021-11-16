package Tree;

public class MyBinarySeachTree {
    // BST -> BinarySeachTree

    // Node root manager children node in tree
    TreeNode mRoot;

    public MyBinarySeachTree() {
    }

    // solution 1:
    /*public TreeNode insert(TreeNode root, int value) {

        // TH1: root == null
        TreeNode newNode = new TreeNode(value);
        if (root == null) {
            root = newNode;
            return root;
        } else { // TH2:
            TreeNode temp = root; // tro temp vao root
            while (true) {
                // (ko set TH: temp == node)
                if (value > temp.val) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }
                } else if (value < temp.val) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                }
            }
            return root;
        }
    }*/

    // solution 2: su dung de quy
    // insertIntoBST: add value in rootNode tree
    public TreeNode insertIntoBST(TreeNode rootNode, int value) {
        if (rootNode == null) {
            return new TreeNode(value);
        }
        if (value < rootNode.val) {
            if (rootNode.left == null) {
                rootNode.left = new TreeNode(value);
            } else {
                insertIntoBST(rootNode.left, value);
            }
        } else {
            if (rootNode.right == null) {
                rootNode.right = new TreeNode(value);
            } else {
                insertIntoBST(rootNode.right, value);
            }
        }
        return rootNode;
    }

}
