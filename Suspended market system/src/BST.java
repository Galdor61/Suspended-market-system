
public class BST {

	 private TreeNode root;

	    private int size;

	    public BST() {

	    }

	    public BST(String[] data) {
	        for (String e : data) {
	            insert(e);
	        }
	    }

	    public boolean insert(String e) {
	        if (isEmpty()) {
	            root = new TreeNode(e);
	            size++;
	            return true;
	        }

	        TreeNode current = root;
	        while (true) {

	            if (e.compareTo(current.data) > 0) {
	                if (current.left == null) {
	                    current.left = new TreeNode(e);
	                    size++;
	                    return true;
	                } else {
	                    current = current.left;
	                }
	            } else if (e.compareTo(current.data) < 0) {
	                if (current.right == null) {
	                    current.right = new TreeNode(e);
	                    size++;
	                    return true;
	                } else {
	                    current = current.right;
	                }
	            } else {
	                return false;

	            }
	        }
	    }

	    public void inorder() {
	        inorder(root);
	    }

	    private void inorder(TreeNode node) {
	        if (node == null)
	            return;

	        inorder(node.left);
	        System.out.print(node.data + "");
	        inorder(node.right);
	    }

	    static class TreeNode {
	        String data;
	        TreeNode left;
	        TreeNode right;

	        public TreeNode(String data) {
	            this.data = data;

	        }

	    }

	    public boolean isEmpty() {
	        return root == null;
	    }

	    public int size() {
	        return size;
	    }

	    public void clear() {
	        root = null;
	        size = 0;
	    }
	}


