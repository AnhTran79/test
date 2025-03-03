/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ADMIN
 */
public class Tree {
    public static void visit(TreeNode node){
        System.out.println(node.getInfo() + "");
        
        
    }
    
    public static void preOrder(TreeNode node){
        
        
        if(node != null){
            visit(node);
            
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
        
    }
    
    public static void postOrder(TreeNode node){
        
        if(node != null){
            
            postOrder(node.getLeft());
            postOrder(node.getRight());
            
            visit(node);
        }
        
        
    }
    
    public static void inOrder(TreeNode node){
        
        if(node != null){
            
            inOrder(node.getLeft());
            visit(node);
            inOrder(node.getRight());
            
        }
        
        
    }    
    
    public static void breathTraverse(TreeNode node){
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(node);
        
        while(!queue.isEmpty()){
            
            TreeNode node1 = (TreeNode)queue.remove();
            visit(node1);
            if(node1.getLeft() != null) queue.add(node1.getLeft());
            if(node1.getRight() != null) queue.add(node1.getRight());
        }
        
}    
    
}
