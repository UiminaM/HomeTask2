package summerpractice.hometask.hometask2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import summerpractice.hometask.hometask2.databinding.FragmentFilmsBinding

class FilmsFragment : Fragment(R.layout.fragment_films) {

    private var binding: FragmentFilmsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFilmsBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}