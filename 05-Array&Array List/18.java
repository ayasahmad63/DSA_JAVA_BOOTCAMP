ution {
public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<Integer> anss=new ArrayList<>();
        int n=0,temp;

        for(int i=0;i<num.length;i++){
        n+=num[num.length-i-1 ]*Math.pow(10,i);

        }
        n=n+k;
        System.out.println(n);

        while(n>0){
        anss.add(n%10);
        n=n/10;

        }

        for(int i=anss.size();i>0;i--){
        ans.add(anss.get(i-1));

        }

        return ans;
        }
        }