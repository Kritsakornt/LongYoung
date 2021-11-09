public class Cup {
    private int cupID[] ; //รหัสแก้ว
    private String cupSize[] ; // ชื่อแก้ว
    private int cupNumber[] ; // จำนวนแก้ว


public Cup(int cupID[], String cupSize[], int cupNumber[]) {
    this.cupID = cupID ;
    this.cupSize = cupSize ;
    this.cupNumber = cupNumber ;
}

public int getCupID(int id) {
    int idCup = 0 ;
    for(int i=0; i<cupID.length; i++) {
        if(id == cupID[i]) {
            idCup = cupID[i];
        }
    }
    return idCup ;
}

public String getCupSize(int id){
    String Size = "";
    for(int i = 0 ; i<cupID.length; i++){
        if(id == cupID[i]) {
            Size = cupSize[i];
        }
    }
    return Size ;
} 

public int getCupNumber(int id){
    int Nb = 0;
    for(int i = 0 ; i<cupID.length; i++){
        if(id == cupID[i]) {
            Nb = cupNumber[i];
        }
    }
    return Nb ;
} 

public String getCupDetails() {
    String detailCup = "" ;
    for(int i=0; i<cupID.length; i++) {
        detailCup = i + getCupSize(i) + getCupNumber(i) ;
    }
    return detailCup ;
}

}