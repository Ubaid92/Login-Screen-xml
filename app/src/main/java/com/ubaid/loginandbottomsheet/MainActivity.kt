package com.ubaid.loginandbottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val createAccountBtn = findViewById<Button>(R.id.btnNewAccnt)
        val loginBtn = findViewById<Button>(R.id.btnLogin)

        createAccountBtn.setOnClickListener {
            val bottomSheetDialog = BottomSheetDialog(this)
            val view1 = LayoutInflater.from(this).inflate(R.layout.bottom_sheet_create_account, null)

            bottomSheetDialog.setContentView(view1)

            bottomSheetDialog.show()

            val btnClose = view1.findViewById<TextView>(R.id.btnClose)

            btnClose.setOnClickListener {
                bottomSheetDialog.dismiss()
            }

        }

        loginBtn.setOnClickListener {
            val bottomSheetDialog = BottomSheetDialog(this)
            val view1 = LayoutInflater.from(this).inflate(R.layout.bottom_sheet_login, null)

            bottomSheetDialog.setContentView(view1)

            bottomSheetDialog.show()

            val btnClose = view1.findViewById<TextView>(R.id.btnClose)

            btnClose.setOnClickListener {
                bottomSheetDialog.dismiss()
            }

        }
    }
}