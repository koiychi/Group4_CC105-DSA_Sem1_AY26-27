class ArrayTraversalExample2_Tiongson {
    public static void main(String[] args) {
        double scores[] = {85.5, 90, 78.5, 88, 92.5},
            total = 0;
        for (double score : scores) {
            total += score;
        }
        double average = total / scores.length;
        System.out.println("Scores of the class:");
        for (double score : scores) {
            System.out.println(score);
        }
        System.out.println("\nTotal score: " + total);
        System.out.println("Average score: " + average);
    }
}