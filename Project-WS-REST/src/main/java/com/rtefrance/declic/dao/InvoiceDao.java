package com.rtefrance.declic.dao;

import com.rtefrance.declic.model.Invoice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vagrant on 16/12/16.
 */
public class InvoiceDao {

    public List<Invoice> createInvoices() {
        List<Invoice> invoices = new ArrayList<Invoice>();
        invoices.add(new Invoice(1, "Facture 1"));
        invoices.add(new Invoice(2, "Facture2"));
        invoices.add(new Invoice(3, "Facture3"));
        invoices.add(new Invoice(4, "Facture4"));
        return invoices;
    }

}
