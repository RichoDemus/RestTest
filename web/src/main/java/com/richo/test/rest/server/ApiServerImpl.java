package com.richo.test.rest.server;

import com.richo.test.rest.Api;

public class ApiServerImpl implements Api {
  @Override
  public String getString() {
    System.out.println("getString called");
    return "Hello!";
  }
}
