class MaxSumOfSquares {
    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; // Пример последовательности
        int result = maxSumOfSquares(sequence);
        System.out.println("Максимальная сумма квадратов: " + result);
    }
    public static int maxSumOfSquares(int[] sequence) {
        int n = sequence.length;
        int maxSum = 0;

        // Массив для хранения квадратов
        int[] squares = new int[n];
        for (int i = 0; i < n; i++) {
            squares[i] = sequence[i] * sequence[i];
        }

        // Поиск максимальной суммы квадратов
        for (int i = 0; i < n; i++) {
            for (int j = i + 10; j < n; j++) { // Индекс j должен быть на расстоянии >= 10 от i
                int currentSum = squares[i] + squares[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
}
