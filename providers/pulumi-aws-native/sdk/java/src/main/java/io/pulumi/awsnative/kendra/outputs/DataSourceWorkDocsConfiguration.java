// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.outputs.DataSourceToIndexFieldMapping;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceWorkDocsConfiguration {
    private final @Nullable Boolean crawlComments;
    private final @Nullable List<String> exclusionPatterns;
    private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
    private final @Nullable List<String> inclusionPatterns;
    private final String organizationId;
    private final @Nullable Boolean useChangeLog;

    @CustomType.Constructor
    private DataSourceWorkDocsConfiguration(
        @CustomType.Parameter("crawlComments") @Nullable Boolean crawlComments,
        @CustomType.Parameter("exclusionPatterns") @Nullable List<String> exclusionPatterns,
        @CustomType.Parameter("fieldMappings") @Nullable List<DataSourceToIndexFieldMapping> fieldMappings,
        @CustomType.Parameter("inclusionPatterns") @Nullable List<String> inclusionPatterns,
        @CustomType.Parameter("organizationId") String organizationId,
        @CustomType.Parameter("useChangeLog") @Nullable Boolean useChangeLog) {
        this.crawlComments = crawlComments;
        this.exclusionPatterns = exclusionPatterns;
        this.fieldMappings = fieldMappings;
        this.inclusionPatterns = inclusionPatterns;
        this.organizationId = organizationId;
        this.useChangeLog = useChangeLog;
    }

    public Optional<Boolean> crawlComments() {
        return Optional.ofNullable(this.crawlComments);
    }
    public List<String> exclusionPatterns() {
        return this.exclusionPatterns == null ? List.of() : this.exclusionPatterns;
    }
    public List<DataSourceToIndexFieldMapping> fieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }
    public List<String> inclusionPatterns() {
        return this.inclusionPatterns == null ? List.of() : this.inclusionPatterns;
    }
    public String organizationId() {
        return this.organizationId;
    }
    public Optional<Boolean> useChangeLog() {
        return Optional.ofNullable(this.useChangeLog);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWorkDocsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean crawlComments;
        private @Nullable List<String> exclusionPatterns;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
        private @Nullable List<String> inclusionPatterns;
        private String organizationId;
        private @Nullable Boolean useChangeLog;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWorkDocsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crawlComments = defaults.crawlComments;
    	      this.exclusionPatterns = defaults.exclusionPatterns;
    	      this.fieldMappings = defaults.fieldMappings;
    	      this.inclusionPatterns = defaults.inclusionPatterns;
    	      this.organizationId = defaults.organizationId;
    	      this.useChangeLog = defaults.useChangeLog;
        }

        public Builder crawlComments(@Nullable Boolean crawlComments) {
            this.crawlComments = crawlComments;
            return this;
        }
        public Builder exclusionPatterns(@Nullable List<String> exclusionPatterns) {
            this.exclusionPatterns = exclusionPatterns;
            return this;
        }
        public Builder exclusionPatterns(String... exclusionPatterns) {
            return exclusionPatterns(List.of(exclusionPatterns));
        }
        public Builder fieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }
        public Builder fieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
            return fieldMappings(List.of(fieldMappings));
        }
        public Builder inclusionPatterns(@Nullable List<String> inclusionPatterns) {
            this.inclusionPatterns = inclusionPatterns;
            return this;
        }
        public Builder inclusionPatterns(String... inclusionPatterns) {
            return inclusionPatterns(List.of(inclusionPatterns));
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder useChangeLog(@Nullable Boolean useChangeLog) {
            this.useChangeLog = useChangeLog;
            return this;
        }        public DataSourceWorkDocsConfiguration build() {
            return new DataSourceWorkDocsConfiguration(crawlComments, exclusionPatterns, fieldMappings, inclusionPatterns, organizationId, useChangeLog);
        }
    }
}
