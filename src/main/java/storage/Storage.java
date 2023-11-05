package storage;

import model.Trainee;
import model.Trainer;
import model.Training;
import model.TrainingType;
import org.springframework.beans.factory.annotation.Value;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Storage {
    private Map<Long, Trainee> traineeMap= new HashMap<>();
    private Map<Long, Trainer> trainerMap = new HashMap<>();
    private Map<Long, Training> trainingMap = new HashMap<>();

    @Value("${data.path}")
    private String dataPath;

    public void init() {
        Properties properties = new Properties();

        try (InputStream inputStream = new FileInputStream(dataPath)) {
            properties.load(inputStream);
        } catch (IOException e) {
            // Обработка ошибки, например, запись в журнал
        }

        loadTrainees(properties);
        loadTrainers(properties);
        loadTrainingTypes(properties);
    }

    private void loadTrainees(Properties properties) {
        int traineeIndex = 0;
        while (properties.containsKey("trainees[" + traineeIndex + "].id")) {
            Long traineeId = Long.parseLong(properties.getProperty("trainees[" + traineeIndex + "].id"));
            String traineeDate = properties.getProperty("trainees[" + traineeIndex + "].date");
            String traineeAddress = properties.getProperty("trainees[" + traineeIndex + "].Address");

            Trainee trainee = new Trainee(traineeId, traineeDate, traineeAddress);
            trainees.put(traineeId, trainee);

            traineeIndex++;
        }
    }

    private void loadTrainers(Properties properties) {
        int trainerIndex = 0;
        while (properties.containsKey("trainers[" + trainerIndex + "].id")) {
            Long trainerId = Long.parseLong(properties.getProperty("trainers[" + trainerIndex + "].id"));
            Long specializationId = Long.parseLong(properties.getProperty("trainers[" + trainerIndex + "].specialization"));

            Trainer trainer = new Trainer(trainerId, specializationId);
            trainers.put(trainerId, trainer);

            trainerIndex++;
        }
    }

    private void loadTrainingTypes(Properties properties) {
        int typeIndex = 0;
        while (properties.containsKey("trainingTypes[" + typeIndex + "].id")) {
            Long typeId = Long.parseLong(properties.getProperty("trainingTypes[" + typeIndex + "].id"));
            String typeName = properties.getProperty("trainingTypes[" + typeIndex + "].name");

            TrainingType type = new TrainingType(typeId, typeName);
            trainingTypes.put(typeId, type);

            typeIndex++;
        }
    }
    public Map<Long, Trainee> getTrainees() {
        return trainees;
    }

    public Map<Long, Trainer> getTrainers() {
        return trainers;
    }

    public Map<Long, TrainingType> getTrainingTypes() {
        return trainingTypes;
    }
}
