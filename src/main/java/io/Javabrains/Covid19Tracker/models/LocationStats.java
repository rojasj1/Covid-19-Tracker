package io.Javabrains.Covid19Tracker.models;

public class LocationStats {
    private String state;
    private String country;
    private int LatestTotalCases;
    private int DiffStatsfromPrevday;
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return LatestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        LatestTotalCases = latestTotalCases;
    }
    
    public int getDiffStatsfromPrevday() {
		return DiffStatsfromPrevday;
	}

	public void setDiffStatsfromPrevday(int diffStatsfromPrevday) {
		DiffStatsfromPrevday = diffStatsfromPrevday;
	}
    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", LatestTotalCases=" + LatestTotalCases +
                '}';
    }

	
}
