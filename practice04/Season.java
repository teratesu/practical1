package practice04;

public enum Season {
    WINTER(-5.0),
    SPRING(8.5),
    SUMMER(24.0) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(10.0);

    private final double averageTemperature;

    Season(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
