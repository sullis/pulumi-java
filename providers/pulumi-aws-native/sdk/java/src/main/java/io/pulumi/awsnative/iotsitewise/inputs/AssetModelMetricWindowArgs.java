// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.awsnative.iotsitewise.inputs.AssetModelTumblingWindowArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssetModelMetricWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssetModelMetricWindowArgs Empty = new AssetModelMetricWindowArgs();

    @InputImport(name="tumbling")
    private final @Nullable Input<AssetModelTumblingWindowArgs> tumbling;

    public Input<AssetModelTumblingWindowArgs> getTumbling() {
        return this.tumbling == null ? Input.empty() : this.tumbling;
    }

    public AssetModelMetricWindowArgs(@Nullable Input<AssetModelTumblingWindowArgs> tumbling) {
        this.tumbling = tumbling;
    }

    private AssetModelMetricWindowArgs() {
        this.tumbling = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelMetricWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AssetModelTumblingWindowArgs> tumbling;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelMetricWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tumbling = defaults.tumbling;
        }

        public Builder setTumbling(@Nullable Input<AssetModelTumblingWindowArgs> tumbling) {
            this.tumbling = tumbling;
            return this;
        }

        public Builder setTumbling(@Nullable AssetModelTumblingWindowArgs tumbling) {
            this.tumbling = Input.ofNullable(tumbling);
            return this;
        }

        public AssetModelMetricWindowArgs build() {
            return new AssetModelMetricWindowArgs(tumbling);
        }
    }
}
