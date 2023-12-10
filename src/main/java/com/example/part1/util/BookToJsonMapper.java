package com.example.part1.util;

import com.example.part1.domain.Book;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class BookToJsonMapper {


    public JSONObject map(Book book) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("author", book.getAuthor());
        jsonObject.put("title", book.getTitle());
        return jsonObject;
    }
}
