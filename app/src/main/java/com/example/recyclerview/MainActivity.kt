package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.MainAdapter
import com.example.recyclerview.databinding.ActivityMainBinding
import org.json.JSONObject
import java.lang.reflect.Array

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeProfileData: kotlin.Array<JSONObject> = arrayOf(
            JSONObject("{\"user\": \"MariaAux\", \"status\": \"Active\"}"),
            JSONObject("{\"user\": \"C L A I R E\", \"status\": \"Out\"}"),
            JSONObject("{\"user\": \"gr_xwz4\", \"status\": \"Disconnected\"}"),
            JSONObject("{\"user\": \"ioioioioi\", \"status\": \"Disconnected\"}"),
            )

        binding.rvSug.adapter = MainAdapter(fakeProfileData)
    }
}