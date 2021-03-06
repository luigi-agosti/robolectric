package com.xtremelabs.robolectric.shadows;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.xtremelabs.robolectric.util.Implementation;
import com.xtremelabs.robolectric.util.Implements;

import static com.xtremelabs.robolectric.Robolectric.newInstanceOf;

/**
 * Shadow of {@code ConnectivityManager} that provides for the simulation of
 * the active connection status.
 */

@Implements(ConnectivityManager.class)
public class ShadowConnectivityManager {

	private NetworkInfo networkInfo;

	@Implementation
    public NetworkInfo getActiveNetworkInfo() {
		return networkInfo == null ? networkInfo = newInstanceOf(NetworkInfo.class) : networkInfo;
    }
}
