package com.ventas.bill.service.Impl;

import com.ventas.bill.domain.Bill;
import com.ventas.bill.domain.Customer;
import com.ventas.bill.dto.request.BillRequest;
import com.ventas.bill.dto.request.assignment.BillEdibleRequest;
import com.ventas.bill.dto.request.update.BillUpdateRequest;
import com.ventas.bill.repository.BillRepository;
import com.ventas.bill.repository.Custom.function.Functions;
import com.ventas.bill.repository.CustomerRepository;
import com.ventas.bill.repository.SelectElementRepository;
import com.ventas.bill.service.BillService;
import com.ventas.bill.service.SelectElementService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@CrossOrigin
public class BillServiceImpl implements BillService {

    public final BillRepository billRepository;
    public final CustomerRepository customerRepository;
    public final SelectElementService selectElementService;
    public final Functions functions;

    @Override
    public List<Bill> findAll() throws Exception {
        return billRepository.findAllBill();
    }

    @Override
    public Bill save(BillRequest billRequest) throws Exception {
        Optional<Customer> customer = customerRepository.findByDni(billRequest.getPersona().getDni());

        Bill bill = billRepository.save(Bill
                .builder()
                .idCustomer(Customer.builder().id(customer.isPresent()?customer.get().getId():2).build())
                .date(billRequest.getDate())
                .quantityTotal(functions.calcQuantity(billRequest.getEdibles()))
                .state(true)
                .build());

        selectElementService.saveListEdible(bill.getId(),billRequest.getEdibles());

        return bill;
    }

    @Override
    public Bill update(BillUpdateRequest billUpdateRequest) throws Exception {
        Optional<Customer> customer = customerRepository.findByDni(billUpdateRequest.getCustomerRequest().getDni());

        /*List<BillEdibleRequest> edibleList = billUpdateRequest.getEdibleList();

        double quantity = 0;

        for (BillEdibleRequest edibles :  edibleList) {
            quantity += (double) (edibles.getUnitPrice() * edibles.getQuantity());
        }*/


        Bill bill = Bill
                .builder()
                .id(billUpdateRequest.getId())
                .idCustomer(Customer.builder().id(customer.isPresent()?customer.get().getId():2).build())
                .date(billUpdateRequest.getDate())
                .quantityTotal(functions.calcQuantity(billUpdateRequest.getEdibleList()))
                .state(true)
                .build();



        return  null;
    }

    @Override
    public Bill findById(Long id) throws Exception {
        return null;
    }

    @Override
    public Bill delete(Long id) throws Exception {
        return null;
    }
}
