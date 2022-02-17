package es.hulk.entorns.refactors.extractmethod_04;


import java.util.Locale;

public class UrlNormalizer {

	public String normalize(String title) {
		String url = title.trim();

		// Remove special chars
		removeSpecialChars(url);

		// Replace white spaces with hyphens
		return removeSpaces(url);
	}

	private String removeSpecialChars(String url) {
		String specialRemoved = "";
		for (int i = 0; i < url.length(); i++) {
			if (url.charAt(i) != ',' && url.charAt(i) != ':' && url.charAt(i) != '.' && url.charAt(i) != '?') {
				specialRemoved += url.charAt(i);
			}
		}
		url = specialRemoved;
		return url;
	}

	private String removeSpaces(String url) {
		String spacesReplaced = "";
		for (int i = 0; i < url.length(); i++) {
			if (url.charAt(i) == ' ') {
				spacesReplaced += "-";
			} else {
				spacesReplaced += url.charAt(i);
			}
		}
		url = spacesReplaced;
		return url.toLowerCase();
	}
}

