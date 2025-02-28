package frameloginbd;

import java.sql.Timestamp;

public class Customer {
    private int customer_id;
    private int store_id;
    private String first_name;
    private String last_name;
    private String email;
    private int address_id;
    private int active;
    private Timestamp create_date;
    private Timestamp last_update;

    
    
    public Customer(int store_id, String first_name, String last_name, String email, int address_id, int active) {
        this.store_id = store_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.address_id = address_id;
        this.active = active;
    }

    @Override
    public String toString() {
        return "Customer{" + "customer_id=" + customer_id + "\nstore_id=" + store_id + "\nfirst_name=" + first_name + "\nlast_name=" + last_name + "\nemail=" + email + "\naddress_id=" + address_id + "\nactive=" + active + "\ncreate_date=" + create_date + "\nlast_update=" + last_update + "\n\n" + '}';
    }

    public Customer(int store_id, String first_name, String last_name, String email, int address_id, int active, Timestamp last_update){
        this.store_id = store_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.address_id = address_id;
        this.active = active;
        this.last_update = last_update;
    }
    
    public Customer(int customer_id, int store_id, String first_name, String last_name, String email, int address_id, int active, Timestamp create_date, Timestamp last_update) {
        this.customer_id = customer_id;
        this.store_id = store_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.address_id = address_id;
        this.active = active;
        this.create_date = create_date;
        this.last_update = last_update;
    }

    

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getAddress_id() {
        return address_id;
    }
    
    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }
}