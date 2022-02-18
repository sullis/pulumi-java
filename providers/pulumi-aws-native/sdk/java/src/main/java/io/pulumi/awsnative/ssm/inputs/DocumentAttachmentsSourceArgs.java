// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm.inputs;

import io.pulumi.awsnative.ssm.enums.DocumentAttachmentsSourceKey;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentAttachmentsSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentAttachmentsSourceArgs Empty = new DocumentAttachmentsSourceArgs();

    /**
     * The key of a key-value pair that identifies the location of an attachment to a document.
     * 
     */
    @InputImport(name="key")
    private final @Nullable Input<DocumentAttachmentsSourceKey> key;

    public Input<DocumentAttachmentsSourceKey> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * The name of the document attachment file.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The value of a key-value pair that identifies the location of an attachment to a document. The format for Value depends on the type of key you specify.
     * 
     */
    @InputImport(name="values")
    private final @Nullable Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public DocumentAttachmentsSourceArgs(
        @Nullable Input<DocumentAttachmentsSourceKey> key,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> values) {
        this.key = key;
        this.name = name;
        this.values = values;
    }

    private DocumentAttachmentsSourceArgs() {
        this.key = Input.empty();
        this.name = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentAttachmentsSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DocumentAttachmentsSourceKey> key;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentAttachmentsSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder setKey(@Nullable Input<DocumentAttachmentsSourceKey> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable DocumentAttachmentsSourceKey key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setValues(@Nullable Input<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public DocumentAttachmentsSourceArgs build() {
            return new DocumentAttachmentsSourceArgs(key, name, values);
        }
    }
}
