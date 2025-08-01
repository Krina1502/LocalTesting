package jlin2.examples.localtesting

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class TestEmailValidator {

    @Test
    fun `test valid email address format`() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }

    @Test
    fun `test invalid email address without domain`() {
        assertFalse(EmailValidator.isValidEmail("123@abc"))
    }


    @Test
    fun `test invalid email address with double dots`() {
        assertFalse(EmailValidator.isValidEmail("123@abc..com"))
    }

    @Test
    fun `test invalid email address without username`() {
        assertFalse(EmailValidator.isValidEmail("@abc.com"))
    }

    @Test
    fun `test invalid email address without domain and username`() {
        assertFalse(EmailValidator.isValidEmail("testing123"))
    }

    @Test
    fun `test invalid email address empty string`() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun `test invalid email address null` (){
        assertFalse(EmailValidator.isValidEmail(null))
    }


}
