package LinkedList;
import LinkedList.polynomial;
public class Polynomial_1 {
    polynomial pol1;
    public void createPoly(polynomial head,int coff,int pow)
    {
        //System.out.println(("head is : "+head));
        polynomial newpoly=new polynomial(coff,pow);
        //System.out.println("new poly is "+newpoly);

        if(head==null)
        {
            head=pol1=newpoly;
        }else
        {
           pol1.next=newpoly;
           pol1= pol1.next;
        }
        System.out.println(pol1.coff+"x^"+pol1.pow);
    }
    public void display(polynomial head)
    {
        polynomial pol=head;
        while(pol!=null)
        {
            System.out.print(pol.coff +"x^"+pol.pow);
            pol=pol.next;
            if(pol.coff>=0)
            {
                if(pol.next!=null)
                {
                    System.out.print(" + ");
                }
            }
        }
    }
}
