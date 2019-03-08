
package employee;

/**
 *
 * @author vantuPro
 */
public abstract class Employee {
    private String name,mnv;
   
    public Employee(String name , String mnv){
        
        this.mnv = mnv;
        this.name = name;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the mnv
     */
    public String getMnv() {
        return mnv;
    }

    /**
     * @param mnv the mnv to set
     */
    public void setMnv(String mnv) {
        this.mnv = mnv;
    }

    /**
     * @return the luongcb
     */
   
    public abstract  double tongluong();
    public String toString(){
        return "Ten : " + this.name + "\n" + "Ma nhan vien : " + this.mnv; 
    }
    
  
    
}
