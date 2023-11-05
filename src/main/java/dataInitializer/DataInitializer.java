package dataInitializer;

import model.TrainingType;
import org.springframework.beans.factory.annotation.Value;
import service.TraineeService;
import service.TrainerService;
import service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.TrainingTypeService;
import storage.Storage;

@Component
public class DataInitializer {
    @Autowired
    private Storage storage;
    @Autowired
    private TraineeService traineeService;

    @Autowired
    private TrainerService trainerService;

    @Autowired
    private TrainingService trainingService;
    @Autowired
    private TrainingTypeService trainingTypeService;

}
