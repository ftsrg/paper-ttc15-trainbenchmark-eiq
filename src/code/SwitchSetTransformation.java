public void transform(final Collection<Object> matches) {
	for (final Object match : matches) {
		final SwitchSetMatch ssm = (SwitchSetMatch) match;
		ssm.getSw().setCurrentPosition(ssm.getSwitchPosition().getPosition());
	}
}
