package com.daxstudio.sa.mvp;



import rx.Subscription;

/**
 * Created by DAppx(github.com/DAppx) on 12/10/2016.by daxstudio
 */

public abstract class DxRxPresenter<V extends DxView> extends DxPresenter<V> {

    private final DxRxDelegate mRxDxDelegate;

    protected DxRxPresenter() {
        mRxDxDelegate = new DxRxDelegate();
        mRxDxDelegate.onCreate();
    }

    protected boolean addUtilStop(Subscription subscription) {
        return mRxDxDelegate.addUtilStop(subscription);
    }

    public boolean addUtilDestroy(Subscription subscription) {
        return mRxDxDelegate.addUtilDestroy(subscription);
    }

    public void remove(Subscription subscription) {
        mRxDxDelegate.remove(subscription);
    }

    @Override
    public void attachView(V view) {
        super.attachView(view);
        mRxDxDelegate.onStart();
    }

    @Override
    public void detachView() {
        super.detachView();
        mRxDxDelegate.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mRxDxDelegate.onDestroy();
    }
}
