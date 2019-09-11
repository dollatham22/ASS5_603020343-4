package com.example.ass5_603020343_4_3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var data = intent.extras
        var newEmployee = data?.getParcelable<Employee>("EmpData")
        nameText.text = "Employee Name : ${newEmployee?.name}"
        genderText.text = "Gender :  ${newEmployee?.gender}"
        emailText.text = "E-mail : ${newEmployee?.mail}"
        salaryText.text = "Salary : ${newEmployee?.salary}"
    }
    fun onClickClose(view: View){
        finish()
    }
}
