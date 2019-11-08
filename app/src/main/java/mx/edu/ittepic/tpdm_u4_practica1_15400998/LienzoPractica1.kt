package mx.edu.ittepic.tpdm_u4_practica1_15400998

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Build
import android.view.View
import androidx.annotation.RequiresApi

class LienzoPractica1(p: MainActivity): View(p){
    val imagen = BitmapFactory.decodeResource(resources,R.drawable.lunachida65x65)
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()

        //setBackgroundColor(Color.rgb(253,211,215))//fondo anocheciendo
        setBackgroundColor(Color.rgb(244,113,82))//fondo atardeciendo
        c.drawBitmap(imagen,1000f,200f,p) //la luna
        p.color = Color.rgb(255,255,255)
        c.drawCircle(100f, 1900f, 1500f, p) //circulo izq
        c.drawCircle(2100f, 1950f, 1350f, p)//circulo der

        //<casa 1>
        p.color = Color.rgb(141,132,130)//color cimientos gris
        c.drawRect(90f,1295f,500f,1305f,p)

        p.color = Color.rgb(0,26,100)// azul casa grande
        c.drawRect(110f,1100f,485f,1294f,p)

        p.color = Color.rgb(255,198,0)//amarillo ventana y puerta
        c.drawRect(190f,1170f,275f,1293f,p)
        c.drawRect(320f,1170f,400f,1245f,p)

        p.color = Color.rgb(0,26,100)//azul chimenea
        p.style = Paint.Style.STROKE
        p.strokeWidth = 10f
        c.drawRect(390f,1020f,470f,1105f,p)
        //</casa 1>

        //<casa 2>
        p.style = Paint.Style.FILL
        p.color = Color.rgb(141,132,130)//color cimientos gris
        c.drawRect(590f,1295f,1000f,1305f,p)

        p.color = Color.rgb(0,26,100)// azul casa grande
        c.drawRect(610f,1100f,985f,1294f,p)

        p.color = Color.rgb(255,198,0)//amarillo ventana y puerta
        c.drawRect(690f,1170f,775f,1293f,p)
        c.drawRect(820f,1170f,890f,1245f,p)

        p.color = Color.rgb(0,26,100)//azul chimenea
        p.style = Paint.Style.STROKE
        p.strokeWidth = 10f
        c.drawRect(890f,1020f,970f,1105f,p)
        //</casa 2>

        //<arbol 1>
        p.style = Paint.Style.FILL
        p.color = Color.rgb(142,112,76)//cafe tronco arbol
        c.drawRect(200f,800f,300f,940f,p)

        p.color = Color.rgb(4,78,4)//hojas arbol
        c.drawOval(115f,700f,385f,840f,p)
        c.drawOval(115f,600f,385f,740f,p)
        //</arbol 1>

        //<arbol 2>
        p.color = Color.rgb(142,112,76)//cafe tronco arbol
        c.drawRect(600f,800f,700f,940f,p)

        p.color = Color.rgb(4,78,4)//hojas arbol
        c.drawOval(515f,700f,785f,840f,p)
        c.drawOval(515f,600f,785f,740f,p)
        //</arbol 2>

        //<arbol 3>
        p.color = Color.rgb(142,112,76)//cafe tronco arbol
        c.drawRect(2100f,1165f,2200f,1305f,p)

        p.color = Color.rgb(4,78,4)//hojas arbol
        c.drawOval(2015f,1065f,2285f,1205f,p)
        c.drawOval(2015f,965f,2285f,1105f,p)
        //</arbol 3>

        //<muñeco de nieve>
        p.color = Color.rgb(0,0,0)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 8f
        c.drawCircle(1600f, 1000f, 80f, p) //cabeza
        c.drawCircle(1600f,1150f,100f,p)//panza

        p.color = Color.rgb(255,255,255)
        p.style = Paint.Style.FILL
        c.drawCircle(1600f, 1000f, 79f, p) //cabeza rellena

        p.color = Color.BLACK
        c.drawCircle(1559f, 990f, 15f, p)//ojo izq
        c.drawCircle(1639f, 990f, 15f, p)//ojo der
        c.drawCircle(1600f, 1030f, 20f, p)//boca
        p.color = Color.rgb(0,112,184)
        c.drawCircle(1600f, 1120f, 16f, p)//boton 1
        c.drawCircle(1600f, 1160f, 16f, p)//boton 2
        c.drawCircle(1600f, 1200f, 16f, p)//boton 3
        //<//muñeco de nieve>

        //<estrellas>
        p.color = Color.rgb(255,255,255)
        p.style = Paint.Style.FILL
        c.drawCircle(0f, 100f, 18f, p)
        c.drawCircle(150f, 100f, 18f, p)
        c.drawCircle(350f, 100f, 18f, p)
        c.drawCircle(550f, 100f, 18f, p)
        c.drawCircle(750f, 100f, 18f, p)
        c.drawCircle(950f, 100f, 18f, p)
        c.drawCircle(1150f, 100f, 18f, p)
        c.drawCircle(1350f, 100f, 18f, p)
        c.drawCircle(1550f, 100f, 18f, p)
        c.drawCircle(1750f, 100f, 18f, p)
        c.drawCircle(1950f, 100f, 18f, p)
        c.drawCircle(2150f, 100f, 18f, p)
        c.drawCircle(2350f, 100f, 18f, p)


        //----------------------------------------------
        c.drawCircle(070f, 200f, 16f, p)
        c.drawCircle(250f, 200f, 16f, p)
        c.drawCircle(450f, 200f, 16f, p)
        c.drawCircle(650f, 200f, 16f, p)
        c.drawCircle(850f, 200f, 16f, p)
        c.drawCircle(1050f, 200f, 16f, p)
        c.drawCircle(1250f, 200f, 16f, p)
        c.drawCircle(1450f, 200f, 16f, p)
        c.drawCircle(1650f, 200f, 16f, p)
        c.drawCircle(1850f, 200f, 16f, p)
        c.drawCircle(2050f, 200f, 16f, p)
        c.drawCircle(2250f, 200f, 16f, p)

        //----------------------------------------------
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        c.drawCircle(0f, 300f, 18f, p)
        c.drawCircle(150f, 300f, 18f, p)
        c.drawCircle(350f, 300f, 18f, p)
        c.drawCircle(550f, 300f, 18f, p)
        c.drawCircle(750f, 300f, 18f, p)
        c.drawCircle(950f, 300f, 18f, p)
        c.drawCircle(1350f, 300f, 18f, p)
        c.drawCircle(1550f, 300f, 18f, p)
        c.drawCircle(1750f, 300f, 18f, p)
        c.drawCircle(1950f, 300f, 18f, p)
        c.drawCircle(2150f, 300f, 18f, p)
        c.drawCircle(2350f, 300f, 18f, p)

        //**********************************************
        p.color = Color.rgb(255,255,255)
        p.style = Paint.Style.FILL
        c.drawCircle(150f, 400f, 18f, p)
        c.drawCircle(350f, 400f, 18f, p)
        c.drawCircle(550f, 400f, 18f, p)
        c.drawCircle(750f, 400f, 18f, p)
        c.drawCircle(950f, 400f, 18f, p)
        c.drawCircle(1350f, 400f, 18f, p)
        c.drawCircle(1550f, 400f, 18f, p)
        c.drawCircle(1750f, 400f, 18f, p)
        c.drawCircle(1950f, 400f, 18f, p)
        c.drawCircle(2150f, 400f, 18f, p)

        //----------------------------------------------
        c.drawCircle(250f, 500f, 16f, p)
        c.drawCircle(450f, 500f, 16f, p)
        c.drawCircle(650f, 500f, 16f, p)
        c.drawCircle(850f, 500f, 16f, p)
        c.drawCircle(1050f, 500f, 16f, p)
        c.drawCircle(1250f, 500f, 16f, p)
        c.drawCircle(1450f, 500f, 16f, p)
        c.drawCircle(1650f, 500f, 16f, p)
        c.drawCircle(1850f, 500f, 16f, p)
        c.drawCircle(2050f, 500f, 16f, p)
        c.drawCircle(2250f, 500f, 16f, p)

        //----------------------------------------------
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        c.drawCircle(150f, 600f, 18f, p)
        c.drawCircle(350f, 600f, 18f, p)
        c.drawCircle(550f, 600f, 18f, p)
        c.drawCircle(750f, 600f, 18f, p)
        c.drawCircle(950f, 600f, 18f, p)
        c.drawCircle(1150f, 600f, 18f, p)
        c.drawCircle(1350f, 600f, 18f, p)
        c.drawCircle(1550f, 600f, 18f, p)
        c.drawCircle(1750f, 600f, 18f, p)
        c.drawCircle(1950f, 600f, 18f, p)
        c.drawCircle(2150f, 600f, 18f, p)
        c.drawCircle(2350f, 600f, 18f, p)

        //**********************************************
        p.color = Color.rgb(255,255,255)
        p.style = Paint.Style.FILL
        c.drawCircle(1150f, 700f, 18f, p)
        c.drawCircle(1350f, 700f, 18f, p)
        c.drawCircle(1550f, 700f, 18f, p)
        c.drawCircle(1750f, 700f, 18f, p)
        c.drawCircle(1950f, 700f, 18f, p)
        c.drawCircle(2150f, 700f, 18f, p)

        //----------------------------------------------
        c.drawCircle(250f, 800f, 16f, p)
        c.drawCircle(450f, 800f, 16f, p)
        c.drawCircle(650f, 800f, 16f, p)
        c.drawCircle(850f, 800f, 16f, p)
        c.drawCircle(1050f, 800f, 16f, p)
        c.drawCircle(1250f, 800f, 16f, p)
        c.drawCircle(1450f, 800f, 16f, p)
        c.drawCircle(1650f, 800f, 16f, p)
        c.drawCircle(1850f, 800f, 16f, p)
        c.drawCircle(2050f, 800f, 16f, p)
        //</estrellas>
        /*p.color = Color.RED
        p.textSize = 40f
        c.drawText("Miguel Garcia", 100f, 100f, p)*/
        

    }
}