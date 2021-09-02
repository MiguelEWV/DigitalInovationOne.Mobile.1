package com.miguelewv.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged
import kotlinx.android.synthetic.main.relativity.*

class Finalizado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relativity)
        setListeners()
    }

private fun setListeners() {
    etAltura.doAfterTextChanged { text ->
        // Toast.makeText(this. text.toString(), Toast.Lenght_SHORT).show()
    }
    btnCalcular.setOnClickListener {
        calcularIMC(etPeso.text.toString(),etAltura.text.toString())
    }
}

    private fun calcularIMC(peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if (peso != null && altura != null){
            val imc = peso / (altura * altura)
            I_M_C.text = "Seu IMC e $imc".format(imc)
        }
    }

}