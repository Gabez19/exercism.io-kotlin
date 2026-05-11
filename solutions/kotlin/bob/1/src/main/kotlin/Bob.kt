object Bob {
    fun hey(input: String): String {
        val message = input.trim()
        
        val isSilence = message.isBlank()
        
        val isQuestion = message.endsWith('?')
        
        val hasLetters = message.any { it.isLetter() }
        val isUppercase = message == message.uppercase()
        
        val isAllCaps = hasLetters && isUppercase

        if(isSilence){
            return "Fine. Be that way!"
        } else if(isAllCaps && isQuestion) {
            return "Calm down, I know what I'm doing!"
        } else if(isAllCaps) {
            return "Whoa, chill out!"
        } else if(isQuestion){
            return "Sure."
        } else {
            return "Whatever."
        }
    }
}
