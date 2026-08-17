class CuentaCorriente(
    numeroCuenta: int,
    cliente: Cliente,
    saldoInicial: Double,
    val limiteTransferencia: Double
) : CuentaBancaria(numeroCuenta = numeroCuenta,cliente,saldoInicial){
    override fun mostrarTipoCuenta() {
        println("Cuenta Corriente")
        println("Limite de transferencia :$limiteTransferencia")

    }
}