// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentationVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentationVersionArgs Empty = new DocumentationVersionArgs();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="documentationVersion", required=true)
    private final Input<String> documentationVersion;

    public Input<String> getDocumentationVersion() {
        return this.documentationVersion;
    }

    @InputImport(name="restApiId", required=true)
    private final Input<String> restApiId;

    public Input<String> getRestApiId() {
        return this.restApiId;
    }

    public DocumentationVersionArgs(
        @Nullable Input<String> description,
        Input<String> documentationVersion,
        Input<String> restApiId) {
        this.description = description;
        this.documentationVersion = Objects.requireNonNull(documentationVersion, "expected parameter 'documentationVersion' to be non-null");
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
    }

    private DocumentationVersionArgs() {
        this.description = Input.empty();
        this.documentationVersion = Input.empty();
        this.restApiId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentationVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> documentationVersion;
        private Input<String> restApiId;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentationVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.documentationVersion = defaults.documentationVersion;
    	      this.restApiId = defaults.restApiId;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDocumentationVersion(Input<String> documentationVersion) {
            this.documentationVersion = Objects.requireNonNull(documentationVersion);
            return this;
        }

        public Builder setDocumentationVersion(String documentationVersion) {
            this.documentationVersion = Input.of(Objects.requireNonNull(documentationVersion));
            return this;
        }

        public Builder setRestApiId(Input<String> restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }

        public Builder setRestApiId(String restApiId) {
            this.restApiId = Input.of(Objects.requireNonNull(restApiId));
            return this;
        }

        public DocumentationVersionArgs build() {
            return new DocumentationVersionArgs(description, documentationVersion, restApiId);
        }
    }
}
