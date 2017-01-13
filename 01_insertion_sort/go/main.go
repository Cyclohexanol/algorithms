package main

import "fmt"

func main() {
	a := []int{6,5,2,0,3,1,4}
	insertionSort(a)
	fmt.Println(a)
}

func insertionSort(list []int) {
	for j, v := range list {
		i := j - 1
		for {
			if !(i >= 0 && list[i] > v) {
				break
			}
			list[i+1] = list[i]
			i--
		}
		list[i+1] = v
	}
}
