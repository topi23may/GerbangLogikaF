package com.destiny.gamegerbanglogika.Model.Kategorikal.NOR;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class NorModel2 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.nor_in_1_off),
                    String.valueOf(R.drawable.nor_in_1_on),
                    "OFF",
                    "ON",
                    "",
                    "OFF",
                    String.valueOf(R.drawable.nor_e_1)
            },
            {"2",
                    String.valueOf(R.drawable.nor_in_2_off),
                    String.valueOf(R.drawable.nor_in_2_on),
                    "ON",
                    "OFF",
                    "",
                    "OFF",
                    String.valueOf(R.drawable.nor_e_1)
            },
            {"3",
                    String.valueOf(R.drawable.normal_3_nor_mati),
                    String.valueOf(R.drawable.normal_3_nor_nyala),
                    "NOR",
                    "XOR",
                    "OR",
                    "NOR",
                    String.valueOf(R.drawable.nor_n_3)
            },
            {"4",
                    String.valueOf(R.drawable.normal_1_2_nor_mati),
                    String.valueOf(R.drawable.normal_1_2_nor_nyala),
                    "XOR",
                    "AND",
                    "NAND",
                    "AND",
                    String.valueOf(R.drawable.nor_n_1)
            },
            {"5",
                    String.valueOf(R.drawable.normal_4_nor_mati),
                    String.valueOf(R.drawable.normal_4_nor_nyala),
                    "NAND",
                    "OR",
                    "XOR",
                    "NAND",
                    String.valueOf(R.drawable.nor_n_4)
            },
            {"6",
                    String.valueOf(R.drawable.normal_1_2_nor_mati),
                    String.valueOf(R.drawable.normal_1_2_nor_nyala),
                    "NAND",
                    "OR",
                    "XNOR",
                    "XNOR",
                    String.valueOf(R.drawable.nor_n_2)
            },
            {"7",
                    String.valueOf(R.drawable.hard_3_nor_mati),
                    String.valueOf(R.drawable.hard_3_nor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "NOR",
                    String.valueOf(R.drawable.nor_h_3)
            },
            {"8",
                    String.valueOf(R.drawable.hard_1_nor_mati),
                    String.valueOf(R.drawable.hard_1_nor_nyala),
                    "AND",
                    "XOR",
                    "XNOR",
                    "XNOR",
                    String.valueOf(R.drawable.nor_h_1)
            },
            {"9",
                    String.valueOf(R.drawable.hard_4_nor_mati),
                    String.valueOf(R.drawable.hard_4_nor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "XOR",
                    String.valueOf(R.drawable.nor_h_4)
            },
            {"10",
                    String.valueOf(R.drawable.hard_2_nor_mati),
                    String.valueOf(R.drawable.hard_2_nor_nyala),
                    "AND",
                    "XOR",
                    "XNOR",
                    "XOR",
                    String.valueOf(R.drawable.nor_h_2)
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
