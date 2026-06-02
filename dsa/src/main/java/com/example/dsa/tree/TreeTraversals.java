package com.example.dsa.tree;

public class TreeTraversals {

    // Left -> Root-> Right
    public static void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+", ");
        inOrder(root.right);
    }

    // Root-> Left -> Right
    public static void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+", ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Left -> Right -> Root
    public static void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+", ");
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(19);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(25);
        root.left.right = new TreeNode(29);
        root.right.left = new TreeNode(30);
        root.right.right = new TreeNode(40);

        // inorder traversal
        inOrder(root);

        // preorder traversal
        preOrder(root);

        // postorder traversal
        postOrder(root);
    }
}




