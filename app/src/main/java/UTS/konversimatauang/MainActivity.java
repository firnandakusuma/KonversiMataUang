package UTS.konversimatauang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import UTS.konversimatauang.fragments.DollarRpFragment;

public class MainActivity extends AppCompatActivity implements DollarRpFragment.OnFragmentInteractionListener {

    private DollarRpFragment dollarRpFragment;
    Button dollarRupiah;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dollarRpFragment = new DollarRpFragment();
        dollarRupiah = findViewById(R.id.dollar_rupiah);
    }

    @Override
    public void onClickDollarRpHandler() {
        getSupportFragmentManager().beginTransaction().replace(R.id.uang_container, dollarRpFragment).commit();
    }
}
