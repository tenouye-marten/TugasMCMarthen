package com.example.tugas4marthen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Home : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<ItemData>
    private lateinit var newAdapter: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)


        newRecyclerView = findViewById(R.id.ha)
        newArrayList = ArrayList()

        newArrayList.add(ItemData(R.drawable.anakdanyesus, "Yesus Mengasihi Anak-Anak Kecil", "Biarkan anak-anak itu datang kepadaku, dan jangan menghalangi mereka, sebab kerajaan Allah adalah milik orang-orang seperti mereka."))
        newArrayList.add(ItemData(R.drawable.nuh, "Yesus Mengasihi Anak-Anak Kecil", "Biarkan anak-anak itu datang kepadaku, dan jangan menghalangi mereka, sebab kerajaan Allah adalah milik orang-orang seperti mereka."))
        newArrayList.add(ItemData(R.drawable.musadanelia, "Yesus Mengasihi Anak-Anak Kecil", "Biarkan anak-anak itu datang kepadaku, dan jangan menghalangi mereka, sebab kerajaan Allah adalah milik orang-orang seperti mereka."))
        newArrayList.add(ItemData(R.drawable.sembah, "Yesus Mengasihi Anak-Anak Kecil", "Biarkan anak-anak itu datang kepadaku, dan jangan menghalangi mereka, sebab kerajaan Allah adalah milik orang-orang seperti mereka."))
        newArrayList.add(ItemData(R.drawable.musadanelia, "Yesus Mengasihi Anak-Anak Kecil", "Biarkan anak-anak itu datang kepadaku, dan jangan menghalangi mereka, sebab kerajaan Allah adalah milik orang-orang seperti mereka."))
        newArrayList.add(ItemData(R.drawable.anakdanyesus, "Yesus Mengasihi Anak-Anak Kecil", "Biarkan anak-anak itu datang kepadaku, dan jangan menghalangi mereka, sebab kerajaan Allah adalah milik orang-orang seperti mereka."))


        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newAdapter = MyAdapter(newArrayList)
        newRecyclerView.adapter = newAdapter
    }
}