package comp4020.buchbook.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import comp4020.buchbook.adapters.LibraryListArrayAdapter;
import comp4020.buchbook.buch_book.DetailsActivity;
import comp4020.buchbook.R;
import comp4020.buchbook.utils.Data;


/**
 * A simple {@link android.app.Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link comp4020.buchbook.fragments.LibraryListFragment.LibraryListFragmentCallbacks} interface
 * to handle interaction events.
 * Use the {@link LibraryListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LibraryListFragment extends Fragment {

    private LibraryListFragmentCallbacks mListener;
    private ListView listView;

    private static final String ARG_TITLES = "titles";
    private static final String ARG_AUTHORS = "authors";
    private static final String ARG_COVERS = "covers";

    private String[] titles;
    private String[] authors;
    private String[] covers;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment MainFragment.
     */
    public static LibraryListFragment newInstance(String[] titles, String[] authors, String[] covers) {

        LibraryListFragment fragment = new LibraryListFragment();
        Bundle args = new Bundle();
        args.putStringArray(ARG_TITLES, titles);
        args.putStringArray(ARG_AUTHORS, authors);
        args.putStringArray(ARG_COVERS, covers);
        fragment.setArguments(args);

        return fragment;
    }

    public LibraryListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            titles = getArguments().getStringArray(ARG_TITLES);
            authors = getArguments().getStringArray(ARG_AUTHORS);
            covers = getArguments().getStringArray(ARG_COVERS);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Initialize listView items
        View contentView = inflater.inflate(R.layout.fragment_library_list, container, false);
        listView = (ListView) contentView.findViewById(R.id.libraryListView);

        final LibraryListArrayAdapter adapter = new LibraryListArrayAdapter(contentView.getContext(),
                R.layout.row_layout_book, titles, authors, covers);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    final int position, long id) {

                view.animate().setDuration(20).alpha(0).withEndAction(
                        new Runnable() {

                            @Override
                            public void run() {

                                Intent i = new Intent(view.getContext(), DetailsActivity.class);

                                Bundle b = Data.getBookBundle(position);
                                i.putExtras(b);

                                startActivity(i);
                            }
                        });
            }

        });

        return contentView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onLibraryListFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (LibraryListFragmentCallbacks) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }



    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface LibraryListFragmentCallbacks {

        public void onLibraryListFragmentInteraction(Uri uri);
    }

}
