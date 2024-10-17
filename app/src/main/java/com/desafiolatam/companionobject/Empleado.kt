package com.desafiolatam.companionobject

import com.desafiolatam.companionobject.constant.SUELDO_BASE

class Empleado(var nombre: String, var valorHora:Int, var activo:Boolean) {

    companion object {

        fun obtenerSueldo(horas: Double, valorHora: Int): Double = SUELDO_BASE + horas * valorHora

        fun situacionEmpleado(activo:Boolean): String = if (activo) "Contratado" else "Despedido"

    }

}