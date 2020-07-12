package main

import "fmt"

func main() {
	arr := []int {1,2,3,1,1,3}
	fmt.Println(numIdenticalPairs(arr))
}

func numIdenticalPairs(nums []int) int {
	result := 0
	for i := 0; i < len(nums) - 1; i++ {
		for j := i + 1; j < len(nums); j++ {
			if nums[i] == nums[j] {
				result++
			}
		}
	}
	return result
}