// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceToIndexFieldMapping;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration Empty = new DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration();

    @Import(name="documentDataFieldName", required=true)
      private final String documentDataFieldName;

    public String documentDataFieldName() {
        return this.documentDataFieldName;
    }

    @Import(name="documentTitleFieldName")
      private final @Nullable String documentTitleFieldName;

    public Optional<String> documentTitleFieldName() {
        return this.documentTitleFieldName == null ? Optional.empty() : Optional.ofNullable(this.documentTitleFieldName);
    }

    @Import(name="fieldMappings")
      private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

    public List<DataSourceToIndexFieldMapping> fieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }

    public DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration(
        String documentDataFieldName,
        @Nullable String documentTitleFieldName,
        @Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
        this.documentDataFieldName = Objects.requireNonNull(documentDataFieldName, "expected parameter 'documentDataFieldName' to be non-null");
        this.documentTitleFieldName = documentTitleFieldName;
        this.fieldMappings = fieldMappings;
    }

    private DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration() {
        this.documentDataFieldName = null;
        this.documentTitleFieldName = null;
        this.fieldMappings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String documentDataFieldName;
        private @Nullable String documentTitleFieldName;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentDataFieldName = defaults.documentDataFieldName;
    	      this.documentTitleFieldName = defaults.documentTitleFieldName;
    	      this.fieldMappings = defaults.fieldMappings;
        }

        public Builder documentDataFieldName(String documentDataFieldName) {
            this.documentDataFieldName = Objects.requireNonNull(documentDataFieldName);
            return this;
        }
        public Builder documentTitleFieldName(@Nullable String documentTitleFieldName) {
            this.documentTitleFieldName = documentTitleFieldName;
            return this;
        }
        public Builder fieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }
        public Builder fieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
            return fieldMappings(List.of(fieldMappings));
        }        public DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration build() {
            return new DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration(documentDataFieldName, documentTitleFieldName, fieldMappings);
        }
    }
}
