package com.example.grab4.ui.pembayaran

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.grab4.R
import com.example.grab4.databinding.FragmentPembayaranBinding
import com.example.grab4.ui.adapter.Pembayaran1Adapter
import com.example.grab4.ui.adapter.Pembayaran2Adapter
import com.example.grab4.ui.dataclass.Pembayaran1
import com.example.grab4.ui.dataclass.Pembayaran2

class PembayaranFragment : Fragment() {

    private var _binding: FragmentPembayaranBinding? = null
    private val binding get() = _binding!!

    private val listpembayaran1 = ArrayList<Pembayaran1>()
    private val listpembayaran2 = ArrayList<Pembayaran2>()

    private lateinit var rvpembayaran1: RecyclerView
    private lateinit var rvpembayaran2: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentPembayaranBinding.inflate(inflater, container, false)
        val view = binding.root

        rvpembayaran1 = binding.rv1Pembayaran
        rvpembayaran1.setHasFixedSize(true)
        listpembayaran1.clear()
        listpembayaran1.addAll(getListPembayaran1())

        rvpembayaran2 = binding.rv2Pembayaran
        rvpembayaran2.setHasFixedSize(true)
        listpembayaran2.clear()
        listpembayaran2.addAll(getListPembayaran2())
        showRecyclerList()

        return view
    }

    private fun getListPembayaran2(): ArrayList<Pembayaran2> {
        val dataTitle = resources.getStringArray(R.array.data_rv2_pembayaran2)
        val dataDescription = resources.getStringArray(R.array.description_rv2_pembayaran2)
        val dataPhoto = resources.obtainTypedArray(R.array.photo_rv2_pembayaran2)
        val listPembayaran2 = ArrayList<Pembayaran2>()
        for (i in dataTitle.indices) {
            val pembayaran2 = Pembayaran2(dataPhoto.getResourceId(i, -1),dataTitle[i], dataDescription[i] )
            listPembayaran2.add(pembayaran2)
        }
        return listPembayaran2
    }

    private fun getListPembayaran1():ArrayList<Pembayaran1> {
        val dataName = resources.getStringArray(R.array.data_rv1_pembayaran1)
        val dataName2 = resources.getStringArray(R.array.data_rv1_pembayaran2)
        val listPembayaran1 = ArrayList<Pembayaran1>()
        for (i in dataName.indices) {
            val pembayaran1 = Pembayaran1(dataName[i], dataName2[i])
            listPembayaran1.add(pembayaran1)
        }
        return listPembayaran1
    }

    private fun showRecyclerList() {
        rvpembayaran1.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val listPembayaran1Adapter = Pembayaran1Adapter(listpembayaran1)
        rvpembayaran1.adapter = listPembayaran1Adapter
        rvpembayaran2.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL, false)
        val listPembayaran2Adapter = Pembayaran2Adapter(listpembayaran2)
        rvpembayaran2.adapter = listPembayaran2Adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}