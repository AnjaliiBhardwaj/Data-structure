class LevelOrderTraversal{
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue <TreeNode> pendingNode=new LinkedList<>();
        pendingNode.add(root);

        while(!pendingNode.isEmpty()){
            int levelsize=pendingNode.size();
            //creating new list everytime for every new level
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode frontNode=pendingNode.poll();
                //add data in list
                currentLevel.add(frontNode.val);

                if(frontNode.left!=null){
                    pendingNode.add(frontNode.left);
                }

                if(frontNode.right!=null){
                    pendingNode.add(frontNode.right);
                }
            }
            //add levellist in final list
            ans.add(currentLevel);
        }
        return ans;
    }
}