package com.naridsara.raansalatpak;

import com.adedom.library.Dru;

import java.sql.Connection;

public class ConnectDB {
    public static Connection getConnection() {
        return Dru.connection("192.168.43.28","naridsara","242541","raan");
    }
}
