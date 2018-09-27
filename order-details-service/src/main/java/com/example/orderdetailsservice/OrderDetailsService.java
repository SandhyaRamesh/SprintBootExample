package com.example.orderdetailsservice;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.String;

@Service
public class OrderDetailsService {
    private static final int ORDER_ID = 0;
    private static final int PRODUCT_ID = 1;
    private static final int QUANTITY = 2;
    private static final int DESC = 3;
    private static final int LENGTH = 4;
    private static final int BREADTH = 5;
    private static final int HEIGHT = 6;

    public List<OrderDetails> readFromCSV()
        {
                    BufferedReader fileReader = null;
                    List<OrderDetails> orderDetails = new ArrayList<OrderDetails>();
                    String FILENAME = "D:\\SprintBootExample/OrderDetails.csv";
            try {
                    String line = "";
                    fileReader = new BufferedReader(new FileReader(FILENAME));
                    // Read CSV header
                    fileReader.readLine();
                    // Read order data line by line
                    while ((line = fileReader.readLine()) != null) {
                    String[] tokens = line.split(";");
                    if (tokens.length > 0) {
                        OrderDetails orderDetail = new OrderDetails(
                                    tokens[ORDER_ID],
                                    tokens[PRODUCT_ID],
                                    tokens[QUANTITY],
                                    tokens[DESC],
                                    Integer.parseInt(tokens[LENGTH]),
                                    Integer.parseInt(tokens[BREADTH]),
                                    Integer.parseInt(tokens[HEIGHT]) );
                            orderDetails.add(orderDetail);
                    }

                }
                return orderDetails;


            } catch (Exception e) {
                System.out.println("Reading CSV Error!");
                e.printStackTrace();
            } finally {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("Closing fileReader Error!");
                    e.printStackTrace();
                }
            }
            return orderDetails;
    }
    public List<OrderDetails> getAllOrderDetails() throws IOException
    {
            List<OrderDetails> results = readFromCSV();
            return results;
    }

    public List<OrderDetails> getOrderDetailsById(String id) throws IOException
    {
        List<OrderDetails> AllOrderDetails = getAllOrderDetails();
        Iterator<OrderDetails> iterator = AllOrderDetails.iterator();
        List<OrderDetails> orderDetails = new ArrayList<OrderDetails>();
        OrderDetails currentOrder = null;
        while (iterator.hasNext()) {
            currentOrder = iterator.next();
            if (id.equals(currentOrder.getOrderId())) {
                orderDetails.add(currentOrder);
            }
        }
        return orderDetails;
    }
}
