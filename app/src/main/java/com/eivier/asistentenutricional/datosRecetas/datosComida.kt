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

class datosComida {

    companion object {

        fun creacionDatosComida(): ArrayList<ModeloReceta> {
            val listaComida = ArrayList<ModeloReceta>()
            listaComida.add(
                ModeloReceta(
                    "ENCHILADAS DE CALABAZA CON POLLO",
                    "Baja",
                    "25 minutos",
                    "4",
                    "5 jitomates\n" +
                            "5 chiles morita secos\n" +
                            "1/4 de cebolla\n" +
                            "1 diente de ajo\n" +
                            "1 cucharada de ajo\n" +
                            "1 pechuga de pollo deshebrada\n" +
                            "3 calabacitas\n" +
                            "1 cucharada de aceite de oliva\n" +
                            "1/2 taza de queso panela desmoronado\n" +
                            "al gusto de cilantro fresco para decora",
                    "Precalienta el horno a 180°C.\n" +
                            "En un comal, asa los jitomates, los chiles, la cebolla y el ajo. Licúa hasta obtener una salsa.\n" +
                            "En una cacerola calienta el aceite vierte la salsa y cocina por 10 minutos. Reserva un poco de la salsa para servir, y agrega la pechuga de pollo a la cacerola. Cocina 5 minutos más.\n" +
                            "Con ayuda de un pelador, corta las calabazas en láminas delgadas.\n" +
                            "Sobre una tabla coloca 3 tiras de calabaza y rellena con el pollo.\n" +
                            "Coloca las enchiladas en un refractario para horno, agrega un poco de aceite de oliva, sazona con sal y pimienta. Hornea 10 minutos o hasta que las calabazas estén suaves.\n" +
                            "Sirve calientes con más salsa, queso y cilantro.",
                    "https://cdn.kiwilimon.com/recetaimagen/30402/33723.jpg"
                )
            )
            listaComida.add(
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
            listaComida.add(
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
            return listaComida
        }
    }
}