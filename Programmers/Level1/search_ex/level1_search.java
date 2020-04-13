import java.util.*;

public class level1_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] answers = { 1,2,3,4,5,3,3,3,4,4,4,4,1,1,1,1 };
		
		solution(answers);

	}
	
    public static int[] solution(int[] answers) {
        int[] answer = {}; // ��ȯ�� List�� ������ �迭
        
        // �����ڵ��� ����
        int[] person1 = {1,2,3,4,5}; 
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        // ���� ���� ����
        int answer1=0, answer2 =0, answer3 =0;
        
        // ���� �� üũ
        for(int i =0; i<answers.length; i++){
            if(person1[i%person1.length] == answers[i]) answer1++;
            if(person2[i%person2.length] == answers[i]) answer2++;
            if(person3[i%person3.length] == answers[i]) answer3++;
        }
        
        // ���� ���� ���� ��
        int max = Math.max(Math.max(answer1, answer2),answer3); // max�� ���ϱ�
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // max���� ������ ������ ��� list�� add
        if(max==answer1) list.add(1); //max���̶� ������ �ִ´�.
        if(max==answer2) list.add(2);
        if(max==answer3) list.add(3);
        
        // answer �迭�� list ũ�⸸ŭ ����
        answer = new int[list.size()];
        
        // list���� �迭�� ����
        for(int i =0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        // �迭 ����
        return answer;
    }

}
