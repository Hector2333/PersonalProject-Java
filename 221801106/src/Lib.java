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
}

