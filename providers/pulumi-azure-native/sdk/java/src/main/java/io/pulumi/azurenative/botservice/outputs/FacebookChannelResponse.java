// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.azurenative.botservice.outputs.FacebookChannelPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FacebookChannelResponse {
    /**
     * The channel name
     * Expected value is 'FacebookChannel'.
     * 
     */
    private final String channelName;
    /**
     * Entity Tag of the resource
     * 
     */
    private final @Nullable String etag;
    /**
     * Specifies the location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * The set of properties specific to bot facebook channel
     * 
     */
    private final @Nullable FacebookChannelPropertiesResponse properties;
    /**
     * Provisioning state of the resource
     * 
     */
    private final String provisioningState;

    @OutputCustomType.Constructor({"channelName","etag","location","properties","provisioningState"})
    private FacebookChannelResponse(
        String channelName,
        @Nullable String etag,
        @Nullable String location,
        @Nullable FacebookChannelPropertiesResponse properties,
        String provisioningState) {
        this.channelName = Objects.requireNonNull(channelName);
        this.etag = etag;
        this.location = location;
        this.properties = properties;
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    /**
     * The channel name
     * Expected value is 'FacebookChannel'.
     * 
    */
    public String getChannelName() {
        return this.channelName;
    }
    /**
     * Entity Tag of the resource
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Specifies the location of the resource.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The set of properties specific to bot facebook channel
     * 
    */
    public Optional<FacebookChannelPropertiesResponse> getProperties() {
        return Optional.ofNullable(this.properties);
    }
    /**
     * Provisioning state of the resource
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FacebookChannelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channelName;
        private @Nullable String etag;
        private @Nullable String location;
        private @Nullable FacebookChannelPropertiesResponse properties;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(FacebookChannelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelName = defaults.channelName;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setChannelName(String channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setProperties(@Nullable FacebookChannelPropertiesResponse properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public FacebookChannelResponse build() {
            return new FacebookChannelResponse(channelName, etag, location, properties, provisioningState);
        }
    }
}