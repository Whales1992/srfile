package com.android.srfileutil.presentation.retrieve

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.srfileutil.R

class RetrieveFileFragment : Fragment() {

    companion object {
        fun newInstance() = RetrieveFileFragment()
    }

    private lateinit var viewModel: RetrieveFileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.retrieve_file_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(RetrieveFileViewModel::class.java)
    }

}