package ru.netology.unit;
public class CashBackHackerService {

        private final int boundary = 1000;

        public int remain(int amount) {
            return boundary - amount % boundary;
        }
}
