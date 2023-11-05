package model;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

@Component

public class Training {
    private Long id;
    private Trainee trainee;

    private Trainer trainer;
    private TrainingType trainingType;
    private Date date;
    private Duration duration;

    public Training(Long id, Trainee trainee, Trainer trainer, TrainingType trainingType, Date date, Duration duration) {
        this.id = id;
        this.trainee = trainee;
        this.trainer = trainer;
        this.trainingType = trainingType;
        this.date = date;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Trainee getTrainee() {
        return trainee;
    }

    public void setTrainee(Trainee trainee) {
        this.trainee = trainee;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public TrainingType getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(TrainingType trainingType) {
        this.trainingType = trainingType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}