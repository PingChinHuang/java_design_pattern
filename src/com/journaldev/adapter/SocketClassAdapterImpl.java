/**
 * 
 */
package com.journaldev.adapter;

/**
 * @author superod
 *
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	/**
	 * 
	 */
	public SocketClassAdapterImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.journaldev.adapter.SocketAdapter#get120Volt()
	 */
	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	/* (non-Javadoc)
	 * @see com.journaldev.adapter.SocketAdapter#get12Volt()
	 */
	@Override
	public Volt get12Volt() {
		return convertVolt(getVolt(), 10);
	}

	/* (non-Javadoc)
	 * @see com.journaldev.adapter.SocketAdapter#get3Volt()
	 */
	@Override
	public Volt get3Volt() {
		return convertVolt(getVolt(), 40);
	}

	private Volt convertVolt(Volt volt, int i) {
		return new Volt(volt.getVolts() / i);
	}

}
