package org.example.adapters;

import org.example.abstracts.CustomerCheckService;
import org.example.entities.Customer;
import org.example.mernis.AKSKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        AKSKPSPublicSoap client = new AKSKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
    }
}
