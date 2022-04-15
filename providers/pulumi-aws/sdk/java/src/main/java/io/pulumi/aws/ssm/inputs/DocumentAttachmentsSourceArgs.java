// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentAttachmentsSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentAttachmentsSourceArgs Empty = new DocumentAttachmentsSourceArgs();

    /**
     * The key describing the location of an attachment to a document. Valid key types include: `SourceUrl` and `S3FileUrl`
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    /**
     * The name of the document attachment file
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The value describing the location of an attachment to a document
     * 
     */
    @Import(name="values", required=true)
      private final Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    public DocumentAttachmentsSourceArgs(
        Output<String> key,
        @Nullable Output<String> name,
        Output<List<String>> values) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.name = name;
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private DocumentAttachmentsSourceArgs() {
        this.key = Codegen.empty();
        this.name = Codegen.empty();
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentAttachmentsSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private @Nullable Output<String> name;
        private Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentAttachmentsSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder values(Output<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Output.of(Objects.requireNonNull(values));
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public DocumentAttachmentsSourceArgs build() {
            return new DocumentAttachmentsSourceArgs(key, name, values);
        }
    }
}
