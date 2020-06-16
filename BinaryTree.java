class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public boolean is_empty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(int x) {
        if (is_empty() == false) {
            Node n = root;
            while (n != null) {
                if (x == n.key) {
                    n = null;
                    break;
                } else if (x < n.key) {
                    if (n.left == null) {
                        n.left = new Node(x);
                        break;
                    }
                    n = n.left;
                } else {
                    if (n.right == null) {
                        n.right = new Node(x);
                        break;
                    }
                    n = n.right;
                } 
            }
        } else {
            root = new Node(x);
        }
    }

    public boolean search(int x) {
        if (is_empty() == false) {
            Node n = root;
            while (n != null) {
                if (x == n.key) {
                    return true;
                } else if (x < n.key) {
                    n = n.left;
                } else {
                    n = n.right;
                    }
                }
            return false; 
        } else {
            return false;
        }
    }

    public int find_min() {
        Node n = root;
        while (n.left != null) {
            n = n.left;
        }
        return n.key;
    }

    public int find_max() {
        Node n = root;
        while (n.right != null) {
            n = n.right;
        }
        return n.key;
    }

    public int find_height() {
        if (is_empty() == true) {
            return -1;
        }
        int h1 = 0;
        int h2 = 0;
        Node n = root;
        return height_helper(h1, h2, n);
    }

    public int height_helper(int h1, int h2, Node node) {
        if (node.left != null) {
            h1 = 1 + height_helper(0, 0, node.left);
        }
        if (node.right != null) {
            h2 = 1 + height_helper(0, 0, node.right);
        }
        if (h1 >= h2) {
            return h1;
        }
        return h2;
    }

    public void inorder_list() {
        /*  1) Left subtree
            2) Root
            3) Right subtree */
        Node n = root;
        String lst = "";
        in_h(lst, n);
        System.out.println("");
    }

    public void in_h(String lst, Node node) {
        if (node != null) {
            in_h(lst, node.left);
            System.out.print(node.key + " ");
            in_h(lst, node.right);
        }
    }
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        System.out.println(bst.search(10));
        System.out.println(bst.is_empty());
        System.out.println(bst.find_height());
        bst.insert(10);
        System.out.println(bst.find_height());
        System.out.println(bst.is_empty());
        bst.insert(5);
        System.out.println(bst.find_height());
        bst.insert(15);
        bst.insert(1);
        System.out.println(bst.find_height());
        System.out.println(bst.search(5));
        System.out.println(bst.search(10));
        System.out.println(bst.search(15));
        System.out.println(bst.search(20));
        System.out.println(bst.find_min());
        System.out.println(bst.find_max());
        bst.inorder_list();
    }
}

class Node {
    int key;
    Node right, left;

    public Node(int item) {
        key = item; // Node Value
        left = right = null; // initial node will have no children
    }
}