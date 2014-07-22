package parse;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

//XML을 그대로 담을 수 있는 클래스
@Root(name="SortStrategy")
public class XMLParser {
	
	@Element
	private String SortType;
	
	public XMLParser(){
		super();
	}
	
	public String GetSortType(){
		return SortType;
	}

}

/*
<SortStrategy> => @Root
	<SortType>Bubble</SortType> => @Element
</SortStrategy>
*/