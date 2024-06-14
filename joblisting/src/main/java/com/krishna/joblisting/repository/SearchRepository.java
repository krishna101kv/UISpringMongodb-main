package com.krishna.joblisting.repository;

import com.krishna.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

   List<Post> findByText(String text);
}
