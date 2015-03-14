package com.comp4020.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.comp4020.decentralized_library.R;
import com.comp4020.utils.Data;
import com.comp4020.adapters.LibraryListArrayAdapter;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ExchangesFragment.BorrowingFragmentCallbacks} interface
 * to handle interaction events.
 * Use the {@link ExchangesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ExchangesFragment extends Fragment {

    private static final String ARG_TITLES = "titles";
    private static final String ARG_AUTHORS = "authors";
    private static final String ARG_COVERS = "covers";

    private ListView listView;
    private Bundle requestsBundle;
    private Bundle requestedBundle;
    private Bundle borrowedBundle;
    private Bundle lentBundle;

    private BorrowingFragmentCallbacks mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment BorrowingFragment.
     */
    public static ExchangesFragment newInstance() {

        ExchangesFragment fragment = new ExchangesFragment();
        Bundle args = Data.getRequests();
        fragment.setArguments(args);
        return new ExchangesFragment();
    }

    public ExchangesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View contentView = inflater.inflate(R.layout.fragment_borrowing, container, false);

        listView = (ListView) contentView.findViewById(R.id.exchangeListView);

        //TODO how do we switch between exchanging categories/sections?
        requestsBundle = Data.getRequests();
        requestedBundle = Data.getRequested();
        borrowedBundle = Data.getBorrowed();
        lentBundle = Data.getLent();

        listView.setAdapter(new LibraryListArrayAdapter(contentView.getContext(),
                R.layout.row_layout_book,
                requestsBundle.getStringArray("titles"),
                requestsBundle.getStringArray("authors"),
                requestsBundle.getStringArray("covers")));

        return contentView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onBorrowingFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (BorrowingFragmentCallbacks) activity;
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
    public interface BorrowingFragmentCallbacks {

        public void onBorrowingFragmentInteraction(Uri uri);
    }

}
