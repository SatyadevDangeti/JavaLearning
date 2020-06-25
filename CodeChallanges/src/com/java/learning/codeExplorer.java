package com.java.learning;

public class codeExplorer {
    static int id = 1;
    int id1 = -1;

    public codeExplorer(int ids, int id) {
        this.id1 = ids;
        codeExplorer.id = id;
    }


    public codeExplorer() {

    }

    codeExplorer ex = new codeExplorer(id1);

    public codeExplorer(int id1) {
        codeExplorer.id = id1;
    }

    static void varargsMethods(int... items) {
      codeExplorer.id = 23;
    }

}
