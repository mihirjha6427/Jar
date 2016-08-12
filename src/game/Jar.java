package game;

public class Jar {
private String mItem;
private int mMax;


public Jar(String mItem, int mMax) {
	super();
	this.mItem = mItem;
	this.mMax = mMax;
}
public Jar() {
	// TODO Auto-generated constructor stub
}
public String getItem() {
	return mItem;
}
public void setItem(String mItem) {
	this.mItem = mItem;
}
public int getMax() {
	return mMax;
}
public void setMax(int mMax) {
	this.mMax = mMax;
}


}
