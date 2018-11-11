package com.teamisotope.openmechanics.api.task;

import net.minecraftforge.fml.common.eventhandler.Event;

public abstract class Task {

    private Object[] inputs;

    public Task(Object[] inputs) {
        this.inputs = inputs;
    }

    public Object[] getInputs() { return inputs; }

    public abstract void run(TaskEnvironment env) throws TaskMalformedInputException;

    public abstract TaskEnvironment getWantedEnvironment();

    public boolean testEnvironment(TaskEnvironment env) {
        return getWantedEnvironment().equals(env);
    }

    public static class TaskEnvironment {

        public RunOn runOn;
        public Scope scope;
        public Class<? extends Event> event;
        public Object evtInstance;

        public TaskEnvironment(Class<? extends Event> event) {
            this.runOn = RunOn.EVENT;
            this.event = event;
        }

        public TaskEnvironment(Event evtInstance) {
            this.runOn = RunOn.EVENT;
            this.evtInstance = evtInstance;
        }

        public TaskEnvironment(RunOn runOn, Scope scope) {
            this.runOn = runOn;
            this.scope = scope;
        }

        public static enum RunOn {
            PRE_INIT,
            INIT,
            POST_INIT,
            EVENT,
        }

        public static enum Scope {
            CLIENT,
            SERVER,
            COMMON
        }

        @Override
        public boolean equals(Object o) {
            if (o == this)
                return true;

            if (!(o instanceof TaskEnvironment))
                return false;

            TaskEnvironment env = (TaskEnvironment) o;

            if (runOn == RunOn.EVENT && env.runOn == RunOn.EVENT)
                return event.isInstance(env.evtInstance);
            else
                return env.runOn == runOn && env.scope == scope;
        }

    }

}
