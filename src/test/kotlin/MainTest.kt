import dev.dagn.formatToE164
import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun `when passing a valid phone number and their country code, it should return the formatted phone number`() {
        val rawPhoneNumber = "4704564755"
        val countryCode = "+32"
        val expected = "+324704564755"

        val phoneNumber = formatToE164(rawPhoneNumber, countryCode)
        assertEquals(expected, phoneNumber)
    }

    @Test
    fun `when passing a valid phone number in E164 format, it should return the formatted phone number`() {
        val rawPhoneNumber = "+447403229339"
        val countryCode = ""
        val expected = "+447403229339"

        val phoneNumber = formatToE164(rawPhoneNumber, countryCode)
        assertEquals(expected, phoneNumber)
    }

    @Test
    fun `when passing a valid phone number in E164 format with an extra space, it should return the formatted phone number`() {
        val rawPhoneNumber = "+54 9112180303"
        val countryCode = ""
        val expected = "+549112180303"

        val phoneNumber = formatToE164(rawPhoneNumber, countryCode)
        assertEquals(expected, phoneNumber)
    }
}
