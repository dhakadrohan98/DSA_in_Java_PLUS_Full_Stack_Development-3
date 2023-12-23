package org.codeship;

interface Subject {
	public void subscribe(Observer ob);
	public void unsubscribe(Observer ob);
	public void newVideoUploaded(String title); //notify();
}
