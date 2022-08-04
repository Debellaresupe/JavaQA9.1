    package ru.netology.radio;

    public class Radio {
        public int currentStation;
        public int currentVolume;
        public int minStation = 0;
        public int maxStation = 9;
        public int minVolume = 0;
        public int maxVolume = 100;


        public int getCurrentStation() {
            return currentStation;
        }

        public int getCurrentVolume() {
            return currentVolume;
        }

        public int getMinVolume() {
            return minVolume;
        }

        public int getMaxVolume() {
            return maxVolume;
        }

        public void setCurrentStation(int currentStation) {
            if (currentStation > maxStation) {
                return;
            }
            if (currentStation < minStation) {
                return;
            }
            this.currentStation = currentStation;
        }

        public void nextStation() {
            if (currentStation == maxStation) {
                currentStation = minStation;
                return;
            }
            currentStation++;
        }

        public void prevStation() {
            if (currentStation == minStation) {
                currentStation = maxStation;
                return;
            }
            currentStation--;
        }

        public void setCurrentVolume(int currentVolume) {
            if (currentVolume > maxVolume) {
                return;
            }
            if (currentVolume < minVolume) {
                return;
            }
            this.currentVolume = currentVolume;
        }

        public void increaseCurrentVolume() {
            if (currentVolume < maxVolume)
                currentVolume++;
        }

        public void decreaseCurrentVolume() {
            if (currentVolume > minVolume)
                currentVolume--;
        }
    }
