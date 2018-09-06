package com.blackchopper.loginshare.interfaces;


import com.blackchopper.loginshare.model.Type;

/**
 * author  : Black Chopper
 * e-mail  : 4884280@qq.com
 * github  : http://github.com/BlackChopper
 * project : LoginShare
 */

public interface OnLoginShareListener {
    void onLoginSuccess(Type type, String info);

    void onLoginCancel(Type type);

    void onLoginError(Type type, int errorCode);

    void onShareSuccess(Type type);

    void onShareCancel(Type type);

    void onShareError(Type type, int code);

    void onPaySuccess(Type type);

    void onPayCancel(Type type);

    void onPayError(Type type, int code);

}
