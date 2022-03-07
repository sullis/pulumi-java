// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PublicKeyConfig extends io.pulumi.resources.InvokeArgs {

    public static final PublicKeyConfig Empty = new PublicKeyConfig();

    @InputImport(name="callerReference", required=true)
      private final String callerReference;

    public String getCallerReference() {
        return this.callerReference;
    }

    @InputImport(name="comment")
      private final @Nullable String comment;

    public Optional<String> getComment() {
        return this.comment == null ? Optional.empty() : Optional.ofNullable(this.comment);
    }

    @InputImport(name="encodedKey", required=true)
      private final String encodedKey;

    public String getEncodedKey() {
        return this.encodedKey;
    }

    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public PublicKeyConfig(
        String callerReference,
        @Nullable String comment,
        String encodedKey,
        String name) {
        this.callerReference = Objects.requireNonNull(callerReference, "expected parameter 'callerReference' to be non-null");
        this.comment = comment;
        this.encodedKey = Objects.requireNonNull(encodedKey, "expected parameter 'encodedKey' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PublicKeyConfig() {
        this.callerReference = null;
        this.comment = null;
        this.encodedKey = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicKeyConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String callerReference;
        private @Nullable String comment;
        private String encodedKey;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicKeyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callerReference = defaults.callerReference;
    	      this.comment = defaults.comment;
    	      this.encodedKey = defaults.encodedKey;
    	      this.name = defaults.name;
        }

        public Builder setCallerReference(String callerReference) {
            this.callerReference = Objects.requireNonNull(callerReference);
            return this;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setEncodedKey(String encodedKey) {
            this.encodedKey = Objects.requireNonNull(encodedKey);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public PublicKeyConfig build() {
            return new PublicKeyConfig(callerReference, comment, encodedKey, name);
        }
    }
}