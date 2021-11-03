package com.reyhan.foodapp;

import java.util.ArrayList;
import android.graphics.drawable.Drawable;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Batagor", "Batagor merupakan jajanan khas Bandung yang mengadaptasi gaya Tionghoa-Indonesia dan kini sudah dikenal hampir di seluruh wilayah Indonesia.", "Rp. 5000", context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Black Salad", "Salad merupakan jenis makanan yang terdiri dari campuran sayur-sayuran dan bahan-bahan makanan siap santap.", "Rp. 10000", context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Capphuchino", "Cappucino merupakan kopi yang terdiri atas sepertiga shot espresso, sepertiga susu panas, dan sepertiga busa susu.", "Rp. 5000", context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Cheesecake", "Cheesecake adalah kue yang biasanya dimakan sebagai hidangan penutup, dibuat dengan mencampurkan keju yang bertekstur lembut, telur, susu, dan gula.", "Rp. 15000", context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Cireng", "Cireng adalah makanan ringan yang berasal dari daerah Sunda yang dibuat dengan cara menggoreng campuran adonan yang berbahan utama tepung kanji atau tapioka.", "Rp. 5000", context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Donut", "Donat adalah penganan yang digoreng, dibuat dari adonan tepung terigu, gula, telur, dan mentega. ", "Rp. 5000", context.getDrawable(R.drawable.donut)));
        list.add(new Food("Kopi Hitam", "Kopi Hitam adalah minuman hasil seduhan biji kopi yang telah disangrai dan dihaluskan menjadi bubuk. ", "Rp. 5000", context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Mie Goreng", "Mi goreng adalah makanan yang berasal dari Indonesia yang populer dan juga digemari di Malaysia, dan Singapura.", "Rp. 10000", context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Nasi Goreng", "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. ", "Rp. 15000", context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Food("Sparkling Tea", "Sparkling Tea adalah teh dengan udara yang dikarbonasikan sehingga memiliki soda yang menyegarkan", "Rp. 10000", context.getDrawable(R.drawable.sparkling_tea)));
        return list;
    }
}
