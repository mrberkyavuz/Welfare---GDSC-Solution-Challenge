package com.works.solutionchallange2024.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.works.solutionchallange2024.HomeActivity
import com.works.solutionchallange2024.MainActivity
import com.works.solutionchallange2024.R
import com.works.solutionchallange2024.databinding.FragmentProfileBinding
import com.works.solutionchallange2024.manager.AppPref

//

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentProfileBinding.inflate(inflater, container, false)

        binding.constraintLayoutUpdate.setOnClickListener{
            val action = ProfileFragmentDirections.actionProfileFragmentToProfileInformationFragment()
            findNavController().navigate(action)
        }

        binding.constraintLayoutFavorites.setOnClickListener{
            val action = ProfileFragmentDirections.actionProfileFragmentToProfileFavouritesFragment()
            findNavController().navigate(action)
        }

        binding.constraintLayoutLogout.setOnClickListener {
            showLogoutConfirmationDialog()
        }

        return binding.root
    }

    private fun showLogoutConfirmationDialog() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Log Out")
        builder.setMessage("Are you sure want to log out?")

        // Evet (Yes) butonuna tıklanınca
        builder.setPositiveButton("Yes") { dialog, which ->
            val appPref = AppPref(requireContext())
            appPref.clearData()
            appPref.clearToken()
            val intent = Intent(requireActivity(),MainActivity::class.java)
            startActivity(intent)
            requireActivity().finish()

            dialog.dismiss()
        }

        // Hayır (No) butonuna tıklanınca
        builder.setNegativeButton("No") { dialog, which ->
            // Çıkış işlemi iptal edildi, hiçbir şey yapma
            // Dialog'u kapat
            dialog.dismiss()
        }//

        // Dialog'u oluştur ve göster
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as HomeActivity).showBottomNavigation()

        // RatingBar ve TextView'ı bul
        val ratingBar = view.findViewById<RatingBar>(R.id.profileRatingBar)
        val ratingTextView = view.findViewById<TextView>(R.id.profileRatingTextView)

        // Rating değerini ayarla (örneğin 4.7)
        val ratingValue = 4.7.toFloat()
        ratingBar.rating = ratingValue

        // TextView'a rating değerini yaz
        ratingTextView.text = String.format("%.1f", ratingValue)
    }

}