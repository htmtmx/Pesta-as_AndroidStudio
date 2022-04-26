package com.example.pestanias;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    public int[] imageArray = {
            R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.e, R.drawable.f,
            R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l,
            R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.p, R.drawable.q, R.drawable.r,
            R.drawable.s, R.drawable.t, R.drawable.u, R.drawable.v, R.drawable.w, R.drawable.x,
            R.drawable.y, R.drawable.z/*, R.drawable.aa, R.drawable.ab, R.drawable.ac, R.drawable.ad,
            R.drawable.ae, R.drawable.af, R.drawable.ag, R.drawable.ah, R.drawable.ai, R.drawable.aj,
            R.drawable.ak, R.drawable.al, R.drawable.am, R.drawable.an, R.drawable.ao, R.drawable.ap,
            R.drawable.aq, R.drawable.ar, R.drawable.as, R.drawable.at, R.drawable.au, R.drawable.av,
            R.drawable.aw, R.drawable.ax, R.drawable.ay, R.drawable.az, R.drawable.aaa, R.drawable.aab,
            R.drawable.aac, R.drawable.aad, R.drawable.aae, R.drawable.aaf, R.drawable.aag, R.drawable.aah,
            R.drawable.aai, R.drawable.aaj, R.drawable.aak, R.drawable.aal, R.drawable.aam, R.drawable.aan,
            R.drawable.aao, R.drawable.aap, R.drawable.aaq, R.drawable.aar, R.drawable.aas, R.drawable.aat,
            R.drawable.aau, R.drawable.aav, R.drawable.aaw, R.drawable.aax, R.drawable.aay, R.drawable.aaz,
            R.drawable.aaaa, R.drawable.aaab, R.drawable.aaac, R.drawable.aaad*/
    };

    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int i) {
        return imageArray[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imageArray[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340,350));
        return imageView;
    }
}
