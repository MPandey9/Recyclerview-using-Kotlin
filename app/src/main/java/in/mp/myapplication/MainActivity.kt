package `in`.mp.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //recyclerview
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<ItemsViewModel>()
        for(i in 1..50){
            data.add(ItemsViewModel(R.drawable.baseline_insert_drive_file_24, "Item at " + i))
        }
        // This will pass the ArrayList to our Adapter
        val adapter = Adapter(data)

        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter
    }
}