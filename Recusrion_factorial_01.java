class factorial {
    
    public int fact(int n){
        int fin=0;
        if(n>0)
            return n*fact(n-1);
        else
            return 1;
    }
    public static void main(String[] args) {
        factorial fa=new factorial();
         int n=fa.fact(10);
        System.out.println(n);
    }
}
