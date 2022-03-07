// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.outputs.DataSourceConfluenceAttachmentToIndexFieldMapping;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceConfluenceAttachmentConfiguration {
    private final @Nullable List<DataSourceConfluenceAttachmentToIndexFieldMapping> attachmentFieldMappings;
    private final @Nullable Boolean crawlAttachments;

    @OutputCustomType.Constructor({"attachmentFieldMappings","crawlAttachments"})
    private DataSourceConfluenceAttachmentConfiguration(
        @Nullable List<DataSourceConfluenceAttachmentToIndexFieldMapping> attachmentFieldMappings,
        @Nullable Boolean crawlAttachments) {
        this.attachmentFieldMappings = attachmentFieldMappings;
        this.crawlAttachments = crawlAttachments;
    }

    public List<DataSourceConfluenceAttachmentToIndexFieldMapping> getAttachmentFieldMappings() {
        return this.attachmentFieldMappings == null ? List.of() : this.attachmentFieldMappings;
    }
    public Optional<Boolean> getCrawlAttachments() {
        return Optional.ofNullable(this.crawlAttachments);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfluenceAttachmentConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DataSourceConfluenceAttachmentToIndexFieldMapping> attachmentFieldMappings;
        private @Nullable Boolean crawlAttachments;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfluenceAttachmentConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentFieldMappings = defaults.attachmentFieldMappings;
    	      this.crawlAttachments = defaults.crawlAttachments;
        }

        public Builder setAttachmentFieldMappings(@Nullable List<DataSourceConfluenceAttachmentToIndexFieldMapping> attachmentFieldMappings) {
            this.attachmentFieldMappings = attachmentFieldMappings;
            return this;
        }

        public Builder setCrawlAttachments(@Nullable Boolean crawlAttachments) {
            this.crawlAttachments = crawlAttachments;
            return this;
        }
        public DataSourceConfluenceAttachmentConfiguration build() {
            return new DataSourceConfluenceAttachmentConfiguration(attachmentFieldMappings, crawlAttachments);
        }
    }
}