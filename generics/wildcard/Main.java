package generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SwiftPayment> swiftsPaymentList = new ArrayList<>();
        swiftsPaymentList.add(new SwiftPayment(1, 1000));
        swiftsPaymentList.add(new SwiftPayment(2, 2000));

        List<AzipsPayment> azipsPaymentList = new ArrayList<>();
        azipsPaymentList.add(new AzipsPayment(1, 500));
        azipsPaymentList.add(new AzipsPayment(2, 1500));

        Payment payment = new Payment();
        int overallSwiftPayment = payment.overallSum(swiftsPaymentList);
        int overallAzipsPayment = payment.overallSum(azipsPaymentList);
        System.out.println("Overall swift payment =" + overallSwiftPayment);
        System.out.println("Overall azips payment =" + overallAzipsPayment);
    }
}
