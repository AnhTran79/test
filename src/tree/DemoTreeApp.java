/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import static tree.Tree.breathTraverse;


/**
 *
 * @author ADMIN
 */
public class DemoTreeApp {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node9 = new TreeNode(9);
        TreeNode node11 = new TreeNode(11);
        TreeNode root = node1;
        
        
        node2.setLeft(node9);
        node2.setRight(node11);
        node1.setLeft(node2);
        node1.setRight(node4);
       
       // preOrder(root);
       // postOrder(root);
       // inOrder(root);
        breathTraverse(root);
    }
    
}
