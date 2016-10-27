package homework;

class DataWrap implements Comparable<DataWrap> {
	int data;
	String flag;

	public DataWrap(int data, String flag) {
		this.data = data;
		this.flag = flag;
	}

	public String toString() {
		return data + flag;
	}

	// ����dataʵ����������������DataWrap�Ĵ�С
	public int compareTo(DataWrap dw) {
		return this.data > dw.data ? 1 : (this.data == dw.data ? 0 : -1);
	}
}

public class Selection {
	public static void selectSort(DataWrap[] data) {
		System.out.println("��ʼ����");
		int arrayLength = data.length;
		// ���ν���n��1�˱Ƚ�, ��i�˱ȽϽ���i���ֵѡ������iλ���ϡ�
		for (int i = 0; i < arrayLength - 1; i++) {
			// ��i������ֻ�������������ݱȽ�
			for (int j = i + 1; j < arrayLength; j++) {
				// �����iλ�õ����� > jλ�õ�����, ��������
				if (data[i].compareTo(data[j]) > 0) {
					DataWrap tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				}
			}
			System.out.println(java.util.Arrays.toString(data));
		}
	}

	public static void main(String[] args) {
		DataWrap[] data = { new DataWrap(21, ""), new DataWrap(30, ""),
				new DataWrap(49, ""), new DataWrap(30, "*"),
				new DataWrap(16, ""), new DataWrap(9, "") };
		System.out.println("����֮ǰ��\n" + java.util.Arrays.toString(data));
		selectSort(data);
		System.out.println("����֮��\n" + java.util.Arrays.toString(data));
	}
}
