/**
 * 
 */
package com.journaldev.adapter;

/**
 * @author superod
 *
 */
public class SocketObjectAdapterImpl implements SocketAdapter {
	
	private Socket sock = new Socket();

	/**
	 * 
	 */
	public SocketObjectAdapterImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.journaldev.adapter.SocketAdapter#get120Volt()
	 */
	@Override
	public Volt get120Volt() {
		return sock.getVolt();
	}

	/* (non-Javadoc)
	 * @see com.journaldev.adapter.SocketAdapter#get12Volt()
	 */
	@Override
	public Volt get12Volt() {
		return convertVolt(sock.getVolt(), 10);
	}

	/* (non-Javadoc)
	 * @see com.journaldev.adapter.SocketAdapter#get3Volt()
	 */
	@Override
	public Volt get3Volt() {
		return convertVolt(sock.getVolt(), 40);
	}

	private Volt convertVolt(Volt volt, int i) {
		return new Volt(volt.getVolts() / i);
	}

}
