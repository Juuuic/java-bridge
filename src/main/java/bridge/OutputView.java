package bridge;

import java.util.List;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(List<List<String>> bridge) {
        for(int i=0; i<bridge.size(); i++){
            if(i == 0){
                System.out.print("[");
            }
            System.out.print(bridge.get(i).get(0));
            System.out.print("|");
            if(i == bridge.size()-1){
                System.out.print("]");
            }
        }
        System.out.print("\n");
        for(int i=0; i<bridge.size(); i++){
            if(i == 0){
                System.out.print("[");
            }
            System.out.print(bridge.get(i).get(1));
            if(i == bridge.size()-1){
                System.out.print("]");
            }
            System.out.print("|");
        }
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult() {
    }

    //게임 시작 메세지 출력 method
    public void printStart() {
        System.out.println("다리 건너기 게임을 시작합니다.\n");
    }
}
