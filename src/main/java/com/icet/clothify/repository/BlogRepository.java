package com.icet.clothify.repository;

import com.icet.clothify.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface BlogRepository extends JpaRepository<BlogEntity,Long> {
}