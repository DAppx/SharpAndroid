package com.daxstudio.sa.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by DAppx(github.com/DAppx) on 11/10/2016.by daxstudio
 */

public abstract class DxMvpDiActivity<V extends DxView, P extends DxPresenter<V>, C extends
        BaseComponent<V, P>>
        extends AppCompatActivity implements HasComponent<C> {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeDi();
    }

    protected abstract void initializeDi();
}
