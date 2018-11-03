package cubex.mahesh.cp_test_nov9am

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.SimpleCursorAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cr = contentResolver
     var c= cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                null,null,null,
                ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME)
    var cursor_adapter = SimpleCursorAdapter(
            this@MainActivity,
            R.layout.indiview,c, arrayOf(
            ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,
            ContactsContract.CommonDataKinds.Phone.NUMBER
    ), intArrayOf(R.id.tv1,R.id.tv2),0)
lview.adapter = cursor_adapter

        srch.setOnClickListener {

            var c= cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                    null,
                    ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME+"=?",
                    arrayOf(et1.text.toString()),
                    ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME)
            var cursor_adapter = SimpleCursorAdapter(
                    this@MainActivity,
                    R.layout.indiview,c, arrayOf(
                    ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,
                    ContactsContract.CommonDataKinds.Phone.NUMBER
            ), intArrayOf(R.id.tv1,R.id.tv2),0)
            lview.adapter = cursor_adapter

        }
    }
}
