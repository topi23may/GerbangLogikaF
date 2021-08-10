package com.destiny.gamegerbanglogika.Model.Kategorikal.OR;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class OrModel4 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.or_in_1_off),
                    String.valueOf(R.drawable.or_in_2_on),
                    "OFF",
                    "ON",
                    "",
                    "ON",
                    String.valueOf(R.drawable.or_e_3)
            },
            {"2",
                    String.valueOf(R.drawable.or_in_1_off),
                    String.valueOf(R.drawable.or_in_2_on),
                    "ON",
                    "OFF",
                    "",
                    "ON",
                    String.valueOf(R.drawable.or_e_3)
            },

            {"3",
                    String.valueOf(R.drawable.normal_4_or_mati),
                    String.valueOf(R.drawable.normal_4_or_nyala),
                    "NAND",
                    "NOR",
                    "AND",
                    "NAND",
                    String.valueOf(R.drawable.or_n_4)
            },
            {"4",
                    String.valueOf(R.drawable.normal_5_or_mati),
                    String.valueOf(R.drawable.normal_5_or_nyala),
                    "XNOR",
                    "AND",
                    "OR",
                    "OR",
                    String.valueOf(R.drawable.or_n_5)
            },
            {"5",
                    String.valueOf(R.drawable.normal_3_or_mati),
                    String.valueOf(R.drawable.normal_3_or_nyala),
                    "NAND",
                    "NOR",
                    "AND",
                    "AND",
                    String.valueOf(R.drawable.or_n_3)
            },
            {"6",
                    String.valueOf(R.drawable.normal_6_or_mati),
                    String.valueOf(R.drawable.normal_6_or_nyala),
                    "XNOR",
                    "AND",
                    "OR",
                    "XNOR",
                    String.valueOf(R.drawable.or_n_6)
            },
            {"7",
                    String.valueOf(R.drawable.hard_4_5_or_mati),
                    String.valueOf(R.drawable.hard_4_5_or_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XOR",
                    String.valueOf(R.drawable.or_h_4)
            },
            {"8",
                    String.valueOf(R.drawable.hard_4_5_or_mati),
                    String.valueOf(R.drawable.hard_4_5_or_nyala),
                    "NOR",
                    "AND",
                    "NAND",
                    "NAND",
                    String.valueOf(R.drawable.or_h_5)
            },
            {"9",
                    String.valueOf(R.drawable.hard_3_or_mati),
                    String.valueOf(R.drawable.hard_3_or_nyala),
                    "NOR",
                    "AND",
                    "NAND",
                    "NAND",
                    String.valueOf(R.drawable.or_h_3)
            },
            {"10",
                    String.valueOf(R.drawable.hard_6_or_mati),
                    String.valueOf(R.drawable.hard_6_or_nyala),
                    "NOR",
                    "AND",
                    "OR",
                    "NOR",
                    String.valueOf(R.drawable.or_h_6)
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