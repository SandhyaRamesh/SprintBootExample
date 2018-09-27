package com.example.spacecalculateservice.ValueObjects;

public class OrderDetailsVO {
    private String orderId;
    private String productId;
    private String quantity;
    private String productDesc;
    private int length;
    private int breadth;
    private int height;

    public  OrderDetailsVO()
    {

    }
    public OrderDetailsVO(String OrderId, String ProductId, String Quantity, String ProductDesc, int Length, int Breadth, int Height)
    {
        super();
        this.orderId = OrderId;
        this.productId = ProductId;
        this.quantity = Quantity;
        this.productDesc = ProductDesc;
        this.length = Length;
        this.breadth = Breadth;
        this.height = Height;
    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public int getLength() { return length; }

    public void setLength(int Length) { this.length = Length; }

    public int getBreadth() { return breadth; }

    public void setBreadth(int Breadth) { this.breadth = Breadth; }

    public int getHeight() { return height; }

    public void setHeight(int Height) { this.height = Height; }
}
