public class LongestIncreasingSubsequence {



    public static void printLIS(int[] nums){

        //creating size and path array
        String[] paths = new String[nums.length];
        int[] sizes = new int[nums.length];
        int nr=0;

        //Initially, assign sizes and path position
        for(int i=0; i<nums.length; i++){
            sizes[i] = 1;
            paths[i] = nums[i] + " " ;
        }

        //Creating maxLenth to keep track
        int maxLength = 1;

        for(int i=1; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
        // i at firstposition
        // j at zeroposition

        //here j<i and size must be increasing
                if(nums[i]>nums[j] && sizes[i] < sizes[j] + 1){;
                    //if so, we need to update sizes and path
                    sizes[i] = sizes[j] + 1;
                    paths[i] = paths[j] + nums[i] + " ";
                    // append current values to end!!

                    if(maxLength < sizes[i])
                        maxLength = sizes[i];
                }
            }
        }

        // finally go scanning the size of array again and print out the path when size matches
        for(int i=1; i<nums.length; i++){
            if(sizes[i] == maxLength)
                System.out.println("LIS: " + paths[i]);

        }

    }
}
