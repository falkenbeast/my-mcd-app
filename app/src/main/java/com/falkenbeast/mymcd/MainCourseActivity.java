package com.falkenbeast.mymcd;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCourseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_maincourse);

        ListView maincourselist = findViewById(R.id.mainclist);
        Maindish [] md = {
                new Maindish("Big Mac", "Two beef patties, lettuce, cheese, pickles, onions, and special sauce in a sesame seed bun.", 550),
                new Maindish("McChicken", "A breaded chicken patty with lettuce and mayo in a bun.", 400),
                new Maindish("McRoyale", "A beef patty with melted cheese, lettuce, and a special sauce.", 450),
                new Maindish("McChicken Deluxe", "A McChicken with extra cheese, lettuce, and mayo.", 470),
                new Maindish("McVeggie Deluxe", "A vegetarian burger with a crispy vegetable patty, lettuce, and mayo.", 380),
                new Maindish("Maharaja Mac", "Two beef patties with lettuce, cheese, onions, pickles, and special sauce, served in a large bun.", 700),
                new Maindish("Chicken Maharaja Mac", "A spicy chicken patty with lettuce, cheese, and special sauce in a larger bun.", 720),
                new Maindish("Double Cheeseburger", "Two beef patties with melted cheese, pickles, onions, ketchup, and mustard.", 450),
                new Maindish("Filet-O-Fish", "A crispy fish fillet with tartar sauce and lettuce in a soft bun.", 350),
                new Maindish("Chicken Deluxe Wrap", "A tender chicken patty, lettuce, and mayo wrapped in a soft tortilla.", 420),
                new Maindish("Spicy Chicken Maharaja Mac", "A spicy chicken patty, lettuce, onions, cheese, and special sauce in a large bun.", 750),
                new Maindish("Veggie McMuffin", "A vegetarian breakfast muffin with a veggie patty, cheese, and a soft muffin bun.", 300),
                new Maindish("Chicken McWrap (Classic)", "A grilled or crispy chicken wrap with lettuce, cheese, and a tangy sauce.", 450),
                new Maindish("Chicken Tikka Wrap", "Spicy chicken tikka with lettuce and mayo wrapped in a soft tortilla.", 430),
                new Maindish("Chicken Nugget Meal", "A meal that includes chicken nuggets served with fries and a drink.", 600),
                new Maindish("Chicken Kebab Wrap", "Spicy chicken kebabs with fresh veggies, wrapped in a flatbread.", 480),
                new Maindish("Double Filet-O-Fish", "Two crispy fish fillets with tartar sauce and lettuce in a bun.", 450),
                new Maindish("Veg Maharaja Mac", "A larger veggie patty burger with lettuce, cheese, and special sauce.", 700),
                new Maindish("Cheesy Garlic Bread", "Soft garlic bread topped with melted cheese.", 210),
                new Maindish("McChicken & Fries Combo", "A McChicken burger paired with crispy fries and a drink.", 750)
        };

        ArrayAdapter<Maindish> dishesadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, md);    //change
        maincourselist.setAdapter(dishesadapter);
    }
}
