package com.lmx.apiserver.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: lmx
 * @create: 2020/9/14
 **/
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        str(list,root);
        return list;

    }

    public void str(List<Integer> list, TreeNode root){
        Deque<TreeNode> deque = new LinkedList<>();
        while (root != null || !deque.isEmpty()){
            while (root!=null){
                deque.push(root);
                root=root.left;
            }
            list.add(deque.pop().val);
            root = root.right;
        }
    }

    public void degui(List<Integer> list, TreeNode root){
        if (root == null){
            return;
        }else {
            degui(list,root.left);
            list.add(root.val);
            degui(list, root.right);
        }
    }
}

