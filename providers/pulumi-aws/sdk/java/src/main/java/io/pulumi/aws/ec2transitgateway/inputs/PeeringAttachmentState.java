// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PeeringAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final PeeringAttachmentState Empty = new PeeringAttachmentState();

    /**
     * Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
     * 
     */
    @Import(name="peerAccountId")
      private final @Nullable Output<String> peerAccountId;

    public Output<String> peerAccountId() {
        return this.peerAccountId == null ? Codegen.empty() : this.peerAccountId;
    }

    /**
     * Region of EC2 Transit Gateway to peer with.
     * 
     */
    @Import(name="peerRegion")
      private final @Nullable Output<String> peerRegion;

    public Output<String> peerRegion() {
        return this.peerRegion == null ? Codegen.empty() : this.peerRegion;
    }

    /**
     * Identifier of EC2 Transit Gateway to peer with.
     * 
     */
    @Import(name="peerTransitGatewayId")
      private final @Nullable Output<String> peerTransitGatewayId;

    public Output<String> peerTransitGatewayId() {
        return this.peerTransitGatewayId == null ? Codegen.empty() : this.peerTransitGatewayId;
    }

    /**
     * Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * Identifier of EC2 Transit Gateway.
     * 
     */
    @Import(name="transitGatewayId")
      private final @Nullable Output<String> transitGatewayId;

    public Output<String> transitGatewayId() {
        return this.transitGatewayId == null ? Codegen.empty() : this.transitGatewayId;
    }

    public PeeringAttachmentState(
        @Nullable Output<String> peerAccountId,
        @Nullable Output<String> peerRegion,
        @Nullable Output<String> peerTransitGatewayId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> transitGatewayId) {
        this.peerAccountId = peerAccountId;
        this.peerRegion = peerRegion;
        this.peerTransitGatewayId = peerTransitGatewayId;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.transitGatewayId = transitGatewayId;
    }

    private PeeringAttachmentState() {
        this.peerAccountId = Codegen.empty();
        this.peerRegion = Codegen.empty();
        this.peerTransitGatewayId = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.transitGatewayId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> peerAccountId;
        private @Nullable Output<String> peerRegion;
        private @Nullable Output<String> peerTransitGatewayId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> transitGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peerAccountId = defaults.peerAccountId;
    	      this.peerRegion = defaults.peerRegion;
    	      this.peerTransitGatewayId = defaults.peerTransitGatewayId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.transitGatewayId = defaults.transitGatewayId;
        }

        public Builder peerAccountId(@Nullable Output<String> peerAccountId) {
            this.peerAccountId = peerAccountId;
            return this;
        }
        public Builder peerAccountId(@Nullable String peerAccountId) {
            this.peerAccountId = Codegen.ofNullable(peerAccountId);
            return this;
        }
        public Builder peerRegion(@Nullable Output<String> peerRegion) {
            this.peerRegion = peerRegion;
            return this;
        }
        public Builder peerRegion(@Nullable String peerRegion) {
            this.peerRegion = Codegen.ofNullable(peerRegion);
            return this;
        }
        public Builder peerTransitGatewayId(@Nullable Output<String> peerTransitGatewayId) {
            this.peerTransitGatewayId = peerTransitGatewayId;
            return this;
        }
        public Builder peerTransitGatewayId(@Nullable String peerTransitGatewayId) {
            this.peerTransitGatewayId = Codegen.ofNullable(peerTransitGatewayId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder transitGatewayId(@Nullable Output<String> transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }
        public Builder transitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = Codegen.ofNullable(transitGatewayId);
            return this;
        }        public PeeringAttachmentState build() {
            return new PeeringAttachmentState(peerAccountId, peerRegion, peerTransitGatewayId, tags, tagsAll, transitGatewayId);
        }
    }
}
