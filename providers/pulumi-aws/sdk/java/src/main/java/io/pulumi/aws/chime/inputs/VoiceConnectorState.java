// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VoiceConnectorState extends io.pulumi.resources.ResourceArgs {

    public static final VoiceConnectorState Empty = new VoiceConnectorState();

    /**
     * The AWS Region in which the Amazon Chime Voice Connector is created. Default value: `us-east-1`
     * 
     */
    @Import(name="awsRegion")
      private final @Nullable Output<String> awsRegion;

    public Output<String> awsRegion() {
        return this.awsRegion == null ? Codegen.empty() : this.awsRegion;
    }

    /**
     * The name of the Amazon Chime Voice Connector.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The outbound host name for the Amazon Chime Voice Connector.
     * 
     */
    @Import(name="outboundHostName")
      private final @Nullable Output<String> outboundHostName;

    public Output<String> outboundHostName() {
        return this.outboundHostName == null ? Codegen.empty() : this.outboundHostName;
    }

    /**
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * 
     */
    @Import(name="requireEncryption")
      private final @Nullable Output<Boolean> requireEncryption;

    public Output<Boolean> requireEncryption() {
        return this.requireEncryption == null ? Codegen.empty() : this.requireEncryption;
    }

    public VoiceConnectorState(
        @Nullable Output<String> awsRegion,
        @Nullable Output<String> name,
        @Nullable Output<String> outboundHostName,
        @Nullable Output<Boolean> requireEncryption) {
        this.awsRegion = awsRegion;
        this.name = name;
        this.outboundHostName = outboundHostName;
        this.requireEncryption = requireEncryption;
    }

    private VoiceConnectorState() {
        this.awsRegion = Codegen.empty();
        this.name = Codegen.empty();
        this.outboundHostName = Codegen.empty();
        this.requireEncryption = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VoiceConnectorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> awsRegion;
        private @Nullable Output<String> name;
        private @Nullable Output<String> outboundHostName;
        private @Nullable Output<Boolean> requireEncryption;

        public Builder() {
    	      // Empty
        }

        public Builder(VoiceConnectorState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsRegion = defaults.awsRegion;
    	      this.name = defaults.name;
    	      this.outboundHostName = defaults.outboundHostName;
    	      this.requireEncryption = defaults.requireEncryption;
        }

        public Builder awsRegion(@Nullable Output<String> awsRegion) {
            this.awsRegion = awsRegion;
            return this;
        }
        public Builder awsRegion(@Nullable String awsRegion) {
            this.awsRegion = Codegen.ofNullable(awsRegion);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder outboundHostName(@Nullable Output<String> outboundHostName) {
            this.outboundHostName = outboundHostName;
            return this;
        }
        public Builder outboundHostName(@Nullable String outboundHostName) {
            this.outboundHostName = Codegen.ofNullable(outboundHostName);
            return this;
        }
        public Builder requireEncryption(@Nullable Output<Boolean> requireEncryption) {
            this.requireEncryption = requireEncryption;
            return this;
        }
        public Builder requireEncryption(@Nullable Boolean requireEncryption) {
            this.requireEncryption = Codegen.ofNullable(requireEncryption);
            return this;
        }        public VoiceConnectorState build() {
            return new VoiceConnectorState(awsRegion, name, outboundHostName, requireEncryption);
        }
    }
}
