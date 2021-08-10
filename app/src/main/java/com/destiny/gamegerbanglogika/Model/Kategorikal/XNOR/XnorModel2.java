package com.destiny.gamegerbanglogika.Model.Kategorikal.XNOR;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class XnorModel2 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.xnor_in_1_off),
                    String.valueOf(R.drawable.xnor_in_1_on),
                    "ON",
                    "OFF",
                    "",
                    "ON",
                    String.valueOf(R.drawable.xnor_e_1)
            },
            {"2",
                    String.valueOf(R.drawable.xnor_in_2_off),
                    String.valueOf(R.drawable.xnor_in_2_on),
                    "ON",
                    "OFF",
                    "",
                    "OFF",
                    String.valueOf(R.drawable.xnor_e_23)
            },
            {"3",
                    String.valueOf(R.drawable.normal_2_3_xnor_mati),
                    String.valueOf(R.drawable.normal_2_3_xnor_nyala),
                    "OR",
                    "AND",
                    "XOR",
                    "XOR",
                    String.valueOf(R.drawable.xnor_n_3)
            },
            {"4",
                    String.valueOf(R.drawable.normal_1_xnor_mati),
                    String.valueOf(R.drawable.normal_1_xnor_nyala),
                    "NOR",
                    "XNOR",
                    "XOR",
                    "XNOR",
                    String.valueOf(R.drawable.xnor_n_1)
            },
            {"5",
                    String.valueOf(R.drawable.normal_4_xnor_mati),
                    String.valueOf(R.drawable.normal_4_xnor_nyala),
                    "NOR",
                    "AND",
                    "XOR",
                    "XOR",
                    String.valueOf(R.drawable.xnor_n_4)
            },
            {"6",
                    String.valueOf(R.drawable.normal_2_3_xnor_mati),
                    String.valueOf(R.drawable.normal_2_3_xnor_nyala),
                    "NOR",
                    "AND",
                    "OR",
                    "NOR",
                    String.valueOf(R.drawable.xnor_n_2)
            },
            {"7",
                    String.valueOf(R.drawable.hard_3_xnor_mati),
                    String.valueOf(R.drawable.hard_3_xnor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "NOR",
                    String.valueOf(R.drawable.xnor_h_3)
            },
            {"8",
                    String.valueOf(R.drawable.hard_1_xnor_mati),
                    String.valueOf(R.drawable.hard_1_xnor_nyala),
                    "AND",
                    "NAND",
                    "NOR",
                    "AND",
                    String.valueOf(R.drawable.xnor_h_1)
            },
            {"9",
                    String.valueOf(R.drawable.hard_4_xnor_mati),
                    String.valueOf(R.drawable.hard_4_xnor_nyala),
                    "AND",
                    "NAND",
                    "NOR",
                    "NAND",
                    String.valueOf(R.drawable.xnor_h_4)
            },
            {"10",
                    String.valueOf(R.drawable.hard_2_xnor_mati),
                    String.valueOf(R.drawable.hard_2_xnor_nyala),
                    "NAND",
                    "XOR",
                    "XNOR",
                    "XNOR",
                    String.valueOf(R.drawable.xnor_h_2)
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
