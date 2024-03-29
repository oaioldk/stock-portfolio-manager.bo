package com.proserus.stocks.bo.utils;

import java.io.File;

import org.apache.commons.lang3.StringUtils;

public class PathUtils {
	private static String installationFolder;
	private static String absolutePath;
	static {
		installationFolder = PathUtils.class.getClassLoader().getResource(".").getPath();
		installationFolder = StringUtils.removeEnd(installationFolder, "/");
		installationFolder = StringUtils.removeEnd(installationFolder, "\\");
		installationFolder = StringUtils.removeEnd(installationFolder, "target/classes");
		installationFolder = StringUtils.removeEnd(installationFolder, "/");
		installationFolder = StringUtils.removeEnd(installationFolder, "\\");

		absolutePath = new File("./").getAbsolutePath();
		absolutePath = StringUtils.removeEnd(absolutePath, ".");
		absolutePath = StringUtils.removeEnd(absolutePath, "/");
		absolutePath = StringUtils.removeEnd(absolutePath, "\\");
	}

	public static String getInstallationFolder() {
		return installationFolder;
	}

	public static String getCurrentFolder() {
		return absolutePath;
	}
}
