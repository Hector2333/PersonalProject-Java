import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
 
public class Lib
{
	public int wordlines;   //������¼����
	public int characters;    //������¼�ַ���
	public int wordnumbers;    //������¼������
	public String anticle;    //����������ļ������ȫ������
	public String inputTxt;    //д�����µĵ�ַ
	public String outputTxt;    //д������ͳ�Ƶĵ�ַ
    public List<Map.Entry<String, Integer>> list;    //������¼ͳ�Ƴ�����Ƶ������
    public HashMap<String,Integer> hashMap;    //������¼���е��ʼ��������г��ֵ�Ƶ��
    public String result;    //������¼Ҫ����Ľ��
    
    public Lib(String in,String out) {    //��������
		wordlines = 0;
		characters = 0;
		wordnumbers = 0;
		anticle = "";
		inputTxt = in;
		outputTxt = out;
		result = "";
	}
    
    public int isWord(String word) {    //�����ж�����ַ����Ƿ�Ϊ����
		if (word.length()<4)
			return -1;
		for (int i=0;i<4;i++){
			char c = word.charAt(i);
			if (!(c>='a'&&c<='z'||c>='A'&&c<='Z'))
				return -1;
		}
		return 1;
	}
    
    public void mapValueSort(HashMap<String, Integer> map) {    //��hashMapת��Ϊlist��ʹ�����װ��sort������������
        list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2){   //��дcompare���������Ӷ�Ϊnlog2��n�����Ȱ���value�Ӵ�С��
                if (o1.getValue()<o2.getValue())                                           //value��ȵ�����£��ٰ���key��С����
                	return 1;
                else if (o1.getValue()>o2.getValue())
                	return -1;
                else {
                	return o1.getKey().compareTo(o2.getKey());
                }
            }
        });
    }
}

