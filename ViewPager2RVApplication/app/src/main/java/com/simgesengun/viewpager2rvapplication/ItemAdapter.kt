package com.simgesengun.viewpager2rvapplication

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.simgesengun.viewpager2rvapplication.databinding.CardDesignBinding

class ItemAdapter(var itemsList : ArrayList<Item>, var selectedItemsList : ArrayList<Item>) : RecyclerView.Adapter<ItemAdapter.CardDesignHolder>() {
    inner class CardDesignHolder(cardDesignBinding: CardDesignBinding) : RecyclerView.ViewHolder(cardDesignBinding.root){
        var cardDesign : CardDesignBinding
        init{
            this.cardDesign = cardDesignBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        val design = CardDesignBinding.inflate(layoutInflater,parent,false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val item = itemsList[position]
        holder.cardDesign.item = item

        holder.cardDesign.buttonCart.setOnClickListener {
            selectedItemsList.add(item)
            Log.e("selected_items_list",selectedItemsList.toString())
        }
    }

    override fun getItemCount(): Int = itemsList.size
}