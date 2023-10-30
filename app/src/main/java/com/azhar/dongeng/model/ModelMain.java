package com.azhar.dongeng.model;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by Azhar Rivaldi on 05-10-2023
 * Youtube Channel : https://bit.ly/2PJMowZ
 * Github : https://github.com/AzharRivaldi
 * Twitter : https://twitter.com/azharrvldi_
 * Instagram : https://www.instagram.com/azhardvls_
 * LinkedIn : https://www.linkedin.com/in/azhar-rivaldi
 */

public class ModelMain implements Serializable {

    String strJudul;
    String strCerita;

    public String getStrJudul() {
        return strJudul;
    }

    public void setStrJudul(String strJudul) {
        this.strJudul = strJudul;
    }

    public String getStrCerita() {
        return strCerita;
    }

    public void setStrCerita(String strCerita) {
        this.strCerita = strCerita;
    }

    public static Comparator<ModelMain> sortByAsc = new Comparator<ModelMain>() {
        @Override
        public int compare(ModelMain o1, ModelMain o2) {
            return o1.strJudul.compareTo(o2.strJudul);
        }
    };
}
