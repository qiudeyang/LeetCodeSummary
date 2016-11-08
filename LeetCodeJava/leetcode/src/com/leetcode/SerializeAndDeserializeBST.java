package com.leetcode;

/**
 * Created by qiudeyang on 08/11/16.
 */
class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return midOrder(root);
    }
    public String midOrder(TreeNode root){
        if (root == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(midOrder(root.left));
        sb.append(root.val);
        sb.append(midOrder(root.right));
        String temp = sb.toString();
        temp = temp.replace("null","");
        return temp;
    }

    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//         TreeNode root = new TreeNode();
//    }
}
public class SerializeAndDeserializeBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        Codec codec = new Codec();
        System.out.println(codec.serialize(root));
    }
}
