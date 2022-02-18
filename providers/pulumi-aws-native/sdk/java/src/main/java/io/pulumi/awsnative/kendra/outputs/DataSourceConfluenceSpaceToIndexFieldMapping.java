// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.enums.DataSourceConfluenceSpaceFieldName;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceConfluenceSpaceToIndexFieldMapping {
    private final DataSourceConfluenceSpaceFieldName dataSourceFieldName;
    private final @Nullable String dateFieldFormat;
    private final String indexFieldName;

    @OutputCustomType.Constructor({"dataSourceFieldName","dateFieldFormat","indexFieldName"})
    private DataSourceConfluenceSpaceToIndexFieldMapping(
        DataSourceConfluenceSpaceFieldName dataSourceFieldName,
        @Nullable String dateFieldFormat,
        String indexFieldName) {
        this.dataSourceFieldName = Objects.requireNonNull(dataSourceFieldName);
        this.dateFieldFormat = dateFieldFormat;
        this.indexFieldName = Objects.requireNonNull(indexFieldName);
    }

    public DataSourceConfluenceSpaceFieldName getDataSourceFieldName() {
        return this.dataSourceFieldName;
    }
    public Optional<String> getDateFieldFormat() {
        return Optional.ofNullable(this.dateFieldFormat);
    }
    public String getIndexFieldName() {
        return this.indexFieldName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfluenceSpaceToIndexFieldMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceConfluenceSpaceFieldName dataSourceFieldName;
        private @Nullable String dateFieldFormat;
        private String indexFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfluenceSpaceToIndexFieldMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceFieldName = defaults.dataSourceFieldName;
    	      this.dateFieldFormat = defaults.dateFieldFormat;
    	      this.indexFieldName = defaults.indexFieldName;
        }

        public Builder setDataSourceFieldName(DataSourceConfluenceSpaceFieldName dataSourceFieldName) {
            this.dataSourceFieldName = Objects.requireNonNull(dataSourceFieldName);
            return this;
        }

        public Builder setDateFieldFormat(@Nullable String dateFieldFormat) {
            this.dateFieldFormat = dateFieldFormat;
            return this;
        }

        public Builder setIndexFieldName(String indexFieldName) {
            this.indexFieldName = Objects.requireNonNull(indexFieldName);
            return this;
        }

        public DataSourceConfluenceSpaceToIndexFieldMapping build() {
            return new DataSourceConfluenceSpaceToIndexFieldMapping(dataSourceFieldName, dateFieldFormat, indexFieldName);
        }
    }
}
