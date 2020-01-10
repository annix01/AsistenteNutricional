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
 * imagen: String; Intenet, libreria Glide
 *  Regresa un ArrayList
 */

class datosDesayuno {

    companion object {

        fun creacionDatosDesayuno(): ArrayList<ModeloReceta> {
            val listaDesayuno = ArrayList<ModeloReceta>()
            listaDesayuno.add(
                ModeloReceta(
                    "WAFFLES DE CORAZÓN",
                    "Baja",
                    "30 minutos",
                    "5",
                    "1 3/4 tazas de harina\n" +
                            "1 cucharada de polvo para hornear\n" +
                            "1/4 de cucharadita de sal\n" +
                            "2 yemas de huevo\n" +
                            "1 3/4 tazas de leche de vaca\n" +
                            "1/2 taza de aceite vegetal\n" +
                            "2 claras de huevo\n" +
                            "azúcar glass\n",
                    "En un bowl mezcle el harina, polvo para hornear y sal.\n" +
                            "En otro recipiente bata las yemas de huevo un poco y agregue la leche y el aceite. Revuelva y agregue la mezcla a la harina mezclada. Revuelva hasta que se mezcle bien.\n" +
                            "En otro recipiente, bata las claras de huevo hasta punto de turrón."+
                            "Poco a poco incorpore las claras de huevo a la mezcla anterior con movimientos envolventes (no bata de más).\n"+
                            "Ponga 1 taza de la mezcla en la wafflera engrasada en forma de corazón y cierre la tapa rápidamente. Cocine hasta que esté listo.\n"+
                            "Repita con el resto de la mezcla.\n"+"Espolvoree azúcar glass y sirva con su fruta favorita\n",
                    "https://cdn.kiwilimon.com/recetaimagen/22820/th5-640x426-22407.jpg"
                )
            )
            listaDesayuno.add(
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
            listaDesayuno.add(
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
            return listaDesayuno
        }
    }
}