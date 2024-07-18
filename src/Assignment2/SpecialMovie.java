package Assignment2;

public class SpecialMovie extends Movie{
    String audioFormat;
    String videoFormat;

    public SpecialMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category,
                        String audioFormat, String videoFormat) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.audioFormat = audioFormat;
        this.videoFormat = videoFormat;
    }

    @Override
    public String showDetails() {
        return super.showDetails() + ", Audio Format: " + audioFormat + ", Video Format: " + videoFormat;
    }
}
