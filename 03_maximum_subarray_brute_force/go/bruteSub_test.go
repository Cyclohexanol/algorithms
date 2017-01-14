package bruteSub

import "testing"

var list = []int{-2,-4,3,-1,5,7,-7}

var result = []int{2, 5, 14}

func TestBruteSub(t *testing.T) {
	res := bruteSub(list)
	for i, v := range res {
		if v != result[i] {
			t.Error("Maximum subarray not found, output is", res)
			break
		}
	}
}
