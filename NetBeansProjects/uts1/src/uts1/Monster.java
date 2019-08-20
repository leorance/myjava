package uts1;
public class Monster {
        String nama = null;
        int totalSerang;
        int totalHP = 0;
        int totalMP = 0;
        void totalSerangApi(){
            totalSerang = MonsterApi.totalSerang;
            totalHP = MonsterApi.hpi;
            totalMP = MonsterApi.mpi;
        }
//        } else if (nama.equalsIgnoreCase("MonsterAir")) {
//            totalHP = MonsterAir.hpr;
//            totalMP = MonsterAir.mpr;
//        } else if (nama.equalsIgnoreCase("MonsterTanah")) {
//            totalHP = MonsterTanah.hph; 
//            totalMP = MonsterTanah.mph;
}