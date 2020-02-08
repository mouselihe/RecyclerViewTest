package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);


//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);

        // 瀑布效果
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        //设置水平方向滚动
        // 然后 在 item 布局写成 水平方向看的布局
//        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);//表示让布局横行排列

        FruitAdapter fruitAdapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(fruitAdapter);

    }

    private void initFruits() {
//        for (int i = 0; i < 2; i++) {
//            Fruit apple = new Fruit(getRandom, R.drawable.apple_pic);
//            fruitList.add(apple);
//            Fruit banana = new Fruit("Banana", R.drawable.banana_pic);
//            fruitList.add(banana);
////            Fruit orange = new Fruit("Orange", R.drawable.orange_pic);
////            fruitList.add(orange);
////            Fruit watermelon = new Fruit("Watermelon", R.drawable.watermelon_pic);
////            fruitList.add(watermelon);
////            Fruit pear = new Fruit("Pear", R.drawable.pear_pic);
////            fruitList.add(pear);
////            Fruit grape = new Fruit("Grape", R.drawable.grape_pic);
////            fruitList.add(grape);
////            Fruit pineapple = new Fruit("Pineapple", R.drawable.pineapple_pic);
////            fruitList.add(pineapple);
////            Fruit strawberry = new Fruit("Strawberry", R.drawable.strawberry_pic);
////            fruitList.add(strawberry);
////            Fruit cherry = new Fruit("Cherry", R.drawable.cherry_pic);
////            fruitList.add(cherry);
////            Fruit mango = new Fruit("Mango", R.drawable.mango_pic);
//            fruitList.add(mango);
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit(getRandomLengthName("Apple"), R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit(getRandomLengthName("Banana"), R.drawable.banana_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit(getRandomLengthName("Orange"), R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit(getRandomLengthName("Watermelon"), R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit(getRandomLengthName("Pear"), R.drawable.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit(getRandomLengthName("Grape"), R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit(getRandomLengthName("Pineapple"), R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit(getRandomLengthName("Strawberry"), R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit(getRandomLengthName("Cherry"), R.drawable.cherry_pic);
            fruitList.add(cherry);
            Fruit mango = new Fruit(getRandomLengthName("Mango"), R.drawable.mango_pic);
            fruitList.add(mango);


        }
    }
        private String getRandomLengthName(String name) {
            Random random = new Random();
            int length = random.nextInt(20) +1;
            StringBuilder stringBuilder = new StringBuilder();
            for (int i =0;i<length;i++){
                stringBuilder.append(name);
            }
            return stringBuilder.toString();

        }

}