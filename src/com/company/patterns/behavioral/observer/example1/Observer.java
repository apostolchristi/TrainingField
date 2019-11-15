package com.company.patterns.behavioral.observer.example1;

interface Observer {

	// method to update the observer, used by the subject
	void update();

	// attach with subject to observe, not required but added so that the
	// observer can query the subject to see if an update has occurred
	void setSubject(Subject subject);
}

class MyTopicSubscriber implements Observer {

	private String name;
	private Subject topic;

	public MyTopicSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		// this method could take data of subjects state that was changed, do not need to ask
		String msg = (String) this.topic.getUpdate(this);
		if(msg == null) {
			System.out.println(this.name + ":: No new Message");
		} else {
			System.out.println(this.name + ":: Consuming message::" + msg);
		}
	}

	@Override
	public void setSubject(Subject subject) {
		// not rquired, added so observer can ask subject for state
		this.topic = subject;
	}
}
