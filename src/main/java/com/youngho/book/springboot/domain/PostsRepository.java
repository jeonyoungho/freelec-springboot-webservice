package com.youngho.book.springboot.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jyh1004 on 2024-09-30
 */

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
