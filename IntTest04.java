/*
	java����һ���﷨����
		�����������������û�г���byte��ȡֵ��Χ����ô���
		����������������ֱ�Ӹ�ֵ��byte���͵ı�����
	
	�����﷨������Ϊ�˷���д���룬�����ڵġ�
*/
public class IntTest04{
	public static void main(String[] args){
		// ���������´���������ͨ����
		// 300 ��Ĭ�ϵ���int����
		// b������byte����
		// ������ת����С������Ҫ�����ͨ��������ʹ��ǿ������ת����
		// ����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
		//byte b = 300;

		// Ҫ�������ϵĳ������ͨ���������ǿ������ת����
		// ��Ȼ����ͨ���ˣ����ǿ��ܾ�����ʧ��
		// 300���int���Ͷ�Ӧ�Ķ����ƣ�00000000 00000000 00000001 00101100
		// byteռ��1���ֽڣ�����ǰ3���ֽڣ�����ǣ�00101100 (44)
		byte b = (byte)300;
		System.out.println(b); // 44

		// ���������ͨ����
		// 1��int���ͣ�Ĭ�ϱ�����int����������
		// x��byte���ͣ�1���ֽڣ��������޷�ֱ��ת����С������
		// ��˵�Ǳ��뱨���ġ�
		byte x = 1;
		byte y = 127;
		// ����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
		byte z = 128;

		// ��������������û�г���short����ȡֵ��Χ��ʱ�򣬸�����������ֱ�Ӹ�ֵ��short
		// ���͵ı�����
		short s = 1;
		short s1 = 32767;
		// ����: �����ݵ�����: ��intת����short���ܻ�����ʧ
		//short s2 = 32768;
		System.out.println(s);

	}
}