package com.example.grab4.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.grab4.R
import com.example.grab4.databinding.FragmentHomeBinding
import com.example.grab4.ui.adapter.Menu1Adapter
import com.example.grab4.ui.adapter.Menu2Adapter
import com.example.grab4.ui.adapter.Menu3Adapter
import com.example.grab4.ui.dataclass.Menu1
import com.example.grab4.ui.dataclass.Menu2
import com.example.grab4.ui.dataclass.Menu3
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val listmenu1 = ArrayList<Menu1>()
    private val listmenu2 = ArrayList<Menu2>()
    private val listmenu3 = ArrayList<Menu3>()
    private val listmenu4 = ArrayList<Menu3>()

    private lateinit var rvmenu1: RecyclerView
    private lateinit var rvmenu2: RecyclerView
    private lateinit var rvmenu3: RecyclerView
    private lateinit var rvmenu4: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root

        // inisialisasi recyclerview
        rvmenu1 = binding.rvMenu1
        // set ukuran recyclerview
        rvmenu1.setHasFixedSize(true)
        // menghapus data jika ada perubahan
        listmenu1.clear()
        // memasukkan data ke dalam list
        listmenu1.addAll(getListMenu1())

        rvmenu2 = binding.rvMenu2
        rvmenu2.setHasFixedSize(true)
        listmenu2.clear()
        listmenu2.addAll(getListMen2())

        rvmenu3 = binding.rvMenu3
        rvmenu3.setHasFixedSize(true)
        listmenu3.clear()
        listmenu3.addAll(getListMenu3())

        rvmenu4 = binding.rvMenu4
        rvmenu4.setHasFixedSize(true)
        listmenu4.clear()
        listmenu4.addAll(getListMenu4())

        showRecyclerList()

        return view
    }
    private fun getListMenu1():ArrayList<Menu1> {
        val dataNama = resources.getStringArray(R.array.data_name)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val listMenu1 = ArrayList<Menu1>()
        for (i in dataNama.indices) {
            val menu1 = Menu1(dataPhoto.getResourceId(i, -1), dataNama[i])
            listMenu1.add(menu1)
        }
        return listMenu1
    }

    private fun getListMen2():ArrayList<Menu2> {
        val dataName = resources.getStringArray(R.array.data_name_rv2)
        val dataDescription = resources.getStringArray(R.array.data_description_rv2)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo_rv2)
        val listMenu2 = ArrayList<Menu2>()
        for (i in dataName.indices) {
            val menu2 = Menu2(dataPhoto.getResourceId(i, -1), dataName[i], dataDescription[i])
            listMenu2.add(menu2)
        }
        return listMenu2
    }

    private fun getListMenu3():ArrayList<Menu3> {
        val dataName = resources.getStringArray(R.array.data_name_rv3)
        val dataDiskon = resources.getStringArray(R.array.data_diskon_rv3)
        val dataDescription = resources.getStringArray(R.array.data_description_rv3)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo_rv3)
        val listMenu3 = ArrayList<Menu3>()
        for (i in dataName.indices) {
            val menu3 = Menu3(dataPhoto.getResourceId(i, -1), dataName[i], dataDiskon[i], dataDescription[i])
            listMenu3.add(menu3)
        }
        return listMenu3

    }
    private fun getListMenu4():ArrayList<Menu3> {
        val dataName = resources.getStringArray(R.array.data_name_rv3)
        val dataDiskon = resources.getStringArray(R.array.data_diskon_rv3)
        val dataDescription = resources.getStringArray(R.array.data_description_rv3)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo_rv3)
        val listMenu4 = ArrayList<Menu3>()
        for (i in dataName.indices) {
            val menu4 = Menu3(dataPhoto.getResourceId(i, -1), dataName[i], dataDiskon[i], dataDescription[i])
            listMenu4.add(menu4)
        }
        return listMenu4

    }



    private fun showRecyclerList() {
        rvmenu1.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val listMenu1Adapter = Menu1Adapter(listmenu1)
        rvmenu2.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val listMenu2Adapter = Menu2Adapter(listmenu2)
        rvmenu3.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val listMenu3Adapter = Menu3Adapter(listmenu3)
        rvmenu4.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val listMenu4Adapter = Menu3Adapter(listmenu4)
        rvmenu2.adapter = listMenu2Adapter
        rvmenu1.adapter = listMenu1Adapter
        rvmenu3.adapter = listMenu3Adapter
        rvmenu4.adapter = listMenu4Adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}