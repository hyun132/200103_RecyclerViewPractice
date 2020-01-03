package com.example.a200103_recyclerviewpractice

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a200103_recyclerviewpractice.datas.item
import com.example.a200103_recyclerviewpractice.datas.myitem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    private lateinit var linearLayoutManager : LinearLayoutManager
    private lateinit var adapter: RecyclerAdapter
    var itemList = ArrayList<myitem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValues()
        setupEvents()
    }

    override fun onStart() {
        super.onStart()

//        if(photosList.size == 0){
//            requestPhoto()
//        }
    }

    override fun setValues() {
        linearLayoutManager = LinearLayoutManager(mContext)
        recyclerView.layoutManager = linearLayoutManager

        adapter= RecyclerAdapter(mContext,itemList)
        recyclerView.adapter=adapter

        addItem()
    }

    override fun setupEvents() {

    }

   fun addItem(){
       itemList.add(myitem("이름1",5000))
       itemList.add(myitem("이름2",5000))
       itemList.add(myitem("이름3",5000))
       itemList.add(myitem("이름4",5000))
       itemList.add(myitem("이름5",5000))
       itemList.add(myitem("이름6",5000))
       itemList.add(myitem("이름7",5000))
       itemList.add(myitem("이름11",5000))
       itemList.add(myitem("이름12",5000))
       itemList.add(myitem("이름13",5000))
       itemList.add(myitem("이름14",5000))
       itemList.add(myitem("이름15",5000))
       itemList.add(myitem("이름16",5000))
       itemList.add(myitem("이름17",5000))
       itemList.add(myitem("이름21",5000))
       itemList.add(myitem("이름22",5000))
       itemList.add(myitem("이름23",5000))
       itemList.add(myitem("이름24",5000))
       itemList.add(myitem("이름25",5000))
       itemList.add(myitem("이름26",5000))
       itemList.add(myitem("이름27",5000))

   }

}
