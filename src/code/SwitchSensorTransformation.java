public void transform(final Collection<Object> matches) {
	for (final Object match : matches) {
		final SwitchSensorMatch ssm = (SwitchSensorMatch) match;
		final Sensor sensor = RailwayFactory.eINSTANCE.createSensor();
		ssm.getSw().setSensor(sensor);
	}
}
