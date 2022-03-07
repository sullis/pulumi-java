// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.LocalGatewayRouteTableVPCAssociationTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLocalGatewayRouteTableVPCAssociationResult {
    /**
     * The ID of the local gateway.
     * 
     */
    private final @Nullable String localGatewayId;
    /**
     * The ID of the association.
     * 
     */
    private final @Nullable String localGatewayRouteTableVpcAssociationId;
    /**
     * The state of the association.
     * 
     */
    private final @Nullable String state;
    /**
     * The tags for the association.
     * 
     */
    private final @Nullable List<LocalGatewayRouteTableVPCAssociationTag> tags;

    @OutputCustomType.Constructor({"localGatewayId","localGatewayRouteTableVpcAssociationId","state","tags"})
    private GetLocalGatewayRouteTableVPCAssociationResult(
        @Nullable String localGatewayId,
        @Nullable String localGatewayRouteTableVpcAssociationId,
        @Nullable String state,
        @Nullable List<LocalGatewayRouteTableVPCAssociationTag> tags) {
        this.localGatewayId = localGatewayId;
        this.localGatewayRouteTableVpcAssociationId = localGatewayRouteTableVpcAssociationId;
        this.state = state;
        this.tags = tags;
    }

    /**
     * The ID of the local gateway.
     * 
    */
    public Optional<String> getLocalGatewayId() {
        return Optional.ofNullable(this.localGatewayId);
    }
    /**
     * The ID of the association.
     * 
    */
    public Optional<String> getLocalGatewayRouteTableVpcAssociationId() {
        return Optional.ofNullable(this.localGatewayRouteTableVpcAssociationId);
    }
    /**
     * The state of the association.
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * The tags for the association.
     * 
    */
    public List<LocalGatewayRouteTableVPCAssociationTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayRouteTableVPCAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String localGatewayId;
        private @Nullable String localGatewayRouteTableVpcAssociationId;
        private @Nullable String state;
        private @Nullable List<LocalGatewayRouteTableVPCAssociationTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalGatewayRouteTableVPCAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localGatewayId = defaults.localGatewayId;
    	      this.localGatewayRouteTableVpcAssociationId = defaults.localGatewayRouteTableVpcAssociationId;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        public Builder setLocalGatewayId(@Nullable String localGatewayId) {
            this.localGatewayId = localGatewayId;
            return this;
        }

        public Builder setLocalGatewayRouteTableVpcAssociationId(@Nullable String localGatewayRouteTableVpcAssociationId) {
            this.localGatewayRouteTableVpcAssociationId = localGatewayRouteTableVpcAssociationId;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setTags(@Nullable List<LocalGatewayRouteTableVPCAssociationTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetLocalGatewayRouteTableVPCAssociationResult build() {
            return new GetLocalGatewayRouteTableVPCAssociationResult(localGatewayId, localGatewayRouteTableVpcAssociationId, state, tags);
        }
    }
}