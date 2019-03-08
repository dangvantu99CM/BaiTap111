
package p;

/**
 *
 * @author DangVanTu
 */
public class objectVexeId {
    private int vexe;
    private int id;
    public objectVexeId(){
    }
    public objectVexeId(int ve,int id){
        this.vexe = ve;
        this.id = id;
    }

    /**
     * @return the vexe
     */
    public int getVexe() {
        return vexe;
    }

    /**
     * @param vexe the vexe to set
     */
    public void setVexe(int vexe) {
        this.vexe = vexe;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    public String toString(){
        return "vexe : " + this.vexe + " ,id: "  + this.id;
    }
}
