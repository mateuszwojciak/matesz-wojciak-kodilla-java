package com.kodilla.good.patterns.challenges.allegro;

public class Main {
    public static void main(String[] args) {
        SampleOrderDetails sampleOrderDetails = new SampleOrderDetails();
        OrderRequest orderRequest = sampleOrderDetails.request();

        OrderProcessor orderProcessor = new OrderProcessor(new ProductInfoService(),
                new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
