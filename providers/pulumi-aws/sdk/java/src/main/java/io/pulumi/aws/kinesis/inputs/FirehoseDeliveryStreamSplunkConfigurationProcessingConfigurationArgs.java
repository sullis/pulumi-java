// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs Empty = new FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs();

    /**
     * Enables or disables data processing.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * Array of data processors. More details are given below
     * 
     */
    @Import(name="processors")
      private final @Nullable Output<List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs>> processors;

    public Output<List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs>> processors() {
        return this.processors == null ? Codegen.empty() : this.processors;
    }

    public FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs>> processors) {
        this.enabled = enabled;
        this.processors = processors;
    }

    private FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs() {
        this.enabled = Codegen.empty();
        this.processors = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs>> processors;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.processors = defaults.processors;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder processors(@Nullable Output<List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs>> processors) {
            this.processors = processors;
            return this;
        }
        public Builder processors(@Nullable List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs> processors) {
            this.processors = Codegen.ofNullable(processors);
            return this;
        }
        public Builder processors(FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorArgs... processors) {
            return processors(List.of(processors));
        }        public FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs build() {
            return new FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationArgs(enabled, processors);
        }
    }
}
