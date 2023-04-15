package leetCode;

public class ContainerWithMostWater {

    public int maxArea(int [] height){
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int max = 0;
        while (leftIndex < rightIndex){
            int maxHeight = Math.min(height[leftIndex], height[rightIndex]);
            int currentArea = maxHeight * (rightIndex - leftIndex);
            max = Math.max(currentArea, max);
            if (height[leftIndex] == maxHeight) leftIndex++;
            else rightIndex--;
        }
        return max;
    }

//    public int maxArea(int [] height){
//
//        int max = 0;
//        for (int i=0; i<height.length; i++){
//            for (int j=i+1; j<height.length; j++){
//                int area = (j-i) * (Math.min(height[i], height[j]));
//                if (area > max) max = area;
//            }
//        }
//
//        return max;
//    }
}
