package onex7.belajarpapb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MrPotato extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox cbHat;
    CheckBox cbEyebrows;
    CheckBox cbNose;
    CheckBox cbMustache;
    CheckBox cbArms;
    CheckBox cbEyes;
    CheckBox cbGlasses;
    CheckBox cbMouth;
    CheckBox cbEars;
    CheckBox cbShoes;

    ImageView ivHat;
    ImageView ivEyebrows;
    ImageView ivNose;
    ImageView ivMustache;
    ImageView ivArms;
    ImageView ivEyes;
    ImageView ivGlasses;
    ImageView ivMouth;
    ImageView ivEars;
    ImageView ivShoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mr_potato);

        cbHat = (CheckBox) findViewById(R.id.cbHat);
        cbEyebrows = (CheckBox) findViewById(R.id.cbEyebrows);
        cbNose = (CheckBox) findViewById(R.id.cbNose);
        cbMustache = (CheckBox) findViewById(R.id.cbMustache);
        cbArms = (CheckBox) findViewById(R.id.cbArms);
        cbEyes = (CheckBox) findViewById(R.id.cbEyes);
        cbGlasses = (CheckBox) findViewById(R.id.cbGlasses);
        cbMouth = (CheckBox) findViewById(R.id.cbMouth);
        cbEars = (CheckBox) findViewById(R.id.cbEars);
        cbShoes = (CheckBox) findViewById(R.id.cbShoes);

        ivHat = (ImageView) findViewById(R.id.ivHat);
        ivEyebrows = (ImageView) findViewById(R.id.ivEyebrows);
        ivNose = (ImageView) findViewById(R.id.ivNose);
        ivMustache = (ImageView) findViewById(R.id.ivMustache);
        ivArms = (ImageView) findViewById(R.id.ivArms);
        ivEyes = (ImageView) findViewById(R.id.ivEyes);
        ivGlasses = (ImageView) findViewById(R.id.ivGlasses);
        ivMouth = (ImageView) findViewById(R.id.ivMouth);
        ivEars = (ImageView) findViewById(R.id.ivEars);
        ivShoes = (ImageView) findViewById(R.id.ivShoes);

        cbHat.setOnCheckedChangeListener(this);
        cbEyebrows.setOnCheckedChangeListener(this);
        cbNose.setOnCheckedChangeListener(this);
        cbMustache.setOnCheckedChangeListener(this);
        cbArms.setOnCheckedChangeListener(this);
        cbEyes.setOnCheckedChangeListener(this);
        cbGlasses.setOnCheckedChangeListener(this);
        cbMouth.setOnCheckedChangeListener(this);
        cbEars.setOnCheckedChangeListener(this);
        cbShoes.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (cbHat.isChecked()) {
            ivHat.setVisibility(View.VISIBLE);
        } else {
            ivHat.setVisibility(View.INVISIBLE);
        }

        if (cbEyebrows.isChecked()) {
            ivEyebrows.setVisibility(View.VISIBLE);
        } else {
            ivEyebrows.setVisibility(View.INVISIBLE);
        }

        if (cbNose.isChecked()) {
            ivNose.setVisibility(View.VISIBLE);
        } else {
            ivNose.setVisibility(View.INVISIBLE);
        }

        if (cbMustache.isChecked()) {
            ivMustache.setVisibility(View.VISIBLE);
        } else {
            ivMustache.setVisibility(View.INVISIBLE);
        }

        if (cbArms.isChecked()) {
            ivArms.setVisibility(View.VISIBLE);
        } else {
            ivArms.setVisibility(View.INVISIBLE);
        }

        if (cbEyes.isChecked()) {
            ivEyes.setVisibility(View.VISIBLE);
        } else {
            ivEyes.setVisibility(View.INVISIBLE);
        }

        if (cbGlasses.isChecked()) {
            ivGlasses.setVisibility(View.VISIBLE);
        } else {
            ivGlasses.setVisibility(View.INVISIBLE);
        }

        if (cbMouth.isChecked()) {
            ivMouth.setVisibility(View.VISIBLE);
        } else {
            ivMouth.setVisibility(View.INVISIBLE);
        }

        if (cbEars.isChecked()) {
            ivEars.setVisibility(View.VISIBLE);
        } else {
            ivEars.setVisibility(View.INVISIBLE);
        }

        if (cbShoes.isChecked()) {
            ivShoes.setVisibility(View.VISIBLE);
        } else {
            ivShoes.setVisibility(View.INVISIBLE);
        }
    }
}
