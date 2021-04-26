package com.example.trello_project_alcohol.service.mediaFileService;

import com.example.trello_project_alcohol.model.MediaFile;
import com.example.trello_project_alcohol.service.IService;

import java.util.List;

public interface IMediaFileService extends IService<MediaFile> {
    List<MediaFile> findMediaFileByCard(Long card_id);
}
