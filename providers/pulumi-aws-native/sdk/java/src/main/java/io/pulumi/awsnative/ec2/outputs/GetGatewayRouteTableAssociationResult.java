// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGatewayRouteTableAssociationResult {
    /**
     * The route table association ID.
     * 
     */
    private final @Nullable String associationId;
    /**
     * The ID of the route table.
     * 
     */
    private final @Nullable String routeTableId;

    @CustomType.Constructor
    private GetGatewayRouteTableAssociationResult(
        @CustomType.Parameter("associationId") @Nullable String associationId,
        @CustomType.Parameter("routeTableId") @Nullable String routeTableId) {
        this.associationId = associationId;
        this.routeTableId = routeTableId;
    }

    /**
     * The route table association ID.
     * 
    */
    public Optional<String> getAssociationId() {
        return Optional.ofNullable(this.associationId);
    }
    /**
     * The ID of the route table.
     * 
    */
    public Optional<String> getRouteTableId() {
        return Optional.ofNullable(this.routeTableId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayRouteTableAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String associationId;
        private @Nullable String routeTableId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayRouteTableAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationId = defaults.associationId;
    	      this.routeTableId = defaults.routeTableId;
        }

        public Builder associationId(@Nullable String associationId) {
            this.associationId = associationId;
            return this;
        }
        public Builder routeTableId(@Nullable String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }        public GetGatewayRouteTableAssociationResult build() {
            return new GetGatewayRouteTableAssociationResult(associationId, routeTableId);
        }
    }
}
