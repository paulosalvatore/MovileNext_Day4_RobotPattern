package br.com.paulosalvatore.movilenext_day4_robotpattern.login

import android.content.Context
import android.support.test.espresso.ViewInteraction
import br.com.paulosalvatore.movilenext_day4_robotpattern.R
import br.com.paulosalvatore.movilenext_day4_robotpattern.robot.BaseTestRobot

class LoginRobot(private val context: Context) : BaseTestRobot() {
    fun setEmail(email: String) = apply {
        fillEditText(R.id.etEmail, email)
    }

    fun setPassword(pass: String) = apply {
        fillEditText(R.id.etPassword, pass)
    }

    fun clickLogin() = apply {
        clickButton(R.id.btLogin)
    }

    fun matchErrorText(err: Int) = matchText(
        textView(android.R.id.message),
        context.getString(err)
    )
}

