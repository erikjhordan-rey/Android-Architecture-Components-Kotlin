/**
 * Copyright 2017 Erik Jhordan Rey.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.erikjhordanrey.kotlin_devises.view

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.github.erikjhordanrey.kotlin_devises.databinding.AboutFragmentBinding

class AboutFragment : Fragment() {

    private lateinit var binding: AboutFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = AboutFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        binding.showMePost.setOnClickListener { startActivityActionView(PROJECT_BLOG_POST) }
        binding.showMeCode.setOnClickListener { startActivityActionView(PROJECT_SOURCE_CODE) }
    }

    private fun startActivityActionView(url: String) {
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }

    companion object {

        const val PROJECT_BLOG_POST = "https://erikjhordan-rey.github.io/blog/2017/05/22/ANDROID-kotlin-arch-components.html"
        const val PROJECT_SOURCE_CODE = "https://github.com/erikjhordan-rey/Android-Architecture-Components-Kotlin"

        fun newInstance() = AboutFragment()
    }
}

