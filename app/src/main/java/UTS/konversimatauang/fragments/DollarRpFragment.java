package UTS.konversimatauang.fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import UTS.konversimatauang.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DollarRpFragment extends Fragment {
    private OnFragmentInteractionListener mListener;
    private Button dollarRupiah;

    public DollarRpFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dollar_rp, container, false);
        dollarRupiah = view.findViewById(R.id.dollar_rupiah);
//        dollarRupiah.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                if(mListener != null) {
//                    mListener.onClickDollarRpHandler();
//                }
//            }
//        });
        return view;

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
    public interface OnFragmentInteractionListener {
        void onClickDollarRpHandler();
    }
}
