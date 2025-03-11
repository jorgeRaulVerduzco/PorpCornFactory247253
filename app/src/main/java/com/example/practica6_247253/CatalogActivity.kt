package com.example.practica6_247253

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CatalogActivity : AppCompatActivity() {
    var adapter: PeliculaAdapter?=null
    var seriesAdapter: PeliculaAdapter?=null
    var peliculas = ArrayList<Pelicula>()
    var series = ArrayList<Pelicula>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_catalog)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        cargarPeliculas()
        cargarSeries()
        adapter = PeliculaAdapter(this,peliculas)
        seriesAdapter = PeliculaAdapter(this,series)
        var gridPelis : GridView = findViewById(R.id.movies_catalog)
        var gridSeries : GridView = findViewById(R.id.series_catalog)
        gridPelis.adapter= adapter
        gridSeries.adapter= seriesAdapter

    }
    fun cargarPeliculas(){
        peliculas.add(Pelicula("Bones", R.drawable.bones, R.drawable.bonesheader, "Dr. Temperance Brennan is a brilliant, but lonely, anthropologist whom is approached by an ambitious FBI agent, named Seely Booth, to help the bureau solve a series of unsolved crimes by identifying the long-dead bodies of missing persons by their bone structure. But both Agent Booth and Dr. Brennan and her team come up again a variety of interference from red tape, corruption, and local noncooperation.",arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Dr. House", R.drawable.drhouse, R.drawable.househeader, "The series follows the life of anti-social, pain killer addict, witty and arrogant medical doctor Gregory House (Hugh Laurie) with only half a muscle in his right leg. He and his team of medical doctors try to cure complex and rare diseases from very ill ordinary people in the United States of America.",arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Big Hero 6", R.drawable.bighero6, R.drawable.headerbighero6, "When a devastating event befalls the city of San Fransokyo and catapults Hiro into the midst of danger, he turns to Baymax and his close friends adrenaline junkie Go Go Tomago, neatnik Wasabi, chemistry whiz Honey Lemon and fanboy Fred. Determined to uncover the mystery, Hiro transforms his friends into a band of high-tech heroes called &quot;Big Hero 6.&quot;",arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Dr. Who", R.drawable.drwho, R.drawable.drwhoheader, "Traveling across time and space, the immortal time-lord known as &#39;The Doctor&#39; travels across the universe with his many companions and his loyal shape-shifting space-ship: The TARDIS. The Doctor faces many threats across many generations: from The Daleks, The Cybermen and his time- lord adversary The Master to the sinister Davros, creator of The Daleks.",arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Friends", R.drawable.friends, R.drawable.friendsheader, "Rachel Green, Ross Geller, Monica Geller, Joey Tribbiani, Chandler Bing and Phoebe Buffay are six 20 something year-olds, living off of one another in the heart of New York City. Over the course of ten years, this average group of buddies goes through massive mayhem, family trouble, past and future romances, fights, laughs, tears and surprises as they learn what it really means to be a friend.",arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Inception", R.drawable.inception, R.drawable.inceptionheader, "Dom Cobb is a skilled thief, the absolute best in the dangerous art of extraction, stealing valuable secrets from deep within the subconscious during the dream state, when the mind is at its most vulnerable. Cobb&#39;s rare ability has made him a coveted player in this treacherous new world of corporate espionage, but it has also made him an international  fugitive and cost him everything he has ever loved. Now Cobb is being offered a chance at redemption. One last job could give him his life back but only if he can accomplish the impossible, inception. Instead of the perfect heist, Cobb and his team of specialists have to pull off the reverse: their task is not to steal an idea, but to plant one. If they succeed, it could be the perfect crime. But no amount of careful planning or expertise can prepare the team for the dangerous enemy that seems to predict their every move. An enemy that only Cobb could have seen coming. ",arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Leap Year", R.drawable.leapyear, R.drawable.leapyearheader, "A woman who has an elaborate scheme to propose to her boyfriend on Leap Day, an Irish tradition which occurs every time the date February 29 rolls around, faces a major setback when bad weather threatens to derail her planned trip to Dublin. With the help of an innkeeper, however, her cross-country odyssey just might result in her getting engaged.",arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Toy Story", R.drawable.toystory, R.drawable.toystoryheader, "Toy Story is about the &#39;secret life of toys&#39; when people are not around. When Buzz Lightyear, a space-ranger, takes Woody&#39;s place as Andy&#39;s favorite toy, Woody doesn&#39;t like the situation and gets into a fight with Buzz. Accidentaly Buzz falls out the window and Woody is accused by all the other toys of having killed him. He has to go out of the house to look for him so that they can both return to Andys room. But while on the outside they get into all kind of trouble while trying to get home.",arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Smallville", R.drawable.smallville, R.drawable.smallvilleheader, "The numerous miraculous rescues by the local wonder boy Clark have aroused suspicions amongst colonials of Smallville. Interestingly, the boy has managed to downplay his acts of various heroic egresses in the past. They say he&#39;s either too fast or has a penchant for finding trouble. He was found by Martha and Jonathan Kent on the day of the Meteor Shower, and subsequently adopted. Clark&#39;s friend Lex Luthor, the only heir of Luthorcorp, has been secretly investigating grounds for Clark&#39;s outlandish valor. However, on the face of it, Clark just seems a normal boy who&#39;s slightly more secretive than usual.",arrayListOf<Cliente>()))
    }
    fun cargarSeries(){
        series.add(Pelicula("Avatar: La leyenda de Aang", R.drawable.ant,R.drawable.ant,"La leyenda de Aang sigue al último sobreviviente de los Nómadas del Aire, quien deberá restaurar el equilibrio en el mundo entre las tres naciones restantes: la Tribu del Agua, el Reino Tierra y la Nación del Fuego.", arrayListOf<Cliente>()))
        series.add(Pelicula("Halo", R.drawable.halo,R.drawable.halos,"Una evacuación mortal cambia la guerra del Jefe Maestro con el Covenant. En Reach, un nuevo régimen toma el mando en FLEETCOM. John siente una amenaza inminente cerca. Estreno de temporada.",arrayListOf<Cliente>()))
        series.add(Pelicula("Leveling", R.drawable.sololeveling,R.drawable.sololevelings,"En un mundo en el que ciertos humanos llamados “cazadores” poseen habilidades mágicas, estos deben luchar contra monstruos para proteger a la raza humana de una aniquilación segura. Un cazador muy débil llamado Sung Jinwoo se encuentra en una lucha en la que solo puede tratar de sobrevivir.",arrayListOf<Cliente>()))
        series.add(Pelicula("Mi adorable demonio", R.drawable.adorabledemonio,R.drawable.adorabledemonios,"Se centra en la vida de Jung Koo Won, un temerario demonio que pierde sus poderes tras conocer a Do Do-Hee, una exitosa empresaria con la que deberá de colaborar para recuperarlos.",arrayListOf<Cliente>()))
        series.add(Pelicula("El Monstruo de la Vieja Seúl", R.drawable.elmonstruo,R.drawable.elmonstruovieja,"Gyeongseong, 1945. En la oscura era colonial de Seúl, un empresario y una investigadora luchan por sobrevivir y se enfrentan a un monstruo nacido de la avaricia humana.",arrayListOf<Cliente>()))
        series.add(Pelicula("Witcher", R.drawable.thewitcher,R.drawable.thewitchers,"Geralt de Rivia, un cazador de monstruos mutante, viaja en pos de su destino por un mundo turbulento en el que, a menudo, los humanos son peores que las bestias.",arrayListOf<Cliente>()))
    }

    class PeliculaAdapter: BaseAdapter{
        var context: Context? = null
        var peliculas = ArrayList<Pelicula>()
        constructor(context: Context, peliculas: ArrayList<Pelicula>){
            this.context = context
            this.peliculas=peliculas
        }

        override fun getCount(): Int {
           return peliculas.size
        }

        override fun getItem(position: Int): Any {
            return  peliculas[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var pelicula= peliculas[position]
            var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var vista = inflator.inflate(R.layout.cell_movie, null)
            var image : ImageView = vista.findViewById(R.id.image_movie_cell)
            var title: TextView = vista.findViewById(R.id.movie_title_cell)

            image.setImageResource(pelicula.image)
            title.setText(pelicula.titulo)

            image.setOnClickListener {
                var intent =Intent(context, MovieDetail::class.java)
                intent.putExtra("titulo",pelicula.titulo)
                intent.putExtra("sinopsis",pelicula.sinopsis)
                intent.putExtra("header",pelicula.header)
                intent.putExtra("image",pelicula.image)
                intent.putExtra("numberSeats",(20-pelicula.seats.size))
                context!!.startActivity(intent)
            }
            return vista
        }
    }
}