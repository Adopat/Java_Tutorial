package chapter7_6;

import java.util.ArrayList;

public class UserNotEnoughException extends Exception{
    private int code;
    private  String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public UserNotEnoughException(){
        super();
    }
    public UserNotEnoughException(int code,String msg){
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
