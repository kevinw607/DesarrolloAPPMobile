fun main() {
    println("Banco APP")

    //Creamos cliente
    val cliente = Cliente(nombre = "Kevin Mansilla Vargas", rut = "21.606.788-6")

    //Creamos cuentas
    val cuentaAhorro = CuentaAhorro(numeroCuenta = 1001, cliente, saldoInicial = 100000.0, tasaInteres = 3.5)

    val cuentaCorriente = CuentaCorriente(numeroCuenta = 2001, cliente, saldoInicial = 100000.0, limiteTransferencia = 200000.0)

    // Polimorfismo
    val cuentas: List<CuentaBancaria> = listOf(cuentaCorriente, cuentaAhorro)
     for(cuenta in cuentas) {
         println("-----------------")
         cuenta.mostrarTipoCuenta()
     }
    // Manejo de errores
    try {
        println("Ingresar el monto a retirar")

        val monto = readln().toDouble()
        cuentaAhorro.retirar(monto)
        println("Saldo : $ ${cuentaAhorro.obtenerSaldo()}")

    } catch (error: NumberFormatException) {
        println("Error: debes ingresar un numero")

    } catch (error: SaldoInsuficienteException) {
        println("Error: ${error.message}")
    }finally {
        println("Operacion bancaria finalizada")
    }
    println("Programa finalizado correctamente")
}