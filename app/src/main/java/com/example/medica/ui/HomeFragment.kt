package com.example.medica.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.medica.R
import com.example.medica.adapters.ButtonAdapter
import com.example.medica.adapters.DoctorAdapter
import com.example.medica.databinding.FragmentHomeBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

lateinit var buttonItem: MutableList<ButtonItem>
lateinit var doctorsItem: MutableList<DoctorItem>

lateinit var buttonAdapter: ButtonAdapter
lateinit var doctorAdapter: DoctorAdapter


class HomeFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var binding =FragmentHomeBinding.inflate(inflater)

        buttonItem = mutableListOf<ButtonItem>()
        buttonItem.add(ButtonItem( "All"))
        buttonItem.add(ButtonItem("General"))
        buttonItem.add(ButtonItem("Dentist"))
        buttonItem.add(ButtonItem("Otphthal"))
        buttonItem.add(ButtonItem("Nutition"))
        buttonItem.add(ButtonItem("Neurolog"))
        buttonItem.add(ButtonItem("Pediatric"))
        buttonItem.add(ButtonItem("Radiolog"))
        buttonItem.add(ButtonItem("More"))

        buttonAdapter = ButtonAdapter(buttonItem, this)
        binding.rv2.adapter = buttonAdapter

        doctorsItem = mutableListOf<DoctorItem>()
        doctorsItem.add(DoctorItem(R.drawable.img_23, "Dr Randy Wigham",  "Cardiologists | The Valley Hospital", "4.8 (4.279 reviews)"))
        doctorsItem.add(DoctorItem(R.drawable.img_24, "Dr Jenny Watson",  "Immunologists | Christ Hospital", "4.4 (4.242 reviews)"))
        doctorsItem.add(DoctorItem(R.drawable.img_25, "Dr Raul Zirkind",  "Neurologists | Franklin Hospital", "4.8 (6.279 reviews)"))
        doctorsItem.add(DoctorItem(R.drawable.img_26, "Dr Elijah Baranick",  "Allergists | JFK Medical Center", "4.6 (3.279 reviews)"))
        doctorsItem.add(DoctorItem(R.drawable.img_27, "Dr Stephen Shute",  "Immunologists | Franklin Hospital", "4.8 (4.279 reviews)"))
        doctorsItem.add(DoctorItem(R.drawable.img_23, "Dr Randy Wigham",  "Cardiologists | The Valley Hospital", "4.8 (4.279 reviews)"))
        doctorsItem.add(DoctorItem(R.drawable.img_24, "Dr Jenny Watson",  "Immunologists | Christ Hospital", "4.4 (4.242 reviews)"))
        doctorsItem.add(DoctorItem(R.drawable.img_25, "Dr Raul Zirkind",  "Neurologists | Franklin Hospital", "4.8 (6.279 reviews)"))
        doctorsItem.add(DoctorItem(R.drawable.img_26, "Dr Elijah Baranick",  "Allergists | JFK Medical Center", "4.6 (3.279 reviews)"))
        doctorsItem.add(DoctorItem(R.drawable.img_27, "Dr Stephen Shute",  "Immunologists | Franklin Hospital", "4.8 (4.279 reviews)"))

        doctorAdapter = DoctorAdapter(doctorsItem, this)
        binding.rv3.adapter = doctorAdapter


        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}