package Christopher.Martinez.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class PriemerFragmento : Fragment() {

    lateinit var botonUno: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vistaUno=inflater.inflate(R.layout.fragmentuno, container, false)
        botonUno = vistaUno.findViewById(R.id.button2)
        botonUno.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentoUno_to_fragmentoDos)
        }
        return vistaUno
    }
}