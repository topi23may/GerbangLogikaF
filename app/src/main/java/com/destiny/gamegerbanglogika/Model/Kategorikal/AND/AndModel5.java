package com.destiny.gamegerbanglogika.Model.Kategorikal.AND;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class AndModel5 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.and_in_1_off),
                    String.valueOf(R.drawable.and_in_1_on),
                    "ON",
                    "OFF",
                    "",
                    "ON",
                    String.valueOf(R.drawable.and_e_1)
            },
            {"2",
                    String.valueOf(R.drawable.and_in_2_off),
                    String.valueOf(R.drawable.and_in_2_on),
                    "OFF",
                    "ON",
                    "",
                    "ON",
                    String.valueOf(R.drawable.and_e_1)
            },
            {"3",
                    String.valueOf(R.drawable.normal_1_and_mati),
                    String.valueOf(R.drawable.normal_1_and_nyala),
                    "NAND",
                    "XNOR",
                    "AND",
                    "NAND",
                    String.valueOf(R.drawable.and_n_1)
            },
            {"4",
                    String.valueOf(R.drawable.normal_2_and_mati),
                    String.valueOf(R.drawable.normal_2_and_nyala),
                    "NAND",
                    "XNOR",
                    "AND",
                    "NAND",
                    String.valueOf(R.drawable.and_n_2)
            },
            {"5",
                    String.valueOf(R.drawable.normal_5_and_mati),
                    String.valueOf(R.drawable.normal_5_and_nyala),
                    "NOR",
                    "XOR",
                    "OR",
                    "NOR",
                    String.valueOf(R.drawable.and_n_5)
            },
            {"6",
                    String.valueOf(R.drawable.normal_6_and_mati),
                    String.valueOf(R.drawable.normal_6_and_nyala),
                    "XOR",
                    "NAND",
                    "OR",
                    "NAND",
                    String.valueOf(R.drawable.and_n_6)
            },
            {"7",
                    String.valueOf(R.drawable.hard_1_and_mati),
                    String.valueOf(R.drawable.hard_1_and_nyala),
                    "NOR",
                    "AND",
                    "OR",
                    "NOR",
                    String.valueOf(R.drawable.and_h_1)
            },
            {"8",
                    String.valueOf(R.drawable.hard_2_and_mati),
                    String.valueOf(R.drawable.hard_2_and_nyala),
                    "NOR",
                    "AND",
                    "NAND",
                    "NAND",
                    String.valueOf(R.drawable.and_h_2)
            },
            {"9",
                    String.valueOf(R.drawable.hard_5_and_mati),
                    String.valueOf(R.drawable.hard_5_and_nyala),
                    "AND",
                    "XOR",
                    "XNOR",
                    "XNOR",
                    String.valueOf(R.drawable.and_h_5)
            },
            {"10",
                    String.valueOf(R.drawable.hard_6_and_mati),
                    String.valueOf(R.drawable.hard_6_and_nyala),
                    "NOR",
                    "OR",
                    "XNOR",
                    "OR",
                    String.valueOf(R.drawable.and_h_6)
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
