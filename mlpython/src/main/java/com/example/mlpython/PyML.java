package com.example.mlpython;

import android.content.Context;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;

public class PyML {

    public static String decision_tree(Context context, float v1, float v2, float v3, float v4) {
        Python py= Python.getInstance();
        PyObject pyObject=py.getModule("model");
        PyObject obj=pyObject.callAttr("main",v1,v2,v3,v4);
        String str1=obj.toString();
        return str1;
    }

    public static String extratree(Context context,float v1, float v2, float v3, float v4) {
        Python py= Python.getInstance();
        PyObject pyObject=py.getModule("model");
        PyObject obj=pyObject.callAttr("extratree",v1,v2,v3,v4);
        String str2=obj.toString();
        return str2;
    }

    public static String random_forest(Context context,float v1, float v2, float v3, float v4) {
        Python py= Python.getInstance();
        PyObject pyObject=py.getModule("model");
        PyObject obj=pyObject.callAttr("randomforest",v1,v2,v3,v4);
        String str3=obj.toString();

        return str3;
    }


}
