package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[] args) {
        ContractorName contractorName = new ContractorName();
        ContractorInterface contractorInterface = contractorName.chooseContractor("Wege tort",12);

        OrderProcessor orderProcessor =  new OrderProcessor(new OrderRepository());
        orderProcessor.startProcess(contractorInterface);
    }
}
