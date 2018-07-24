package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays x, Pays y) {
		if (x.getNbHabitants()>y.getNbHabitants()) {
		return 1;
	}
		if (y.getNbHabitants()>x.getNbHabitants()) {
			return -1;
		}
			return 0;
		}

}
