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
    private int size = 1;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
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
            System.out.print(localRoot.getElement()+" ");
            preOrder(localRoot.getLeftChild());
            preOrder(localRoot.getRightChild());
        }
    }
    
    private void inOrder(TreeNode localRoot){
        if (localRoot != null) {
            inOrder(localRoot.getLeftChild());
            System.out.print(localRoot.getElement()+" ");
            inOrder(localRoot.getRightChild());
        }
    }
    
    private void postOrder(TreeNode localRoot){
        if (localRoot != null) {
            postOrder(localRoot.getLeftChild());
            postOrder(localRoot.getRightChild());
            System.out.print(localRoot.getElement()+ " ");
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
    
    public TreeNode getNode (int key){
        TreeNode bantu = root;
        while (bantu != null) {
            if (bantu.element == key) {
                return bantu;
            }else{
                if (bantu.element > key) {
                    bantu = bantu.leftChild;
                }else{
                    bantu = bantu.rightChild;
                }
            }
        }
        return null;
    }
    
    
    
}
