// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceConfluenceAttachmentToIndexFieldMapping;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceConfluenceAttachmentConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceConfluenceAttachmentConfiguration Empty = new DataSourceConfluenceAttachmentConfiguration();

    @InputImport(name="attachmentFieldMappings")
    private final @Nullable List<DataSourceConfluenceAttachmentToIndexFieldMapping> attachmentFieldMappings;

    public List<DataSourceConfluenceAttachmentToIndexFieldMapping> getAttachmentFieldMappings() {
        return this.attachmentFieldMappings == null ? List.of() : this.attachmentFieldMappings;
    }

    @InputImport(name="crawlAttachments")
    private final @Nullable Boolean crawlAttachments;

    public Optional<Boolean> getCrawlAttachments() {
        return this.crawlAttachments == null ? Optional.empty() : Optional.ofNullable(this.crawlAttachments);
    }

    public DataSourceConfluenceAttachmentConfiguration(
        @Nullable List<DataSourceConfluenceAttachmentToIndexFieldMapping> attachmentFieldMappings,
        @Nullable Boolean crawlAttachments) {
        this.attachmentFieldMappings = attachmentFieldMappings;
        this.crawlAttachments = crawlAttachments;
    }

    private DataSourceConfluenceAttachmentConfiguration() {
        this.attachmentFieldMappings = List.of();
        this.crawlAttachments = null;
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
