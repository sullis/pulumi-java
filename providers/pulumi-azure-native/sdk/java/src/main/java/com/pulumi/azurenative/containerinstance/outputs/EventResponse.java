// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventResponse {
    /**
     * @return The count of the event.
     * 
     */
    private final Integer count;
    /**
     * @return The date-time of the earliest logged event.
     * 
     */
    private final String firstTimestamp;
    /**
     * @return The date-time of the latest logged event.
     * 
     */
    private final String lastTimestamp;
    /**
     * @return The event message.
     * 
     */
    private final String message;
    /**
     * @return The event name.
     * 
     */
    private final String name;
    /**
     * @return The event type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private EventResponse(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("firstTimestamp") String firstTimestamp,
        @CustomType.Parameter("lastTimestamp") String lastTimestamp,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.count = count;
        this.firstTimestamp = firstTimestamp;
        this.lastTimestamp = lastTimestamp;
        this.message = message;
        this.name = name;
        this.type = type;
    }

    /**
     * @return The count of the event.
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return The date-time of the earliest logged event.
     * 
     */
    public String firstTimestamp() {
        return this.firstTimestamp;
    }
    /**
     * @return The date-time of the latest logged event.
     * 
     */
    public String lastTimestamp() {
        return this.lastTimestamp;
    }
    /**
     * @return The event message.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return The event name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The event type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String firstTimestamp;
        private String lastTimestamp;
        private String message;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EventResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.firstTimestamp = defaults.firstTimestamp;
    	      this.lastTimestamp = defaults.lastTimestamp;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder firstTimestamp(String firstTimestamp) {
            this.firstTimestamp = Objects.requireNonNull(firstTimestamp);
            return this;
        }
        public Builder lastTimestamp(String lastTimestamp) {
            this.lastTimestamp = Objects.requireNonNull(lastTimestamp);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public EventResponse build() {
            return new EventResponse(count, firstTimestamp, lastTimestamp, message, name, type);
        }
    }
}
