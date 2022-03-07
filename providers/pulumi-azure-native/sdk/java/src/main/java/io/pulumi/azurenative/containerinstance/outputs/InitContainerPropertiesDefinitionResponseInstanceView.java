// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.azurenative.containerinstance.outputs.ContainerStateResponse;
import io.pulumi.azurenative.containerinstance.outputs.EventResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class InitContainerPropertiesDefinitionResponseInstanceView {
    /**
     * The current state of the init container.
     * 
     */
    private final ContainerStateResponse currentState;
    /**
     * The events of the init container.
     * 
     */
    private final List<EventResponse> events;
    /**
     * The previous state of the init container.
     * 
     */
    private final ContainerStateResponse previousState;
    /**
     * The number of times that the init container has been restarted.
     * 
     */
    private final Integer restartCount;

    @OutputCustomType.Constructor({"currentState","events","previousState","restartCount"})
    private InitContainerPropertiesDefinitionResponseInstanceView(
        ContainerStateResponse currentState,
        List<EventResponse> events,
        ContainerStateResponse previousState,
        Integer restartCount) {
        this.currentState = Objects.requireNonNull(currentState);
        this.events = Objects.requireNonNull(events);
        this.previousState = Objects.requireNonNull(previousState);
        this.restartCount = Objects.requireNonNull(restartCount);
    }

    /**
     * The current state of the init container.
     * 
    */
    public ContainerStateResponse getCurrentState() {
        return this.currentState;
    }
    /**
     * The events of the init container.
     * 
    */
    public List<EventResponse> getEvents() {
        return this.events;
    }
    /**
     * The previous state of the init container.
     * 
    */
    public ContainerStateResponse getPreviousState() {
        return this.previousState;
    }
    /**
     * The number of times that the init container has been restarted.
     * 
    */
    public Integer getRestartCount() {
        return this.restartCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InitContainerPropertiesDefinitionResponseInstanceView defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerStateResponse currentState;
        private List<EventResponse> events;
        private ContainerStateResponse previousState;
        private Integer restartCount;

        public Builder() {
    	      // Empty
        }

        public Builder(InitContainerPropertiesDefinitionResponseInstanceView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentState = defaults.currentState;
    	      this.events = defaults.events;
    	      this.previousState = defaults.previousState;
    	      this.restartCount = defaults.restartCount;
        }

        public Builder setCurrentState(ContainerStateResponse currentState) {
            this.currentState = Objects.requireNonNull(currentState);
            return this;
        }

        public Builder setEvents(List<EventResponse> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder setPreviousState(ContainerStateResponse previousState) {
            this.previousState = Objects.requireNonNull(previousState);
            return this;
        }

        public Builder setRestartCount(Integer restartCount) {
            this.restartCount = Objects.requireNonNull(restartCount);
            return this;
        }
        public InitContainerPropertiesDefinitionResponseInstanceView build() {
            return new InitContainerPropertiesDefinitionResponseInstanceView(currentState, events, previousState, restartCount);
        }
    }
}