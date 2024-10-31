import java.util.Arrays;

public class Main {

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        int sum = 0;
        for(
                int i : totalWasteKgPerCapitaPerYear)
        {
            sum += i;
        }
        return sum / totalWasteKgPerCapitaPerYear.length + 1;
    }

    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        int sum = 0;
        for(
                int i : householdEstimatesKgPerCapitaPerYear)
        {
            sum += i;
        }
        return sum / householdEstimatesKgPerCapitaPerYear.length + 1;
    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        int sum = 0;
        for(
                int i : householdEstimatesTonnesPerYear)
        {
            sum += i;
        }
        return sum / householdEstimatesTonnesPerYear.length + 1;
    }

    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        int sum = 0;
        for(
                int i : retailEstimatesKgPerCapitaPerYear)
        {
            sum += i;
        }
        return sum / retailEstimatesKgPerCapitaPerYear.length + 1;
    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        int sum = 0;
        for (int i : retailEstimatesTonnesPerYear) {
            sum += i;
        }
        return sum / retailEstimatesTonnesPerYear.length;
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        int sum = 0;
        for (int i : foodServiceEstimatesKgPerCapitaPerYear) {
            sum += i;
        }
        return sum / foodServiceEstimatesKgPerCapitaPerYear.length + 1;
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        int sum = 0;
        for (int i : foodServiceEstimatesTonnesPerYear) {
            sum += i;
        }
        return sum / foodServiceEstimatesTonnesPerYear.length + 1;
    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        Arrays.sort(totalWasteKgPerCapitaPerYear);
        int middle = totalWasteKgPerCapitaPerYear.length / 2;
        if (totalWasteKgPerCapitaPerYear.length % 2 == 0) {
            return (totalWasteKgPerCapitaPerYear[middle - 1] + totalWasteKgPerCapitaPerYear[middle]) / 2;
        } else {
            return totalWasteKgPerCapitaPerYear[middle];
        }
    }

    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        Arrays.sort(householdEstimatesKgPerCapitaPerYear);
        int middle = householdEstimatesKgPerCapitaPerYear.length / 2;
        if (householdEstimatesKgPerCapitaPerYear.length % 2 == 0) {
            return (householdEstimatesKgPerCapitaPerYear[middle - 1] + householdEstimatesKgPerCapitaPerYear[middle]) / 2;
        } else {
            return householdEstimatesKgPerCapitaPerYear[middle];
        }
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        Arrays.sort(householdEstimatesTonnesPerYear);
        int middle = householdEstimatesTonnesPerYear.length / 2;
        if (householdEstimatesTonnesPerYear.length % 2 == 0) {
            return (householdEstimatesTonnesPerYear[middle - 1] + householdEstimatesTonnesPerYear[middle]) / 2;
        } else {
            return householdEstimatesTonnesPerYear[middle];
        }
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        Arrays.sort(retailEstimatesKgPerCapitaPerYear);
        int middle = retailEstimatesKgPerCapitaPerYear.length / 2;
        if (retailEstimatesKgPerCapitaPerYear.length % 2 == 0) {
            return (retailEstimatesKgPerCapitaPerYear[middle - 1] + retailEstimatesKgPerCapitaPerYear[middle]) / 2;
        } else {
            return retailEstimatesKgPerCapitaPerYear[middle];
        }
    }

    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        Arrays.sort(retailEstimatesTonnesPerYear);
        int middle = retailEstimatesTonnesPerYear.length / 2;
        if (retailEstimatesTonnesPerYear.length % 2 == 0) {
            return (retailEstimatesTonnesPerYear[middle - 1] + retailEstimatesTonnesPerYear[middle]) / 2;
        } else {
            return retailEstimatesTonnesPerYear[middle];
        }
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        Arrays.sort(foodServiceEstimatesKgPerCapitaPerYear);
        int middle = foodServiceEstimatesKgPerCapitaPerYear.length / 2;
        if (foodServiceEstimatesKgPerCapitaPerYear.length % 2 == 0) {
            return (foodServiceEstimatesKgPerCapitaPerYear[middle - 1] + foodServiceEstimatesKgPerCapitaPerYear[middle]) / 2;
        } else {
            return foodServiceEstimatesKgPerCapitaPerYear[middle];
        }
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        Arrays.sort(foodServiceEstimatesTonnesPerYear);
        int middle = foodServiceEstimatesTonnesPerYear.length / 2;
        if (foodServiceEstimatesTonnesPerYear.length % 2 == 0) {
            return (foodServiceEstimatesTonnesPerYear[middle - 1] + foodServiceEstimatesTonnesPerYear[middle]) / 2;
        } else {
            return foodServiceEstimatesTonnesPerYear[middle];
        }
    }

    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        int min = totalWasteKgPerCapitaPerYear[0];
        for (int i : totalWasteKgPerCapitaPerYear) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        int min = householdEstimatesKgPerCapitaPerYear[0];
        for (int i : householdEstimatesKgPerCapitaPerYear) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        int min = householdEstimatesTonnesPerYear[0];
        for (int i : householdEstimatesTonnesPerYear) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        int min = retailEstimatesKgPerCapitaPerYear[0];
        for (int i : retailEstimatesKgPerCapitaPerYear) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        int min = retailEstimatesTonnesPerYear[0];
        for (int i : retailEstimatesTonnesPerYear) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        int min = foodServiceEstimatesKgPerCapitaPerYear[0];
        for (int i : foodServiceEstimatesKgPerCapitaPerYear) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        int min = foodServiceEstimatesTonnesPerYear[0];
        for (int i : foodServiceEstimatesTonnesPerYear) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    /**
     * Max Methods
     */

    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        int max = totalWasteKgPerCapitaPerYear[0];
        for (int i : totalWasteKgPerCapitaPerYear) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        int max = householdEstimatesKgPerCapitaPerYear[0];
        for (int i : householdEstimatesKgPerCapitaPerYear) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        int max = householdEstimatesTonnesPerYear[0];
        for (int i : householdEstimatesTonnesPerYear) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        int max = retailEstimatesKgPerCapitaPerYear[0];
        for (int i : retailEstimatesKgPerCapitaPerYear) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        int max = retailEstimatesTonnesPerYear[0];
        for (int i : retailEstimatesTonnesPerYear) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        int max = foodServiceEstimatesKgPerCapitaPerYear[0];
        for (int i : foodServiceEstimatesKgPerCapitaPerYear) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        int max = foodServiceEstimatesTonnesPerYear[0];
        for (int i : foodServiceEstimatesTonnesPerYear) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    /**
     * Misc Methods
     */

    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear) {
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals(country)) {
                return totalWasteKgPerCapitaPerYear[i];
            }
        }
        return -1;
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear) {
        int maxIndex = 0;
        for (int i = 1; i < totalWasteKgPerCapitaPerYear.length; i++) {
            if (totalWasteKgPerCapitaPerYear[i] > totalWasteKgPerCapitaPerYear[maxIndex]) {
                maxIndex = i;
            }
        }
        return countries[maxIndex];
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty) {
        double maxPoverty = percentagesShareInPoverty[0];
        for (double poverty : percentagesShareInPoverty) {
            if (poverty > maxPoverty) {
                maxPoverty = poverty;
            }
        }
        int count = 0;
        for (double poverty : percentagesShareInPoverty) {
            if (poverty == maxPoverty) {
                count++;
            }
        }
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < percentagesShareInPoverty.length; i++) {
            if (percentagesShareInPoverty[i] == maxPoverty) {
                result[index++] = countries[i];
            }
        }
        return result;
    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences) {
        int count = 0;
        for (String confidence : confidences) {
            if (isHighConfidence(confidence)) {
                count++;
            }
        }

        String[] highConfidenceCountries = new String[count];

        int index = 0;
        for (int i = 0; i < countries.length; i++) {
            if (isHighConfidence(confidences[i])) {
                highConfidenceCountries[index++] = countries[i];
            }
        }

        return highConfidenceCountries;
    }

    private static boolean isHighConfidence(String confidence) {
        return "High Confidence".equals(confidence);
    }
}
