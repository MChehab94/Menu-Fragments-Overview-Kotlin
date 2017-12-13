package mchehab.com.menufragmentsoverview

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.*
import android.widget.Toast


class MenuFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.fragment_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.item1 -> createToastMessage("First item selected")
            R.id.item2 -> createToastMessage("Second item selected")
        }
        return true
    }

    private fun createToastMessage(message: String){
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }

}// Required empty public constructor
