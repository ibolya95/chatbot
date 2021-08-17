package com.packagechallenge;
import java.lang.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Process {

    private static Random random = new Random();

    private String[] list = {"Mi van tesó?", "Nemmondod dude? :O",
            "De jó neked!", "Értem", "Te vagy a legjobb!", "Nahát!",
            "Nagyon király", "De cuki!"};

    private List<String> history = new ArrayList<>();

    public List<String> getHistory() {
        return history;
    }

    public String getFormattedDate () {
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDate = currentDate.format(myFormatObj);
        return formattedDate;
    }

        private String getBotAnswer () {
            int range = 3000 - 1000 + 1000;
            long randomSec = random.nextInt(range);

            try {
                Thread.sleep(randomSec);
            } catch (Exception e) {
                System.out.println(e);
            }
            return list[random.nextInt(list.length)];
        }

        public String addHistoryUser(String userInput) {
            String result = "Én: [" + getFormattedDate() + "]: " + userInput;
            history.add(result);
            return result;
        }

        public String addHistoryBot() {
            String resultBot = "Bot: [" + getFormattedDate() + "]: " + getBotAnswer();
            history.add(resultBot);
            return resultBot;
        }
}
