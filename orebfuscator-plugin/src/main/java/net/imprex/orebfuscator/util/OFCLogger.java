package net.imprex.orebfuscator.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OFCLogger {

	private static final Logger LOGGER = Logger.getLogger("bukkit.orebfuscator");

	private static final String LOG_PREFIX = "[Orebfuscator] ";
	private static final String LOG_DEBUG_PREFIX = "[Orebfuscator/Debug] ";

	private static boolean verbose = false;

	public static void setVerboseLogging(boolean verbose) {
		OFCLogger.verbose = verbose;
		if (OFCLogger.verbose) {
			debug("Verbose logging has been enabled");
		}
	}

	public static void debug(String message) {
		if (OFCLogger.verbose) {
			OFCLogger.LOGGER.log(Level.INFO, LOG_DEBUG_PREFIX + message);
		}
	}

	public static void warn(String message) {
		log(Level.WARNING, message);
	}

	/**
	 * Log an information
	 */
	public static void info(String message) {
		log(Level.INFO, message);
	}

	/**
	 * Log with a specified level
	 */
	public static void log(Level level, String message) {
		OFCLogger.LOGGER.log(level, LOG_PREFIX + message);
	}

	/**
	 * Log an error
	 */
	public static void error(Throwable e) {
		log(Level.SEVERE, e.getMessage(), e);
	}

	/**
	 * Log an error
	 */
	public static void error(String message, Throwable e) {
		log(Level.SEVERE, message, e);
	}

	/**
	 * Log with a specified level and throwable
	 */
	public static void log(Level level, String message, Throwable throwable) {
		OFCLogger.LOGGER.log(level, LOG_PREFIX + message, throwable);
	}
}