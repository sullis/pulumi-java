// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.DataSourceQueryIdentifiersEnclosingOption;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceSqlConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceSqlConfiguration Empty = new DataSourceSqlConfiguration();

    @Import(name="queryIdentifiersEnclosingOption")
      private final @Nullable DataSourceQueryIdentifiersEnclosingOption queryIdentifiersEnclosingOption;

    public Optional<DataSourceQueryIdentifiersEnclosingOption> queryIdentifiersEnclosingOption() {
        return this.queryIdentifiersEnclosingOption == null ? Optional.empty() : Optional.ofNullable(this.queryIdentifiersEnclosingOption);
    }

    public DataSourceSqlConfiguration(@Nullable DataSourceQueryIdentifiersEnclosingOption queryIdentifiersEnclosingOption) {
        this.queryIdentifiersEnclosingOption = queryIdentifiersEnclosingOption;
    }

    private DataSourceSqlConfiguration() {
        this.queryIdentifiersEnclosingOption = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSqlConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceQueryIdentifiersEnclosingOption queryIdentifiersEnclosingOption;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSqlConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryIdentifiersEnclosingOption = defaults.queryIdentifiersEnclosingOption;
        }

        public Builder queryIdentifiersEnclosingOption(@Nullable DataSourceQueryIdentifiersEnclosingOption queryIdentifiersEnclosingOption) {
            this.queryIdentifiersEnclosingOption = queryIdentifiersEnclosingOption;
            return this;
        }        public DataSourceSqlConfiguration build() {
            return new DataSourceSqlConfiguration(queryIdentifiersEnclosingOption);
        }
    }
}
