package io.swagger.api.factories;

import io.swagger.api.ContactsApiService;
import io.swagger.api.impl.ContactsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-07-31T18:11:15.082Z")
public class ContactsApiServiceFactory {
    private final static ContactsApiService service = new ContactsApiServiceImpl();

    public static ContactsApiService getContactsApi() {
        return service;
    }
}
