package com.example.hellow

import android.annotation.SuppressLint
import android.content.res.TypedArray
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity

//class MainActivity : AppCompatActivity() {
//    private lateinit var titles: Array<String>
//    private lateinit var authors: Array<String>
//    private var dataList = ArrayList<New>()
//
//
//    @SuppressLint("MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main);
//
//        initData()
//
//
//         var newsAdapter =  NewsAdapter(this ,
//         R.layout.list_item , dataList);
//        val newsViewList = findViewById<ListView>(R.id.news_list)
//        newsViewList.adapter = newsAdapter
//    }
//
//    private fun initData() {
//        titles = resources.getStringArray(R.array.titles)
//        authors = resources.getStringArray(R.array.authors)
//        val images =  getResources().obtainTypedArray(R.array.images)
//        val length = if (titles.size > authors.size) {
//            authors.size
//        } else {
//            titles.size
//        }
//        for (i in 0 until length) {
//            var new = New()
//            new.setTitle(titles[i]);
//             new.setAuthor(authors[i]);
//           new.setImageId(images.getResourceId(i, 0));
//            dataList.add(new)
//        }
//    }
//    }


class MainActivity : AppCompatActivity() {


    private lateinit var titles: Array<String>
    private lateinit var authors: Array<String>
    private lateinit var images: TypedArray
    private val dataList = ArrayList<New>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        val newsAdapter = NewsAdapter(this, R.layout.list_item, dataList)
        val newsViewList = findViewById<ListView>(R.id.news_list)
        newsViewList.adapter = newsAdapter
    }

    private fun initData() {
        titles = resources.getStringArray(R.array.titles)
        authors = resources.getStringArray(R.array.authors)
        images = resources.obtainTypedArray(R.array.images)

        val length = minOf(titles.size, authors.size, images.length())

        for (i in 0 until length) {
            val new = New()
            new.title = titles[i]
            new.author = authors[i]
            new.imageId = images.getResourceId(i, 0)
            dataList.add(new)
        }

        images.recycle()
    }
}
