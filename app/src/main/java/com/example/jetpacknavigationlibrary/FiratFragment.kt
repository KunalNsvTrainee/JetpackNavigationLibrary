package com.example.jetpacknavigationlibrary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.jetpacknavigationlibrary.databinding.FragmentFiratBinding


class FiratFragment : Fragment() {
    var _binding :FragmentFiratBinding? =null
    val binding get() =_binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
         _binding =FragmentFiratBinding.inflate(inflater,container,false)
        binding.tv1.setOnClickListener{
            Navigation.findNavController(binding.root).navigate(R.id.action_firatFragment_to_secondFragment)
        }


       return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
     _binding =null
    }

}