// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.chime;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VoiceConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final VoiceConnectorArgs Empty = new VoiceConnectorArgs();

    /**
     * The AWS Region in which the Amazon Chime Voice Connector is created. Default value: `us-east-1`
     * 
     */
    @Import(name="awsRegion")
    private @Nullable Output<String> awsRegion;

    /**
     * @return The AWS Region in which the Amazon Chime Voice Connector is created. Default value: `us-east-1`
     * 
     */
    public Optional<Output<String>> awsRegion() {
        return Optional.ofNullable(this.awsRegion);
    }

    /**
     * The name of the Amazon Chime Voice Connector.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Amazon Chime Voice Connector.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * 
     */
    @Import(name="requireEncryption", required=true)
    private Output<Boolean> requireEncryption;

    /**
     * @return When enabled, requires encryption for the Amazon Chime Voice Connector.
     * 
     */
    public Output<Boolean> requireEncryption() {
        return this.requireEncryption;
    }

    private VoiceConnectorArgs() {}

    private VoiceConnectorArgs(VoiceConnectorArgs $) {
        this.awsRegion = $.awsRegion;
        this.name = $.name;
        this.requireEncryption = $.requireEncryption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VoiceConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VoiceConnectorArgs $;

        public Builder() {
            $ = new VoiceConnectorArgs();
        }

        public Builder(VoiceConnectorArgs defaults) {
            $ = new VoiceConnectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsRegion The AWS Region in which the Amazon Chime Voice Connector is created. Default value: `us-east-1`
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(@Nullable Output<String> awsRegion) {
            $.awsRegion = awsRegion;
            return this;
        }

        /**
         * @param awsRegion The AWS Region in which the Amazon Chime Voice Connector is created. Default value: `us-east-1`
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(String awsRegion) {
            return awsRegion(Output.of(awsRegion));
        }

        /**
         * @param name The name of the Amazon Chime Voice Connector.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Amazon Chime Voice Connector.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param requireEncryption When enabled, requires encryption for the Amazon Chime Voice Connector.
         * 
         * @return builder
         * 
         */
        public Builder requireEncryption(Output<Boolean> requireEncryption) {
            $.requireEncryption = requireEncryption;
            return this;
        }

        /**
         * @param requireEncryption When enabled, requires encryption for the Amazon Chime Voice Connector.
         * 
         * @return builder
         * 
         */
        public Builder requireEncryption(Boolean requireEncryption) {
            return requireEncryption(Output.of(requireEncryption));
        }

        public VoiceConnectorArgs build() {
            $.requireEncryption = Objects.requireNonNull($.requireEncryption, "expected parameter 'requireEncryption' to be non-null");
            return $;
        }
    }

}
