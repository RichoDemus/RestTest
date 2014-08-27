package com.richo.test.rest.client;


import com.richo.test.rest.Api;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import java.util.LinkedList;
import java.util.List;

public class ApiClient {
  public static void main(String[] args) {
    ApiClient client = new ApiClient();
    System.out.println("String is " + client.getString());
  }

  public String getString() {
    final List<JacksonJsonProvider> providers = new LinkedList<JacksonJsonProvider>();
    providers.add(new JacksonJsonProvider());
    final String hostname = "localhost";
    final int port = 80;

    final Api api = JAXRSClientFactory.create("http://" + hostname + ":" + port + "/api/firstApi", Api.class, providers);

    System.out.println("Api initialized");

    return api.getString();

  }
}
