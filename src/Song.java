public class Song{
	String name;
	String lyrics;
}
public void setName(String str) {
	if (str!=null /*|| str!=""*/) {
		name=str;
	}
	else
		System.out.println("Give it a proper name");
}
public String getName() {
	return name;
}
public void setLyrics(String lyr) {
	if (lyr!=null /*|| str!=""*/) {
		lyrics=lyr;
	}
	else
		System.out.println("Give it a proper name");
}
public String getLyrics() {
	return lyrics;;
}
public void sing() {
	
}
