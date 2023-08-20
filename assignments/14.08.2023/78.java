class s78{
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        subset(0,nums, new ArrayList(),result);
        return result;
    }

    void subset(int index, int[] nums, List<Integer> curr, List<List<Integer>> result){
        result.add(new ArrayList(curr));

        for(int i=index; i<nums.length;i++){
            curr.add(nums[i]);
            subset(i+1,nums,curr,result);
            curr.remove(curr.size()-1);
        }
    }
}