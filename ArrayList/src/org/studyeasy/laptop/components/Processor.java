package org.studyeasy.laptop.components;

public class Processor {
	private String brand;
	private String series;
	private int generation;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequency;
	private String MinFrequency;
	private String MaxFrequency;
	
	public Processor()
	{
		this.brand = "Intel";
		this.series = "i5 7200u";
		this.generation = 7;
		this.cores = 2;
		this.threads = 4;
		this.cacheMemory = "3MB";
		this.frequency = "2.5Ghz";
		this.MinFrequency = "2.5Ghz";
		this.MaxFrequency = "3.1Ghz";
	}

	public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory,
			String frequency, String minFrequency, String maxFrequency) {
		
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		MinFrequency = minFrequency;
		MaxFrequency = maxFrequency;
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores
				+ ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency
				+ ", MinFrequency=" + MinFrequency + ", MaxFrequency=" + MaxFrequency + "]";
	}
	
	
	
	
}
