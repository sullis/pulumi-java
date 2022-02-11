// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowIncrementalPullConfig extends io.pulumi.resources.InvokeArgs {

    public static final FlowIncrementalPullConfig Empty = new FlowIncrementalPullConfig();

    @InputImport(name="datetimeTypeFieldName")
    private final @Nullable String datetimeTypeFieldName;

    public Optional<String> getDatetimeTypeFieldName() {
        return this.datetimeTypeFieldName == null ? Optional.empty() : Optional.ofNullable(this.datetimeTypeFieldName);
    }

    public FlowIncrementalPullConfig(@Nullable String datetimeTypeFieldName) {
        this.datetimeTypeFieldName = datetimeTypeFieldName;
    }

    private FlowIncrementalPullConfig() {
        this.datetimeTypeFieldName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowIncrementalPullConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datetimeTypeFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowIncrementalPullConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datetimeTypeFieldName = defaults.datetimeTypeFieldName;
        }

        public Builder setDatetimeTypeFieldName(@Nullable String datetimeTypeFieldName) {
            this.datetimeTypeFieldName = datetimeTypeFieldName;
            return this;
        }

        public FlowIncrementalPullConfig build() {
            return new FlowIncrementalPullConfig(datetimeTypeFieldName);
        }
    }
}
