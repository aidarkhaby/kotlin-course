package org.example.lessons.lesson31.homeworks

class PhoneNumberFormatter {
    fun formatPhoneNumber(phoneNumber: String): String {
        val digits = phoneNumber.replace("\\D".toRegex(), "")
        val length = digits.length

        if (length !in 10..11) {
            throw IllegalArgumentException(
                "Длина номера телефона должна составлять 10-11 цифр, получено: $length цифр"
            )
        }

        var cleanedDigits = digits
        if (length == 11) {
            val firstDigit = digits[0]
            if (firstDigit !in listOf('7', '8')) {
                throw IllegalArgumentException(
                    "11-значный номер должен начинаться с 7 или 8, получено: $firstDigit"
                )
            }
            cleanedDigits = digits.substring(1)
        }

        val areaCode = cleanedDigits.substring(0, 3)
        val part1 = cleanedDigits.substring(3, 6)
        val part2 = cleanedDigits.substring(6, 8)
        val part3 = cleanedDigits.substring(8, 10)

        return "+7 ($areaCode) $part1-$part2-$part3"
    }
}