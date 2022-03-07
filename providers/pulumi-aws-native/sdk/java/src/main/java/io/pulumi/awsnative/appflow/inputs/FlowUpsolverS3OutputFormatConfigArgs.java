// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowFileType;
import io.pulumi.awsnative.appflow.inputs.FlowAggregationConfigArgs;
import io.pulumi.awsnative.appflow.inputs.FlowPrefixConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowUpsolverS3OutputFormatConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowUpsolverS3OutputFormatConfigArgs Empty = new FlowUpsolverS3OutputFormatConfigArgs();

    @InputImport(name="aggregationConfig")
      private final @Nullable Input<FlowAggregationConfigArgs> aggregationConfig;

    public Input<FlowAggregationConfigArgs> getAggregationConfig() {
        return this.aggregationConfig == null ? Input.empty() : this.aggregationConfig;
    }

    @InputImport(name="fileType")
      private final @Nullable Input<FlowFileType> fileType;

    public Input<FlowFileType> getFileType() {
        return this.fileType == null ? Input.empty() : this.fileType;
    }

    @InputImport(name="prefixConfig", required=true)
      private final Input<FlowPrefixConfigArgs> prefixConfig;

    public Input<FlowPrefixConfigArgs> getPrefixConfig() {
        return this.prefixConfig;
    }

    public FlowUpsolverS3OutputFormatConfigArgs(
        @Nullable Input<FlowAggregationConfigArgs> aggregationConfig,
        @Nullable Input<FlowFileType> fileType,
        Input<FlowPrefixConfigArgs> prefixConfig) {
        this.aggregationConfig = aggregationConfig;
        this.fileType = fileType;
        this.prefixConfig = Objects.requireNonNull(prefixConfig, "expected parameter 'prefixConfig' to be non-null");
    }

    private FlowUpsolverS3OutputFormatConfigArgs() {
        this.aggregationConfig = Input.empty();
        this.fileType = Input.empty();
        this.prefixConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowUpsolverS3OutputFormatConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FlowAggregationConfigArgs> aggregationConfig;
        private @Nullable Input<FlowFileType> fileType;
        private Input<FlowPrefixConfigArgs> prefixConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowUpsolverS3OutputFormatConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationConfig = defaults.aggregationConfig;
    	      this.fileType = defaults.fileType;
    	      this.prefixConfig = defaults.prefixConfig;
        }

        public Builder setAggregationConfig(@Nullable Input<FlowAggregationConfigArgs> aggregationConfig) {
            this.aggregationConfig = aggregationConfig;
            return this;
        }

        public Builder setAggregationConfig(@Nullable FlowAggregationConfigArgs aggregationConfig) {
            this.aggregationConfig = Input.ofNullable(aggregationConfig);
            return this;
        }

        public Builder setFileType(@Nullable Input<FlowFileType> fileType) {
            this.fileType = fileType;
            return this;
        }

        public Builder setFileType(@Nullable FlowFileType fileType) {
            this.fileType = Input.ofNullable(fileType);
            return this;
        }

        public Builder setPrefixConfig(Input<FlowPrefixConfigArgs> prefixConfig) {
            this.prefixConfig = Objects.requireNonNull(prefixConfig);
            return this;
        }

        public Builder setPrefixConfig(FlowPrefixConfigArgs prefixConfig) {
            this.prefixConfig = Input.of(Objects.requireNonNull(prefixConfig));
            return this;
        }
        public FlowUpsolverS3OutputFormatConfigArgs build() {
            return new FlowUpsolverS3OutputFormatConfigArgs(aggregationConfig, fileType, prefixConfig);
        }
    }
}