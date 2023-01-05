package com.dhivya.navigationdrawer

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.fragment_message.*


class MessageFragment : Fragment() {
    lateinit var webView: WebView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_message, container, false)
        webView = view.findViewById<WebView>(R.id.wb_webView)
        webViewSetup()





        return view
    }


    private fun webViewSetup() {
       webView.webViewClient= WebViewClient()
        webView.apply {
            loadUrl("https://www.google.com/")
            settings.javaScriptEnabled= true
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                settings.safeBrowsingEnabled= true
            }

        }
    }


}