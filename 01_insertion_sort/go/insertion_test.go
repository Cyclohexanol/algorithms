package insertion

import "testing"

var list = []int{6, 5, 2, 0, 3, 1, 4}
var sortedList = []int{0, 1, 2, 3, 4, 5, 6}

func TestInsertionSort(t *testing.T) {
	insertionSort(list)
	for i, v := range list {
		if v != sortedList[i] {
			t.Error("List is not sorted, output is", list)
			break
		}
	}
}
