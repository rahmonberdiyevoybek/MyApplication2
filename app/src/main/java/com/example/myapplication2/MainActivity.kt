package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var items = arrayOf(
        PostModel("salom do'stlar","nragbihvuhuighajnbjdnoivhioahgionGJNJRVUOhioFJV","03 08 2022",R.drawable.image),
        PostModel("salom do'stlar","nragbihvuhuighajnbjdnoivhioahgionGJNJRVUOhioFJV","03 08 2022",R.drawable.img),
        PostModel("salom do'stlar","nragbihvuhuighajnbjdnoivhioahgionGJNJRVUOhioFJV","03 08 2022",R.drawable.img_1),
        PostModel("salom do'stlar","nragbihvuhuighajnbjdnoivhioahgionGJNJRVUOhioFJV","03 08 2022",R.drawable.image),
        PostModel("salom do'stlar","nragbihvuhuighajnbjdnoivhioahgionGJNJRVUOhioFJV","03 08 2022",R.drawable.img),
        PostModel("salom do'stlar","nragbihvuhuighajnbjdnoivhioahgionGJNJRVUOhioFJV","03 08 2022",R.drawable.img_1),
        PostModel("salom do'stlar","nragbihvuhuighajnbjdnoivhioahgionGJNJRVUOhioFJV","03 08 2022",R.drawable.image),
        PostModel("salom do'stlar","nragbihvuhuighajnbjdnoivhioahgionGJNJRVUOhioFJV","03 08 2022",R.drawable.img),
        PostModel("salom do'stlar","nragbihvuhuighajnbjdnoivhioahgionGJNJRVUOhioFJV","03 08 2022",R.drawable.img_1),

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recycler.layoutManager=LinearLayoutManager(this)
        binding.recycler.adapter=PostAdapter(items)







    }
}