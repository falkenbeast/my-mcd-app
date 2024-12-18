package com.falkenbeast.mymcd;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);
        ListView starterlist = findViewById(R.id.starterlist);
            /* String[] dishes = {
                "McAloo Tikki Burger",
                "Veg Pizza McPuff", "Veg Maharaja Mac (Mini)",
                "McVeggie Burger",
                "McSpicy Paneer Burger",
                "Spicy Paneer Wrap",
                "McCain Smileys (Regional)",
                "Cheesy Veg Nuggets (Limited)",
                "Corn & Cheese Bites",
                "Veggie Sticks with Dip",
                "McChicken Burger(Small)",
                "Chicken McNuggets",
                "Chicken Kebab Wrap",
                "Chicken McWings",
                "Chicken Strips( if available)",
                "filet - O - Fish(Mini)",
                "chicken Tikka Burger(Regional)",
                "chicken Maharaja Mac(Mini)",
                "chicken Popcorn (Limited)",
                "Spicy Chicken Nuggets"
        };*/       //becasue of Dish class array now we dont need it

        //        Dish d1 = new Dish();
        //        d1.title = "McAloo Tikki Burger";
        //        d1.descr = "A potato patty with spices, served in a soft bun, perfect for a vegetarian craving.";
        //        d1.price = 140;           //taking lot of lines so now creating constructor


        //  Dish d1 = new Dish("McAloo Tikki Burger", "A potato patty with spices, served in a soft bun, perfect for a vegetarian craving.",140);  //we can do this but we need to create a dish array and create new dish in itself so


        Dish[] da = {
                new Dish("McAloo Tikki Burger", "A potato patty with spices, served in a soft bun, perfect for a vegetarian craving.", 140),
                new Dish("Veg Pizza McPuff", "A puff pastry filled with a savory mix of vegetables and pizza-style seasoning.", 150),
                new Dish("Veg Maharaja Mac (Mini)", "A smaller version of the iconic Maharaja Mac with veggie patties, lettuce, and special sauce.", 180),
                new Dish("McVeggie Burger", "A vegetarian burger with a crispy vegetable patty and fresh veggies.", 160),
                new Dish("McSpicy Paneer Burger", "A spicy paneer (cottage cheese) patty served with sauce and veggies in a soft bun.", 170),
                new Dish("Spicy Paneer Wrap", "Paneer marinated in spices, wrapped with veggies in a soft tortilla.", 140),
                new Dish("McCain Smileys (Regional)", "Potato smiley faces, crispy on the outside, soft on the inside, served with dipping sauce.", 120),
                new Dish("Cheesy Veg Nuggets (Limited)", "Veg nuggets with a gooey cheese filling, available for a limited time.", 160),
                new Dish("Corn & Cheese Bites", "Crispy bites filled with a blend of corn and melted cheese.", 130),
                new Dish("Veggie Sticks with Dip", "Crunchy vegetable sticks served with a tasty dip.", 100),
                new Dish("McChicken Burger (Small)", "A smaller chicken patty burger with fresh lettuce and mayo.", 180),
                new Dish("Chicken McNuggets", "Crispy, bite-sized chicken pieces, served with a choice of dipping sauces.", 220),
                new Dish("Chicken Kebab Wrap", "Chicken kebabs wrapped in a flatbread with fresh veggies and sauce.", 190),
                new Dish("Chicken McWings", "Crispy fried chicken wings, served with a flavorful sauce.", 250),
                new Dish("Chicken Strips (If Available)", "Breaded chicken strips, crispy on the outside and tender inside.", 200),
                new Dish("Filet-O-Fish (Mini)", "A smaller version of the classic fish sandwich with a crispy fish fillet, tartar sauce, and lettuce.", 170),
                new Dish("Chicken Tikka Burger (Regional)", "A burger featuring chicken tikka, a popular Indian flavor, served with fresh veggies.", 210),
                new Dish("Chicken Maharaja Mac (Mini)", "A mini version of the spicy chicken Maharaja Mac with layers of chicken patties and special sauce.", 220),
                new Dish("Chicken Popcorn (Limited)", "Small, crispy popcorn-style chicken pieces, available for a limited time.", 150),
                new Dish("Spicy Chicken Nuggets", "Spicy, crispy chicken nuggets with a bold flavor, served with dipping sauce.", 200)

        };




        ArrayAdapter<Dish> dishesadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, da);    //change
        starterlist.setAdapter(dishesadapter);

    }
}