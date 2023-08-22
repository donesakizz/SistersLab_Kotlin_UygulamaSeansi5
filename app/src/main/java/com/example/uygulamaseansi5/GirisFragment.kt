package com.example.uygulamaseansi5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.uygulamaseansi5.databinding.FragmentGirisBinding


class GirisFragment : Fragment() {
    private lateinit var binding: FragmentGirisBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding = FragmentGirisBinding.inflate(inflater,container,false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.button.setOnClickListener {

            val username1 = binding.usernameEditText.text.toString()
            val gecis = GirisFragmentDirections.actionikiciFragmenteGecis(username1)

            Navigation.findNavController(it).navigate(gecis)//R.id.DetayFragment

        }
    }
    }


