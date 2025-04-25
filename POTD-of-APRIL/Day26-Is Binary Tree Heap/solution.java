/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
   public static int findTotalNodes(Node root){
        if(root==null) return 0;
        return 1+findTotalNodes(root.left)+findTotalNodes(root.right);
    }
    
    public static boolean check(Node root,int index,int total){
        if(root==null)  return true;
        if(index>=total) return false;
        
        if(root.left==null && root.right==null) return true;
        if(root.left!=null && root.data<root.left.data) return false;
        if(root.right!=null && root.data<root.right.data) return false;
        
        return check(root.left,2*index+1,total) && check(root.right,2*index+2,total);
        
    }
    
    boolean isHeap(Node tree) {
        int num=findTotalNodes(tree);
        return check(tree,0,num);
        
    }
}
