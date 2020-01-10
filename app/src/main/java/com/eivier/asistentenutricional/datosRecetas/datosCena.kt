package com.eivier.asistentenutricional.datos_root_ide_package_.com.eivier.asistentenutricional.modelos.ModeloReceta

import com.eivier.asistentenutricional.R
import com.eivier.asistentenutricional.modelos.ModeloReceta
import kotlinx.android.synthetic.main.content_recetas_opciones.view.*

/**
 * Metodo colocar Datos para Desayuno al modelo _root_ide_package_.com.eivier.asistentenutricional.modelos.ModeloReceta
 * Recibe: Nombre: String,
 * dificultad: String,
 * tiempo: String,
 * porciones: Int,
 * ingredientes: String,
 * preparacion: String,
 * imagen: Int; Recursos drawable
 *  Regresa un ArrayList
 */

class datosCena {

    companion object {

        fun creacionDatosCena(): ArrayList<ModeloReceta> {
            val listaCena = ArrayList<ModeloReceta>()
            listaCena.add(
                ModeloReceta(
                    "TACOS DE LECHUGA CON CAMARONES ADOBADOS",
                    "Baja",
                    "10 minutos",
                    "4",
                    "3 chiles guajillos hidratado en agua caliente para el adobo\n" +
                            "5 chiles anchos hidratado en agua caliente para el adobo\n" +
                            "4 cucharadas de chile chipotle para el adobo\n" +
                            "1/4 de cebolla para el adobo\n" +
                            "1 diente de ajo para el adobo\n" +
                            "1 cucharada de orégano para el adobo\n" +
                            "1/2 cucharada de comino entero, para el adobo\n" +
                            "1/2 taza de jugo de naranja para el adobo\n" +
                            "2 cucharadas de vinagre blanco para el adobo\n" +
                            "2 cucharadas de aceite de oliva\n" +
                            "1/2 taza de cebolla en tiritas\n" +
                            "1/4 de taza de apio finamente picado\n" +
                            "3/4 de taza de jitomate en cubitos\n" +
                            "2 tazas de camarón limpios\n" +
                            "al gusto de sal\n" +
                            "al gusto de pimienta\n" +
                            "1/2 taza de Bits De Coliflor Eva® para el pico de gallo\n" +
                            "1/2 taza de jitomate para el pico de gallo\n" +
                            "1/4 de taza de pepino persa para el pico de gallo\n" +
                            "1 chile cuaresmeño finamente picado para el pico de gallo\n" +
                            "1 cucharada de cebolla en polvo para el pico de gallo\n" +
                            "1 cucharada de orégano para el pico de gallo\n" +
                            "1/4 de taza de cilantro finamente picado para el pico de gallo\n" +
                            "1/4 de taza de jugo de limón para el pico de gallo\n" +
                            "3 cucharadas de jugo de naranja para el pico de gallo\n" +
                            "al gusto de sal para el pico de gallo\n" +
                            "al gusto de pimienta para el pico de gallo\n" +
                            "hojas de Lechuga Mini Romaine Eva® 4 piezas\n" +
                            "suficiente de cebolla morada en tiritas, para acompañar",
                    "Licúa los chiles con la cebolla, el ajo, el orégano, el comino, el jugo de naranja y el vinagre blanco hasta obtener una salsa espesa. Reserva.\n" +
                            "En una sartén con aceite caliente sofríe la cebolla. Agrega el apio, el jitomate y cocina por unos minutos. Incorpora los camarones y el adobo. Sazona con sal y pimienta, cocina por unos minutos más. Enfría.\n" +
                            "Para el pico de gallo, mezcla los bits de coliflor junto con el jitomate, el pepino persa, el chile cuaresmeño, la cebolla en polvo, el orégano, el cilantro, el jugo de limón y el jugo de naranja. Sazona con sal y pimienta. Reserva.\n" +
                            "Coloca dos hojas de lechua Eva® Mini Romaine, una encima de otra, para obtener una base más amplia, agrega el camarón adobado, acompaña con pico de gallo de coliflor y decora con cebolla morada. Coloca en plato extendido.",
                    "https://cdn.kiwilimon.com/recetaimagen/36101/44244.jpg"
                )
            )
            listaCena.add(
                ModeloReceta(
                    "Hotcakes de manzana con avena",
                    "Baja",
                    "16 minutos",
                    "2",
                    "1/2 plátano\n" +
                            "6 cucharadas de Nestum® Cereal infantil Avena\n" +
                            "suficiente de aceite en aerosol\n" +
                            "1/2 manzana",
                    "En un bowl, machaca el plátano hasta hacerlo puré, agrega Nestum® Cereal infantil Avena y la manzana.\n" +
                            "En un sartén a fuego medio, agrega un poco de aceite en aerosol y vierte un poco de la mezcla de hotcakes, cocina por 3 minutos de cada lado.\n" +
                            "Sirve en un platito para bebé.",
                    "https://www.pequerecetas.com/wp-content/uploads/2015/07/recetas-saludables-480x480.jpg"
                )
            )
            listaCena.add(
                ModeloReceta(
                    "Papilla de Pera y Papaya",
                    "Baja",
                    "10 minutos",
                    "2",
                    "1/2 pera sin cáscara\n" +
                            "3 cucharadas de Nestum® Cereal infantil 4 cereales\n" +
                            "1 taza de papaya\n" +
                            "3 cucharadas de Nestum® Cereal infantil 4 cereales",
                    "En un procesador, agrega la pera con 3 cucharadas de Nestum® Cereal infantil 4 cereales y procesa hasta que tenga consistencia de papilla. Reserva.\n" +
                            "En un procesador, agrega la papaya con 3 cucharadas de Nestum® Cereal infantil 4 cereales y procesa hasta que tenga consistencia de papilla. Reserva.\n" +
                            "Coloca en un tazón la papilla de pera y luego la de papaya hasta formar los dos colores.",
                    "https://www.pequerecetas.com/wp-content/uploads/2015/07/recetas-saludables-480x480.jpg"
                )
            )
            return listaCena
        }
    }
}