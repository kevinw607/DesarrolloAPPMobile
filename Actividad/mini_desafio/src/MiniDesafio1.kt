class MiniDesafio1 {fun main(){
    val nombreEvento = "Kotlin Fest"
    var precioEntrada = 12500.0
    val cantidadEntradas = 3
    var cargoPorServicio = 1500.0
    var descuento = 5000.0
    val eventoDisponible = true
    var categoria = "A"
    val edadComprador = 20
    val tieneAutorizacion = true

    //1. Calcular el subtotal de las entradas.
    //2. Calcular el cargo total por servicio, considerando que se cobra por cada entrada.
    //3. Calcular el total antes del descuento.
    //4. Calcular el total final después de aplicar el descuento.
    //5. Determinar mediante una comparación si el comprador es mayor de edad.
    //6. Crear una variable puedeComprar usando operadores lógicos. Para comprar debe ser mayor de edad,
    //tener autorización y el evento debe estar disponible.
    //7. Aumentar en 1 la cantidad de entradas utilizando una variable var.
    //8. Mostrar toda la información utilizando println() y String Templates.

    var subtotalEntradas = cantidadEntradas * precioEntrada //1
    var cargoTotal = cantidadEntradas * cargoPorServicio // 2
    var totalAntesDescuento = subtotalEntradas + cargoTotal //3
    var totalFinal = totalAntesDescuento - descuento //4
    var esMayor = false //5

    if (edadComprador >= 18) {
        esMayor = true
    } else {
        esMayor = false
    }

    var puedeComprar = false //6

    if (esMayor && tieneAutorizacion && eventoDisponible) {
        puedeComprar = true
    } else {
        puedeComprar = false
    }

    val aumentarCantidad = 1 //7
    val cantidadAumentada = cantidadEntradas + aumentarCantidad


    println("================================")
    println("RESUMEN DE COMPRA")
    println("================================")
    println("Evento: $nombreEvento")
    println("Categoria: $categoria")
    println("Precio Entrada: $$precioEntrada")
    println("Cantidad inicial: $cantidadEntradas")
    println("")
    println("Subtotal: $subtotalEntradas")
    println("Cargo por servicio: $$cargoTotal")
    println("Total antes del descuento: $$totalAntesDescuento")
    println("Descuento: $$descuento")
    println("Total final: $$totalFinal")
    println("")
    println("Mayor de edad: $esMayor")
    println("Evento disponible: $eventoDisponible")
    println("tiene autorizacion: $tieneAutorizacion")
    println("Puede comprar: $puedeComprar")
    println("")
    println("Cantidad actualizada $cantidadAumentada")
    }
}



