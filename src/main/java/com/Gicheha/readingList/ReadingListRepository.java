package com.Gicheha.readingList;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingListRepository extends JpaRepository {
    List<Book> findByReader(String reader);
}
