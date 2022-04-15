// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransitGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayArgs Empty = new TransitGatewayArgs();

    /**
     * Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
     * 
     */
    @Import(name="amazonSideAsn")
      private final @Nullable Output<Integer> amazonSideAsn;

    public Output<Integer> amazonSideAsn() {
        return this.amazonSideAsn == null ? Codegen.empty() : this.amazonSideAsn;
    }

    /**
     * Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @Import(name="autoAcceptSharedAttachments")
      private final @Nullable Output<String> autoAcceptSharedAttachments;

    public Output<String> autoAcceptSharedAttachments() {
        return this.autoAcceptSharedAttachments == null ? Codegen.empty() : this.autoAcceptSharedAttachments;
    }

    /**
     * Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @Import(name="defaultRouteTableAssociation")
      private final @Nullable Output<String> defaultRouteTableAssociation;

    public Output<String> defaultRouteTableAssociation() {
        return this.defaultRouteTableAssociation == null ? Codegen.empty() : this.defaultRouteTableAssociation;
    }

    /**
     * Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @Import(name="defaultRouteTablePropagation")
      private final @Nullable Output<String> defaultRouteTablePropagation;

    public Output<String> defaultRouteTablePropagation() {
        return this.defaultRouteTablePropagation == null ? Codegen.empty() : this.defaultRouteTablePropagation;
    }

    /**
     * Description of the EC2 Transit Gateway.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @Import(name="dnsSupport")
      private final @Nullable Output<String> dnsSupport;

    public Output<String> dnsSupport() {
        return this.dnsSupport == null ? Codegen.empty() : this.dnsSupport;
    }

    /**
     * Key-value tags for the EC2 Transit Gateway. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @Import(name="vpnEcmpSupport")
      private final @Nullable Output<String> vpnEcmpSupport;

    public Output<String> vpnEcmpSupport() {
        return this.vpnEcmpSupport == null ? Codegen.empty() : this.vpnEcmpSupport;
    }

    public TransitGatewayArgs(
        @Nullable Output<Integer> amazonSideAsn,
        @Nullable Output<String> autoAcceptSharedAttachments,
        @Nullable Output<String> defaultRouteTableAssociation,
        @Nullable Output<String> defaultRouteTablePropagation,
        @Nullable Output<String> description,
        @Nullable Output<String> dnsSupport,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> vpnEcmpSupport) {
        this.amazonSideAsn = amazonSideAsn;
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
        this.defaultRouteTableAssociation = defaultRouteTableAssociation;
        this.defaultRouteTablePropagation = defaultRouteTablePropagation;
        this.description = description;
        this.dnsSupport = dnsSupport;
        this.tags = tags;
        this.vpnEcmpSupport = vpnEcmpSupport;
    }

    private TransitGatewayArgs() {
        this.amazonSideAsn = Codegen.empty();
        this.autoAcceptSharedAttachments = Codegen.empty();
        this.defaultRouteTableAssociation = Codegen.empty();
        this.defaultRouteTablePropagation = Codegen.empty();
        this.description = Codegen.empty();
        this.dnsSupport = Codegen.empty();
        this.tags = Codegen.empty();
        this.vpnEcmpSupport = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> amazonSideAsn;
        private @Nullable Output<String> autoAcceptSharedAttachments;
        private @Nullable Output<String> defaultRouteTableAssociation;
        private @Nullable Output<String> defaultRouteTablePropagation;
        private @Nullable Output<String> description;
        private @Nullable Output<String> dnsSupport;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> vpnEcmpSupport;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonSideAsn = defaults.amazonSideAsn;
    	      this.autoAcceptSharedAttachments = defaults.autoAcceptSharedAttachments;
    	      this.defaultRouteTableAssociation = defaults.defaultRouteTableAssociation;
    	      this.defaultRouteTablePropagation = defaults.defaultRouteTablePropagation;
    	      this.description = defaults.description;
    	      this.dnsSupport = defaults.dnsSupport;
    	      this.tags = defaults.tags;
    	      this.vpnEcmpSupport = defaults.vpnEcmpSupport;
        }

        public Builder amazonSideAsn(@Nullable Output<Integer> amazonSideAsn) {
            this.amazonSideAsn = amazonSideAsn;
            return this;
        }
        public Builder amazonSideAsn(@Nullable Integer amazonSideAsn) {
            this.amazonSideAsn = Codegen.ofNullable(amazonSideAsn);
            return this;
        }
        public Builder autoAcceptSharedAttachments(@Nullable Output<String> autoAcceptSharedAttachments) {
            this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
            return this;
        }
        public Builder autoAcceptSharedAttachments(@Nullable String autoAcceptSharedAttachments) {
            this.autoAcceptSharedAttachments = Codegen.ofNullable(autoAcceptSharedAttachments);
            return this;
        }
        public Builder defaultRouteTableAssociation(@Nullable Output<String> defaultRouteTableAssociation) {
            this.defaultRouteTableAssociation = defaultRouteTableAssociation;
            return this;
        }
        public Builder defaultRouteTableAssociation(@Nullable String defaultRouteTableAssociation) {
            this.defaultRouteTableAssociation = Codegen.ofNullable(defaultRouteTableAssociation);
            return this;
        }
        public Builder defaultRouteTablePropagation(@Nullable Output<String> defaultRouteTablePropagation) {
            this.defaultRouteTablePropagation = defaultRouteTablePropagation;
            return this;
        }
        public Builder defaultRouteTablePropagation(@Nullable String defaultRouteTablePropagation) {
            this.defaultRouteTablePropagation = Codegen.ofNullable(defaultRouteTablePropagation);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder dnsSupport(@Nullable Output<String> dnsSupport) {
            this.dnsSupport = dnsSupport;
            return this;
        }
        public Builder dnsSupport(@Nullable String dnsSupport) {
            this.dnsSupport = Codegen.ofNullable(dnsSupport);
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
        public Builder vpnEcmpSupport(@Nullable Output<String> vpnEcmpSupport) {
            this.vpnEcmpSupport = vpnEcmpSupport;
            return this;
        }
        public Builder vpnEcmpSupport(@Nullable String vpnEcmpSupport) {
            this.vpnEcmpSupport = Codegen.ofNullable(vpnEcmpSupport);
            return this;
        }        public TransitGatewayArgs build() {
            return new TransitGatewayArgs(amazonSideAsn, autoAcceptSharedAttachments, defaultRouteTableAssociation, defaultRouteTablePropagation, description, dnsSupport, tags, vpnEcmpSupport);
        }
    }
}
