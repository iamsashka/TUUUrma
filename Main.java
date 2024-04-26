package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Иван", "Петр", "Анна"};
        String[] lastNames = {"Иванов", "Петров", "Антонова"};
        int[] ages = {25, 35, 28};
        String[] criminalHistories = {"Первичное нарушение", "Многократный правонарушитель", "Условно осужденный", "Жестокий преступник"};

        registerNewPrisoners(names, lastNames, ages, criminalHistories);

        int remainingSentence = 36;
        int daysServed = 12;
        System.out.println("Release date: " + calculateInmateReleaseDate(remainingSentence, daysServed));


        String[] updatedCriminalHistories = {"Обновление личного дела 1", "Обновление личного дела 2", "Обновление личного дела 3"};
        updatePrisonerInformation(names, null, updatedCriminalHistories);

        String[] menus = {"Суп", "Рыба", "Мясо"};
        int[] portionSizes = {200, 300, 400};
        int[] daysOfWeek = {1, 2, 3};

        manageFoodSchedule(menus, portionSizes, daysOfWeek);

        String[] names2 = {"Мария", "Сергей", "Елена"};
        String[] medicalConditions = {"Здоров", "Хронический бронхит", "Астма"};
        double[] appointmentDates = {1.0, 2.0, 3.0};

        manageMedicalServices(names2, medicalConditions, appointmentDates);

        int numberOfPrisoners = 1000;
        int prisonCapacity = 800;
        double resourceAvailability = 0.8;
        double prisonerHealthAndSafetyImpact = 0.5;
        double overcrowdingIndex = calculatePrisonOvercrowdingIndex(numberOfPrisoners, prisonCapacity, resourceAvailability, prisonerHealthAndSafetyImpact);
        System.out.println("Индекс переполненности тюрем составляет: " + overcrowdingIndex);

        double rehabilitationProbability = calculatePrisonerReProbability("Минимальный", 35, 12, true);
        System.out.println("Предполагаемая вероятность освобождения: " + rehabilitationProbability);

        double earlyReleaseProbability = calculateDosrochnogoosvobojdenia(1, 35, 12);
        System.out.println("Предполагаемая вероятность досрочного освобождения составляет: " + earlyReleaseProbability);

        double guardScheduleEfficiency = calculateGuardScheduleEfficiency(4, 8, 35, 12);
        System.out.println("Предполагаемая эффективность расписания охраны: " + guardScheduleEfficiency);
        System.out.println("Random inmate code: " + generateRandomInmateCode());
        searchPrisonerLocation("Имя заключенного");
        checkVisitorPermissions("Имя посетителя", true);
        String[] guardNames = {"Охраник1", "Охраник2", "Охраник3"};
        String[] areas = {"Область1", "Область2", "Область3"};

        Random random = new Random();
        assignGuardToArea(guardNames[random.nextInt(guardNames.length)], areas[random.nextInt(areas.length)]);
    }

    // New functions
    public static void updatePrisonerInformation(String[] names, Integer[] prisonerNumbers, String[] updatedCriminalHistories) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Обновление информации о заключенном:");
            System.out.println("Имя: " + names[i]);
            System.out.println("№ заключенного: " + (prisonerNumbers != null ? prisonerNumbers[i] : "Не указан" ));
            System.out.println("Обновленная уголовная история: " + updatedCriminalHistories[i]);
            System.out.println("-----------------------------------");
        }
    }

    public static String generateRandomInmateCode() {
        Random random = new Random();int randomNum = random.nextInt(1000);
        return "AB" + randomNum; // Пример формата кода заключенного
    }

    public static boolean checkVisitorPermissions(String visitorName, boolean hasVisitorPass) {
        if (hasVisitorPass) {
            System.out.println(visitorName + " имеет разрешение на посещение.");
            return true;
        } else {
            System.out.println(visitorName + " не имеет соответствующего разрешения.");
            return false;
        }
    }

    public static String calculateInmateReleaseDate(int remainingSentence, int daysServed) {
        int yearsLeft = remainingSentence - daysServed;
        int releaseYear = (new Date().getYear() + 1900) + (yearsLeft / 365);
        int releaseMonth = (new Date().getMonth() + 1) + (yearsLeft % 365) / 30;
        int releaseDay = (new Date().getDate() + 1) + ((yearsLeft % 365) % 30);

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(new Date(releaseYear - 1900, releaseMonth - 1, releaseDay));
    }

    public void searchPrisonerLocation(String inmateName) {
        // Логика поиска местоположения заключенного
        System.out.println("Местоположение заключенного " + inmateName + ": Блок X, камера Y.");
    }

    public void assignGuardToArea(String guardName, String area) {
        // Логика назначения охранника на определенную зону
        System.out.println("Охранник " + guardName + " назначен на зону: " + area);
    }

    public static void registerNewPrisoners(String[] names, String[] lastNames, int[] ages, String[] criminalHistories) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Новый заключенный:");
            System.out.println("Имя: " + names[i]);
            System.out.println("Фамилия: " + lastNames[i]);
            System.out.println("Возраст: " + ages[i]);
            System.out.println("Уровень уголовной истории: " + criminalHistories[i]);
            System.out.println("-----------------------------------");
        }
    }

    public static void manageFoodSchedule(String[] menus, int[] portionSizes, int[] daysOfWeek) {
        Random random = new Random();
        System.out.println("Расписание питания:");
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println("День недели: " + daysOfWeek[i]);
            System.out.println("Меню: " + menus[random.nextInt(menus.length)]);
            System.out.println("Размер порции: " + portionSizes[random.nextInt(portionSizes.length)]);
            System.out.println("-----------------------------------");
        }
    }

    public static void manageMedicalServices(String[] names, String[] medicalConditions, double[] appointmentDates) {
        System.out.println("Медицинские услуги:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя: " + names[i]);
            System.out.println("Медицинское состояние: " + medicalConditions[i]);
            System.out.println("Дата последнего осмотра: " + appointmentDates[i]);
            System.out.println("-----------------------------------");
        }
    }

    public static double calculatePrisonOvercrowdingIndex(int numberOfPrisoners, int prisonCapacity, double resourceAvailability, double prisonerHealthAndSafetyImpact) {
        double prisonersToCapacityWeight = 0.6;
        double resourceAvailabilityWeight = 0.2;
        double prisonerHealthAndSafetyImpactWeight = 0.2;

        double prisonersToCapacityScore = (numberOfPrisoners / (double) prisonCapacity) - 1.0;
        double resourceAvailabilityScore = (resourceAvailability >= 0.8) ? 1.0 : 0.5;
        double prisonerHealthAndSafetyImpactScore = (prisonerHealthAndSafetyImpact <= 0.5) ? 1.0 : 0.5;

        double overcrowdingIndex = (prisonersToCapacityWeight * prisonersToCapacityScore)
                + (resourceAvailabilityWeight * resourceAvailabilityScore)
                + (prisonerHealthAndSafetyImpactWeight * prisonerHealthAndSafetyImpactScore);
        return overcrowdingIndex;
    }

    public static double calculatePrisonerReProbability(String criminalHistory, int age, int educationLevel, boolean participationInRehabPrograms) {
        double criminalHistoryWeight = 0.3;
        double ageWeight = 0.2;
        double educationLevelWeight = 0.3;
        double rehabProgramsWeight = 0.2;

        double criminalHistoryScore = (criminalHistory.equals("Минимальный")) ? 1.0 : 0.5;
        double ageScore = (age >= 30) ? 1.0 : 0.5;
        double educationLevelScore = (educationLevel >= 12) ? 1.0 : 0.5;
        double participationInRehabProgramsScore = (participationInRehabPrograms) ? 1.0 : 0.5;

        double rehabilitationProbability = (criminalHistoryWeight * criminalHistoryScore)
                + (ageWeight * ageScore)
                + (educationLevelWeight * educationLevelScore)
                + (rehabProgramsWeight * participationInRehabProgramsScore);
        return rehabilitationProbability;
    }

    // Added functions
    public static double calculateDosrochnogoosvobojdenia(int remainingSentence, int Otbitoevremia, double Progressrehabilitation) {
        double sentenceCompletionWeight = 0.6;
        double OtbitoevremiaWeight = 0.2;
        double ProgressrehabilitationWeight = 0.2;

        double sentenceCompletionScore = (Otbitoevremia / (double) remainingSentence) - 1.0;
        double OtbitoevremiaScore = (Otbitoevremia >= remainingSentence / 2) ? 1.0 : 0.5;
        double rehabilitationProgressScore = (Progressrehabilitation >= 0.8) ? 1.0 : 0.5;

        double earlyReleaseProbability = (sentenceCompletionWeight * sentenceCompletionScore)
                + (OtbitoevremiaWeight * OtbitoevremiaScore)
                + (ProgressrehabilitationWeight * rehabilitationProgressScore);
        return earlyReleaseProbability;
    }

    public static double calculateGuardScheduleEfficiency(int numberOfGuards, int prisonCapacity, double guardTrainingCompletionRate, double guardSickDays) {
        double guardToPrisonerRatioWeight = 0.4;
        double guardTrainingCompletionRateWeight = 0.3;
        double guardSickDaysWeight = 0.3;

        double guardToPrisonerRatioScore = (numberOfGuards / (double) prisonCapacity) - 1.0;
        double guardTrainingCompletionRateScore = (guardTrainingCompletionRate >= 0.8) ? 1.0 : 0.5;
        double guardSickDaysScore = (guardSickDays <= 0.05) ? 1.0 : 0.5;

        double guardScheduleEfficiency = (guardToPrisonerRatioWeight * guardToPrisonerRatioScore)
                + (guardTrainingCompletionRateWeight * guardTrainingCompletionRateScore)
                + (guardSickDaysWeight * guardSickDaysScore);
        return guardScheduleEfficiency;
    }

}
