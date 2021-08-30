package com.muayid.my_kash


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_star.*

/**
 * A simple [Fragment] subclass.
 */
class star : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_star, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        setHasOptionsMenu(true)

    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater?.inflate(R.menu .meu_ster,menu)
        super.onCreateOptionsMenu(menu, inflater)

        ambulan.setOnClickListener {

            val  intent= Intent(Intent.ACTION_CALL)

            intent.data = Uri.parse("tel:997")

            startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item!!.itemId ){
            R.id.sve ->{

                view!!.findNavController().navigate(R.id.action_star_to_ambulance)
            }

            R.id.info ->{

                view!!.findNavController().navigate(R.id.action_star_to_test)
            }



        }

        return super.onOptionsItemSelected(item)
    }





}
