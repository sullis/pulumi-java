// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.DataSourceConfluenceSpaceFieldName;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceConfluenceSpaceToIndexFieldMapping extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceConfluenceSpaceToIndexFieldMapping Empty = new DataSourceConfluenceSpaceToIndexFieldMapping();

    @InputImport(name="dataSourceFieldName", required=true)
    private final DataSourceConfluenceSpaceFieldName dataSourceFieldName;

    public DataSourceConfluenceSpaceFieldName getDataSourceFieldName() {
        return this.dataSourceFieldName;
    }

    @InputImport(name="dateFieldFormat")
    private final @Nullable String dateFieldFormat;

    public Optional<String> getDateFieldFormat() {
        return this.dateFieldFormat == null ? Optional.empty() : Optional.ofNullable(this.dateFieldFormat);
    }

    @InputImport(name="indexFieldName", required=true)
    private final String indexFieldName;

    public String getIndexFieldName() {
        return this.indexFieldName;
    }

    public DataSourceConfluenceSpaceToIndexFieldMapping(
        DataSourceConfluenceSpaceFieldName dataSourceFieldName,
        @Nullable String dateFieldFormat,
        String indexFieldName) {
        this.dataSourceFieldName = Objects.requireNonNull(dataSourceFieldName, "expected parameter 'dataSourceFieldName' to be non-null");
        this.dateFieldFormat = dateFieldFormat;
        this.indexFieldName = Objects.requireNonNull(indexFieldName, "expected parameter 'indexFieldName' to be non-null");
    }

    private DataSourceConfluenceSpaceToIndexFieldMapping() {
        this.dataSourceFieldName = null;
        this.dateFieldFormat = null;
        this.indexFieldName = null;
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
