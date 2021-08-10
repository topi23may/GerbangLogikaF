package com.destiny.gamegerbanglogika.Model.Kategorikal.XOR;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class XorModel2 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.xor_in_2_off),
                    String.valueOf(R.drawable.xor_in_2_on),
                    "ON",
                    "OFF",
                    "",
                    "ON",
                    String.valueOf(R.drawable.xor_e_1)
            },
            {"2",
                    String.valueOf(R.drawable.xor_in_1_off),
                    String.valueOf(R.drawable.xor_in_1_on),
                    "ON",
                    "OFF",
                    "",
                    "OFF",
                    String.valueOf(R.drawable.xor_e_23)
            },

            {"3",
                    String.valueOf(R.drawable.normal_3_xor_mati),
                    String.valueOf(R.drawable.normal_3_xor_nyala),
                    "NOR",
                    "NAND",
                    "OR",
                    "OR",
                    String.valueOf(R.drawable.xor_n_3)
            },
            {"4",
                    String.valueOf(R.drawable.normal_1_2_xor_mati),
                    String.valueOf(R.drawable.normal_1_2_xor_nyala),
                    "XOR",
                    "XNOR",
                    "NOR",
                    "XNOR",
                    String.valueOf(R.drawable.xor_n_1)
            },
            {"5",
                    String.valueOf(R.drawable.normal_4_xor_mati),
                    String.valueOf(R.drawable.normal_4_xor_nyala),
                    "NAND",
                    "XNOR",
                    "NOR",
                    "NAND",
                    String.valueOf(R.drawable.xor_n_4)
            },
            {"6",
                    String.valueOf(R.drawable.normal_1_2_xor_mati),
                    String.valueOf(R.drawable.normal_1_2_xor_nyala),
                    "NOR",
                    "NAND",
                    "OR",
                    "OR",
                    String.valueOf(R.drawable.xor_n_2)
            },
            {"7",
                    String.valueOf(R.drawable.hard_3_xor_mati),
                    String.valueOf(R.drawable.hard_3_xor_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XOR",
                    String.valueOf(R.drawable.xor_h_3)
            },
            {"8",
                    String.valueOf(R.drawable.hard_1_xor_mati),
                    String.valueOf(R.drawable.hard_1_xor_nyala),
                    "NAND",
                    "AND",
                    "XNOR",
                    "NAND",
                    String.valueOf(R.drawable.xor_h_1)
            },
            {"9",
                    String.valueOf(R.drawable.hard_4_xor_mati),
                    String.valueOf(R.drawable.hard_4_xor_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XOR",
                    String.valueOf(R.drawable.xor_h_4)
            },
            {"10",
                    String.valueOf(R.drawable.hard_2_xor_mati),
                    String.valueOf(R.drawable.hard_2_xor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "AND",
                    String.valueOf(R.drawable.xor_h_2)
    },
    };
    public static ArrayList<DataModel> getListData(){
        DataModel models = null;
        ArrayList<DataModel> list = new ArrayList<>();
        for (String[] aData : data) {
            models = new DataModel();
            models.setNo(aData[0]);
            models.setGambar(aData[1]);
            models.setGambar2(aData[2]);
            models.setJawaban1(aData[3]);
            models.setJawaban2(aData[4]);
            models.setJawaban3(aData[5]);
            models.setJawaban(aData[6]);
            models.setTable(aData[7]);
            list.add(models);
        }
        return list;
    }
}
