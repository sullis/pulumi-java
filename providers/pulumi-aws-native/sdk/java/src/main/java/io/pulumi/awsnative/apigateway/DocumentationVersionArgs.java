// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentationVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentationVersionArgs Empty = new DocumentationVersionArgs();

    /**
     * The description of the API documentation snapshot.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The version identifier of the API documentation snapshot.
     * 
     */
    @Import(name="documentationVersion", required=true)
      private final Output<String> documentationVersion;

    public Output<String> documentationVersion() {
        return this.documentationVersion;
    }

    /**
     * The identifier of the API.
     * 
     */
    @Import(name="restApiId", required=true)
      private final Output<String> restApiId;

    public Output<String> restApiId() {
        return this.restApiId;
    }

    public DocumentationVersionArgs(
        @Nullable Output<String> description,
        Output<String> documentationVersion,
        Output<String> restApiId) {
        this.description = description;
        this.documentationVersion = Objects.requireNonNull(documentationVersion, "expected parameter 'documentationVersion' to be non-null");
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
    }

    private DocumentationVersionArgs() {
        this.description = Codegen.empty();
        this.documentationVersion = Codegen.empty();
        this.restApiId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentationVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> documentationVersion;
        private Output<String> restApiId;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentationVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.documentationVersion = defaults.documentationVersion;
    	      this.restApiId = defaults.restApiId;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder documentationVersion(Output<String> documentationVersion) {
            this.documentationVersion = Objects.requireNonNull(documentationVersion);
            return this;
        }
        public Builder documentationVersion(String documentationVersion) {
            this.documentationVersion = Output.of(Objects.requireNonNull(documentationVersion));
            return this;
        }
        public Builder restApiId(Output<String> restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }
        public Builder restApiId(String restApiId) {
            this.restApiId = Output.of(Objects.requireNonNull(restApiId));
            return this;
        }        public DocumentationVersionArgs build() {
            return new DocumentationVersionArgs(description, documentationVersion, restApiId);
        }
    }
}
