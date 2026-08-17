open class CuentaBancaria (
    val numeroCuenta: int,
    val cliente: Cliente,
    saldoInicial: Double
) {

        //Encapsular = proteger
        private var saldo: Double = salarioInicial

         //Permite consultar el saldo sin acceder directamente
        fun obtenerSaldo(): Double {
            return saldo
        }

         //Deposito
        fun depositar(monto: Double){
            if (monto <= 0){
                //Lanzar una excepcion throw = lanzar
                throw IllegalArgumentException("El monto debe ser mayor a 0")
            }
            saldo += monto
            println("Deposito realizado: $ $monto")
        }
        //retirar dinero
        fun retirar(monto: Double){
            if(monto > saldo){
                throw SaldoInsuficienteException("Saldo Insuficiente")
            }
            //si el monto es menor al saldo
            saldo -= monto
            println("Retiro realizado: $ $monto")
        }
        //Polimorfismo
        // open = metodo abierto para que las clases hijos puedan cambiar su comportamiento
        open fun mostrarTipoCuenta(){
            println("Cuenta Bancaria")
        }

}