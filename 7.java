Scanner sc = new Scanner(System.in);
int n=sc.nextInt(),may=n,men=n,i=1;

while(i<10){
    n=sc.nextInt();
    if(n>may)may=n;
    if(n<men)men=n;
    i++;
}
System.out.println("Mayor: "+may);
System.out.println("Menor: "+men);