
	

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
		this.data = data;
	    }
	}
	


public class LCA_Of_Two_Nodes {
	public static BinaryTreeNode<Integer> lca(BinaryTreeNode<Integer>root,int a,int b){
		if(root==null){
			return null;
		}

		if(root.data==a || root.data==b){
			return root;
		}

		BinaryTreeNode<Integer>left=lca(root.left,a,b);
		BinaryTreeNode<Integer>right=lca(root.right,a,b);

		if(left!=null && right!=null){
			return root;
		}
		return (left!=null)?left:right;
	}
    public static BinaryTreeNode<Integer> lcaOfThreeNodes(BinaryTreeNode<Integer> root, int node1, int node2,
            int node3) {
        BinaryTreeNode<Integer>first=lca(root,node1,node2);
		return lca(root,first.data,node3);
    }
}
