package com.destiny.gamegerbanglogika.Model.Kategorikal.OR;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class OrModel1 {
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
            {"4",
                    String.valueOf(R.drawable.normal_1_2_or_mati),
                    String.valueOf(R.drawable.normal_1_2_or_nyala),
                    "XOR",
                    "XNOR",
                    "NAND",
                    "XNOR",
                    String.valueOf(R.drawable.or_n_1)
            },
            {"5",
                    String.valueOf(R.drawable.normal_1_2_or_mati),
                    String.valueOf(R.drawable.normal_1_2_or_nyala),
                    "AND",
                    "XOR",
                    "NAND",
                    "AND",
                    String.valueOf(R.drawable.or_n_2)
            },
            {"6",
                    String.valueOf(R.drawable.normal_3_or_mati),
                    String.valueOf(R.drawable.normal_3_or_nyala),
                    "NAND",
                    "NOR",
                    "AND",
                    "AND",
                    String.valueOf(R.drawable.or_n_3)
            },
            {"7",
                    String.valueOf(R.drawable.normal_4_or_mati),
                    String.valueOf(R.drawable.normal_4_or_nyala),
                    "NAND",
                    "NOR",
                    "AND",
                    "NAND",
                    String.valueOf(R.drawable.or_n_4)


            },
            {"10",
                    String.valueOf(R.drawable.hard_1_or_mati),
                    String.valueOf(R.drawable.hard_1_or_nyala),
                    "NAND",
                    "AND",
                    "NOR",
                    "AND",
                    String.valueOf(R.drawable.or_h_1)
            },
            {"11",
                    String.valueOf(R.drawable.hard_2_or_mati),
                    String.valueOf(R.drawable.hard_2_or_nyala),
                    "NOR",
                    "AND",
                    "XOR",
                    "XOR",
                    String.valueOf(R.drawable.or_h_2)
            },
            {"12",
                    String.valueOf(R.drawable.hard_3_or_mati),
                    String.valueOf(R.drawable.hard_3_or_nyala),
                    "NOR",
                    "AND",
                    "NAND",
                    "NAND",
                    String.valueOf(R.drawable.or_h_3)
            },
            {"13",
                    String.valueOf(R.drawable.hard_4_5_or_mati),
                    String.valueOf(R.drawable.hard_4_5_or_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XOR",
                    String.valueOf(R.drawable.or_h_4)
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