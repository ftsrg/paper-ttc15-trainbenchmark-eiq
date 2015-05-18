public void transform(final Collection<Object> matches) {
	for (final Object match : matches) {
		final RouteSensorMatch rsm = (RouteSensorMatch) match;
		rsm.getRoute().getDefinedBy().add(rsm.getSensor());
	}
}
