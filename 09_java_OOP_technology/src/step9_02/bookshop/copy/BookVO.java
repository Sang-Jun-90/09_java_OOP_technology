package step9_02.bookshop.copy;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//	책 1권의 정보를 기억하는 클래스
public class BookVO {

	private String title;
	private String author;
	private String publisher;
	private Date date;
	private int price;
	
	public BookVO(String title, String author, String publisher, Date date, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.date = date;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		DecimalFormat df = new DecimalFormat("#,##0원");
		
		return String.format("%s %s %s %s %s",title,author,publisher,sdf.format(date), df.format(price));
	}
	
	
}
















