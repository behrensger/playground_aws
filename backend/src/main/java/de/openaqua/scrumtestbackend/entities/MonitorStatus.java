package de.openaqua.scrumtestbackend.entities;

public enum MonitorStatus {
	OK("OK"), FAILURE("FAILURE"), UNKNOWN("UNKNOWN");

	private final String text;

	MonitorStatus(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
}
