package com.coderscampus.arraylists;

public class CustomListApp {

	public static void main(String[] args) {
		CustomList<String> myList = new CustomArrayList<>();
		myList.add("Red");
		myList.add("Blue");
		myList.add("Green");
		myList.add("Yellow");
		myList.add("Purple");
		myList.add("Orange");
		myList.add("Pink");
		myList.add("Brown");
		myList.add("Gray");
		myList.add("Black");
		myList.add("White");
		myList.add("Teal");
		myList.add("Turquoise");
		myList.add("Lavender");
		myList.add("Maroon");
		myList.add("Indigo");
		myList.add("Cyan");
		myList.add("Beige");
		myList.add("Coral");
		myList.add("Olive");
		myList.add("Silver");
		myList.add("Gold");
		myList.add("Plum");
		myList.add("Mauve");
		System.out.println(myList);
		System.out.println(myList.get(21));
		System.out.println(myList.getSize());

	}

}