package Medium;
public class Q134_GasStation {
    public static void main(String[] args) {
        int [] gas ={1,2,3,4,5};
        int [] cost ={3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
    public static int canCompleteCircuit(int  [] gas, int[] cost) {
        int i = 0,index=0,st=0,gasleft=0;
        while(true){
            while(i<gas.length){
                if(gas[i]<cost[i])
                    i++;
                else break;
            }
            index=i;
            st=index;
            while(gasleft+gas[st]>=cost[st]){
                gasleft=gasleft+gas[st]-cost[st];
                st++;
                if(st==gas.length) st=0;
                if(st==index) return st;
            }
            i++;
        }
    }
}
