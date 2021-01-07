package com.naridsara.raansalatpak;

import com.adedom.library.Dru;

import java.sql.Connection;

// mysql://b35aa416699eeb:64f41e19@us-cdbr-east-02.cleardb.com/heroku_bf8dd352a144069?reconnect=true

public class ConnectDB {
    public static Connection getConnection() {
//        return Dru.connection("192.168.43.28","naridsara","242541","raan");
        return Dru.connection("us-cdbr-east-02.cleardb.com","b35aa416699eeb","64f41e19","heroku_bf8dd352a144069");
    }
}
