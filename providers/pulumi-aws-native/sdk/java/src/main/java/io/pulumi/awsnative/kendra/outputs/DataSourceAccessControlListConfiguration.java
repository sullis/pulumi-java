// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceAccessControlListConfiguration {
    private final @Nullable String keyPath;

    @OutputCustomType.Constructor({"keyPath"})
    private DataSourceAccessControlListConfiguration(@Nullable String keyPath) {
        this.keyPath = keyPath;
    }

    public Optional<String> getKeyPath() {
        return Optional.ofNullable(this.keyPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceAccessControlListConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyPath;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceAccessControlListConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyPath = defaults.keyPath;
        }

        public Builder setKeyPath(@Nullable String keyPath) {
            this.keyPath = keyPath;
            return this;
        }

        public DataSourceAccessControlListConfiguration build() {
            return new DataSourceAccessControlListConfiguration(keyPath);
        }
    }
}
