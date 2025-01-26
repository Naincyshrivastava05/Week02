package multilevel_inheritance.education_heirarchy;

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    // Constructor for OnlineCourse
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call the base class constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding displayInfo to include OnlineCourse-specific attributes
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

