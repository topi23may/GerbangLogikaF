package com.destiny.gamegerbanglogika.Model.Dificulty.Medium;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class NormalModel1 {
        public static String[][] data = new String[][]{
                {"1",
                        String.valueOf(R.drawable.normal_1_2_or_mati),
                        String.valueOf(R.drawable.normal_1_2_or_nyala),
                        "XOR",
                        "XNOR",
                        "NAND",
                        "XNOR",
                        String.valueOf(R.drawable.or_n_1)
                },
                {"2",
                        String.valueOf(R.drawable.normal_1_2_or_mati),
                        String.valueOf(R.drawable.normal_1_2_or_nyala),
                        "AND",
                        "XOR",
                        "NAND",
                        "AND",
                        String.valueOf(R.drawable.or_n_2)
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
                        String.valueOf(R.drawable.normal_1_2_nand_mati),
                        String.valueOf(R.drawable.normal_1_2_nand_nyala),
                        "NAND",
                        "OR",
                        "XOR",
                        "OR",
                        String.valueOf(R.drawable.nand_n_1)
                },
                {"5",
                        String.valueOf(R.drawable.normal_1_2_nand_mati),
                        String.valueOf(R.drawable.normal_1_2_nand_nyala),
                        "XOR",
                        "NOR",
                        "AND",
                        "AND",
                        String.valueOf(R.drawable.nand_n_2)
                },
                {"6",
                        String.valueOf(R.drawable.normal_1_2_nor_mati),
                        String.valueOf(R.drawable.normal_1_2_nor_nyala),
                        "XOR",
                        "AND",
                        "NAND",
                        "AND",
                        String.valueOf(R.drawable.nor_n_1)
                },
                {"7",
                        String.valueOf(R.drawable.normal_1_2_nor_mati),
                        String.valueOf(R.drawable.normal_1_2_nor_nyala),
                        "NAND",
                        "OR",
                        "XNOR",
                        "XNOR",
                        String.valueOf(R.drawable.nor_n_2)
                },
                {"8",
                        String.valueOf(R.drawable.normal_1_2_xor_mati),
                        String.valueOf(R.drawable.normal_1_2_xor_nyala),
                        "XOR",
                        "XNOR",
                        "NOR",
                        "XNOR",
                        String.valueOf(R.drawable.xor_n_1)
                },
                {"9",
                        String.valueOf(R.drawable.normal_6_xor_mati),
                        String.valueOf(R.drawable.normal_6_xor_nyala),
                        "AND",
                        "NOR",
                        "XOR",
                        "AND",
                        String.valueOf(R.drawable.xor_n_6)
                },
                {"10",
                        String.valueOf(R.drawable.normal_1_xnor_mati),
                        String.valueOf(R.drawable.normal_1_xnor_nyala),
                        "NOR",
                        "XNOR",
                        "XOR",
                        "XNOR",
                        String.valueOf(R.drawable.xnor_n_1)
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
