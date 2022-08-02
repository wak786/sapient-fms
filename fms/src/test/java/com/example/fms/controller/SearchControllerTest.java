package com.example.fms.controller;

import com.example.fms.service.SearchService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

@ExtendWith(MockitoExtension.class)
class SearchControllerTest {

    @InjectMocks
    private SearchController controller;

    @Mock
    private SearchService service;

    @Test
    void searchFlights() {
      //  controller.searchFlights("S", "D", new Date(2022, 07, 31), false);

    }
}