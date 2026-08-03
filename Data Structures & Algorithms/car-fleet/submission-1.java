class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
              int[][] positionSpeed = new int[position.length][2];

        for (int i=0; i< position.length; i++)
        {
            positionSpeed[i][0]=position[i];
            positionSpeed[i][1]=speed[i];
        }

        Arrays.sort(positionSpeed, (a,b) -> Integer.compare(b[0] , a[0]));

        //Arrays.stream(positionSpeed).forEach(a -> System.out.println(Arrays.toString(a)));

        Stack<Double> timeStack = new Stack<>();
        

        for (int i=0 ; i< positionSpeed.length; i++)
        {
            Double time = (double)(target - positionSpeed[i][0])/positionSpeed[i][1];

            timeStack.add(time);

            if(timeStack.size() >1 && (timeStack.get(timeStack.size() - 1) <=  timeStack.get(timeStack.size() - 2)))
            {
                timeStack.pop();
            }
        }

        //System.out.println(timeStack);

        return timeStack.size();
    }
}
