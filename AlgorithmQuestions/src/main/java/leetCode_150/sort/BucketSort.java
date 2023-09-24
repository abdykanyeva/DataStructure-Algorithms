package leetCode_150.sort;

public class BucketSort {


}
/*
 - Create buckets and distribute elements of array into buckets
 - Sort buckets individually
 - Merge buckets after sorting

 1. Number of buckets = round(Sqrt(number of elements))
 round(sqrt(9)) = 3
 Appropriate bucket = ceil(value*number of buckets/maxValue)=ceil(9*3/9)=ceil(3) = 3
 Sort all buckets using sorting algorithm


 When to use BucketSort?
 - When input uniformly distributed over range
 1,2,4,5,3,8,7,9

 when to avoid Bucket sort?
 When space is concern


 */