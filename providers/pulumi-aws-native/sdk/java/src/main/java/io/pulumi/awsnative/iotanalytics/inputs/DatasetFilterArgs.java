// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatasetDeltaTimeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetFilterArgs Empty = new DatasetFilterArgs();

    @InputImport(name="deltaTime")
    private final @Nullable Input<DatasetDeltaTimeArgs> deltaTime;

    public Input<DatasetDeltaTimeArgs> getDeltaTime() {
        return this.deltaTime == null ? Input.empty() : this.deltaTime;
    }

    public DatasetFilterArgs(@Nullable Input<DatasetDeltaTimeArgs> deltaTime) {
        this.deltaTime = deltaTime;
    }

    private DatasetFilterArgs() {
        this.deltaTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DatasetDeltaTimeArgs> deltaTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deltaTime = defaults.deltaTime;
        }

        public Builder setDeltaTime(@Nullable Input<DatasetDeltaTimeArgs> deltaTime) {
            this.deltaTime = deltaTime;
            return this;
        }

        public Builder setDeltaTime(@Nullable DatasetDeltaTimeArgs deltaTime) {
            this.deltaTime = Input.ofNullable(deltaTime);
            return this;
        }

        public DatasetFilterArgs build() {
            return new DatasetFilterArgs(deltaTime);
        }
    }
}
