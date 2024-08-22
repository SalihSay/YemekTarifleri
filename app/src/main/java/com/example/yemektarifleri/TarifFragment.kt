package com.example.yemektarifleri

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.yemektarifleri.databinding.FragmentListeBinding
import com.example.yemektarifleri.databinding.FragmentTarifBinding
import java.security.Permission


class TarifFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    private var _binding: FragmentTarifBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTarifBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imageView.setOnClickListener{
        if (ContextCompat.checkSelfPermission(requireContext(),Manifest.permission.READ_EXTERNAL_STORAGE) !=PackageManager.PERMISSION_GRANTED){
         if (ActivityCompat.shouldShowRequestPermissionRationale(requireActivity(),Manifest.permission.READ_EXTERNAL_STORAGE)){

         }

        }
        binding.buttonKaydet.setOnClickListener {

        }
        binding.buttonSil.setOnClickListener {

        }
        arguments?.let {
           val bilgi= TarifFragmentArgs.fromBundle(it).bilgi
            if (bilgi=="yeni"){
              binding.buttonSil.isEnabled=false
                binding.buttonKaydet.isEnabled=true
            }else{
                binding.buttonKaydet.isEnabled=false
                binding.buttonSil.isEnabled=true
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}