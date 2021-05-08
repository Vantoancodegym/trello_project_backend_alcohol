package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Labels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LabelsRepo extends JpaRepository<Labels,Long> {
    @Query(value = "select * from labels join card_labels on labels.id = card_labels.labels_id where card_labels.card_id = ? ", nativeQuery = true)
    List<Labels> findListLabelsByCardId(Long card_id);
}
