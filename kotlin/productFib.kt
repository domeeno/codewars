/*
KATA: 5541f58a944b85ce6d00006a
*/

fun calcFib(curr: Long, next: Long, max: Long): Pair<Long, Long> {
    if(curr * next < max)
        return calcFib(next, curr+next, max)
        
    return Pair(curr, next)
}

fun productFib(prod:Long): LongArray {
    val result = calcFib(0L, 1L, prod)
    val prodIsEqual = if (result.first * result.second == prod) 1L else 0L
    print("${result.first} : ${result.second} - prod: $prod, result: ${result.first * result.second}")
    return longArrayOf(result.first, result.second, prodIsEqual)
}
