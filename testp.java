public class testp{
    public static void main(String args[]){
        String name="Praveen";
        char c;
        char temp;
        int i,j;
        char[] ch=new char[100];
        int[] freq=new int[100];
           // c=name.charAt(0);
       //System.out.println(c);
       for(i=0;i<name.length();i++)
        {
            c=name.charAt(i);
            int count=0;
            for(j=0;j<name.length();j++)
            {
                temp=name.charAt(j);
                if(c==temp)
                {
                    count++;
                }

            }
                ch[i]=c;
                freq[i]=count;
        }
        System.out.print(ch[4]);
        System.out.print(freq[4]);
       
        
       
    }
}

$this->db->view('home');
$this->db->model('service');
$this-db->update('user',$data);