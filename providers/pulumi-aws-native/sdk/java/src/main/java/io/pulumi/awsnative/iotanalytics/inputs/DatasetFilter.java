// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatasetDeltaTime;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetFilter extends io.pulumi.resources.InvokeArgs {

    public static final DatasetFilter Empty = new DatasetFilter();

    @Import(name="deltaTime")
      private final @Nullable DatasetDeltaTime deltaTime;

    public Optional<DatasetDeltaTime> deltaTime() {
        return this.deltaTime == null ? Optional.empty() : Optional.ofNullable(this.deltaTime);
    }

    public DatasetFilter(@Nullable DatasetDeltaTime deltaTime) {
        this.deltaTime = deltaTime;
    }

    private DatasetFilter() {
        this.deltaTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetDeltaTime deltaTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deltaTime = defaults.deltaTime;
        }

        public Builder deltaTime(@Nullable DatasetDeltaTime deltaTime) {
            this.deltaTime = deltaTime;
            return this;
        }        public DatasetFilter build() {
            return new DatasetFilter(deltaTime);
        }
    }
}
