
package inheritance.person;

/**
 *
 * @author athiralekshmicv
 */
 public class Person {
    String name;
    String address;
    public Person(String nm,String add){
        name=nm;
        address=add;
    }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(String ad){
        address=ad;
    }
   
    public String tostring(){
        return "Name "+ name + "Address" + address;
    }
    
}
