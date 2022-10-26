package Module3.Lesson17.PatternStrategy;

class Encryption {
    private Algorithm algorithm;

    public Encryption(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public String crypt(String text, String key) {
        return algorithm.crypt(text, key);
    }

}
