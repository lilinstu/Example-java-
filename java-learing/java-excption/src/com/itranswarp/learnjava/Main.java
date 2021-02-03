package com.itranswarp.learnjava;

import java.io.UnsupportedEncodingException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {
    static final Log log = LogFactory.getLog(Main.class);//未被任何变量引用的日志记录器可能会被垃圾回收，故用静态变量存储日志记录器的引用

    public static void main(String[] args) {
        log.info("Start process...");
        try {
            "".getBytes("invalidCharsetName");
        } catch (UnsupportedEncodingException e) {
            log.error("Invalid encoding.", e);
        }
        log.info("Process end.");
    }
}
