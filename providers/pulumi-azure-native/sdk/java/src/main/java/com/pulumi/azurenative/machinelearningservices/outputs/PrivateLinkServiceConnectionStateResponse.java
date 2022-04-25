// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateLinkServiceConnectionStateResponse {
    /**
     * @return A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    private final @Nullable String actionsRequired;
    /**
     * @return The reason for approval/rejection of the connection.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private PrivateLinkServiceConnectionStateResponse(
        @CustomType.Parameter("actionsRequired") @Nullable String actionsRequired,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("status") @Nullable String status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = status;
    }

    /**
     * @return A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    public Optional<String> actionsRequired() {
        return Optional.ofNullable(this.actionsRequired);
    }
    /**
     * @return The reason for approval/rejection of the connection.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionsRequired;
        private @Nullable String description;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionsRequired(@Nullable String actionsRequired) {
            this.actionsRequired = actionsRequired;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public PrivateLinkServiceConnectionStateResponse build() {
            return new PrivateLinkServiceConnectionStateResponse(actionsRequired, description, status);
        }
    }
}
