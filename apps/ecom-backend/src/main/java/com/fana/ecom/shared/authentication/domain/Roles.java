package com.fana.ecom.shared.authentication.domain;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Stream;

import org.springframework.util.Assert;

public record Roles(Set<Role> roles) {
    public static final Roles EMPTY = new Roles(null);

  public Roles(Set<Role> roles) {
    this.roles = Collections.unmodifiableSet(roles);
  }

  public boolean hasRole() {
    return !roles.isEmpty();
  }

  public boolean hasRole(String role) {
    Assert.notNull("role", role);

    return roles.contains(role);
  }

  public Stream<Role> stream() {
    return get().stream();
  }

  public Set<Role> get() {
    return roles();
  }
}
