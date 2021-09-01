package model;


/**
 * @author Christian O'Brien- cpobrien3
 * CIS175 - Fall 2021
 * Aug 31, 2021
 */

public class Lion {
	
	private String name;
	private String color;
	private int age;
	
	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lion(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public String speak() {
		return "Roar!";
	}
}
