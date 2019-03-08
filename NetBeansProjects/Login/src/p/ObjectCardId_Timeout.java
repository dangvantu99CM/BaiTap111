
package p;

/**
 *
 * @author DangVanTu
 */
public class ObjectCardId_Timeout {
    private String Card_ID;
    private String timeout;
    private int id;
    private String loaixe;
    private float price;
    private String bso;
    private String scmt;
    private String veid;
    
    public ObjectCardId_Timeout(){
        
    }
    public ObjectCardId_Timeout(String Card_ID,String timeout,int id,String loaixe, float price,String bso,String scmt,String veid){
        this.Card_ID = Card_ID;
        this.timeout = timeout;
        this.id = id;
        this.loaixe = loaixe;
        this.price = price;
        this.bso = bso;
        this.scmt = scmt;
        this.veid = veid;
    }

    /**
     * @return the Card_ID
     */
    public String getCard_ID() {
        return Card_ID;
    }

    /**
     * @param Card_ID the Card_ID to set
     */
    public void setCard_ID(String Card_ID) {
        this.Card_ID = Card_ID;
    }

    /**
     * @return the timeout
     */
    public String getTimeout() {
        return timeout;
    }

    /**
     * @param timeout the timeout to set
     */
    public void setTimeout(String timeout) {
        this.timeout = timeout;
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
        return "Ma the: " + this.Card_ID + " ,gio ra: "+this.timeout + " ,id: " + this.id + " ,loai xe: " + this.getLoaixe() + " ,gia : "+ this.price + " ,bienso  : " + this.bso + " , scmt: " + this.scmt + " , ve id: " + this.veid;
    }

    /**
     * @return the loaixe
     */
    public String getLoaixe() {
        return loaixe;
    }

    /**
     * @param loaixe the loaixe to set
     */
    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the bso
     */
    public String getBso() {
        return bso;
    }

    /**
     * @param bso the bso to set
     */
    public void setBso(String bso) {
        this.bso = bso;
    }

    /**
     * @return the scmt
     */
    public String getScmt() {
        return scmt;
    }

    /**
     * @param scmt the scmt to set
     */
    public void setScmt(String scmt) {
        this.scmt = scmt;
    }

    /**
     * @return the veid
     */
    public String getVeid() {
        return veid;
    }

    /**
     * @param veid the veid to set
     */
    public void setVeid(String veid) {
        this.veid = veid;
    }
}
