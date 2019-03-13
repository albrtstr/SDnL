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
public class mainTree {
    public static void main(String[] args) {
        Tree test = new Tree();
        test.add(16);
        test.add(3);
        test.add(2);
        test.add(5);
        test.add(20);
        test.add(17);
        test.add(25);
        
        System.out.print("Pre-Order Traversal  = ");
        test.helpPreOrder();
        System.out.println();
        System.out.print("In-Order Traversal   = ");
        test.helpInOrder();
        System.out.println();
        System.out.print("Post-Order Traversal = ");
        test.helpPostOrder();
        
        System.out.println("");
        TreeNode found = test.getNode(25);
        if (found != null) {
            System.out.println("Ketemu node key = "+ found.element);
        }else{
            System.out.println("Node key = "+found.element+"tidak ada");
        }
    }
}
