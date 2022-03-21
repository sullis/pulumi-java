// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTransitGatewayMulticastDomainAssociationResult {
    /**
     * The ID of the resource.
     * 
     */
    private final @Nullable String resourceId;
    /**
     * The type of resource, for example a VPC attachment.
     * 
     */
    private final @Nullable String resourceType;
    /**
     * The state of the subnet association.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private GetTransitGatewayMulticastDomainAssociationResult(
        @CustomType.Parameter("resourceId") @Nullable String resourceId,
        @CustomType.Parameter("resourceType") @Nullable String resourceType,
        @CustomType.Parameter("state") @Nullable String state) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.state = state;
    }

    /**
     * The ID of the resource.
     * 
    */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * The type of resource, for example a VPC attachment.
     * 
    */
    public Optional<String> getPropResourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    /**
     * The state of the subnet association.
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayMulticastDomainAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceId;
        private @Nullable String resourceType;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitGatewayMulticastDomainAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
    	      this.state = defaults.state;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public GetTransitGatewayMulticastDomainAssociationResult build() {
            return new GetTransitGatewayMulticastDomainAssociationResult(resourceId, resourceType, state);
        }
    }
}
