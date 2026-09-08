public class O364Stack_Main_Class {
    public static void main (String[] args) throws O363StackException{
//Left//What you can access   Right//What type of access you can get
        O358CustomStack stack=new O365DynamicStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
