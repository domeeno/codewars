
/*

KATA: 55983863da40caa2c900004e

Create a function that takes a positive integer and returns the next bigger number that can be formed by rearranging its digits. For example:

```
12 ==> 21
513 ==> 531
2017 ==> 2071
```

*/

fun nextBiggerNumber(n: Long): Long {
    
    var numberSize = n.toString().length
    var individualNumbers = n.toString().toList().map { it -> Character.getNumericValue(it) }.toMutableList()
    var reversedNumbers = individualNumbers.reversed().toMutableList()
    
    for (i in 0..numberSize-2) {
        if(reversedNumbers[i] > reversedNumbers[i+1]) {
            val indexToSwap = reversedNumbers.indexOf(reversedNumbers.subList(0, i+1).sorted().first {it > reversedNumbers[i + 1] })
            
            val temporary = reversedNumbers[indexToSwap]
            reversedNumbers[indexToSwap] = reversedNumbers[i+1]
            reversedNumbers[i+1] = temporary
            
            return (reversedNumbers.subList(i+1, numberSize).reversed() + reversedNumbers.subList(0, i+1).sorted())
                .joinToString("").toLong()
        }
    }
    
    return -1
}

