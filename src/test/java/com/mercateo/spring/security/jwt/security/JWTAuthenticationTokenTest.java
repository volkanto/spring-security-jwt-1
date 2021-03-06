package com.mercateo.spring.security.jwt.security;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class JWTAuthenticationTokenTest {

    private JWTAuthenticationToken uut;

    @Before
    public void setUp() throws Exception {
        uut = new JWTAuthenticationToken("<token>");
    }

    @Test
    public void shouldContainToken() throws Exception {
        assertThat(uut.getToken()).isEqualTo("<token>");
    }
}