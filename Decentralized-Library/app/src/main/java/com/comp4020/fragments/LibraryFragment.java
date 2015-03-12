package com.comp4020.fragments;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.comp4020.adapters.LibraryArrayAdapter;
import com.comp4020.decentralized_library.DetailsActivity;
import com.comp4020.decentralized_library.R;
import com.comp4020.utils.Data;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link LibraryFragment.LibraryFragmentCallbacks} interface
 * to handle interaction events.
 * Use the {@link LibraryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LibraryFragment extends Fragment {

    private LibraryFragmentCallbacks mListener;
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
    public static LibraryFragment newInstance(String[][] library) {

        LibraryFragment fragment = new LibraryFragment();
        Bundle args = new Bundle();
        args.putStringArray(ARG_TITLES, library[0]);
        args.putStringArray(ARG_AUTHORS, library[1]);
        args.putStringArray(ARG_COVERS, library[2]);
        fragment.setArguments(args);

        return fragment;
    }

    public static LibraryFragment newInstance(Data data) {

        LibraryFragment fragment = new LibraryFragment();
        Bundle args = new Bundle();
        args.putStringArray(ARG_TITLES, data.getTitles());
        args.putStringArray(ARG_AUTHORS, data.getAuthors());
        args.putStringArray(ARG_COVERS, data.getCovers());
        fragment.setArguments(args);

        return fragment;
    }

    public LibraryFragment() {
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
        View contentView = inflater.inflate(R.layout.fragment_library, container, false);
        listView = (ListView) contentView.findViewById(R.id.libraryListView);

        final LibraryArrayAdapter adapter = new LibraryArrayAdapter(contentView.getContext(),
                R.layout.row_layout_book, new Data());

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
            mListener.onLibraryFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (LibraryFragmentCallbacks) activity;
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
    public interface LibraryFragmentCallbacks {

        public void onLibraryFragmentInteraction(Uri uri);
    }

}
