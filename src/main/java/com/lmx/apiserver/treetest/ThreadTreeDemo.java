package com.lmx.apiserver.treetest;

/**
 * @author: lmx
 * @create: 2020/10/15
 **/
public class ThreadTreeDemo {

    public void inThraed(ThreadTree p, ThreadTree pre){
        if (p != null){
            inThraed(p.left,pre);
            if (p.left == null){
                p.left = pre;
                p.lTag = 1;
            }
            if ( pre != null && pre.right == null){
                pre.right = p;
                pre.rTag = 1;
            }
            pre = p;
            inThraed(p.right, pre);
        }
    }

    public void createInThread(ThreadTree t){
        ThreadTree  pre = null;
        if (t != null){
            inThraed(t,pre);
            pre.right = null;
            pre.rTag = 1;
        }
    }

}
