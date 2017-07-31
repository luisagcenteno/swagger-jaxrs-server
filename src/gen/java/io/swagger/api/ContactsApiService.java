package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.InlineResponse200;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-07-31T18:11:15.082Z")
public abstract class ContactsApiService {
    public abstract Response contactsGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response contactsGetById(Integer id,SecurityContext securityContext) throws NotFoundException;
}
