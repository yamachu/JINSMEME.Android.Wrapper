package com.jins_jp.meme;

import android.bluetooth.BluetoothDevice;
import android.content.Context;

import java.util.List;

public class MemeLibWrapper {
    private static MemeLibWrapper memeLibWrapper;
    private static MemeLib memeLib;

    public static synchronized MemeLibWrapper getInstance() {
        memeLib = MemeLib.getInstance();
        return memeLibWrapper;
    }

    private MemeLibWrapper() { }

    public static synchronized void setAppClientID(Context paramContext, String paramString1, String paramString2)
    {
        if (memeLibWrapper == null) {
            MemeLib.setAppClientID(paramContext, paramString1, paramString2);
            memeLibWrapper = new MemeLibWrapper();
        }

    }

    public void setAutoConnect(boolean paramBoolean)
    {
        memeLib.setAutoConnect(paramBoolean);
    }

    public synchronized void setResponseListener(MemeResponseListener paramMemeResponseListener)
    {
        memeLib.setResponseListener(paramMemeResponseListener);
    }

    public boolean isScanning() {
        return memeLib.isScanning();
    }

    public synchronized int startScan(MemeScanListener var1) {
        return memeLib.startScan(var1).ordinal();
    }

    public synchronized int stopScan() {
        return memeLib.stopScan().ordinal();
    }

    public synchronized int connect(String var1) {
        return memeLib.connect(var1).ordinal();
    }

    public synchronized int setMemeConnectListener(MemeConnectListener var1) {
        return memeLib.setMemeConnectListener(var1).ordinal();
    }

    public synchronized void disconnect() {
        memeLib.disconnect();
    }

    public synchronized boolean isConnected() {
        return memeLib.isConnected();
    }

    public synchronized int startDataReport(MemeRealtimeListener var1) {
        return memeLib.startDataReport(var1).ordinal();
    }

    public synchronized void stopDataReport() {
        memeLib.stopDataReport();
    }

    public synchronized int isCalibrated() {
        return memeLib.isCalibrated().ordinal();
    }

    public String getSDKVersion() {
        return memeLib.getSDKVersion();
    }

    public String getFWVersion() {
        return memeLib.getFWVersion();
    }

    public int getHWVersion() {
        return memeLib.getHWVersion();
    }

    public int getConnectedDeviceType() {
        return memeLib.getConnectedDeviceType();
    }

    public int getConnectedDeviceSubType() {
        return memeLib.getConnectedDeviceSubType();
    }

    public BluetoothDevice getConnectedDevice() {
        return memeLib.getConnectedDevice();
    }

    public boolean isDataReceiving() {
        return memeLib.isDataReceiving();
    }

    public boolean isAutoConnect() {
        return memeLib.isAutoConnect();
    }

    public void setVerbose(boolean var1) {
        memeLib.setVerbose(var1);
    }

    public List<String> getConnectedByOthers() {
        return memeLib.getConnectedByOthers();
    }

    public void getMode() {
        // GETとは
        memeLib.getMode();
    }
}
