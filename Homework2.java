// ���� 1+2-3+4-5+6-7....+100�Ľ��
// �ҹ��ɣ�����ʱ������ż��ʱ�ӷ���
// ��һ��˼·��(��1֮��)���е�ż����ͣ����е�������ͣ�Ȼ��ż����͵Ľ����ȥ������͵Ľ����
// �ڶ���˼·��ѭ��������ȡ��ÿ��ֵ���жϸ�����ż������������ż���ͼӣ������ͼ���

//д�������ɺ�ϰ���ǣ�дһ������һ����
public class Homework2{
	public static void main(String[] args){
		// ��һ�����ȱ��ż�����ɣ����ܴ�1ȡ��100
		int sum = 1; //sum�ĳ�ʼֵ����0������1.
		for(int i = 2; i <= 100; i++){ // i��2��ʼ��
			if(i % 2 == 0){ //ż��
				sum += i;
			}else{ // ����
				sum -= i; 
			}
		}
		System.out.println("���=" + sum); // 52
	}
}