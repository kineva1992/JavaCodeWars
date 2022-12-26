package com.ky7;

public class Arguments {

    public static int countArgs(Object... args){
        return args == null ? 0 : args.length;
    }
}
