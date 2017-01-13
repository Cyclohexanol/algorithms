package insertion

import "fmt"

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
