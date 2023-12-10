package com.example.part1.controller;

import com.example.part1.domain.Book;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.part1.util.BookToJsonMapper;

@Service
@RequiredArgsConstructor
public class BookController {

    private final BookToJsonMapper mapper;
    private int counter = 3;

    @Scheduled(cron = "2 * * * * *")
    public void sendBook() {
        System.out.println("Start creating and sending book");
        RestTemplate template = new RestTemplate();
        Book bookToSend = new Book();
        bookToSend.setAuthor("Author");
        bookToSend.setTitle("Title" + counter);
        counter = counter + 1;
        ResponseEntity<String> response = template.postForEntity("http://localhost:9090/book", bookToSend, String.class);
    }
}
