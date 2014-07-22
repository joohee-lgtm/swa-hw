package sort;

import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import parse.XMLParser;

public class SortFactory {
	private String filePath;

	public SortFactory(String filePath) {
		setFilePath(filePath);
	}

	public ISort getinstance() {
		Serializer serializer = new Persister();
		File file = new File(filePath);
		String sort_type = null;
		ISort isort = null;
		try {
			XMLParser parser = serializer.read(XMLParser.class, file);
			sort_type = "sort." + parser.GetSortType() + "Sort";
			System.out.println("type : " + sort_type);
			isort = (ISort) Class.forName( sort_type ).newInstance(); // reflection
		} catch (Exception e) {
			System.out.println("Cannot create Sort Class");
			e.printStackTrace();
		} // xml 정보를 XMLParser 클래스에 넣어줌
		return isort;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public String getFilePath(){
		return this.filePath;
	}

}
