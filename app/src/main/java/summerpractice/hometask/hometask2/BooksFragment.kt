package summerpractice.hometask.hometask2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import summerpractice.hometask.hometask2.databinding.FragmentBooksBinding

class BooksFragment : Fragment(R.layout.fragment_books) {

    private var binding: FragmentBooksBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBooksBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}