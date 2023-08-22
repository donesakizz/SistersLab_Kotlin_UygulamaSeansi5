package com.example.uygulamaseansi5.soru2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.uygulamaseansi5.GirisFragmentDirections
import com.example.uygulamaseansi5.R
import com.example.uygulamaseansi5.databinding.FragmentGirisBinding
import com.example.uygulamaseansi5.databinding.FragmentListeBinding


class ListeFragment : Fragment() {
    private lateinit var binding: FragmentListeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListeBinding.inflate(inflater,container,false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.rv.layoutManager = LinearLayoutManager(requireContext())
        binding.rv.adapter = ListelerAdapter(listOf(Listeler("Döne","Sakız"))) {
            val gecis = ListeFragmentDirections.actionDetaySayfasiGecis(it)

            findNavController().navigate(gecis)

        }

    }


}