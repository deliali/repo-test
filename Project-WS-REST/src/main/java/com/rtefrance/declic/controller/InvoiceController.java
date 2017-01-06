package com.rtefrance.declic.controller;

import com.rtefrance.declic.dao.InvoiceDao;
import com.rtefrance.declic.model.Invoice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value="invoices", description="Operations invoice")
@RequestMapping(value = "/invoices/ideas")
public class InvoiceController {

    @Autowired
    private InvoiceDao dao;

    @RequestMapping(method=RequestMethod.GET)
    @ApiOperation(value = "Method to get the all invoices",
    authorizations = {@Authorization(value = "ap", scopes = {})})
    public List<Invoice> getInvoicess() {
        List<Invoice> invoices = dao.createInvoices();
        return invoices;
    }
    

    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    @ApiOperation(value = "Method to find the invoice by his id")
    public Invoice getInvoiceByID(@ApiParam(name = "id", value = "The id of the invoice to be returned", required = true) @PathVariable("id") long id) {
        List<Invoice> invoices = dao.createInvoices();
        for (Invoice invoice : invoices) {
            if (invoice.getId() == id) {
                return invoice;
            }

        }
        return null;
    }
 
}

