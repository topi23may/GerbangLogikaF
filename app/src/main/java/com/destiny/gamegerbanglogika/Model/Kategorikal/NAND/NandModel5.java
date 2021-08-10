package com.destiny.gamegerbanglogika.Model.Kategorikal.NAND;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class NandModel5 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.nand_in_2_off),
                    String.valueOf(R.drawable.nand_in_2_on),
                    "OFF",
                    "ON",
                    "",
                    "OFF",
                    String.valueOf(R.drawable.nand_e_1)
            },
            {"2",
                    String.valueOf(R.drawable.nand_in_2_off),
                    String.valueOf(R.drawable.nand_in_2_on),
                    "ON",
                    "OFF",
                    "",
                    "OFF",
                    String.valueOf(R.drawable.nand_e_3)
            },
            {"3",
                    String.valueOf(R.drawable.normal_1_2_nand_mati),
                    String.valueOf(R.drawable.normal_1_2_nand_nyala),
                    "NAND",
                    "OR",
                    "XOR",
                    "OR",
                    String.valueOf(R.drawable.nand_n_1)
            },
            {"4",
                    String.valueOf(R.drawable.normal_1_2_nand_mati),
                    String.valueOf(R.drawable.normal_1_2_nand_nyala),
                    "XOR",
                    "NOR",
                    "AND",
                    "AND",
                    String.valueOf(R.drawable.nand_n_2)
            },
            {"5",
                    String.valueOf(R.drawable.normal_5_6_nand_mati),
                    String.valueOf(R.drawable.normal_5_6_nand_nyala),
                    "XOR",
                    "NOR",
                    "XNOR",
                    "XNOR",
                    String.valueOf(R.drawable.nand_n_5)
            },
            {"6",
                    String.valueOf(R.drawable.normal_5_6_nand_mati),
                    String.valueOf(R.drawable.normal_5_6_nand_nyala),
                    "XOR",
                    "AND",
                    "NAND",
                    "AND",
                    String.valueOf(R.drawable.nand_n_6)
            },
            {"7",
                    String.valueOf(R.drawable.hard_1_nand_mati),
                    String.valueOf(R.drawable.hard_1_nand_nyala),
                    "AND",
                    "XOR",
                    "XNOR",
                    "XOR",
                    String.valueOf(R.drawable.nand_h_1)
            },
            {"8",
                    String.valueOf(R.drawable.hard_2_nand_mati),
                    String.valueOf(R.drawable.hard_2_nand_nyala),
                    "NAND",
                    "XOR",
                    "XNOR",
                    "XNOR",
                    String.valueOf(R.drawable.nand_h_2)
            },
            {"9",
                    String.valueOf(R.drawable.hard_5_nand_mati),
                    String.valueOf(R.drawable.hard_5_nand_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XOR",
                    String.valueOf(R.drawable.nand_h_5)
            },
            {"10",
                    String.valueOf(R.drawable.hard_6_nand_mati),
                    String.valueOf(R.drawable.hard_6_nand_nyala),
                    "NAND",
                    "AND",
                    "XNOR",
                    "NAND",
                    String.valueOf(R.drawable.nand_h_6)
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
