package com.kaleyra.patterns.singleton.camilo;

class DBconnection {
    private static DBconnection instanceRef = new DBconnection();

    private DBconnection(){}

    public static DBconnection getInstance(){
        return instanceRef;
    }

}

class DBconnection2 {
    private static DBconnection2 instanceRef;

    private DBconnection2(){}

    public static DBconnection2 getInstance() {
        if (instanceRef == null)
            instanceRef = new DBconnection2();

        return instanceRef;

    }

}