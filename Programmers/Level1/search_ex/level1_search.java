import java.util.*;

public class level1_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] answers = { 1,2,3,4,5,3,3,3,4,4,4,4,1,1,1,1 };
		
		solution(answers);

	}
	
    public static int[] solution(int[] answers) {
        int[] answer = {}; // 반환할 List를 저장할 배열
        
        // 수포자들의 패턴
        int[] person1 = {1,2,3,4,5}; 
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        // 정답 맞춘 개수
        int answer1=0, answer2 =0, answer3 =0;
        
        // 정답 수 체크
        for(int i =0; i<answers.length; i++){
            if(person1[i%person1.length] == answers[i]) answer1++;
            if(person2[i%person2.length] == answers[i]) answer2++;
            if(person3[i%person3.length] == answers[i]) answer3++;
        }
        
        // 가장 많이 맞춘 자
        int max = Math.max(Math.max(answer1, answer2),answer3); // max값 구하기
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // max값과 동일한 값들을 모두 list에 add
        if(max==answer1) list.add(1); //max값이랑 같으면 넣는다.
        if(max==answer2) list.add(2);
        if(max==answer3) list.add(3);
        
        // answer 배열을 list 크기만큼 생성
        answer = new int[list.size()];
        
        // list값을 배열에 저장
        for(int i =0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        // 배열 리턴
        return answer;
    }

}
