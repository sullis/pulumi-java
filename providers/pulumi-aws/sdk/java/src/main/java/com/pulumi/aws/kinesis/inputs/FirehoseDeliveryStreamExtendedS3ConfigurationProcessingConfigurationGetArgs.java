// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs();

    /**
     * Enables or disables data processing.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enables or disables data processing.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Array of data processors. More details are given below
     * 
     */
    @Import(name="processors")
    private @Nullable Output<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs>> processors;

    /**
     * @return Array of data processors. More details are given below
     * 
     */
    public Optional<Output<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs>>> processors() {
        return Optional.ofNullable(this.processors);
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs() {}

    private FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs $) {
        this.enabled = $.enabled;
        this.processors = $.processors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs $;

        public Builder() {
            $ = new FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs();
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs defaults) {
            $ = new FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enables or disables data processing.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enables or disables data processing.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param processors Array of data processors. More details are given below
         * 
         * @return builder
         * 
         */
        public Builder processors(@Nullable Output<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs>> processors) {
            $.processors = processors;
            return this;
        }

        /**
         * @param processors Array of data processors. More details are given below
         * 
         * @return builder
         * 
         */
        public Builder processors(List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs> processors) {
            return processors(Output.of(processors));
        }

        /**
         * @param processors Array of data processors. More details are given below
         * 
         * @return builder
         * 
         */
        public Builder processors(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs... processors) {
            return processors(List.of(processors));
        }

        public FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs build() {
            return $;
        }
    }

}
