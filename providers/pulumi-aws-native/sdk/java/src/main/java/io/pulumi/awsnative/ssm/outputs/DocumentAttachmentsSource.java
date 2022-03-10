// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm.outputs;

import io.pulumi.awsnative.ssm.enums.DocumentAttachmentsSourceKey;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DocumentAttachmentsSource {
    /**
     * The key of a key-value pair that identifies the location of an attachment to a document.
     * 
     */
    private final @Nullable DocumentAttachmentsSourceKey key;
    /**
     * The name of the document attachment file.
     * 
     */
    private final @Nullable String name;
    /**
     * The value of a key-value pair that identifies the location of an attachment to a document. The format for Value depends on the type of key you specify.
     * 
     */
    private final @Nullable List<String> values;

    @OutputCustomType.Constructor
    private DocumentAttachmentsSource(
        @OutputCustomType.Parameter("key") @Nullable DocumentAttachmentsSourceKey key,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("values") @Nullable List<String> values) {
        this.key = key;
        this.name = name;
        this.values = values;
    }

    /**
     * The key of a key-value pair that identifies the location of an attachment to a document.
     * 
    */
    public Optional<DocumentAttachmentsSourceKey> getKey() {
        return Optional.ofNullable(this.key);
    }
    /**
     * The name of the document attachment file.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The value of a key-value pair that identifies the location of an attachment to a document. The format for Value depends on the type of key you specify.
     * 
    */
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentAttachmentsSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DocumentAttachmentsSourceKey key;
        private @Nullable String name;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentAttachmentsSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder setKey(@Nullable DocumentAttachmentsSourceKey key) {
            this.key = key;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public DocumentAttachmentsSource build() {
            return new DocumentAttachmentsSource(key, name, values);
        }
    }
}
