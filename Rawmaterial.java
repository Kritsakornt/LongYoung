public class Rawmaterial {
    private int rawID[] ; // รหัสวัตถุดิบ
    private String rawName[] ; // ชื่อวัตถุดิบ
    private int rawNumber[] ; // จำนวนวัตถุดิบ

    public Rawmaterial(int rawID[], String rawName[], int rawNumber[]) {
        this.rawID = rawID ;
        this.rawName = rawName ;
        this.rawNumber = rawNumber ;
    }

    public int getRawID(int id) {
        int idRaw = 0 ;
        for(int i=0; i<rawID.length; i++) {
            if(id == rawID[i]) {
                idRaw = rawID[i];
            }
        }
        return idRaw ;
    }

    public String getRawName(int id) {
        String nameRaw = "" ;
        for(int i=0; i<rawID.length; i++) {
            if(id == rawID[i]) {
                nameRaw = rawName[i];
            }
        }
        return nameRaw ;
    }

    public int getRawNumber(int id) {
        int Nr = 0 ;
        for(int i = 0 ; i<rawID.length; i++){
            if(id == rawID[i]) {
                Nr = rawNumber[i];
            }
        }
        return Nr ;
    }

    public String getRawDetails() {
        String detailRaw = "" ;
        for(int i = 0 ; i<rawID.length ; i++) {
            detailRaw = i + getRawName(i) + getRawNumber(i) ;
        }
        return detailRaw ;
    }
}
