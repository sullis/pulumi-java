// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.awsnative.iotanalytics.outputs.PipelineAddAttributes;
import io.pulumi.awsnative.iotanalytics.outputs.PipelineChannel;
import io.pulumi.awsnative.iotanalytics.outputs.PipelineDatastore;
import io.pulumi.awsnative.iotanalytics.outputs.PipelineDeviceRegistryEnrich;
import io.pulumi.awsnative.iotanalytics.outputs.PipelineDeviceShadowEnrich;
import io.pulumi.awsnative.iotanalytics.outputs.PipelineFilter;
import io.pulumi.awsnative.iotanalytics.outputs.PipelineLambda;
import io.pulumi.awsnative.iotanalytics.outputs.PipelineMath;
import io.pulumi.awsnative.iotanalytics.outputs.PipelineRemoveAttributes;
import io.pulumi.awsnative.iotanalytics.outputs.PipelineSelectAttributes;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineActivity {
    private final @Nullable PipelineAddAttributes addAttributes;
    private final @Nullable PipelineChannel channel;
    private final @Nullable PipelineDatastore datastore;
    private final @Nullable PipelineDeviceRegistryEnrich deviceRegistryEnrich;
    private final @Nullable PipelineDeviceShadowEnrich deviceShadowEnrich;
    private final @Nullable PipelineFilter filter;
    private final @Nullable PipelineLambda lambda;
    private final @Nullable PipelineMath math;
    private final @Nullable PipelineRemoveAttributes removeAttributes;
    private final @Nullable PipelineSelectAttributes selectAttributes;

    @CustomType.Constructor
    private PipelineActivity(
        @CustomType.Parameter("addAttributes") @Nullable PipelineAddAttributes addAttributes,
        @CustomType.Parameter("channel") @Nullable PipelineChannel channel,
        @CustomType.Parameter("datastore") @Nullable PipelineDatastore datastore,
        @CustomType.Parameter("deviceRegistryEnrich") @Nullable PipelineDeviceRegistryEnrich deviceRegistryEnrich,
        @CustomType.Parameter("deviceShadowEnrich") @Nullable PipelineDeviceShadowEnrich deviceShadowEnrich,
        @CustomType.Parameter("filter") @Nullable PipelineFilter filter,
        @CustomType.Parameter("lambda") @Nullable PipelineLambda lambda,
        @CustomType.Parameter("math") @Nullable PipelineMath math,
        @CustomType.Parameter("removeAttributes") @Nullable PipelineRemoveAttributes removeAttributes,
        @CustomType.Parameter("selectAttributes") @Nullable PipelineSelectAttributes selectAttributes) {
        this.addAttributes = addAttributes;
        this.channel = channel;
        this.datastore = datastore;
        this.deviceRegistryEnrich = deviceRegistryEnrich;
        this.deviceShadowEnrich = deviceShadowEnrich;
        this.filter = filter;
        this.lambda = lambda;
        this.math = math;
        this.removeAttributes = removeAttributes;
        this.selectAttributes = selectAttributes;
    }

    public Optional<PipelineAddAttributes> addAttributes() {
        return Optional.ofNullable(this.addAttributes);
    }
    public Optional<PipelineChannel> channel() {
        return Optional.ofNullable(this.channel);
    }
    public Optional<PipelineDatastore> datastore() {
        return Optional.ofNullable(this.datastore);
    }
    public Optional<PipelineDeviceRegistryEnrich> deviceRegistryEnrich() {
        return Optional.ofNullable(this.deviceRegistryEnrich);
    }
    public Optional<PipelineDeviceShadowEnrich> deviceShadowEnrich() {
        return Optional.ofNullable(this.deviceShadowEnrich);
    }
    public Optional<PipelineFilter> filter() {
        return Optional.ofNullable(this.filter);
    }
    public Optional<PipelineLambda> lambda() {
        return Optional.ofNullable(this.lambda);
    }
    public Optional<PipelineMath> math() {
        return Optional.ofNullable(this.math);
    }
    public Optional<PipelineRemoveAttributes> removeAttributes() {
        return Optional.ofNullable(this.removeAttributes);
    }
    public Optional<PipelineSelectAttributes> selectAttributes() {
        return Optional.ofNullable(this.selectAttributes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineActivity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PipelineAddAttributes addAttributes;
        private @Nullable PipelineChannel channel;
        private @Nullable PipelineDatastore datastore;
        private @Nullable PipelineDeviceRegistryEnrich deviceRegistryEnrich;
        private @Nullable PipelineDeviceShadowEnrich deviceShadowEnrich;
        private @Nullable PipelineFilter filter;
        private @Nullable PipelineLambda lambda;
        private @Nullable PipelineMath math;
        private @Nullable PipelineRemoveAttributes removeAttributes;
        private @Nullable PipelineSelectAttributes selectAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineActivity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addAttributes = defaults.addAttributes;
    	      this.channel = defaults.channel;
    	      this.datastore = defaults.datastore;
    	      this.deviceRegistryEnrich = defaults.deviceRegistryEnrich;
    	      this.deviceShadowEnrich = defaults.deviceShadowEnrich;
    	      this.filter = defaults.filter;
    	      this.lambda = defaults.lambda;
    	      this.math = defaults.math;
    	      this.removeAttributes = defaults.removeAttributes;
    	      this.selectAttributes = defaults.selectAttributes;
        }

        public Builder addAttributes(@Nullable PipelineAddAttributes addAttributes) {
            this.addAttributes = addAttributes;
            return this;
        }
        public Builder channel(@Nullable PipelineChannel channel) {
            this.channel = channel;
            return this;
        }
        public Builder datastore(@Nullable PipelineDatastore datastore) {
            this.datastore = datastore;
            return this;
        }
        public Builder deviceRegistryEnrich(@Nullable PipelineDeviceRegistryEnrich deviceRegistryEnrich) {
            this.deviceRegistryEnrich = deviceRegistryEnrich;
            return this;
        }
        public Builder deviceShadowEnrich(@Nullable PipelineDeviceShadowEnrich deviceShadowEnrich) {
            this.deviceShadowEnrich = deviceShadowEnrich;
            return this;
        }
        public Builder filter(@Nullable PipelineFilter filter) {
            this.filter = filter;
            return this;
        }
        public Builder lambda(@Nullable PipelineLambda lambda) {
            this.lambda = lambda;
            return this;
        }
        public Builder math(@Nullable PipelineMath math) {
            this.math = math;
            return this;
        }
        public Builder removeAttributes(@Nullable PipelineRemoveAttributes removeAttributes) {
            this.removeAttributes = removeAttributes;
            return this;
        }
        public Builder selectAttributes(@Nullable PipelineSelectAttributes selectAttributes) {
            this.selectAttributes = selectAttributes;
            return this;
        }        public PipelineActivity build() {
            return new PipelineActivity(addAttributes, channel, datastore, deviceRegistryEnrich, deviceShadowEnrich, filter, lambda, math, removeAttributes, selectAttributes);
        }
    }
}
