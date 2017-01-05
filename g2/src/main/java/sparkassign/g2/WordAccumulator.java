package sparkassign.g2;

import java.util.Map;
import org.apache.spark.util.AccumulatorV2;

//could be used instead of a broadcasted map

public class WordAccumulator extends AccumulatorV2<Map<String, Integer>, Map<String, Integer>>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6844777707633450464L;

	@Override
	public void add(Map<String, Integer> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AccumulatorV2<Map<String, Integer>, Map<String, Integer>> copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isZero() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void merge(AccumulatorV2<Map<String, Integer>, Map<String, Integer>> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Integer> value() {
		// TODO Auto-generated method stub
		return null;
	}

}
