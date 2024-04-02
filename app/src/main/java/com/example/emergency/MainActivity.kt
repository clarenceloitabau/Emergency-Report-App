package com.example.emergency

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
/**MAIN CLASS**/
class MainActivity : AppCompatActivity() {
    /**METHODS**/
    override fun onCreate(savedInstanceState: Bundle?) { /**onCreate() method is overridden to set up the activity when it's first created.**/
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  /**setContentView(R.layout.activity_main) inflates the layout to display the UI elements.**/
        /**declaring variables**/
        var buttonPolice: Button ?= null
        var buttonEMS: Button ?= null
        var buttonFire: Button ?= null
        var buttonDisaster: Button ?= null
        var buttonChild: Button ?= null
        /**methods used to assign the respective buttons from the layout XML to the corresponding variables.**/
        /**EVENT SOURCES**/
            buttonPolice = findViewById(R.id.button1)
            buttonEMS = findViewById(R.id.button2)
            buttonFire = findViewById(R.id.button3)
            buttonDisaster = findViewById(R.id.button4)
            buttonChild = findViewById(R.id.button5)
        /**EVENT LISTENERS**/
        /**setOnClickListener method means when the button is clicked, the code inside the curly braces will be executed.**/
            buttonPolice!!.setOnClickListener {
                /**EVENT HANDLER**/
                /**The Intent.ACTION_CALL is used to perform a call action,
                 *  and the phone number "112" is passed as a parameter, which is the emergency number**/
                val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "112"))
                /**DECISION CONTROL STRUCTURE**/
                /**Before initiating the call, the code checks if the app has the permission to make a call. If not, it requests
                 * permission from the user using requestPermissions(). If the permission is already granted,
                 * it starts the call using startActivity(intent)**/
                if (ContextCompat.checkSelfPermission(
                        this@MainActivity,
                        Manifest.permission.CALL_PHONE
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    ActivityCompat.requestPermissions(
                        this@MainActivity,
                        arrayOf(Manifest.permission.CALL_PHONE),
                        1
                    )
                } else {
                    startActivity(intent)
                }
            }
        buttonEMS!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "999"))
            if (ContextCompat.checkSelfPermission(
                    this@MainActivity,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@MainActivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }
        }
        buttonFire!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + " 0202344599"))
            if (ContextCompat.checkSelfPermission(
                    this@MainActivity,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@MainActivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }
        }
        buttonDisaster!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254 020 2224324 "))
            if (ContextCompat.checkSelfPermission(
                    this@MainActivity,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@MainActivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }
        }
        buttonChild!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "116"))
            if (ContextCompat.checkSelfPermission(
                    this@MainActivity,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@MainActivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }
        }
        }
    }
