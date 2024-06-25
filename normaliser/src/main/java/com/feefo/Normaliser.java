package com.feefo;

import org.apache.commons.text.similarity.LevenshteinDistance;

public class Normaliser extends JobTitle {

    LevenshteinDistance levenshtein = new LevenshteinDistance();

    @Override
    public String normalise(String input) {
        if (input != null && !input.trim().isEmpty()) {
            String match = findClosestMatch(input.trim());
            return getJobs().getOrDefault(match, input);
        }
        return null;
    }

    private String findClosestMatch(String input) {

        String closestMatch = null;
        int shortestDistance = Integer.MAX_VALUE;

        for (String k : getJobs().keySet()) {
            int distance = levenshtein.apply(input, k);
            if (distance < shortestDistance) {
                shortestDistance = distance;
                closestMatch = k;
            }
        }

        return closestMatch;

    }

}
