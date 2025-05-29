import java.util.Arrays;

public class TwoFourTree {

    private class TwoFourTreeItem 
    {
        int values = 1;
        int value1 = 0;                             // always exists.
        int value2 = 0;                             // exists iff the node is a 3-node or 4-node.
        int value3 = 0;                             // exists iff the node is a 4-node.
        boolean isLeaf = true;
        
        TwoFourTreeItem parent = null;              // parent exists iff the node is not root.
        TwoFourTreeItem leftChild = null;           // left and right child exist iff the note is a non-leaf.
        TwoFourTreeItem rightChild = null;          
        TwoFourTreeItem centerChild = null;         // center child exists iff the node is a non-leaf 3-node.
        TwoFourTreeItem centerLeftChild = null;     // center-left and center-right children exist iff the node is a non-leaf 4-node.
        TwoFourTreeItem centerRightChild = null;


        // finished by me
        public boolean isTwoNode() 
        {
            if (values == 1)
            {
                return true;
            } 
            else 
            {
                return false;
            }
        }

        // finished by me
        public boolean isThreeNode() 
        {
            if (values == 2)
            {
                return true;
            } 
            else 
            {
                return false;
            }
        }

        // finished by me
        public boolean isFourNode() 
        {
            if (values == 3)
            {
                return true;
            } 
            else 
            {
                return false;
            }
        }

        // finished by me
        public boolean isRoot() 
        {
            if(parent == null)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        public TwoFourTreeItem(int value1) 
        {
            this.value1 = value1;
            this.values = 1;
        }

        public TwoFourTreeItem(int value1, int value2) 
        {   
            if (value1 < value2)
            {
                this.value1 = value1;
                this.value2 = value2;
            } else
            {
                this.value2 = value1;
                this.value1 = value2;
            }
            this.values = 2;
        }

        public TwoFourTreeItem(int value1, int value2, int value3) 
        {
            int[] vals = {value1,value2,value3};
            Arrays.sort(vals);
            this.value1 = vals[0];
            this.value2 = vals[1];
            this.value3 = vals[2];
            this.values = 3;
        }

        // completed by Gerber
        private void printIndents(int indent) 
        {
            for(int i = 0; i < indent; i++) System.out.printf("  ");
        }

        // completed by Gerber
        public void printInOrder(int indent) 
        {
            if(!isLeaf) leftChild.printInOrder(indent + 1);
            printIndents(indent);
            System.out.printf("%d\n", value1);
            if(isThreeNode()) {
                if(!isLeaf) centerChild.printInOrder(indent + 1);
                printIndents(indent);
                System.out.printf("%d\n", value2);
            } else if(isFourNode()) {
                if(!isLeaf) centerLeftChild.printInOrder(indent + 1);
                printIndents(indent);
                System.out.printf("%d\n", value2);
                if(!isLeaf) centerRightChild.printInOrder(indent + 1);
                printIndents(indent);
                System.out.printf("%d\n", value3);
            }
            if(!isLeaf) rightChild.printInOrder(indent + 1);
        }
    }

    TwoFourTreeItem root = null;

    public boolean addValue(int value) {

        //empty tree, add root
        if(root == null)
        {
            root = new TwoFourTreeItem(value);
            return true;
        }

        TwoFourTreeItem current = root;



        return false;
    }

    public boolean hasValue(int value) {
        return false;
    }

    public boolean deleteValue(int value) {
        return false;
    }

    // commpleted by Gerber
    public void printInOrder() {
        if(root != null) root.printInOrder(0);
    }

    public TwoFourTree() 
    {

    }
}
