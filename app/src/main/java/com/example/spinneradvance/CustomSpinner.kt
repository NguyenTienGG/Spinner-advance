package com.example.spinneradvance

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomSpinner(
    val activity: Activity,
    val list2: List<OurData>
):ArrayAdapter<OurData>(activity, R.layout.listonepiece, list2){

    override fun getCount(): Int {
        return list2.size // ve bao nhieu dong
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {// hien thi giao dien
        //position: vi tri cua item trong list
        //convertView: che do cem chi tung muc spinner
        //parent: la viewgroup cha  chua spinner
        return initView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {// hien thi giao dien khi click vao spinner
        return initView(position, convertView, parent)
    }

    private fun initView(position: Int, convertView: View?, parent: ViewGroup):View {

        val context = activity.layoutInflater
        // giup chuyen doi layout xmk thanh view
        val rowView = context.inflate(R.layout.listonepiece, parent, false)

        val images = rowView.findViewById<ImageView>(R.id.imgFood)
        val txtOnepiece = rowView.findViewById<TextView>(R.id.txtFood)

        images.setImageResource(list2[position].image)
        txtOnepiece.text = list2[position].disc

        return rowView
    }
}