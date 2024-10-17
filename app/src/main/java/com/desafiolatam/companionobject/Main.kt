package com.desafiolatam.companionobject

fun main() {

    var empleado = Empleado("Armando Mochas",20000,true)

    val sueldo: Double = Empleado.obtenerSueldo(180.0, empleado.valorHora)
    val situacion: String = Empleado.situacionEmpleado(empleado.activo)

    println("El empleado ${empleado.nombre} actualmente está ${situacion} y obtuvo un sueldo de $ ${sueldo}")

}