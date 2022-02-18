// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.events.k8s.io_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EventSeries {
    /**
     * count is the number of occurrences in this series up to the last heartbeat time.
     * 
     */
    private final Integer count;
    /**
     * lastObservedTime is the time when last Event from the series was seen before last heartbeat.
     * 
     */
    private final String lastObservedTime;

    @OutputCustomType.Constructor({"count","lastObservedTime"})
    private EventSeries(
        Integer count,
        String lastObservedTime) {
        this.count = Objects.requireNonNull(count);
        this.lastObservedTime = Objects.requireNonNull(lastObservedTime);
    }

    /**
     * count is the number of occurrences in this series up to the last heartbeat time.
     * 
     */
    public Integer getCount() {
        return this.count;
    }
    /**
     * lastObservedTime is the time when last Event from the series was seen before last heartbeat.
     * 
     */
    public String getLastObservedTime() {
        return this.lastObservedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSeries defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String lastObservedTime;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSeries defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.lastObservedTime = defaults.lastObservedTime;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setLastObservedTime(String lastObservedTime) {
            this.lastObservedTime = Objects.requireNonNull(lastObservedTime);
            return this;
        }

        public EventSeries build() {
            return new EventSeries(count, lastObservedTime);
        }
    }
}
