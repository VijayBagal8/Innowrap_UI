package com.example.taskui;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.taskui.Adapter.Adapter1;
import com.example.taskui.models.Item;
import com.example.taskui.models.Item1;
import com.example.taskui.models.Item2;
import com.example.taskui.models.Item3;

import java.util.ArrayList;
import java.util.List;


import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title

        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewId);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        List<Item> items = new ArrayList<>();
        Item3 item31 = new Item3("Positive Vibes", "When you surround yourself with positive vibes, it can have a powerful effect on all aspects of your life. We have a great collection of good vibe quotes to help you harness that positive energy so you can feel happy and radiant from the inside out.", Color.argb(255, 255, 178, 102), Color.argb(45, 255, 0, 102));
        items.add(new Item(2, item31));
        Item1 item12 = new Item1(R.drawable.img2, "Positive vibes", "It’s the beautiful evening time", Color.argb(255, 0, 102, 0), Color.argb(255, 204, 255, 204));
        items.add(new Item(0, item12));
        Item2 item22 = new Item2("Evenings allow you to forget the bitter worries of the day and get ready for the sweet dreams of night.", R.drawable.img7, Color.argb(200, 255, 153, 204));
        items.add(new Item(1, item22));
        Item1 item11 = new Item1(R.drawable.image3, "The beach makes everything better—and it's good for your mind, body and spirit.", "Mountains Calling!", Color.argb(255, 0, 51, 102), Color.argb(255, 204, 229, 255));
        items.add(new Item(0, item11));
        Item2 item21 = new Item2("Every day brings unknown opportunities and challenges. But it ends with a peaceful evening. ", R.drawable.img4, Color.argb(180, 0, 59, 0));
        items.add(new Item(1, item21));
        Item2 item2 = new Item2("The sky grew darker, painted blue on blue, one stroke at a time, into deeper and deeper shades of night.", R.drawable.img5, Color.argb(180, 70, 130, 180));
        items.add(new Item(1, item2));
        Item1 item1 = new Item1(R.drawable.image1, "Explore More", "The freshness of the fields", Color.argb(255, 204, 102, 0), Color.argb(255, 255, 229, 204));
        items.add(new Item(0, item1));
        Item3 item3 = new Item3("Ralph Waldo Emerson", "If the stars should appear one night in a thousand years, how would men believe and adore; and preserve for many generations the remembrance of the city of God which had been shown! But every night come out these envoys of beauty, and light the universe with their admonishing smile.", Color.argb(255, 160, 160, 160), Color.argb(45, 0, 160, 160));
        items.add(new Item(2, item3));
        Item2 item23 = new Item2("Ever wondered, where does the sky  get its colors from?", R.drawable.img6, Color.argb(180, 204, 0, 0));
        items.add(new Item(1, item23));
        Item3 item32 = new Item3("Click here", "", Color.argb(255, 139, 0, 0), Color.argb(45, 220, 20, 60));
        items.add(new Item(2, item32));

        recyclerView.setAdapter(new Adapter1(items));
    }
}