// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcAttachmentAccepterArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcAttachmentAccepterArgs Empty = new VpcAttachmentAccepterArgs();

    /**
     * Key-value tags for the EC2 Transit Gateway VPC Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The ID of the EC2 Transit Gateway Attachment to manage.
     * 
     */
    @Import(name="transitGatewayAttachmentId", required=true)
      private final Output<String> transitGatewayAttachmentId;

    public Output<String> transitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    /**
     * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
     * 
     */
    @Import(name="transitGatewayDefaultRouteTableAssociation")
      private final @Nullable Output<Boolean> transitGatewayDefaultRouteTableAssociation;

    public Output<Boolean> transitGatewayDefaultRouteTableAssociation() {
        return this.transitGatewayDefaultRouteTableAssociation == null ? Codegen.empty() : this.transitGatewayDefaultRouteTableAssociation;
    }

    /**
     * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
     * 
     */
    @Import(name="transitGatewayDefaultRouteTablePropagation")
      private final @Nullable Output<Boolean> transitGatewayDefaultRouteTablePropagation;

    public Output<Boolean> transitGatewayDefaultRouteTablePropagation() {
        return this.transitGatewayDefaultRouteTablePropagation == null ? Codegen.empty() : this.transitGatewayDefaultRouteTablePropagation;
    }

    public VpcAttachmentAccepterArgs(
        @Nullable Output<Map<String,String>> tags,
        Output<String> transitGatewayAttachmentId,
        @Nullable Output<Boolean> transitGatewayDefaultRouteTableAssociation,
        @Nullable Output<Boolean> transitGatewayDefaultRouteTablePropagation) {
        this.tags = tags;
        this.transitGatewayAttachmentId = Objects.requireNonNull(transitGatewayAttachmentId, "expected parameter 'transitGatewayAttachmentId' to be non-null");
        this.transitGatewayDefaultRouteTableAssociation = transitGatewayDefaultRouteTableAssociation;
        this.transitGatewayDefaultRouteTablePropagation = transitGatewayDefaultRouteTablePropagation;
    }

    private VpcAttachmentAccepterArgs() {
        this.tags = Codegen.empty();
        this.transitGatewayAttachmentId = Codegen.empty();
        this.transitGatewayDefaultRouteTableAssociation = Codegen.empty();
        this.transitGatewayDefaultRouteTablePropagation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcAttachmentAccepterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> transitGatewayAttachmentId;
        private @Nullable Output<Boolean> transitGatewayDefaultRouteTableAssociation;
        private @Nullable Output<Boolean> transitGatewayDefaultRouteTablePropagation;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcAttachmentAccepterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
    	      this.transitGatewayAttachmentId = defaults.transitGatewayAttachmentId;
    	      this.transitGatewayDefaultRouteTableAssociation = defaults.transitGatewayDefaultRouteTableAssociation;
    	      this.transitGatewayDefaultRouteTablePropagation = defaults.transitGatewayDefaultRouteTablePropagation;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder transitGatewayAttachmentId(Output<String> transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = Objects.requireNonNull(transitGatewayAttachmentId);
            return this;
        }
        public Builder transitGatewayAttachmentId(String transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = Output.of(Objects.requireNonNull(transitGatewayAttachmentId));
            return this;
        }
        public Builder transitGatewayDefaultRouteTableAssociation(@Nullable Output<Boolean> transitGatewayDefaultRouteTableAssociation) {
            this.transitGatewayDefaultRouteTableAssociation = transitGatewayDefaultRouteTableAssociation;
            return this;
        }
        public Builder transitGatewayDefaultRouteTableAssociation(@Nullable Boolean transitGatewayDefaultRouteTableAssociation) {
            this.transitGatewayDefaultRouteTableAssociation = Codegen.ofNullable(transitGatewayDefaultRouteTableAssociation);
            return this;
        }
        public Builder transitGatewayDefaultRouteTablePropagation(@Nullable Output<Boolean> transitGatewayDefaultRouteTablePropagation) {
            this.transitGatewayDefaultRouteTablePropagation = transitGatewayDefaultRouteTablePropagation;
            return this;
        }
        public Builder transitGatewayDefaultRouteTablePropagation(@Nullable Boolean transitGatewayDefaultRouteTablePropagation) {
            this.transitGatewayDefaultRouteTablePropagation = Codegen.ofNullable(transitGatewayDefaultRouteTablePropagation);
            return this;
        }        public VpcAttachmentAccepterArgs build() {
            return new VpcAttachmentAccepterArgs(tags, transitGatewayAttachmentId, transitGatewayDefaultRouteTableAssociation, transitGatewayDefaultRouteTablePropagation);
        }
    }
}
