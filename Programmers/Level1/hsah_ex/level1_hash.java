import java.util.Arrays;

public class level1_hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] participant = {"leo","kiki","eden"};
		String[] completion = {"kiki", "eden"};
		
		System.out.println(solution(participant,completion));
	}

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for(i =0; i<completion.length; i++) {
        	if(!participant[i].equals(completion[i])) {
        		return participant[i];
        	}
        }
        return participant[i];
    }
}

// 다른 사람들의 풀이
//import java.util.HashMap;
//
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
//        for (String player : completion) hm.put(player, hm.get(player) - 1);
//
//        for (String key : hm.keySet()) {
//            if (hm.get(key) != 0){
//                answer = key;
//            }
//        }
//        return answer;
//    }
//}

//class Solution {
//	public String solution(String[] participant, String[] completion) {
//		String answer = "";
//		HashMap<String, Integer> hm = new HashMap<>();
//		for (int i = 0; i < participant.length; i++) {
//			map.compute(participant[i], (k, v) -> v != null ? null : 1);
//			if (i < completion.length)
//				map.compute(completion[i], (k, v) -> v != null ? null : 1);
//		}
//
//		return map.keySet().iterator().next();
//	}
//}

