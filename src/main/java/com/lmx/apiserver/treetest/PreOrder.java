package com.lmx.apiserver.treetest;

import java.util.*;

/**
 * @author: lmx
 * @create: 2020/10/15
 **/
public class PreOrder {

    public static void main(String[] args) {
        BiTree biTree = new BiTree(1);
        List<BiTree> result = new ArrayList<>();
        preOrder(biTree, result);
        inOrder(biTree, result);
        backOrder(biTree, result);
    }

    /**
     * 后序遍历 On
     * @param biTree
     * @param result
     */
    private static void backOrder(BiTree biTree, List<BiTree> result) {

        if (biTree != null){
            backOrder(biTree.left,result);
            backOrder(biTree.right,result);
            result.add(biTree);
        }

    }

    /**
     * 中序遍历
     * @param biTree
     * @param result
     */
    private static void inOrder(BiTree biTree, List<BiTree> result) {
        if (biTree != null) {
            inOrder(biTree.left, result);
            result.add(biTree);
            inOrder(biTree.right, result);
        }

    }

    /**
     * 中序遍历 非递归
     * @param biTree
     */
    private static void inOrder(BiTree biTree) {
        List<BiTree> list = new ArrayList<>();
        Stack<BiTree> stack = new Stack<>();
        BiTree p  = biTree;
        while (p != null || !stack.isEmpty()){
            if (p != null){
                stack.push(p);
                p = p.left;
            }else {
                BiTree pop = stack.pop();
                list.add(pop);
                p = p.right;
            }
        }

    }

    /**
     * 层级遍历
     * @param biTree
     */
    private static void queueOrder(BiTree biTree){
        List<BiTree> list = new ArrayList<>();
        Queue<BiTree> queue = new LinkedList<>();
        queue.offer(biTree);
        while (!queue.isEmpty()){
            BiTree peek = queue.peek();
            list.add(peek);
            if (peek.left != null){
                queue.offer(peek.left);
            }
            if (peek.right != null){
                queue.offer(peek.right);
            }

        }

    }

    /**
     * 先序遍历 复杂度O（n）
     *
     * @param biTree
     * @param list
     */
    private static void preOrder(BiTree biTree, List<BiTree> list) {
        if (biTree != null) {
            list.add(biTree);
            preOrder(biTree.left, list);
            preOrder(biTree.right, list);
        }
    }


}
