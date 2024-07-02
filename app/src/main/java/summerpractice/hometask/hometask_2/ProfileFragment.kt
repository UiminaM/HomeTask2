package summerpractice.hometask.hometask_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.profile_fragment, container, false)

        // Находим TextView по индексу в списке дочерних элементов RelativeLayout
        val textView = view.findViewById<TextView>(0)

        // Извлекаем аргументы из Bundle
        val inputText = arguments?.getString("inputText")
        textView.text = inputText

        return view
    }
}