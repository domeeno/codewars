package solution

object PhoneDir {

    fun phone(strng: String, num: String): String {
        val entries = strng.split("\n")
       
        val filteredEntries = entries.filter { it.contains("+" + num) }
        when (filteredEntries.size) {
            0 -> return "Error => Not found: $num"
            1 -> {
                var result = filteredEntries[0]
                var nameRegex = "<[a-z 'A-z]*>".toRegex()
                var addressRegex = "[^A-Z. a-z0-9-]".toRegex()
                
                val name = nameRegex.find(result)!!
                result = result.replace(name.value, "", false)
                result = result.replace(num, "", false)
                
                val address = result.replace("_", " ", false).replace(addressRegex, "").replace("\\s+".toRegex(), " ").trim()
                return "Phone => ${num}, Name => ${name.value.replace("<", "", false).replace(">", "", false)}, Address => ${address}"
            }
            else -> return "Error => Too many people: $num"
        }
    }
}
