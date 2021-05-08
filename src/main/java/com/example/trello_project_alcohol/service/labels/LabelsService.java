package com.example.trello_project_alcohol.service.labels;

import com.example.trello_project_alcohol.model.Card_Labels;
import com.example.trello_project_alcohol.model.Labels;
import com.example.trello_project_alcohol.repo.Card_labels_repo;
import com.example.trello_project_alcohol.repo.LabelsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LabelsService implements ILabelsService{
    @Autowired
    private LabelsRepo labelsRepo;
    @Autowired
    private Card_labels_repo card_labels_repo;

    @Override
    public List<Labels> findAll() {
        return (List<Labels>) labelsRepo.findAll();
    }

    @Override
    public Labels findById(Long id) {
        return labelsRepo.findById(id).get();
    }

    @Override
    public Labels save(Labels labels) {
        return labelsRepo.save(labels);
    }

    @Override
    public void delete(Long id) {
        labelsRepo.deleteById(id);
    }

    @Override
    public List<Labels> findListLabelsByCardId(Long card_id) {
        return labelsRepo.findListLabelsByCardId(card_id);
    }

    @Override
    public List<Labels> findListSelected(Long card_id) {
        List<Labels> labelsList = new ArrayList<>();
        List<Labels> allLabels = this.findAll();
        List<Labels> cardLabels = this.findListLabelsByCardId(card_id);
        for (Labels l:allLabels) {
           if (!checkListContainItem(l,cardLabels)) labelsList.add(l);
        }
        return labelsList;
    }
    public boolean checkListContainItem(Labels labels, List<Labels> labelsList){
        for (Labels l: labelsList) {
           if (l.getId()==labels.getId()) return true;
        }
        return false;
    }

    @Override
    public void addNewLabelToCard(Card_Labels card_labels) {
        card_labels_repo.save(card_labels);
    }

    @Override
    public List<Labels> showAllLabel() {
        return labelsRepo.findAll();
    }
}
