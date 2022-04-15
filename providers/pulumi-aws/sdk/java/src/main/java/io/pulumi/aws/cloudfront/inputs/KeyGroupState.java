// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyGroupState extends io.pulumi.resources.ResourceArgs {

    public static final KeyGroupState Empty = new KeyGroupState();

    /**
     * A comment to describe the key group..
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> comment() {
        return this.comment == null ? Codegen.empty() : this.comment;
    }

    /**
     * The identifier for this version of the key group.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * A list of the identifiers of the public keys in the key group.
     * 
     */
    @Import(name="items")
      private final @Nullable Output<List<String>> items;

    public Output<List<String>> items() {
        return this.items == null ? Codegen.empty() : this.items;
    }

    /**
     * A name to identify the key group.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public KeyGroupState(
        @Nullable Output<String> comment,
        @Nullable Output<String> etag,
        @Nullable Output<List<String>> items,
        @Nullable Output<String> name) {
        this.comment = comment;
        this.etag = etag;
        this.items = items;
        this.name = name;
    }

    private KeyGroupState() {
        this.comment = Codegen.empty();
        this.etag = Codegen.empty();
        this.items = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> comment;
        private @Nullable Output<String> etag;
        private @Nullable Output<List<String>> items;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.etag = defaults.etag;
    	      this.items = defaults.items;
    	      this.name = defaults.name;
        }

        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }
        public Builder comment(@Nullable String comment) {
            this.comment = Codegen.ofNullable(comment);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder items(@Nullable Output<List<String>> items) {
            this.items = items;
            return this;
        }
        public Builder items(@Nullable List<String> items) {
            this.items = Codegen.ofNullable(items);
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public KeyGroupState build() {
            return new KeyGroupState(comment, etag, items, name);
        }
    }
}
