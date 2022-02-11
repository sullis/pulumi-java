// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.outputs.DataSourceConfluencePageToIndexFieldMapping;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceConfluencePageConfiguration {
    private final @Nullable List<DataSourceConfluencePageToIndexFieldMapping> pageFieldMappings;

    @OutputCustomType.Constructor({"pageFieldMappings"})
    private DataSourceConfluencePageConfiguration(@Nullable List<DataSourceConfluencePageToIndexFieldMapping> pageFieldMappings) {
        this.pageFieldMappings = pageFieldMappings;
    }

    public List<DataSourceConfluencePageToIndexFieldMapping> getPageFieldMappings() {
        return this.pageFieldMappings == null ? List.of() : this.pageFieldMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfluencePageConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DataSourceConfluencePageToIndexFieldMapping> pageFieldMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfluencePageConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pageFieldMappings = defaults.pageFieldMappings;
        }

        public Builder setPageFieldMappings(@Nullable List<DataSourceConfluencePageToIndexFieldMapping> pageFieldMappings) {
            this.pageFieldMappings = pageFieldMappings;
            return this;
        }

        public DataSourceConfluencePageConfiguration build() {
            return new DataSourceConfluencePageConfiguration(pageFieldMappings);
        }
    }
}
