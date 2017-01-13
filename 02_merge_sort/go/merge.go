package merge

func mergeSort(list []int) {
	length := len(list)
	if length != 1 {
		middle := int(len(list) / 2)
		mergeSort(list[:middle])
		mergeSort(list[middle:])
    l1 := make([]int, middle)
    l2 := make([]int, length-middle)
    for i, v := range(list[:middle]) {
      l1[i] = v
    }
    for i, v := range(list[middle:]) {
      l2[i] = v
    }
		i1 := 0
		i2 := 0
		for i := 0; i < length; i++ {
			if i1 == len(l1) && i2 != len(l2) {
				list[i] = l2[i2]
				i2++
			} else if i2 == len(l2) && i1 != len(l1) {
				list[i] = l1[i1]
				i1++
			} else if i1 == len(l1) && i2 == len(l2) {

      } else if l1[i1] <= l2[i2] {
				list[i] = l1[i1]
				i1++
			} else {
				list[i] = l2[i2]
				i2++
			}
		}
	}
}
