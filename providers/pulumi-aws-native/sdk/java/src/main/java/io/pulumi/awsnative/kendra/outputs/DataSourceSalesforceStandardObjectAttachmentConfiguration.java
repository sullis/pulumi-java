// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.outputs.DataSourceToIndexFieldMapping;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceSalesforceStandardObjectAttachmentConfiguration {
    private final @Nullable String documentTitleFieldName;
    private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

    @OutputCustomType.Constructor({"documentTitleFieldName","fieldMappings"})
    private DataSourceSalesforceStandardObjectAttachmentConfiguration(
        @Nullable String documentTitleFieldName,
        @Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
        this.documentTitleFieldName = documentTitleFieldName;
        this.fieldMappings = fieldMappings;
    }

    public Optional<String> getDocumentTitleFieldName() {
        return Optional.ofNullable(this.documentTitleFieldName);
    }
    public List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSalesforceStandardObjectAttachmentConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String documentTitleFieldName;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSalesforceStandardObjectAttachmentConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentTitleFieldName = defaults.documentTitleFieldName;
    	      this.fieldMappings = defaults.fieldMappings;
        }

        public Builder setDocumentTitleFieldName(@Nullable String documentTitleFieldName) {
            this.documentTitleFieldName = documentTitleFieldName;
            return this;
        }

        public Builder setFieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }

        public DataSourceSalesforceStandardObjectAttachmentConfiguration build() {
            return new DataSourceSalesforceStandardObjectAttachmentConfiguration(documentTitleFieldName, fieldMappings);
        }
    }
}
