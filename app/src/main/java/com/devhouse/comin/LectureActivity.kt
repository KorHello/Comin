package com.devhouse.comin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.design.widget.TabLayout.OnTabSelectedListener
import android.view.LayoutInflater
import android.view.View
import com.devhouse.comin.Fragment.FragmentAdapter
import kotlinx.android.synthetic.main.activity_lecture.*
import kotlinx.android.synthetic.main.custom_tab.view.*

class LectureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture)

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        list_viewpager.adapter

        //for 문 돌려도 될듯
        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("AI")))//탭메뉴 자동 생성
        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("css")))
        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("html")))
        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("id")))
        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("jpg")))
        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("js")))

        tab_layout.addOnTabSelectedListener(object : OnTabSelectedListener,
            com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
            override fun onTabSelected(p0: TabLayout.Tab?) {
                if (p0 != null) {
                    list_viewpager.currentItem = p0.position
                }
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {
                TODO("Not yet implemented")
            }

            override fun onTabReselected(p0: TabLayout.Tab?) {
                TODO("Not yet implemented")
            }

            override fun onTabSelected(tab: com.google.android.material.tabs.TabLayout.Tab?) {
                TODO("Not yet implemented")
            }

            override fun onTabUnselected(tab: com.google.android.material.tabs.TabLayout.Tab?) {
                TODO("Not yet implemented")
            }

            override fun onTabReselected(tab: com.google.android.material.tabs.TabLayout.Tab?) {
                TODO("Not yet implemented")
            }

        })

    }
    private fun createTabView(tabName : String) : View{//커스텀 탭 연결

        val tabView = LayoutInflater.from(baseContext).inflate(R.layout.custom_tab, null)
        tabView.txt_name.text = tabName
        return tabView

    }
}

