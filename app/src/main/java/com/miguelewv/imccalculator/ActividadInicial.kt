package com.miguelewv.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged

import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.actividadinicial.*


class ActividadInicial : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividadinicial)
        setListeners()
    }

        private fun setListeners() {
          etAltura1.doAfterTextChanged { text ->
              Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
              }


            etPeso1.doOnTextChanged { text, _, _, _ ->
             tvIMC.text = text
            }

          }
        }


