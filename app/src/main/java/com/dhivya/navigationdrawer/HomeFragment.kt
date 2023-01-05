package com.dhivya.navigationdrawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class HomeFragment : Fragment() {
    lateinit var rvAdapter: RecyclerAdapter
    private lateinit var itemList: List<Travel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        itemList = ArrayList()
        (itemList as ArrayList<Travel>).add(Travel("Nivetha", "11.6k Followers", R.drawable.image1))
        (itemList as ArrayList<Travel>).add(
            Travel(
                "Sruthi",
                "11.7k Followers",
                R.drawable.image2
            )
        )
        (itemList as ArrayList<Travel>).add(Travel("Parkavi", "11.4k Followers", R.drawable.image3))
        (itemList as ArrayList<Travel>).add(Travel("Dhivya", "11.5k Followers", R.drawable.image4))
        (itemList as ArrayList<Travel>).add(
            Travel(
                "Lavanya",
                "11.3k Followers",
                R.drawable.image5
            )
        )
        (itemList as ArrayList<Travel>).add(Travel("William Wise", "11.5k Followers", R.drawable.image3))

        rvAdapter = RecyclerAdapter(itemList)
        var rv_recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        rv_recyclerView.layoutManager = LinearLayoutManager(this.requireContext())
        rv_recyclerView.adapter = rvAdapter

        return view
    }


}