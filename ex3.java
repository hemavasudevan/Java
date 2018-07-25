public class rectangle{
int length;
int width;
void insert(int l,int w){
    length=l;
    width=w;
}
void calculatearea(){System.out.println(length*width);}
     public static void main(String args[]){
        rectangle s1=new rectangle();
        rectangle s2=new rectangle();
        s1.insert(11,5);
        s2.insert(22,4);
        s1.calculatearea();
        s2.calculatearea();
     }
}

