// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.TransitGatewayTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransitGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayArgs Empty = new TransitGatewayArgs();

    @InputImport(name="amazonSideAsn")
    private final @Nullable Input<Integer> amazonSideAsn;

    public Input<Integer> getAmazonSideAsn() {
        return this.amazonSideAsn == null ? Input.empty() : this.amazonSideAsn;
    }

    @InputImport(name="associationDefaultRouteTableId")
    private final @Nullable Input<String> associationDefaultRouteTableId;

    public Input<String> getAssociationDefaultRouteTableId() {
        return this.associationDefaultRouteTableId == null ? Input.empty() : this.associationDefaultRouteTableId;
    }

    @InputImport(name="autoAcceptSharedAttachments")
    private final @Nullable Input<String> autoAcceptSharedAttachments;

    public Input<String> getAutoAcceptSharedAttachments() {
        return this.autoAcceptSharedAttachments == null ? Input.empty() : this.autoAcceptSharedAttachments;
    }

    @InputImport(name="defaultRouteTableAssociation")
    private final @Nullable Input<String> defaultRouteTableAssociation;

    public Input<String> getDefaultRouteTableAssociation() {
        return this.defaultRouteTableAssociation == null ? Input.empty() : this.defaultRouteTableAssociation;
    }

    @InputImport(name="defaultRouteTablePropagation")
    private final @Nullable Input<String> defaultRouteTablePropagation;

    public Input<String> getDefaultRouteTablePropagation() {
        return this.defaultRouteTablePropagation == null ? Input.empty() : this.defaultRouteTablePropagation;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="dnsSupport")
    private final @Nullable Input<String> dnsSupport;

    public Input<String> getDnsSupport() {
        return this.dnsSupport == null ? Input.empty() : this.dnsSupport;
    }

    @InputImport(name="multicastSupport")
    private final @Nullable Input<String> multicastSupport;

    public Input<String> getMulticastSupport() {
        return this.multicastSupport == null ? Input.empty() : this.multicastSupport;
    }

    @InputImport(name="propagationDefaultRouteTableId")
    private final @Nullable Input<String> propagationDefaultRouteTableId;

    public Input<String> getPropagationDefaultRouteTableId() {
        return this.propagationDefaultRouteTableId == null ? Input.empty() : this.propagationDefaultRouteTableId;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<TransitGatewayTagArgs>> tags;

    public Input<List<TransitGatewayTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="transitGatewayCidrBlocks")
    private final @Nullable Input<List<String>> transitGatewayCidrBlocks;

    public Input<List<String>> getTransitGatewayCidrBlocks() {
        return this.transitGatewayCidrBlocks == null ? Input.empty() : this.transitGatewayCidrBlocks;
    }

    @InputImport(name="vpnEcmpSupport")
    private final @Nullable Input<String> vpnEcmpSupport;

    public Input<String> getVpnEcmpSupport() {
        return this.vpnEcmpSupport == null ? Input.empty() : this.vpnEcmpSupport;
    }

    public TransitGatewayArgs(
        @Nullable Input<Integer> amazonSideAsn,
        @Nullable Input<String> associationDefaultRouteTableId,
        @Nullable Input<String> autoAcceptSharedAttachments,
        @Nullable Input<String> defaultRouteTableAssociation,
        @Nullable Input<String> defaultRouteTablePropagation,
        @Nullable Input<String> description,
        @Nullable Input<String> dnsSupport,
        @Nullable Input<String> multicastSupport,
        @Nullable Input<String> propagationDefaultRouteTableId,
        @Nullable Input<List<TransitGatewayTagArgs>> tags,
        @Nullable Input<List<String>> transitGatewayCidrBlocks,
        @Nullable Input<String> vpnEcmpSupport) {
        this.amazonSideAsn = amazonSideAsn;
        this.associationDefaultRouteTableId = associationDefaultRouteTableId;
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
        this.defaultRouteTableAssociation = defaultRouteTableAssociation;
        this.defaultRouteTablePropagation = defaultRouteTablePropagation;
        this.description = description;
        this.dnsSupport = dnsSupport;
        this.multicastSupport = multicastSupport;
        this.propagationDefaultRouteTableId = propagationDefaultRouteTableId;
        this.tags = tags;
        this.transitGatewayCidrBlocks = transitGatewayCidrBlocks;
        this.vpnEcmpSupport = vpnEcmpSupport;
    }

    private TransitGatewayArgs() {
        this.amazonSideAsn = Input.empty();
        this.associationDefaultRouteTableId = Input.empty();
        this.autoAcceptSharedAttachments = Input.empty();
        this.defaultRouteTableAssociation = Input.empty();
        this.defaultRouteTablePropagation = Input.empty();
        this.description = Input.empty();
        this.dnsSupport = Input.empty();
        this.multicastSupport = Input.empty();
        this.propagationDefaultRouteTableId = Input.empty();
        this.tags = Input.empty();
        this.transitGatewayCidrBlocks = Input.empty();
        this.vpnEcmpSupport = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> amazonSideAsn;
        private @Nullable Input<String> associationDefaultRouteTableId;
        private @Nullable Input<String> autoAcceptSharedAttachments;
        private @Nullable Input<String> defaultRouteTableAssociation;
        private @Nullable Input<String> defaultRouteTablePropagation;
        private @Nullable Input<String> description;
        private @Nullable Input<String> dnsSupport;
        private @Nullable Input<String> multicastSupport;
        private @Nullable Input<String> propagationDefaultRouteTableId;
        private @Nullable Input<List<TransitGatewayTagArgs>> tags;
        private @Nullable Input<List<String>> transitGatewayCidrBlocks;
        private @Nullable Input<String> vpnEcmpSupport;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonSideAsn = defaults.amazonSideAsn;
    	      this.associationDefaultRouteTableId = defaults.associationDefaultRouteTableId;
    	      this.autoAcceptSharedAttachments = defaults.autoAcceptSharedAttachments;
    	      this.defaultRouteTableAssociation = defaults.defaultRouteTableAssociation;
    	      this.defaultRouteTablePropagation = defaults.defaultRouteTablePropagation;
    	      this.description = defaults.description;
    	      this.dnsSupport = defaults.dnsSupport;
    	      this.multicastSupport = defaults.multicastSupport;
    	      this.propagationDefaultRouteTableId = defaults.propagationDefaultRouteTableId;
    	      this.tags = defaults.tags;
    	      this.transitGatewayCidrBlocks = defaults.transitGatewayCidrBlocks;
    	      this.vpnEcmpSupport = defaults.vpnEcmpSupport;
        }

        public Builder setAmazonSideAsn(@Nullable Input<Integer> amazonSideAsn) {
            this.amazonSideAsn = amazonSideAsn;
            return this;
        }

        public Builder setAmazonSideAsn(@Nullable Integer amazonSideAsn) {
            this.amazonSideAsn = Input.ofNullable(amazonSideAsn);
            return this;
        }

        public Builder setAssociationDefaultRouteTableId(@Nullable Input<String> associationDefaultRouteTableId) {
            this.associationDefaultRouteTableId = associationDefaultRouteTableId;
            return this;
        }

        public Builder setAssociationDefaultRouteTableId(@Nullable String associationDefaultRouteTableId) {
            this.associationDefaultRouteTableId = Input.ofNullable(associationDefaultRouteTableId);
            return this;
        }

        public Builder setAutoAcceptSharedAttachments(@Nullable Input<String> autoAcceptSharedAttachments) {
            this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
            return this;
        }

        public Builder setAutoAcceptSharedAttachments(@Nullable String autoAcceptSharedAttachments) {
            this.autoAcceptSharedAttachments = Input.ofNullable(autoAcceptSharedAttachments);
            return this;
        }

        public Builder setDefaultRouteTableAssociation(@Nullable Input<String> defaultRouteTableAssociation) {
            this.defaultRouteTableAssociation = defaultRouteTableAssociation;
            return this;
        }

        public Builder setDefaultRouteTableAssociation(@Nullable String defaultRouteTableAssociation) {
            this.defaultRouteTableAssociation = Input.ofNullable(defaultRouteTableAssociation);
            return this;
        }

        public Builder setDefaultRouteTablePropagation(@Nullable Input<String> defaultRouteTablePropagation) {
            this.defaultRouteTablePropagation = defaultRouteTablePropagation;
            return this;
        }

        public Builder setDefaultRouteTablePropagation(@Nullable String defaultRouteTablePropagation) {
            this.defaultRouteTablePropagation = Input.ofNullable(defaultRouteTablePropagation);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDnsSupport(@Nullable Input<String> dnsSupport) {
            this.dnsSupport = dnsSupport;
            return this;
        }

        public Builder setDnsSupport(@Nullable String dnsSupport) {
            this.dnsSupport = Input.ofNullable(dnsSupport);
            return this;
        }

        public Builder setMulticastSupport(@Nullable Input<String> multicastSupport) {
            this.multicastSupport = multicastSupport;
            return this;
        }

        public Builder setMulticastSupport(@Nullable String multicastSupport) {
            this.multicastSupport = Input.ofNullable(multicastSupport);
            return this;
        }

        public Builder setPropagationDefaultRouteTableId(@Nullable Input<String> propagationDefaultRouteTableId) {
            this.propagationDefaultRouteTableId = propagationDefaultRouteTableId;
            return this;
        }

        public Builder setPropagationDefaultRouteTableId(@Nullable String propagationDefaultRouteTableId) {
            this.propagationDefaultRouteTableId = Input.ofNullable(propagationDefaultRouteTableId);
            return this;
        }

        public Builder setTags(@Nullable Input<List<TransitGatewayTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<TransitGatewayTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTransitGatewayCidrBlocks(@Nullable Input<List<String>> transitGatewayCidrBlocks) {
            this.transitGatewayCidrBlocks = transitGatewayCidrBlocks;
            return this;
        }

        public Builder setTransitGatewayCidrBlocks(@Nullable List<String> transitGatewayCidrBlocks) {
            this.transitGatewayCidrBlocks = Input.ofNullable(transitGatewayCidrBlocks);
            return this;
        }

        public Builder setVpnEcmpSupport(@Nullable Input<String> vpnEcmpSupport) {
            this.vpnEcmpSupport = vpnEcmpSupport;
            return this;
        }

        public Builder setVpnEcmpSupport(@Nullable String vpnEcmpSupport) {
            this.vpnEcmpSupport = Input.ofNullable(vpnEcmpSupport);
            return this;
        }

        public TransitGatewayArgs build() {
            return new TransitGatewayArgs(amazonSideAsn, associationDefaultRouteTableId, autoAcceptSharedAttachments, defaultRouteTableAssociation, defaultRouteTablePropagation, description, dnsSupport, multicastSupport, propagationDefaultRouteTableId, tags, transitGatewayCidrBlocks, vpnEcmpSupport);
        }
    }
}
