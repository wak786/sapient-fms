package com.example.fms.controller;

import com.example.fms.dto.SearchResult;
import com.example.fms.service.SearchService;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SearchController {

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/search")
    public SearchResult searchFlights(@RequestParam String source
            , @RequestParam String destination
            , @RequestParam @JsonFormat(pattern = "yyyy-MM-dd") String departureDate,
                                      @RequestParam(required = false) @JsonFormat(pattern = "yyyy-MM-dd") String returnDate) {
        return searchService.searchFlights(source, destination, departureDate, returnDate);
    }
}
