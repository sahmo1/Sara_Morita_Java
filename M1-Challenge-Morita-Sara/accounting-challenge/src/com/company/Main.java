package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static List<String[]> customerData = Arrays.asList(
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"},
            new String[] {"2","Daily Planet","-7500","01-10-2022"},
            new String[] {"1","Wayne Enterprises","18000","12-22-2021"},
            new String[] {"3","Ace Chemical","-48000","01-10-2022"},
            new String[] {"3","Ace Chemical","-95000","12-15-2021"},
            new String[] {"1","Wayne Enterprises","175000","01-01-2022"},
            new String[] {"1","Wayne Enterprises","-35000","12-09-2021"},
            new String[] {"1","Wayne Enterprises","-64000","01-17-2022"},
            new String[] {"3","Ace Chemical","70000","12-29-2022"},
            new String[] {"2","Daily Planet","56000","12-13-2022"},
            new String[] {"2","Daily Planet","-33000","01-07-2022"},
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"},
            new String[] {"2","Daily Planet","33000","01-17-2022"},
            new String[] {"3","Ace Chemical","140000","01-25-2022"},
            new String[] {"2","Daily Planet","5000","12-12-2022"},
            new String[] {"3","Ace Chemical","-82000","01-03-2022"},
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"}
    );
    public static void main(String[] args) {

        // Create a new List<Customer> and add the first customer to it.
        List<Customer> customers = new ArrayList<>();

        // Iterate through the rest of the customer data and add each customer to the List<Customer> if it doesn't
        // already exist.

        for (int i = 0; i < customerData.size(); i++) {
            boolean exists = false;
            for (Customer customer : customers) {
                if (customer.getId() == Integer.parseInt(customerData.get(i)[0])) {
                    exists = true;

                    String chargeDate = customerData.get(i)[3];
                    Integer chargeAmount = Integer.parseInt(customerData.get(i)[2]);
                    Integer chargeSize = customer.getCharges().size();

                    // Add additional charges and chargesdates
                    customer.getCharges().add(new AccountRecord());
                    customer.getCharges().get(chargeSize).setChargeDate(chargeDate);
                    customer.getCharges().get(chargeSize).setCharge(chargeAmount);

                }
            }
            if (!exists) {
                customers.add(new Customer());
                // Get current customers position in the list
                int customerPosition = customers.size() - 1;

                // Add the id and name to the customer.
                customers.get(customerPosition).setId(Integer.parseInt(customerData.get(i)[0]));
                customers.get(customerPosition).setName(customerData.get(i)[1]);
                // Add the charge to the customer's account.
                String chargeDate = customerData.get(i)[3];
                Integer chargeAmount = Integer.parseInt(customerData.get(i)[2]);

                // Set the charge amount and charge date.
                customers.get(customerPosition).getCharges().add(new AccountRecord());


                // Set the charge amount and charge date.
                customers.get(customerPosition).getCharges().get(0).setCharge(chargeAmount);
                customers.get(customerPosition).getCharges().get(0).setChargeDate(chargeDate);

            }
        }

        System.out.println("Positive accounts:");
        for (Customer customer : customers) {
            if (customer.getBalance() > 0) {
                System.out.println(customer.getName() + ": " + customer.getBalance());
            }
        }

        System.out.println("Negative accounts:");
        for (Customer customer : customers) {
            if (customer.getBalance() < 0) {
                System.out.println(customer.getName() + ": " + customer.getBalance());
            }
        }
    }
}
