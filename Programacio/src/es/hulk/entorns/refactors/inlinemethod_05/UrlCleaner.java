package es.hulk.entorns.refactors.inlinemethod_05;


public class UrlCleaner {

	public String clean(String title) {
		return title.trim()
				.replaceAll("[\\s]+", " ").replaceAll("[\\s]", "-")
				.replaceAll("[\\.\\:\\,\\?\\!\\_\\;]", "")
				.toLowerCase();
	}
}

