// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.IndexDocumentAttributeValueType;
import io.pulumi.awsnative.kendra.inputs.IndexRelevance;
import io.pulumi.awsnative.kendra.inputs.IndexSearch;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IndexDocumentMetadataConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final IndexDocumentMetadataConfiguration Empty = new IndexDocumentMetadataConfiguration();

    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    @Import(name="relevance")
      private final @Nullable IndexRelevance relevance;

    public Optional<IndexRelevance> relevance() {
        return this.relevance == null ? Optional.empty() : Optional.ofNullable(this.relevance);
    }

    @Import(name="search")
      private final @Nullable IndexSearch search;

    public Optional<IndexSearch> search() {
        return this.search == null ? Optional.empty() : Optional.ofNullable(this.search);
    }

    @Import(name="type", required=true)
      private final IndexDocumentAttributeValueType type;

    public IndexDocumentAttributeValueType type() {
        return this.type;
    }

    public IndexDocumentMetadataConfiguration(
        String name,
        @Nullable IndexRelevance relevance,
        @Nullable IndexSearch search,
        IndexDocumentAttributeValueType type) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.relevance = relevance;
        this.search = search;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private IndexDocumentMetadataConfiguration() {
        this.name = null;
        this.relevance = null;
        this.search = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexDocumentMetadataConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable IndexRelevance relevance;
        private @Nullable IndexSearch search;
        private IndexDocumentAttributeValueType type;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexDocumentMetadataConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.relevance = defaults.relevance;
    	      this.search = defaults.search;
    	      this.type = defaults.type;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder relevance(@Nullable IndexRelevance relevance) {
            this.relevance = relevance;
            return this;
        }
        public Builder search(@Nullable IndexSearch search) {
            this.search = search;
            return this;
        }
        public Builder type(IndexDocumentAttributeValueType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public IndexDocumentMetadataConfiguration build() {
            return new IndexDocumentMetadataConfiguration(name, relevance, search, type);
        }
    }
}
