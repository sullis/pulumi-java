// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelEvent;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelTransitionEvent;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorModelOnInput {
    private final @Nullable List<DetectorModelEvent> events;
    private final @Nullable List<DetectorModelTransitionEvent> transitionEvents;

    @OutputCustomType.Constructor({"events","transitionEvents"})
    private DetectorModelOnInput(
        @Nullable List<DetectorModelEvent> events,
        @Nullable List<DetectorModelTransitionEvent> transitionEvents) {
        this.events = events;
        this.transitionEvents = transitionEvents;
    }

    public List<DetectorModelEvent> getEvents() {
        return this.events == null ? List.of() : this.events;
    }
    public List<DetectorModelTransitionEvent> getTransitionEvents() {
        return this.transitionEvents == null ? List.of() : this.transitionEvents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelOnInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DetectorModelEvent> events;
        private @Nullable List<DetectorModelTransitionEvent> transitionEvents;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelOnInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
    	      this.transitionEvents = defaults.transitionEvents;
        }

        public Builder setEvents(@Nullable List<DetectorModelEvent> events) {
            this.events = events;
            return this;
        }

        public Builder setTransitionEvents(@Nullable List<DetectorModelTransitionEvent> transitionEvents) {
            this.transitionEvents = transitionEvents;
            return this;
        }

        public DetectorModelOnInput build() {
            return new DetectorModelOnInput(events, transitionEvents);
        }
    }
}
