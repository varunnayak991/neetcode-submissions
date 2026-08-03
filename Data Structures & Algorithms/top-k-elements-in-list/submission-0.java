class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> count = new HashMap<>();

        for (int i : nums)
        {
            count.put(i,count.getOrDefault(i,0)+1);
        }

        ArrayList<ArrayList<Integer>> arraysOfArrays = new ArrayList<>();

        for(int i=0; i<= nums.length; i++)
        {
            arraysOfArrays.add(new ArrayList<>());
        }

        for(Integer num: count.keySet())
        {
            Integer numcount =  count.get(num);
            arraysOfArrays.get(numcount).add(num);

        }

        int[] result = new int[k];

        int j =0;

        for(int i=nums.length; i>=0 && j<k; i--)
        {
            ArrayList<Integer> temp = arraysOfArrays.get(i);

            for(Integer temp2 : temp)
            {
                if(j<k) {
                    result[j] = temp2;
                    j++;
                }
                else
                {
                    j++;
                }
            }

        }

        return result;
        
    }
}
