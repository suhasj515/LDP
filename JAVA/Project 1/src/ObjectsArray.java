public class ObjectsArray {

    ObjectsArray(String arg){
        System.out.println(arg);
    }

    public static void main(String[] args){
        ObjectsArray[] a=new ObjectsArray[3];
        a[0]=new ObjectsArray("arg1");
        a[1]=new ObjectsArray("arg2");
        a[2]=new ObjectsArray("arg3");
    }
}
