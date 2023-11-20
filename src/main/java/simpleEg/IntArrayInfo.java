package simpleEg;

public class IntArrayInfo {
    int count;
    int max;
    int min;
    int sum;
    double average;

    IntArrayInfo(int[] nums){
        count = nums.length;
        max = nums[0];
        min = nums[0]; //첫번째 인자를 max min으로 세팅

        for(int num : nums){
            max = max > num ? max : num; // max 값이랑 지금 값 비교해서 큰 거 넣어주기
            min = min < num ? min : num;
            sum += num;
        }

        average=sum/count;
    }
}
