package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.MediaFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaFile_repo extends JpaRepository<MediaFile,Long> {
    List<MediaFile> findMediaFileByCard_Id(Long card_id);
}
