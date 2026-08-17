//herencia :
class CuentaAhorro(
    numeroCuenta: Int,
    cliente: Cliente,
    saldoInicial: Double,
    val tasaInteres: Double
    //
) : CuentaBancaria(numeroCuenta=numeroCuenta,cliente,saldoInicial){
    //heredo metodo con polimorfismo
    //sobrescribir = override
    override fun mostrarTipoCuenta() {
        println("Tipo de cuenta: Cuenta de Ahorro")
        println("Interes: $tasaInteres")
    }

}