package com.example.spacecalculateservice.ValueObjects;

public class TruckDetailsVO {

    private int truck_id;
    private String model_name;
    private String company_name;
    private int dim_length;
    private int dim_breadth;
    private int dim_width;

    public int getTruck_id() { return truck_id; }

    public void setTruck_id(int truck_id) { this.truck_id = truck_id; }

    public String getModel_name() { return model_name; }

    public void setModel_name(String model_name) { this.model_name = model_name; }

    public String getCompany_name() { return company_name; }

    public void setCompany_name(String company_name) { this.company_name = company_name; }

    public int getDim_length() { return dim_length; }

    public void setDim_length(int dim_length) { this.dim_length = dim_length; }

    public int getDim_breadth() { return dim_breadth; }

    public void setDim_breadth(int dim_breadth) { this.dim_breadth = dim_breadth; }

    public int getDim_width() { return dim_width; }

    public void setDim_width(int dim_width) { this.dim_width = dim_width; }

    public TruckDetailsVO(int truck_id, String model_name, String company_name, int dim_length, int dim_breadth,
                          int dim_width) {
        super();
        this.truck_id = truck_id;
        this.model_name = model_name;
        this.company_name = company_name;
        this.dim_length = dim_length;
        this.dim_breadth = dim_breadth;
        this.dim_width = dim_width;
    }

    public TruckDetailsVO(){ }
}
