package com.test;

import java.util.LinkedList;

/**
 * Created by qiudeyang on 12/10/16.
 */
class TreeNode {
    int leftOrRight = 0;
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        this.val = x;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TreeNode) {
            TreeNode node = (TreeNode) obj;
            return node.val == this.val;
        }
        return false;
    }
}

public class BinaryTree {
    private TreeNode root;
    private int size = 0;

    public BinaryTree() {

    }

    public BinaryTree(int val) {
        this.root = new TreeNode(val);
        this.size = 1;
    }

    public TreeNode getRoot() {
        return root;
    }

    public int getMax() {
        TreeNode node = root;
        while (node.left != null) {
            node = node.left;
        }
        return node.val;
    }

    public int getMin() {
        TreeNode node = root;
        while (node.right != null) {
            node = node.right;
        }
        return node.val;
    }

    public void preOrderTreeWalk(TreeNode node, LinkedList<Integer> container) {
        if (node != null) {
            container.add(node.val);
            preOrderTreeWalk(node.left, container);
            preOrderTreeWalk(node.right, container);
        }
    }

    public void midOrderTreeWalk(TreeNode node, LinkedList<Integer> container) {
        if (node != null) {
            midOrderTreeWalk(node.left, container);
            container.add(node.val);
            midOrderTreeWalk(node.right, container);
        }
    }

    public void postOrderTreeWalk(TreeNode node, LinkedList<Integer> container) {
        if (node != null) {
            postOrderTreeWalk(node.left, container);
            postOrderTreeWalk(node.right, container);
            container.add(node.val);
        }
    }

    public TreeNode search(int val) {
        TreeNode node = root;
        while (val != node.val) {
            if (val < node.val) {
                node = node.left;
            } else {
                node = node.right;
            }
            if (node == null) {
                node = null;
            }
        }
        return node;
    }

    private TreeNode findParentNode(int val) {
        TreeNode parent = null;
        TreeNode node = root;
        while (val != node.val) {
            parent = node;
            if (val < node.val) {
                node = node.left;
            } else {
                node = node.right;
            }
            if (node == null) {
                node = null;
                parent = null;
            }
        }
        return parent;
    }

    public void createBinaryTree(int[] data) {
        if (data != null) {
            for (int i : data) {
                insert(i);
            }
        }
    }

    public void insert(int val) {
        if (root == null) {
            root = new TreeNode(val);
        } else {
            TreeNode curNode = root;
            TreeNode parentNode;
            while (true) {
                parentNode = curNode;
                if (val < curNode.val) {
                    curNode = curNode.left;
                    if (curNode == null) {
                        parentNode.left = new TreeNode(val);
                        parentNode.left.leftOrRight = -1;
                        break;
                    }
                } else {
                    curNode = curNode.right;
                    if (curNode == null) {
                        parentNode.right = new TreeNode(val);
                        parentNode.right.leftOrRight = 1;
                        break;
                    }
                }
            }
        }
        ++size;
    }

    public boolean delete(int val) {
        boolean flag = false;
        TreeNode node = search(val);
        TreeNode parent = findParentNode(val);
        if (node != null) {
            if (node.equals(root)) {
                root = null;
            }
            if (node.left == null && node.right == null) {
                if (node.leftOrRight == 1) {
                    node = null;
                    parent.right = null;
                }
                if (node.leftOrRight == -1) {
                    node = null;
                    parent.left = null;
                }
            } else if (node.left != null
                    && node.right != null) {
                TreeNode successor = findSuccessor(node);
                if (node.leftOrRight == -1) {
                    parent.left = successor;
                    parent.left.leftOrRight = -1;
                }
                if (node.leftOrRight == 1) {
                    parent.right = successor;
                    parent.right.leftOrRight = 1;
                }
                successor.left = node.left;
            } else {
                if (node.left != null) {
                    if (node.leftOrRight == 1) {
                        parent.right = node.left;
                    }
                    if (node.leftOrRight == -1) {
                        parent.left = node.left;
                    }
                }
                if (node.right != null) {
                    if (node.leftOrRight == 1) {
                        parent.right = node.right;
                    }
                    if (node.leftOrRight == -1) {
                        parent.left = node.right;
                    }
                }
                node = null;
            }
            flag = true;
            --size;
        }
        return flag;
    }

    private TreeNode findSuccessor(TreeNode delNode) {
        TreeNode parent = delNode;
        TreeNode successor = delNode;
        TreeNode curNode = delNode.right;

        while (curNode != null) {
            parent = successor;
            successor = curNode;
            curNode = curNode.left;
        }
        if (!successor.equals(delNode.right)) {
            parent.left = successor.right;
            successor.right = delNode.right;
        }
        return successor;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


}
