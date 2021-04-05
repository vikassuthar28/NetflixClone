package com.example.movieappdesigndemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movieappdesigndemo.adpter.MainRecyclerAdapter
import com.example.movieappdesigndemo.model.AllCategory
import com.example.movieappdesigndemo.model.CategoryItem
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private var mainCategoryRecycler: RecyclerView? = null
    private var mainRecyclerAdapter: MainRecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav = findViewById<BottomNavigationView>(R.id.nav_bottom)

        val categoryItemList: MutableList<CategoryItem> = ArrayList()
        categoryItemList.add(CategoryItem(1, R.drawable.download1))
        categoryItemList.add(CategoryItem(1, R.drawable.download2))
        categoryItemList.add(CategoryItem(1, R.drawable.download3))
        categoryItemList.add(CategoryItem(1, R.drawable.download4))
        categoryItemList.add(CategoryItem(1, R.drawable.download5))

        val categoryItemList2: MutableList<CategoryItem> = ArrayList()
        categoryItemList2.add(CategoryItem(1, R.drawable.download6))
        categoryItemList2.add(CategoryItem(1, R.drawable.download7))
        categoryItemList2.add(CategoryItem(1, R.drawable.download8))
        categoryItemList2.add(CategoryItem(1, R.drawable.download9))
        categoryItemList2.add(CategoryItem(1, R.drawable.download10))

        val categoryItemList3: MutableList<CategoryItem> = ArrayList()
        categoryItemList3.add(CategoryItem(1, R.drawable.download11))
        categoryItemList3.add(CategoryItem(1, R.drawable.images12))
        categoryItemList3.add(CategoryItem(1, R.drawable.download13))
        categoryItemList3.add(CategoryItem(1, R.drawable.download14))
        categoryItemList3.add(CategoryItem(1, R.drawable.download15))


        val allCategory: MutableList<AllCategory> = ArrayList()
        allCategory.add(AllCategory("Hollywood", categoryItemList))
        allCategory.add(AllCategory("Best of Oscars", categoryItemList2))
        allCategory.add(AllCategory("Movies Dubbed in hindi", categoryItemList3))
        allCategory.add(AllCategory("BollyWood", categoryItemList2))
        allCategory.add(AllCategory("Top Rank India ", categoryItemList3))

        setMainCategotyRecycler(allCategory)

        bottomNav.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.txt_home -> Toast.makeText(this,"Home",Toast.LENGTH_SHORT).show()
                R.id.txt_comingsoon -> Toast.makeText(this,"Coming Soon",Toast.LENGTH_SHORT).show()
                R.id.txt_search -> Toast.makeText(this,"Search",Toast.LENGTH_SHORT).show()
                R.id.txt_download -> Toast.makeText(this,"Download",Toast.LENGTH_SHORT).show()

            }

        true
        }


    }



    private fun setMainCategotyRecycler(allCategory: List<AllCategory>) {

        mainCategoryRecycler = findViewById(R.id.main_recycler)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        mainCategoryRecycler!!.layoutManager = layoutManager
        mainRecyclerAdapter = MainRecyclerAdapter(this, allCategory)
        mainCategoryRecycler!!.adapter = mainRecyclerAdapter

    }



}