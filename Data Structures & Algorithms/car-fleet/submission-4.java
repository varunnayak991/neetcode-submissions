class Solution {
    public int carFleet(int target, int[] position, int[] speed) {


        int[][] positionSpeed = new int[position.length][2];

        for(int i=0; i< position.length; i++)
        {
            positionSpeed[i][0] = position[i];
            positionSpeed[i][1] = speed[i];
        }

        Arrays.sort(positionSpeed, (p1,p2) -> p2[0] - p1[0] );

        Stack<int[]> stack = new Stack<int[]>();

        for(int i=0; i < position.length; i++)
        {
            if(stack.isEmpty())
            {
                stack.push(positionSpeed[i]);
            }
            else
            {
                float currentSpeed = (float) (target - positionSpeed[i][0]) /positionSpeed[i][1];

                float stackSpeed = (float) (target - stack.peek()[0]) /stack.peek()[1];

                if( currentSpeed > stackSpeed)
                {
                    stack.push(positionSpeed[i]);
                }
            }

        }
        return stack.size();
    }
}
