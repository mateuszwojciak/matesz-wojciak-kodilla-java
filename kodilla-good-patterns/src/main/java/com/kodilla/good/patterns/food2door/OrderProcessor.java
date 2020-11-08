package com.kodilla.good.patterns.food2door;

public class OrderProcessor {
    private OrderRepository orderRepository;

    public OrderProcessor(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderRequest startProcess(ContractorInterface contractorInterface) {
        boolean isOrdered = contractorInterface.process();

        if(isOrdered) {
            orderRepository.createOrder(contractorInterface.getClass().getSimpleName(),
                    contractorInterface.getProduct(), contractorInterface.getQuantity());
            return new OrderRequest(contractorInterface.getProduct(),
                    contractorInterface.getQuantity(), true);
        } else {
            return new OrderRequest(contractorInterface.getProduct(),
                    contractorInterface.getQuantity(), false);
        }
    }

}
