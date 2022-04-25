// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deviceupdate.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IotHubSettingsResponse {
    /**
     * @return EventHub connection string.
     * 
     */
    private final @Nullable String eventHubConnectionString;
    /**
     * @return IoTHub connection string.
     * 
     */
    private final @Nullable String ioTHubConnectionString;
    /**
     * @return IoTHub resource ID
     * 
     */
    private final String resourceId;

    @CustomType.Constructor
    private IotHubSettingsResponse(
        @CustomType.Parameter("eventHubConnectionString") @Nullable String eventHubConnectionString,
        @CustomType.Parameter("ioTHubConnectionString") @Nullable String ioTHubConnectionString,
        @CustomType.Parameter("resourceId") String resourceId) {
        this.eventHubConnectionString = eventHubConnectionString;
        this.ioTHubConnectionString = ioTHubConnectionString;
        this.resourceId = resourceId;
    }

    /**
     * @return EventHub connection string.
     * 
     */
    public Optional<String> eventHubConnectionString() {
        return Optional.ofNullable(this.eventHubConnectionString);
    }
    /**
     * @return IoTHub connection string.
     * 
     */
    public Optional<String> ioTHubConnectionString() {
        return Optional.ofNullable(this.ioTHubConnectionString);
    }
    /**
     * @return IoTHub resource ID
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eventHubConnectionString;
        private @Nullable String ioTHubConnectionString;
        private String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(IotHubSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubConnectionString = defaults.eventHubConnectionString;
    	      this.ioTHubConnectionString = defaults.ioTHubConnectionString;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder eventHubConnectionString(@Nullable String eventHubConnectionString) {
            this.eventHubConnectionString = eventHubConnectionString;
            return this;
        }
        public Builder ioTHubConnectionString(@Nullable String ioTHubConnectionString) {
            this.ioTHubConnectionString = ioTHubConnectionString;
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }        public IotHubSettingsResponse build() {
            return new IotHubSettingsResponse(eventHubConnectionString, ioTHubConnectionString, resourceId);
        }
    }
}
