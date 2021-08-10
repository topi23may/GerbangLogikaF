package com.destiny.gamegerbanglogika.Model.Dificulty.Hard;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class HardModel
{
    public static String[][] data = new String[][]{
            //OR
            {"1",
                    String.valueOf(R.drawable.hard_1_or_mati),
                    String.valueOf(R.drawable.hard_1_or_nyala),
                    "NAND",
                    "AND",
                    "NOR",
                    "AND",
                    String.valueOf(R.drawable.or_h_1)
            },
            {"2",
                    String.valueOf(R.drawable.hard_2_or_mati),
                    String.valueOf(R.drawable.hard_2_or_nyala),
                    "NOR",
                    "AND",
                    "XOR",
                    "XOR",
                    String.valueOf(R.drawable.or_h_2)
            },
            {"3",
                    String.valueOf(R.drawable.hard_3_or_mati),
                    String.valueOf(R.drawable.hard_3_or_nyala),
                    "NOR",
                    "AND",
                    "NAND",
                    "NAND",
                    String.valueOf(R.drawable.or_h_3)
            },
            {"4",
                    String.valueOf(R.drawable.hard_4_5_or_mati),
                    String.valueOf(R.drawable.hard_4_5_or_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XOR",
                    String.valueOf(R.drawable.or_h_4)
            },
            {"5",
                    String.valueOf(R.drawable.hard_4_5_or_mati),
                    String.valueOf(R.drawable.hard_4_5_or_nyala),
                    "NOR",
                    "AND",
                    "NAND",
                    "NAND",
                    String.valueOf(R.drawable.or_h_5)
            },
            {"6",
                    String.valueOf(R.drawable.hard_6_or_mati),
                    String.valueOf(R.drawable.hard_6_or_nyala),
                    "NOR",
                    "AND",
                    "OR",
                    "NOR",
                    String.valueOf(R.drawable.or_h_6)
            },
            //AND
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
                    String.valueOf(R.drawable.hard_3_and_mati),
                    String.valueOf(R.drawable.hard_3_and_nyala),
                    "AND",
                    "NAND",
                    "NOR",
                    "AND",
                    String.valueOf(R.drawable.and_h_3)
            },
            {"10",
                    String.valueOf(R.drawable.hard_4_and_mati),
                    String.valueOf(R.drawable.hard_4_and_nyala),
                    "OR",
                    "AND",
                    "XNOR",
                    "XNOR",
                    String.valueOf(R.drawable.and_h_4)
            },
            {"11",
                    String.valueOf(R.drawable.hard_5_and_mati),
                    String.valueOf(R.drawable.hard_5_and_nyala),
                    "AND",
                    "XOR",
                    "XNOR",
                    "XNOR",
                    String.valueOf(R.drawable.and_h_5)
            },
            {"12",
                    String.valueOf(R.drawable.hard_6_and_mati),
                    String.valueOf(R.drawable.hard_6_and_nyala),
                    "NOR",
                    "OR",
                    "XNOR",
                    "OR",
                    String.valueOf(R.drawable.and_h_6)
            },
            //NAND
            {"13",
                    String.valueOf(R.drawable.hard_1_nand_mati),
                    String.valueOf(R.drawable.hard_1_nand_nyala),
                    "AND",
                    "XOR",
                    "XNOR",
                    "XOR",
                    String.valueOf(R.drawable.nand_h_1)
            },
            {"14",
                    String.valueOf(R.drawable.hard_2_nand_mati),
                    String.valueOf(R.drawable.hard_2_nand_nyala),
                    "NAND",
                    "XOR",
                    "XNOR",
                    "XNOR",
                    String.valueOf(R.drawable.nand_h_2)
            },
            {"15",
                    String.valueOf(R.drawable.hard_3_nand_mati),
                    String.valueOf(R.drawable.hard_3_nand_nyala),
                    "XNOR",
                    "OR",
                    "NAND",
                    "XNOR",
                    String.valueOf(R.drawable.nand_h_3)
            },
            {"16",
                    String.valueOf(R.drawable.hard_4_nand_mati),
                    String.valueOf(R.drawable.hard_4_nand_nyala),
                    "OR",
                    "AND",
                    "NAND",
                    "AND",
                    String.valueOf(R.drawable.nand_h_4)
            },
            {"17",
                    String.valueOf(R.drawable.hard_5_nand_mati),
                    String.valueOf(R.drawable.hard_5_nand_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XOR",
                    String.valueOf(R.drawable.nand_h_5)
            },
            {"18",
                    String.valueOf(R.drawable.hard_6_nand_mati),
                    String.valueOf(R.drawable.hard_6_nand_nyala),
                    "NAND",
                    "AND",
                    "XNOR",
                    "NAND",
                    String.valueOf(R.drawable.nand_h_6)
            },
            //NOR
            {"19",
                    String.valueOf(R.drawable.hard_1_nor_mati),
                    String.valueOf(R.drawable.hard_1_nor_nyala),
                    "AND",
                    "XOR",
                    "XNOR",
                    "XNOR",
                    String.valueOf(R.drawable.nor_h_1)
            },
            {"20",
                    String.valueOf(R.drawable.hard_2_nor_mati),
                    String.valueOf(R.drawable.hard_2_nor_nyala),
                    "AND",
                    "XOR",
                    "XNOR",
                    "XOR",
                    String.valueOf(R.drawable.nor_h_2)
            },
            {"21",
                    String.valueOf(R.drawable.hard_3_nor_mati),
                    String.valueOf(R.drawable.hard_3_nor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "NOR",
                    String.valueOf(R.drawable.nor_h_3)
            },
            {"22",
                    String.valueOf(R.drawable.hard_4_nor_mati),
                    String.valueOf(R.drawable.hard_4_nor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "XOR",
                    String.valueOf(R.drawable.nor_h_4)
            },
            {"23",
                    String.valueOf(R.drawable.hard_5_nor_mati),
                    String.valueOf(R.drawable.hard_5_nor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "AND",
                    String.valueOf(R.drawable.nor_h_5)
            },
            {"24",
                    String.valueOf(R.drawable.hard_6_nor_mati),
                    String.valueOf(R.drawable.hard_6_nor_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XNOR",
                    String.valueOf(R.drawable.nor_h_6)
            },
            //XOR
            {"25",
                    String.valueOf(R.drawable.hard_1_xor_mati),
                    String.valueOf(R.drawable.hard_1_xor_nyala),
                    "NAND",
                    "AND",
                    "XNOR",
                    "NAND",
                    String.valueOf(R.drawable.xor_h_1)
            },
            {"26",
                    String.valueOf(R.drawable.hard_2_xor_mati),
                    String.valueOf(R.drawable.hard_2_xor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "AND",
                    String.valueOf(R.drawable.xor_h_2)
            },
            {"27",
                    String.valueOf(R.drawable.hard_3_xor_mati),
                    String.valueOf(R.drawable.hard_3_xor_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XOR",
                    String.valueOf(R.drawable.xor_h_3)
            },
            {"28",
                    String.valueOf(R.drawable.hard_4_xor_mati),
                    String.valueOf(R.drawable.hard_4_xor_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XOR",
                    String.valueOf(R.drawable.xor_h_4)
            },
            {"29",
                    String.valueOf(R.drawable.hard_5_xor_mati),
                    String.valueOf(R.drawable.hard_5_xor_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XOR",
                    String.valueOf(R.drawable.xor_h_5)
            },
            {"30",
                    String.valueOf(R.drawable.hard_6_xor_mati),
                    String.valueOf(R.drawable.hard_6_xor_nyala),
                    "AND",
                    "NAND",
                    "NOR",
                    "NAND",
                    String.valueOf(R.drawable.xor_h_6)
            },
            //XNOR
            {"31",
                    String.valueOf(R.drawable.hard_1_xnor_mati),
                    String.valueOf(R.drawable.hard_1_xnor_nyala),
                    "AND",
                    "NAND",
                    "NOR",
                    "AND",
                    String.valueOf(R.drawable.xnor_h_1)
            },
            {"32",
                    String.valueOf(R.drawable.hard_2_xnor_mati),
                    String.valueOf(R.drawable.hard_2_xnor_nyala),
                    "NAND",
                    "XOR",
                    "XNOR",
                    "XNOR",
                    String.valueOf(R.drawable.xnor_h_2)
            },
            {"33",
                    String.valueOf(R.drawable.hard_3_xnor_mati),
                    String.valueOf(R.drawable.hard_3_xnor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "NOR",
                    String.valueOf(R.drawable.xnor_h_3)
            },
            {"34",
                    String.valueOf(R.drawable.hard_4_xnor_mati),
                    String.valueOf(R.drawable.hard_4_xnor_nyala),
                    "AND",
                    "NAND",
                    "NOR",
                    "NAND",
                    String.valueOf(R.drawable.xnor_h_4)
            },
            {"35",
                    String.valueOf(R.drawable.hard_5_xnor_mati),
                    String.valueOf(R.drawable.hard_5_xnor_nyala),
                    "OR",
                    "XNOR",
                    "AND",
                    "OR",
                    String.valueOf(R.drawable.xnor_h_5)
            },
            {"36",
                    String.valueOf(R.drawable.hard_6_xnor_mati),
                    String.valueOf(R.drawable.hard_6_xnor_nyala),
                    "AND",
                    "OR",
                    "NOR",
                    "OR",
                    String.valueOf(R.drawable.xnor_h_6)
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
