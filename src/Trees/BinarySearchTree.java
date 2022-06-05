package Trees;

public class BinarySearchTree {

	private static class  Node
	{
		Node left;
		Node right;
		int data;
		
		public Node(int data)
		{
			this.data=data;
		}
	}
	
	Node root;
	int length;
	
	public void insert(int data)
	{
		if(root==null)
		{
			System.out.println("root");
			root=new Node(data);
			length++;
			return;
		}
		
		Node visitor=root;
		while(true)
		{
			if(visitor.data>data)
			{
				if(visitor.left==null)
				{
					visitor.left=new Node(data);
					length++;
					return;
				}
				visitor=visitor.left;
			}
			else
			{
				if(visitor.right==null)
				{
					visitor.right=new Node(data);
					length++;
					return;
				}
				visitor=visitor.right;
			}
		}
		
		
	}
	public void  lookup(int data)
	{
		if(this.root==null)
		{
			System.out.println("Empty tree");
			return;
		}
		Node curNode=this.root;
		boolean flag=false;
		while(curNode!=null)
		{
			if(curNode.data==data)
			{
				System.out.println(" found");
				return;
			}
			else if(curNode.data>data)
			{
				curNode=curNode.left;
			}
			else
			{
				curNode=curNode.right;
			}
		}
		System.out.println(data+" Not Found");
	}
	
	public boolean remove(int data)
	{
		if(root==null)
		{
			return false;
		}
		Node curNode=this.root;
		Node parent=null;
		while(curNode!=null)
		{
			if(data<curNode.data)
			{
				parent=curNode;
				curNode=curNode.left;
			}
			else if(data>curNode.data)
			{
				parent=curNode;
				curNode=curNode.right;
			}
			else if(curNode.data==data)
			{
//				case 1- No right child
				if(curNode.right==null)
				{
					if(parent==null)
					{
						this.root=curNode.left;
					}
					else if(parent.data>curNode.data)
					{
						parent.left=curNode.left;
					}
					else
					{
						parent.right=curNode.right;
					}
				}
				
//				case 2- right child which does not have left child
				else if(curNode.right.left==null)
				{
					if(parent==null)
					{
						this.root=curNode.left;
					}
					else
					{
						curNode.right.left=curNode.left;
						
					}
				}
			}
			
		
			
		}
		return false;
	}
	
	
	public void traverse()
	{
		Node curNode=this.root;
		while(curNode!=null)
		{
			for(int i=0;i<length/2;i++)
			{
				System.out.print(" ");
				
			}
			System.out.println(curNode.data);
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(9);
		bst.insert(4);
		bst.insert(20);
		bst.insert(1);
		bst.insert(6);
		bst.insert(15);
		bst.insert(170);
		bst.insert(171);
		bst.lookup(171);
		
		System.out.println(bst.root.left.right.data);

	}

}
