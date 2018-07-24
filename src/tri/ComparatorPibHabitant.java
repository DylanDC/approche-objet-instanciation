package tri;

import java.util.Comparator;

public class ComparatorPibHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays a, Pays b) {
		
			if (a.getPibHabitants()>b.getNbHabitants()) {
				return 1;
			}
			if (b.getPibHabitants()>a.getPibHabitants()) {
				return -1;
			}
				return 0;
		}
	}



