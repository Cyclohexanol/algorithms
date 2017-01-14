package bruteSub

func bruteSub(list []int) []int {

  solution := make([]int, 3)
  maxValue := list[0]

  for i, _ := range(list) {
    tempValue := 0
    for j, v := range(list[i:]) {
      tempValue += v
      if maxValue < tempValue {
        maxValue = tempValue
        solution[0] = i
        solution[1] = j + i
      }
    }
  }

  solution[2] = maxValue

  return solution

}
