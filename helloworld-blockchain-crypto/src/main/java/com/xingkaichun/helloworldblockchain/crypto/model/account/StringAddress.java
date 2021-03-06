package com.xingkaichun.helloworldblockchain.crypto.model.account;

import java.io.Serializable;

/**
 * 字符串格式的地址
 *
 * @author 邢开春 xingkaichun@qq.com
 */
public class StringAddress implements Serializable {

    private String value;

    public StringAddress(String value) {
        this.value = value;
    }




    //region get set

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //endregion
}
