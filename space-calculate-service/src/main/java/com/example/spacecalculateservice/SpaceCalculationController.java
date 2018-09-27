package com.example.spacecalculateservice;

import com.example.spacecalculateservice.ValueObjects.OrderDetailsVO;
import com.example.spacecalculateservice.ValueObjects.TruckDetailsVO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.*;

@RestController
public class SpaceCalculationController {

    private RestTemplate restTemplate = new RestTemplate();
    private final String orderDetailsURI = "http://localhost:8080/order-details-service/orderById/{id}";
    private final String truckDetailsURI = "http://localhost:8080/database-service/truck/{id}";

    private float fetchDataAndCompute( String salesOrderId, String truckId ){
        ArrayList<OrderDetailsVO> orderDetails = getOrderDetails( salesOrderId );
        TruckDetailsVO truckDetails = getTruckDetails( truckId );
        return compute( orderDetails, truckDetails );
    }

    private ArrayList<OrderDetailsVO> getOrderDetails( String salesOrderId ){
        ArrayList<OrderDetailsVO> result = new ArrayList<OrderDetailsVO>();
        Map<String, String> params = new HashMap<String, String>();
        params.put("id", salesOrderId);
        OrderDetailsVO[] orderDetailsArray = restTemplate.getForObject(orderDetailsURI, OrderDetailsVO[].class, params);
        for( OrderDetailsVO orderDetail : orderDetailsArray )
            result.add(orderDetail);
        return  result;
    }

    private TruckDetailsVO getTruckDetails( String truckId ){
        Map<String, String> params = new HashMap<String, String>();
        params.put("id", truckId );
        return  restTemplate.getForObject(truckDetailsURI, TruckDetailsVO.class, params);
    }

    private float compute(ArrayList<OrderDetailsVO> orderDetails, TruckDetailsVO truckDetails ){
        float volumeOfItems = 0;
        OrderDetailsVO orderDetail;
        Iterator<OrderDetailsVO> iterator = orderDetails.iterator();
        while ( iterator.hasNext())
        {
            orderDetail = iterator.next();
            volumeOfItems += orderDetail.getBreadth() * orderDetail.getHeight() * orderDetail.getLength() * Integer.parseInt(orderDetail.getQuantity());
        }
        return ( volumeOfItems / ( truckDetails.getDim_breadth() * truckDetails.getDim_length() * truckDetails.getDim_width()) ) * 100;

    }

    @CrossOrigin
    @RequestMapping( value = "/computeSpace/{salesOrderId}/{truckID}", method = RequestMethod.GET )
     public float computeSpaceEntryPoint(@PathVariable String salesOrderId, @PathVariable String truckID) throws IOException {
        return fetchDataAndCompute( salesOrderId, truckID );
    }
}
