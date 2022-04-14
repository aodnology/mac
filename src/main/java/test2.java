public class test2 {
    public static void main(String[] args) {


    /*
    new 메모리에 올린다는 뜻
    인덱스 개념 가지고 있음 (항상 0부터 시작함) 배열의 요소 라고도 함
     */
        int[] score = new int[3];
        score[0] = 100;
        score[1] = 100;
        score[2] = 100;

        System.out.println(score);
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score.length);

    }
}
