package dev.dagn

import com.google.i18n.phonenumbers.PhoneNumberUtil

fun main() {
    while (true) {
        println("Enter a phone number:")
        val rawPhoneNumber = readln()
        println("Enter the phone number country code (Leave it blank if you don´t have one):")
        val countryCode = readlnOrNull() ?: "+1"
        val phoneNumber = formatToE164(rawPhoneNumber, countryCode)
        println(phoneNumber)
    }
}

fun formatToE164(phoneNumber: String, countryCode: String): String {
    val phoneUtil = PhoneNumberUtil.getInstance()
    return try {
        val region = phoneUtil.getRegionCodeForCountryCode(countryCode.toInt())
        val parsedPhoneNumber = phoneUtil.parse(phoneNumber, region)
        phoneUtil.format(parsedPhoneNumber, PhoneNumberUtil.PhoneNumberFormat.E164)
    } catch (e: IllegalArgumentException) {
        try {
            val parsedPhoneNumber = phoneUtil.parse(phoneNumber, null)
            phoneUtil.format(parsedPhoneNumber, PhoneNumberUtil.PhoneNumberFormat.E164)
        } catch (ie: Exception) {
            throw ie
        }
    }
}
