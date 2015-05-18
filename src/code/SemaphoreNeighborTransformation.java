public void transform(final Collection<Object> matches) {
	for (final Object match : matches) {
		final SemaphoreNeighborMatch snm = (SemaphoreNeighborMatch) match;
		snm.getRoute2().setEntry(snm.getSemaphore());
	}
}
