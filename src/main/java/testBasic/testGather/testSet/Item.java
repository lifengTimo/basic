package testBasic.testGather.testSet;

import java.util.Comparator;
import java.util.Objects;



/**
 * An item with a description and  a part number
 * @author 开拓者
 *
 */
public class Item implements Comparable<Item>{
	
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 数字部分
	 */
	private int partNumber;

	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructs an item
	 * @param description
	 * @param partNumber
	 */
	public Item(String description, int partNumber) {
		super();
		this.description = description;
		this.partNumber = partNumber;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getPartNumber() {
		return partNumber;
	}



	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}



	@Override
	public String toString() {
		return "Item [description=" + description + ", partNumber=" + partNumber + "]";
	}

	 @Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if (obj==null) {
			return false;
		}
		if(getClass()!=obj.getClass()) {
			return false;
		}
		Item other=(Item)obj;
		return Objects.equals(description, other.description)&&partNumber==other.partNumber;
	}
	 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(description,partNumber);
	}
	 

	@Override
	public int compareTo(Item o) {
		int diff = Integer.compare(partNumber,o.partNumber );
		return diff!=0?diff:description.compareTo(o.description);
	}

}
