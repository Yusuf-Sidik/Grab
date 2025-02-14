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
import com.example.grab4.ui.dataclass.Pembayaran1

class PembayaranFragment : Fragment() {

    private var _binding: FragmentPembayaranBinding? = null
    private val binding get() = _binding!!

    private val listpembayaran1 = ArrayList<Pembayaran1>()
    private lateinit var rvpembayaran1: RecyclerView

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
        showRecyclerList()

        return view
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
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}