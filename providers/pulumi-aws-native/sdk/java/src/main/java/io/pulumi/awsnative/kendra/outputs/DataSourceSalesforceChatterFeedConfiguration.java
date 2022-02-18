// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.enums.DataSourceSalesforceChatterFeedIncludeFilterType;
import io.pulumi.awsnative.kendra.outputs.DataSourceToIndexFieldMapping;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceSalesforceChatterFeedConfiguration {
    private final String documentDataFieldName;
    private final @Nullable String documentTitleFieldName;
    private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
    private final @Nullable List<DataSourceSalesforceChatterFeedIncludeFilterType> includeFilterTypes;

    @OutputCustomType.Constructor({"documentDataFieldName","documentTitleFieldName","fieldMappings","includeFilterTypes"})
    private DataSourceSalesforceChatterFeedConfiguration(
        String documentDataFieldName,
        @Nullable String documentTitleFieldName,
        @Nullable List<DataSourceToIndexFieldMapping> fieldMappings,
        @Nullable List<DataSourceSalesforceChatterFeedIncludeFilterType> includeFilterTypes) {
        this.documentDataFieldName = Objects.requireNonNull(documentDataFieldName);
        this.documentTitleFieldName = documentTitleFieldName;
        this.fieldMappings = fieldMappings;
        this.includeFilterTypes = includeFilterTypes;
    }

    public String getDocumentDataFieldName() {
        return this.documentDataFieldName;
    }
    public Optional<String> getDocumentTitleFieldName() {
        return Optional.ofNullable(this.documentTitleFieldName);
    }
    public List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }
    public List<DataSourceSalesforceChatterFeedIncludeFilterType> getIncludeFilterTypes() {
        return this.includeFilterTypes == null ? List.of() : this.includeFilterTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSalesforceChatterFeedConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String documentDataFieldName;
        private @Nullable String documentTitleFieldName;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
        private @Nullable List<DataSourceSalesforceChatterFeedIncludeFilterType> includeFilterTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSalesforceChatterFeedConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentDataFieldName = defaults.documentDataFieldName;
    	      this.documentTitleFieldName = defaults.documentTitleFieldName;
    	      this.fieldMappings = defaults.fieldMappings;
    	      this.includeFilterTypes = defaults.includeFilterTypes;
        }

        public Builder setDocumentDataFieldName(String documentDataFieldName) {
            this.documentDataFieldName = Objects.requireNonNull(documentDataFieldName);
            return this;
        }

        public Builder setDocumentTitleFieldName(@Nullable String documentTitleFieldName) {
            this.documentTitleFieldName = documentTitleFieldName;
            return this;
        }

        public Builder setFieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }

        public Builder setIncludeFilterTypes(@Nullable List<DataSourceSalesforceChatterFeedIncludeFilterType> includeFilterTypes) {
            this.includeFilterTypes = includeFilterTypes;
            return this;
        }

        public DataSourceSalesforceChatterFeedConfiguration build() {
            return new DataSourceSalesforceChatterFeedConfiguration(documentDataFieldName, documentTitleFieldName, fieldMappings, includeFilterTypes);
        }
    }
}
