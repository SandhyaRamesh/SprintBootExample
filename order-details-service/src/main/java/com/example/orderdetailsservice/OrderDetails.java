package com.example.orderdetailsservice;

public class OrderDetails {

    private String orderId;
    private String productId;
    private String quantity;
    private String productDesc;

    public  OrderDetails()
    {

    }
    public OrderDetails(String OrderId, String ProductId, String Quantity, String ProductDesc)
    {
        super();
        this.orderId = OrderId;
        this.productId = ProductId;
        this.quantity = Quantity;
        this.productDesc = ProductDesc;
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
}
