class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> frequency = new HashMap<Integer,Integer>();

        for(int n : nums)
        {
            Integer frequencyValue = frequency.getOrDefault(n,0);
            frequency.put(n,frequencyValue+1);
        }

        List<List<Integer>> buckets = new ArrayList<List<Integer>>(nums.length);

        for(int i=0; i<= nums.length; i++){

            buckets.add(i,new ArrayList<Integer>());
        }


        for(Integer key: frequency.keySet()){
            List<Integer> bucketElements = buckets.get(frequency.get(key)); // Get by index = frequency
            bucketElements.add(key);
        }

        int[] returnValues = new int[k];
        int j = 0;

        for(int i = buckets.size()-1; i>=0; i--)
        {
            if(buckets.get(i).size() == 0)
            {
                continue;
            }

            for(int element: buckets.get(i))
            {
                if(j >= k)
                {
                    break;
                }

                //returnValues.add(element);
                returnValues[j] = element;
                j++;
            }
        }
        return returnValues;
    }
}
