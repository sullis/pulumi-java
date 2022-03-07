// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventSeries {
    /**
     * Number of occurrences in this series up to the last heartbeat time
     * 
     */
    private final @Nullable Integer count;
    /**
     * Time of the last occurrence observed
     * 
     */
    private final @Nullable String lastObservedTime;
    /**
     * State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18
     * 
     */
    private final @Nullable String state;

    @OutputCustomType.Constructor({"count","lastObservedTime","state"})
    private EventSeries(
        @Nullable Integer count,
        @Nullable String lastObservedTime,
        @Nullable String state) {
        this.count = count;
        this.lastObservedTime = lastObservedTime;
        this.state = state;
    }

    /**
     * Number of occurrences in this series up to the last heartbeat time
     * 
    */
    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }
    /**
     * Time of the last occurrence observed
     * 
    */
    public Optional<String> getLastObservedTime() {
        return Optional.ofNullable(this.lastObservedTime);
    }
    /**
     * State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSeries defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String lastObservedTime;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSeries defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.lastObservedTime = defaults.lastObservedTime;
    	      this.state = defaults.state;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder setLastObservedTime(@Nullable String lastObservedTime) {
            this.lastObservedTime = lastObservedTime;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }
        public EventSeries build() {
            return new EventSeries(count, lastObservedTime, state);
        }
    }
}