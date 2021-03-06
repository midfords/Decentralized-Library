package com.comp4020.fragments;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.comp4020.adapters.LibraryGridArrayAdapter;
import com.comp4020.decentralized_library.DetailsActivity;
import com.comp4020.decentralized_library.R;
import com.comp4020.utils.Data;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link com.comp4020.fragments.LibraryListFragment.LibraryListFragmentCallbacks} interface
 * to handle interaction events.
 * Use the {@link LibraryListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LibraryGridFragment extends Fragment {

    private LibraryGridFragmentCallbacks mListener;
    private GridView gridView;

    private static final String ARG_COVERS = "covers";
    private static final String ARG_TITLES = "titles";

    private String[] covers;
    private String[] titles;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment MainFragment.
     */
    public static LibraryGridFragment newInstance(String[] titles, String[] authors, String[] covers) {

        LibraryGridFragment fragment = new LibraryGridFragment();

        Bundle args = new Bundle();
        args.putStringArray(ARG_COVERS, covers);
        args.putStringArray(ARG_TITLES, titles);
        fragment.setArguments(args);

        return fragment;
    }

    public LibraryGridFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            titles = getArguments().getStringArray(ARG_TITLES);
            covers = getArguments().getStringArray(ARG_COVERS);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Initialize gridView items
        View contentView = inflater.inflate(R.layout.fragment_library_grid, container, false);
        gridView = (GridView) contentView.findViewById(R.id.libraryGridView);

        final LibraryGridArrayAdapter adapter = new LibraryGridArrayAdapter(contentView.getContext(),
                R.layout.row_layout_cover, covers);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    final int position, long id) {

                Intent i = new Intent(view.getContext(), DetailsActivity.class);


                Bundle b = Data.getBookBundle(titles[position]);

                i.putExtras(b);

                startActivity(i);
            }

        });

        return contentView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onLibraryGridFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (LibraryGridFragmentCallbacks) activity;
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
    public interface LibraryGridFragmentCallbacks {

        public void onLibraryGridFragmentInteraction(Uri uri);
    }

}
