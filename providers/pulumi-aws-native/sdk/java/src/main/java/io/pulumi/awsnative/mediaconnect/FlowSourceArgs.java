// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect;

import io.pulumi.awsnative.mediaconnect.enums.FlowSourceProtocol;
import io.pulumi.awsnative.mediaconnect.inputs.FlowSourceEncryptionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowSourceArgs Empty = new FlowSourceArgs();

    /**
     * The type of encryption that is used on the content ingested from this source.
     * 
     */
    @InputImport(name="decryption")
    private final @Nullable Input<FlowSourceEncryptionArgs> decryption;

    public Input<FlowSourceEncryptionArgs> getDecryption() {
        return this.decryption == null ? Input.empty() : this.decryption;
    }

    /**
     * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
     * 
     */
    @InputImport(name="description", required=true)
    private final Input<String> description;

    public Input<String> getDescription() {
        return this.description;
    }

    /**
     * The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The entitlement is set by the content originator and the ARN is generated as part of the originator's flow.
     * 
     */
    @InputImport(name="entitlementArn")
    private final @Nullable Input<String> entitlementArn;

    public Input<String> getEntitlementArn() {
        return this.entitlementArn == null ? Input.empty() : this.entitlementArn;
    }

    /**
     * The ARN of the flow.
     * 
     */
    @InputImport(name="flowArn")
    private final @Nullable Input<String> flowArn;

    public Input<String> getFlowArn() {
        return this.flowArn == null ? Input.empty() : this.flowArn;
    }

    /**
     * The port that the flow will be listening on for incoming content.
     * 
     */
    @InputImport(name="ingestPort")
    private final @Nullable Input<Integer> ingestPort;

    public Input<Integer> getIngestPort() {
        return this.ingestPort == null ? Input.empty() : this.ingestPort;
    }

    /**
     * The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
     * 
     */
    @InputImport(name="maxBitrate")
    private final @Nullable Input<Integer> maxBitrate;

    public Input<Integer> getMaxBitrate() {
        return this.maxBitrate == null ? Input.empty() : this.maxBitrate;
    }

    /**
     * The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
     * 
     */
    @InputImport(name="maxLatency")
    private final @Nullable Input<Integer> maxLatency;

    public Input<Integer> getMaxLatency() {
        return this.maxLatency == null ? Input.empty() : this.maxLatency;
    }

    /**
     * The name of the source.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The protocol that is used by the source.
     * 
     */
    @InputImport(name="protocol")
    private final @Nullable Input<FlowSourceProtocol> protocol;

    public Input<FlowSourceProtocol> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    /**
     * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     * 
     */
    @InputImport(name="streamId")
    private final @Nullable Input<String> streamId;

    public Input<String> getStreamId() {
        return this.streamId == null ? Input.empty() : this.streamId;
    }

    /**
     * The name of the VPC Interface this Source is configured with.
     * 
     */
    @InputImport(name="vpcInterfaceName")
    private final @Nullable Input<String> vpcInterfaceName;

    public Input<String> getVpcInterfaceName() {
        return this.vpcInterfaceName == null ? Input.empty() : this.vpcInterfaceName;
    }

    /**
     * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     */
    @InputImport(name="whitelistCidr")
    private final @Nullable Input<String> whitelistCidr;

    public Input<String> getWhitelistCidr() {
        return this.whitelistCidr == null ? Input.empty() : this.whitelistCidr;
    }

    public FlowSourceArgs(
        @Nullable Input<FlowSourceEncryptionArgs> decryption,
        Input<String> description,
        @Nullable Input<String> entitlementArn,
        @Nullable Input<String> flowArn,
        @Nullable Input<Integer> ingestPort,
        @Nullable Input<Integer> maxBitrate,
        @Nullable Input<Integer> maxLatency,
        @Nullable Input<String> name,
        @Nullable Input<FlowSourceProtocol> protocol,
        @Nullable Input<String> streamId,
        @Nullable Input<String> vpcInterfaceName,
        @Nullable Input<String> whitelistCidr) {
        this.decryption = decryption;
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.entitlementArn = entitlementArn;
        this.flowArn = flowArn;
        this.ingestPort = ingestPort;
        this.maxBitrate = maxBitrate;
        this.maxLatency = maxLatency;
        this.name = name;
        this.protocol = protocol;
        this.streamId = streamId;
        this.vpcInterfaceName = vpcInterfaceName;
        this.whitelistCidr = whitelistCidr;
    }

    private FlowSourceArgs() {
        this.decryption = Input.empty();
        this.description = Input.empty();
        this.entitlementArn = Input.empty();
        this.flowArn = Input.empty();
        this.ingestPort = Input.empty();
        this.maxBitrate = Input.empty();
        this.maxLatency = Input.empty();
        this.name = Input.empty();
        this.protocol = Input.empty();
        this.streamId = Input.empty();
        this.vpcInterfaceName = Input.empty();
        this.whitelistCidr = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FlowSourceEncryptionArgs> decryption;
        private Input<String> description;
        private @Nullable Input<String> entitlementArn;
        private @Nullable Input<String> flowArn;
        private @Nullable Input<Integer> ingestPort;
        private @Nullable Input<Integer> maxBitrate;
        private @Nullable Input<Integer> maxLatency;
        private @Nullable Input<String> name;
        private @Nullable Input<FlowSourceProtocol> protocol;
        private @Nullable Input<String> streamId;
        private @Nullable Input<String> vpcInterfaceName;
        private @Nullable Input<String> whitelistCidr;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.decryption = defaults.decryption;
    	      this.description = defaults.description;
    	      this.entitlementArn = defaults.entitlementArn;
    	      this.flowArn = defaults.flowArn;
    	      this.ingestPort = defaults.ingestPort;
    	      this.maxBitrate = defaults.maxBitrate;
    	      this.maxLatency = defaults.maxLatency;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
    	      this.streamId = defaults.streamId;
    	      this.vpcInterfaceName = defaults.vpcInterfaceName;
    	      this.whitelistCidr = defaults.whitelistCidr;
        }

        public Builder setDecryption(@Nullable Input<FlowSourceEncryptionArgs> decryption) {
            this.decryption = decryption;
            return this;
        }

        public Builder setDecryption(@Nullable FlowSourceEncryptionArgs decryption) {
            this.decryption = Input.ofNullable(decryption);
            return this;
        }

        public Builder setDescription(Input<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Input.of(Objects.requireNonNull(description));
            return this;
        }

        public Builder setEntitlementArn(@Nullable Input<String> entitlementArn) {
            this.entitlementArn = entitlementArn;
            return this;
        }

        public Builder setEntitlementArn(@Nullable String entitlementArn) {
            this.entitlementArn = Input.ofNullable(entitlementArn);
            return this;
        }

        public Builder setFlowArn(@Nullable Input<String> flowArn) {
            this.flowArn = flowArn;
            return this;
        }

        public Builder setFlowArn(@Nullable String flowArn) {
            this.flowArn = Input.ofNullable(flowArn);
            return this;
        }

        public Builder setIngestPort(@Nullable Input<Integer> ingestPort) {
            this.ingestPort = ingestPort;
            return this;
        }

        public Builder setIngestPort(@Nullable Integer ingestPort) {
            this.ingestPort = Input.ofNullable(ingestPort);
            return this;
        }

        public Builder setMaxBitrate(@Nullable Input<Integer> maxBitrate) {
            this.maxBitrate = maxBitrate;
            return this;
        }

        public Builder setMaxBitrate(@Nullable Integer maxBitrate) {
            this.maxBitrate = Input.ofNullable(maxBitrate);
            return this;
        }

        public Builder setMaxLatency(@Nullable Input<Integer> maxLatency) {
            this.maxLatency = maxLatency;
            return this;
        }

        public Builder setMaxLatency(@Nullable Integer maxLatency) {
            this.maxLatency = Input.ofNullable(maxLatency);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProtocol(@Nullable Input<FlowSourceProtocol> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable FlowSourceProtocol protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder setStreamId(@Nullable Input<String> streamId) {
            this.streamId = streamId;
            return this;
        }

        public Builder setStreamId(@Nullable String streamId) {
            this.streamId = Input.ofNullable(streamId);
            return this;
        }

        public Builder setVpcInterfaceName(@Nullable Input<String> vpcInterfaceName) {
            this.vpcInterfaceName = vpcInterfaceName;
            return this;
        }

        public Builder setVpcInterfaceName(@Nullable String vpcInterfaceName) {
            this.vpcInterfaceName = Input.ofNullable(vpcInterfaceName);
            return this;
        }

        public Builder setWhitelistCidr(@Nullable Input<String> whitelistCidr) {
            this.whitelistCidr = whitelistCidr;
            return this;
        }

        public Builder setWhitelistCidr(@Nullable String whitelistCidr) {
            this.whitelistCidr = Input.ofNullable(whitelistCidr);
            return this;
        }

        public FlowSourceArgs build() {
            return new FlowSourceArgs(decryption, description, entitlementArn, flowArn, ingestPort, maxBitrate, maxLatency, name, protocol, streamId, vpcInterfaceName, whitelistCidr);
        }
    }
}
