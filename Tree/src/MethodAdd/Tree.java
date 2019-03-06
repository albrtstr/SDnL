/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodAdd;


/**
 *
 * @author admin
 */
public class Tree {
    private TreeNode root;
    
    public void add(int x){
        if (root == null) {
            root = new TreeNode(x);
        }else{
            TreeNode bantu = root;
            while (bantu != null) {
                if (x < bantu.element) {
                    if (bantu.leftChild == null) {
                        bantu.leftChild = new TreeNode(x);
                        bantu = null;
                    } else{
                        bantu = bantu.leftChild;
                    }
                }else{
                    if (bantu.rightChild == null) {
                        bantu.rightChild = new TreeNode(x);
                        bantu = null;
                    }else{
                        bantu = bantu.rightChild;
                    }
                }
            }
        }
    }
    
    private void preOrder(TreeNode localRoot){
        if (localRoot != null) {
            System.out.print(localRoot.element+" ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }
    
    private void inOrder(TreeNode localRoot){
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.element+" ");
            inOrder(localRoot.rightChild);
        }
    }
    
    private void postOrder(TreeNode localRoot){
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.element+ " ");
        }
    }
    
    public void helpPreOrder(){
        preOrder(root);
    }
    
    public void helpInOrder(){
        inOrder(root);
    }
    
    public void helpPostOrder(){
        postOrder(root);
    }
}
