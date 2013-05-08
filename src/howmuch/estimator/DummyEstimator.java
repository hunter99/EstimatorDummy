package howmuch.estimator;


import howmuch.annotations.AnEstimator;
import howmuch.parse.StatRes;

/*
 * Trivial estimation.
 * <P> The observed trace classes are all trace classes.
 */
@AnEstimator
public class DummyEstimator extends BaseEstimator{
	public DummyEstimator() {
		super("Dummy");
	}

	public void estimate(StatRes res){
		successful=false;
		res.setW(res.getNumOfObservedUnits());
		res.setU(res.getW()-res.getNumOfObservedUnits());
		res.setC(1.0);
		res.setN(1.0-res.getC());
		successful=true;
	}
}

