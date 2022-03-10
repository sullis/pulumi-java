// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTransitGatewayMulticastGroupSourceResult {
    /**
     * Indicates that the resource is a transit gateway multicast group member.
     * 
     */
    private final @Nullable Boolean groupMember;
    /**
     * Indicates that the resource is a transit gateway multicast group member.
     * 
     */
    private final @Nullable Boolean groupSource;
    /**
     * The member type (for example, static).
     * 
     */
    private final @Nullable String memberType;
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
     * The source type.
     * 
     */
    private final @Nullable String sourceType;
    /**
     * The ID of the subnet.
     * 
     */
    private final @Nullable String subnetId;
    /**
     * The ID of the transit gateway attachment.
     * 
     */
    private final @Nullable String transitGatewayAttachmentId;

    @OutputCustomType.Constructor
    private GetTransitGatewayMulticastGroupSourceResult(
        @OutputCustomType.Parameter("groupMember") @Nullable Boolean groupMember,
        @OutputCustomType.Parameter("groupSource") @Nullable Boolean groupSource,
        @OutputCustomType.Parameter("memberType") @Nullable String memberType,
        @OutputCustomType.Parameter("resourceId") @Nullable String resourceId,
        @OutputCustomType.Parameter("resourceType") @Nullable String resourceType,
        @OutputCustomType.Parameter("sourceType") @Nullable String sourceType,
        @OutputCustomType.Parameter("subnetId") @Nullable String subnetId,
        @OutputCustomType.Parameter("transitGatewayAttachmentId") @Nullable String transitGatewayAttachmentId) {
        this.groupMember = groupMember;
        this.groupSource = groupSource;
        this.memberType = memberType;
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.sourceType = sourceType;
        this.subnetId = subnetId;
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * Indicates that the resource is a transit gateway multicast group member.
     * 
    */
    public Optional<Boolean> getGroupMember() {
        return Optional.ofNullable(this.groupMember);
    }
    /**
     * Indicates that the resource is a transit gateway multicast group member.
     * 
    */
    public Optional<Boolean> getGroupSource() {
        return Optional.ofNullable(this.groupSource);
    }
    /**
     * The member type (for example, static).
     * 
    */
    public Optional<String> getMemberType() {
        return Optional.ofNullable(this.memberType);
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
     * The source type.
     * 
    */
    public Optional<String> getSourceType() {
        return Optional.ofNullable(this.sourceType);
    }
    /**
     * The ID of the subnet.
     * 
    */
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * The ID of the transit gateway attachment.
     * 
    */
    public Optional<String> getTransitGatewayAttachmentId() {
        return Optional.ofNullable(this.transitGatewayAttachmentId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayMulticastGroupSourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean groupMember;
        private @Nullable Boolean groupSource;
        private @Nullable String memberType;
        private @Nullable String resourceId;
        private @Nullable String resourceType;
        private @Nullable String sourceType;
        private @Nullable String subnetId;
        private @Nullable String transitGatewayAttachmentId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitGatewayMulticastGroupSourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupMember = defaults.groupMember;
    	      this.groupSource = defaults.groupSource;
    	      this.memberType = defaults.memberType;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
    	      this.sourceType = defaults.sourceType;
    	      this.subnetId = defaults.subnetId;
    	      this.transitGatewayAttachmentId = defaults.transitGatewayAttachmentId;
        }

        public Builder setGroupMember(@Nullable Boolean groupMember) {
            this.groupMember = groupMember;
            return this;
        }

        public Builder setGroupSource(@Nullable Boolean groupSource) {
            this.groupSource = groupSource;
            return this;
        }

        public Builder setMemberType(@Nullable String memberType) {
            this.memberType = memberType;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setSourceType(@Nullable String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setTransitGatewayAttachmentId(@Nullable String transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = transitGatewayAttachmentId;
            return this;
        }
        public GetTransitGatewayMulticastGroupSourceResult build() {
            return new GetTransitGatewayMulticastGroupSourceResult(groupMember, groupSource, memberType, resourceId, resourceType, sourceType, subnetId, transitGatewayAttachmentId);
        }
    }
}
