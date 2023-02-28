
  class Studenttest
{
    public static void main(String[] args)
    {
        Logger l=Logger.getLogger("tyler");

        Stulist a1=new Stulist("ragul",18,9);
        Stulist a2=new Stulist("jeeva",19,10);
        Stulist a3=new Stulist("kawin" ,9, 11);

        List <Stulist> list=new ArrayList<Stulist>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        int siz=list.size();
        for (int i = 0; i <siz ; i++)
        {
            int i1=i;
            l.log(Level.INFO, () ->list.get(i1).getname() + " " + list.get(i1).getage() + " " + list.get(i1).getgpa() + " ");

        }
        l.info("list of students after sorting:");

        Collections.sort(list, new Comparator <Stulist>()
        {

            public int compare(Stulist o1, Stulist o2)
            {
                if (o1.getgpa() < o2.getgpa())
                {
                    return 1;
                }
                else if (o1.getgpa()==o2.getgpa())
                {
                    return 0;
                }
                else
                {
                    return -1;
                }
            }
        });
        for (int i = 0; i <siz ; i++)
        {
            int i1=i;
            l.log(Level.INFO, () ->list.get(i1).getname() + " " + list.get(i1).getage() + " " + list.get(i1).getgpa() + " ");
        }

    }
}
