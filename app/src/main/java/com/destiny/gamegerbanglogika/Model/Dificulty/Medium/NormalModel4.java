package com.destiny.gamegerbanglogika.Model.Dificulty.Medium;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class NormalModel4 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.normal_4_xnor_mati),
                    String.valueOf(R.drawable.normal_4_xnor_nyala),
                    "NOR",
                    "AND",
                    "XOR",
                    "XOR",
                    String.valueOf(R.drawable.xnor_n_4)
            },
            {"2",
                    String.valueOf(R.drawable.normal_4_xor_mati),
                    String.valueOf(R.drawable.normal_4_xor_nyala),
                    "NAND",
                    "XNOR",
                    "NOR",
                    "NAND",
                    String.valueOf(R.drawable.xor_n_4)
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
                    String.valueOf(R.drawable.normal_3_nand_mati),
                    String.valueOf(R.drawable.normal_3_nand_nyala),
                    "XOR",
                    "NAND",
                    "OR",
                    "OR",
                    String.valueOf(R.drawable.nand_n_3)
            },
            {"5",
                    String.valueOf(R.drawable.normal_4_and_mati),
                    String.valueOf(R.drawable.normal_4_and_nyala),
                    "XNOR",
                    "XOR",
                    "OR",
                    "XNOR",
                    String.valueOf(R.drawable.and_n_4)
            },
            {"6",
                    String.valueOf(R.drawable.normal_4_nand_mati),
                    String.valueOf(R.drawable.normal_4_nand_nyala),
                    "XOR",
                    "NOR",
                    "XNOR",
                    "XOR",
                    String.valueOf(R.drawable.nand_n_4)
            },
            {"7",
                    String.valueOf(R.drawable.normal_3_and_mati),
                    String.valueOf(R.drawable.normal_3_and_nyala),
                    "XNOR",
                    "NOR",
                    "OR",
                    "OR",
                    String.valueOf(R.drawable.and_n_3)
            },
            {"8",
                    String.valueOf(R.drawable.normal_2_3_xnor_mati),
                    String.valueOf(R.drawable.normal_2_3_xnor_nyala),
                    "OR",
                    "AND",
                    "XOR",
                    "XOR",
                    String.valueOf(R.drawable.xnor_n_3)
            },
            {"9",
                    String.valueOf(R.drawable.normal_3_or_mati),
                    String.valueOf(R.drawable.normal_3_or_nyala),
                    "NAND",
                    "NOR",
                    "AND",
                    "AND",
                    String.valueOf(R.drawable.or_n_3)
            },
            {"10",
                    String.valueOf(R.drawable.normal_3_nor_mati),
                    String.valueOf(R.drawable.normal_3_nor_nyala),
                    "NOR",
                    "XOR",
                    "OR",
                    "NOR",
                    String.valueOf(R.drawable.nor_n_3)
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
