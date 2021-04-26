package com.example.trello_project_alcohol.service.mediaFileService;

import com.example.trello_project_alcohol.model.MediaFile;
import com.example.trello_project_alcohol.repo.MediaFile_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaFileService implements IMediaFileService{
    @Autowired
    private MediaFile_repo mediaFile_repo;
    @Override
    public List<MediaFile> findAll() {
        return (List<MediaFile>) mediaFile_repo.findAll();
    }

    @Override
    public MediaFile findById(Long id) {
        return mediaFile_repo.findById(id).get();
    }

    @Override
    public MediaFile save(MediaFile mediaFile) {
        return mediaFile_repo.save(mediaFile);
    }

    @Override
    public void delete(Long id) {
        mediaFile_repo.deleteById(id);
    }

    @Override
    public List<MediaFile> findMediaFileByCard(Long card_id) {
        return mediaFile_repo.findMediaFileByCard_Id(card_id);
    }
}
