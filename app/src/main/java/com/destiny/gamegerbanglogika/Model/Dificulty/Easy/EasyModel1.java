package com.destiny.gamegerbanglogika.Model.Dificulty.Easy;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class EasyModel1 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "OR",
                    "NAND",
                    "XOR",
                    "NAND",
                    String.valueOf(R.drawable.nand_e_2)
            },
            {"2",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "NOR",
                    "AND",
                    "XOR",
                    "NOR",
                    String.valueOf(R.drawable.nor_e_1)
            },
            {"3",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "XNOR",
                    "AND",
                    "OR",
                    "XNOR",
                    String.valueOf(R.drawable.xnor_e_23)
            },
            {"4",
                    String.valueOf(R.drawable.easy_on_off_mati),
                    String.valueOf(R.drawable.easy_on_off_nyala),
                    "AND",
                    "XNOR",
                    "OR",
                    "OR",
                    String.valueOf(R.drawable.or_e_1)
            },
            {"5",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "OR",
                    "XOR",
                    "XNOR",
                    "XNOR",
                    String.valueOf(R.drawable.xnor_e_23)
            },
            {"6",
                    String.valueOf(R.drawable.easy_on_on_mati),
                    String.valueOf(R.drawable.easy_on_on_nyala),
                    "NAND",
                    "AND",
                    "NOR",
                    "AND",
                    String.valueOf(R.drawable.and_e_1)
            },
            {"7",
                    String.valueOf(R.drawable.easy_on_off_mati),
                    String.valueOf(R.drawable.easy_on_off_nyala),
                    "NAND",
                    "XNOR",
                    "NOR",
                    "NAND",
                    String.valueOf(R.drawable.nand_e_1)
            },
            {"8",
                    String.valueOf(R.drawable.easy_on_off_mati),
                    String.valueOf(R.drawable.easy_on_off_nyala),
                    "NOR",
                    "AND",
                    "XOR",
                    "XOR",
                    String.valueOf(R.drawable.xor_e_1)
            },
            {"9",
                    String.valueOf(R.drawable.easy_off_on_mati),
                    String.valueOf(R.drawable.easy_off_on_nyala),
                    "NOR",
                    "XOR",
                    "XNOR",
                    "XOR",
                    String.valueOf(R.drawable.xor_e_23)
            },
            {"10",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "OR",
                    "AND",
                    "NOR",
                    "NOR",
                    String.valueOf(R.drawable.nor_e_1)
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
