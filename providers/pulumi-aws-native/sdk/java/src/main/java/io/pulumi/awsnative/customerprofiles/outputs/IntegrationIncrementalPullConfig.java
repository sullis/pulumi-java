// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationIncrementalPullConfig {
    private final @Nullable String datetimeTypeFieldName;

    @CustomType.Constructor
    private IntegrationIncrementalPullConfig(@CustomType.Parameter("datetimeTypeFieldName") @Nullable String datetimeTypeFieldName) {
        this.datetimeTypeFieldName = datetimeTypeFieldName;
    }

    public Optional<String> getDatetimeTypeFieldName() {
        return Optional.ofNullable(this.datetimeTypeFieldName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationIncrementalPullConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datetimeTypeFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationIncrementalPullConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datetimeTypeFieldName = defaults.datetimeTypeFieldName;
        }

        public Builder datetimeTypeFieldName(@Nullable String datetimeTypeFieldName) {
            this.datetimeTypeFieldName = datetimeTypeFieldName;
            return this;
        }        public IntegrationIncrementalPullConfig build() {
            return new IntegrationIncrementalPullConfig(datetimeTypeFieldName);
        }
    }
}
