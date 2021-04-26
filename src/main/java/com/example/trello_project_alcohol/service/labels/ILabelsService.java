package com.example.trello_project_alcohol.service.labels;

import com.example.trello_project_alcohol.model.Labels;
import com.example.trello_project_alcohol.service.IService;

import java.util.List;

public interface ILabelsService extends IService<Labels> {
    List<Labels> findListLabelsByCardId(Long card_id);
    List<Labels> findListSelected(Long card_id);

}