// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VoiceConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final VoiceConnectorArgs Empty = new VoiceConnectorArgs();

    /**
     * The AWS Region in which the Amazon Chime Voice Connector is created. Default value: `us-east-1`
     * 
     */
    @Import(name="awsRegion")
      private final @Nullable Output<String> awsRegion;

    public Output<String> getAwsRegion() {
        return this.awsRegion == null ? Output.empty() : this.awsRegion;
    }

    /**
     * The name of the Amazon Chime Voice Connector.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * 
     */
    @Import(name="requireEncryption", required=true)
      private final Output<Boolean> requireEncryption;

    public Output<Boolean> getRequireEncryption() {
        return this.requireEncryption;
    }

    public VoiceConnectorArgs(
        @Nullable Output<String> awsRegion,
        @Nullable Output<String> name,
        Output<Boolean> requireEncryption) {
        this.awsRegion = awsRegion;
        this.name = name;
        this.requireEncryption = Objects.requireNonNull(requireEncryption, "expected parameter 'requireEncryption' to be non-null");
    }

    private VoiceConnectorArgs() {
        this.awsRegion = Output.empty();
        this.name = Output.empty();
        this.requireEncryption = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VoiceConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> awsRegion;
        private @Nullable Output<String> name;
        private Output<Boolean> requireEncryption;

        public Builder() {
    	      // Empty
        }

        public Builder(VoiceConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsRegion = defaults.awsRegion;
    	      this.name = defaults.name;
    	      this.requireEncryption = defaults.requireEncryption;
        }

        public Builder awsRegion(@Nullable Output<String> awsRegion) {
            this.awsRegion = awsRegion;
            return this;
        }
        public Builder awsRegion(@Nullable String awsRegion) {
            this.awsRegion = Output.ofNullable(awsRegion);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder requireEncryption(Output<Boolean> requireEncryption) {
            this.requireEncryption = Objects.requireNonNull(requireEncryption);
            return this;
        }
        public Builder requireEncryption(Boolean requireEncryption) {
            this.requireEncryption = Output.of(Objects.requireNonNull(requireEncryption));
            return this;
        }        public VoiceConnectorArgs build() {
            return new VoiceConnectorArgs(awsRegion, name, requireEncryption);
        }
    }
}
