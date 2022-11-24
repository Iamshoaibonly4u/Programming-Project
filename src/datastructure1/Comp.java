package datastructure1;

public class Comp implements Comparable {
	
		String name;
		int eid;
		
		public Comp(String name, int eid) {
			super();
			this.name = name;
			this.eid = eid;
		}
		
		@Override
		public String toString() {
			return name;
		}

		@Override
		public int compareTo(Object a) {
			if(this.eid==((Comp)a).eid)
			{
				return 0;
			}
			if(this.eid>((Comp)a).eid)
			{
				return 1;
			}
			else
			{
				return -1;
			}

		}
	}

