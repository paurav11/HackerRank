import java.util.*;

public class Day8_DictionariesAndMaps{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        if (n>=1 && n<=100000){
            for(int i=0;i<n;i++){
                String name = sc.next();
                int phone = sc.nextInt();
                if (String.valueOf(phone).length() == 8){
                    map.put(name,phone);
                } else {
                    System.exit(0);
                }
            }
        }

        while(sc.hasNext()){
            String query = sc.next();
            Integer phoneNumber = map.get(query);
            System.out.println((phoneNumber != null) ? query + "=" + phoneNumber : "Not found");
        }
        sc.close();
    }
}