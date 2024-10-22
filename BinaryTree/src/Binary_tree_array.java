public class Binary_tree_array
{
    int size;
    int [] tree;


    public Binary_tree_array(int capacity)
    {
        tree = new int[capacity];
        size = 0;
    }

    public void add(int data)
    {
        if(size >= tree.length)
        {
            System.out.println("Tree is full");
            return;
        }
        tree[size] = data;
        size++;
    }

    public int leftChild(int i)
    {
        int index = (2*i)+1;
        if(index >= size)
        {
            System.out.println("No left child");
            return -1;
        }
        return  tree[index];
    }

    public int rightChild(int i)
    {
        int index = (2*i)+2;
         if(index >= size)
        {
            System.out.println("No right child");
            return -1;
        }
         return tree[index];
    }

}