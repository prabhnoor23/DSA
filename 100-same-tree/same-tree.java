/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null){
            return true;
        }
        else if(p != null && q != null && p.val == q.val){
            return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
        }

        return false;
    }
    
}

/////////////////////////////////////////////////////////////////////////////////////
// class Solution {
//     boolean ans = true;
//     public boolean isSameTree(TreeNode p, TreeNode q) {

//         ans = areSame(p, q);
//         if(ans == false){
//             return ans;
//         }
//         else if(p != null && q != null){
//             ans = isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            
//         // this peice of code passed 63/66 testcases but failed on input p = [0, -5] and q = [0, -8]
//         // because after checking p.left(-5) and q.right(-8), the ans is false but while checking the right null == null
//         // gets the ans = true and ans being the global variable, it is returned true.
//         // The above code solves this by using && operator and making sure that both left and right counterparts 
//         // of a root node are true.
//             // isSameTree(p.left, q.left);
//             // isSameTree(p.right, q.right);

//         }
//         return ans;
//     }
    

//     public boolean areSame(TreeNode rootP, TreeNode rootQ){
        
//         if(rootP == null && rootQ == null) return true;
//         if(rootP == null || rootQ == null) return false;

//         if(rootP.val == rootQ.val){
//             return true;
//         }
//         return false;
//         // return (rootP.val == rootQ.val) ? true: false;
        
//     }  

// }   
