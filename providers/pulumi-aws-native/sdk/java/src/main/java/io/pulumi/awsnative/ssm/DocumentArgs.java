// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm;

import io.pulumi.awsnative.ssm.enums.DocumentFormat;
import io.pulumi.awsnative.ssm.enums.DocumentType;
import io.pulumi.awsnative.ssm.inputs.DocumentAttachmentsSourceArgs;
import io.pulumi.awsnative.ssm.inputs.DocumentRequiresArgs;
import io.pulumi.awsnative.ssm.inputs.DocumentTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentArgs Empty = new DocumentArgs();

    /**
     * A list of key and value pairs that describe attachments to a version of a document.
     * 
     */
    @InputImport(name="attachments")
      private final @Nullable Input<List<DocumentAttachmentsSourceArgs>> attachments;

    public Input<List<DocumentAttachmentsSourceArgs>> getAttachments() {
        return this.attachments == null ? Input.empty() : this.attachments;
    }

    /**
     * The content for the Systems Manager document in JSON, YAML or String format.
     * 
     */
    @InputImport(name="content", required=true)
      private final Input<Object> content;

    public Input<Object> getContent() {
        return this.content;
    }

    /**
     * Specify the document format for the request. The document format can be either JSON or YAML. JSON is the default format.
     * 
     */
    @InputImport(name="documentFormat")
      private final @Nullable Input<DocumentFormat> documentFormat;

    public Input<DocumentFormat> getDocumentFormat() {
        return this.documentFormat == null ? Input.empty() : this.documentFormat;
    }

    /**
     * The type of document to create.
     * 
     */
    @InputImport(name="documentType")
      private final @Nullable Input<DocumentType> documentType;

    public Input<DocumentType> getDocumentType() {
        return this.documentType == null ? Input.empty() : this.documentType;
    }

    /**
     * A name for the Systems Manager document.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of SSM documents required by a document. For example, an ApplicationConfiguration document requires an ApplicationConfigurationSchema document.
     * 
     */
    @InputImport(name="requires")
      private final @Nullable Input<List<DocumentRequiresArgs>> requires;

    public Input<List<DocumentRequiresArgs>> getRequires() {
        return this.requires == null ? Input.empty() : this.requires;
    }

    /**
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<DocumentTagArgs>> tags;

    public Input<List<DocumentTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Specify a target type to define the kinds of resources the document can run on.
     * 
     */
    @InputImport(name="targetType")
      private final @Nullable Input<String> targetType;

    public Input<String> getTargetType() {
        return this.targetType == null ? Input.empty() : this.targetType;
    }

    /**
     * An optional field specifying the version of the artifact you are creating with the document. This value is unique across all versions of a document, and cannot be changed.
     * 
     */
    @InputImport(name="versionName")
      private final @Nullable Input<String> versionName;

    public Input<String> getVersionName() {
        return this.versionName == null ? Input.empty() : this.versionName;
    }

    public DocumentArgs(
        @Nullable Input<List<DocumentAttachmentsSourceArgs>> attachments,
        Input<Object> content,
        @Nullable Input<DocumentFormat> documentFormat,
        @Nullable Input<DocumentType> documentType,
        @Nullable Input<String> name,
        @Nullable Input<List<DocumentRequiresArgs>> requires,
        @Nullable Input<List<DocumentTagArgs>> tags,
        @Nullable Input<String> targetType,
        @Nullable Input<String> versionName) {
        this.attachments = attachments;
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.documentFormat = documentFormat;
        this.documentType = documentType;
        this.name = name;
        this.requires = requires;
        this.tags = tags;
        this.targetType = targetType;
        this.versionName = versionName;
    }

    private DocumentArgs() {
        this.attachments = Input.empty();
        this.content = Input.empty();
        this.documentFormat = Input.empty();
        this.documentType = Input.empty();
        this.name = Input.empty();
        this.requires = Input.empty();
        this.tags = Input.empty();
        this.targetType = Input.empty();
        this.versionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DocumentAttachmentsSourceArgs>> attachments;
        private Input<Object> content;
        private @Nullable Input<DocumentFormat> documentFormat;
        private @Nullable Input<DocumentType> documentType;
        private @Nullable Input<String> name;
        private @Nullable Input<List<DocumentRequiresArgs>> requires;
        private @Nullable Input<List<DocumentTagArgs>> tags;
        private @Nullable Input<String> targetType;
        private @Nullable Input<String> versionName;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachments = defaults.attachments;
    	      this.content = defaults.content;
    	      this.documentFormat = defaults.documentFormat;
    	      this.documentType = defaults.documentType;
    	      this.name = defaults.name;
    	      this.requires = defaults.requires;
    	      this.tags = defaults.tags;
    	      this.targetType = defaults.targetType;
    	      this.versionName = defaults.versionName;
        }

        public Builder setAttachments(@Nullable Input<List<DocumentAttachmentsSourceArgs>> attachments) {
            this.attachments = attachments;
            return this;
        }

        public Builder setAttachments(@Nullable List<DocumentAttachmentsSourceArgs> attachments) {
            this.attachments = Input.ofNullable(attachments);
            return this;
        }

        public Builder setContent(Input<Object> content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setContent(Object content) {
            this.content = Input.of(Objects.requireNonNull(content));
            return this;
        }

        public Builder setDocumentFormat(@Nullable Input<DocumentFormat> documentFormat) {
            this.documentFormat = documentFormat;
            return this;
        }

        public Builder setDocumentFormat(@Nullable DocumentFormat documentFormat) {
            this.documentFormat = Input.ofNullable(documentFormat);
            return this;
        }

        public Builder setDocumentType(@Nullable Input<DocumentType> documentType) {
            this.documentType = documentType;
            return this;
        }

        public Builder setDocumentType(@Nullable DocumentType documentType) {
            this.documentType = Input.ofNullable(documentType);
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

        public Builder setRequires(@Nullable Input<List<DocumentRequiresArgs>> requires) {
            this.requires = requires;
            return this;
        }

        public Builder setRequires(@Nullable List<DocumentRequiresArgs> requires) {
            this.requires = Input.ofNullable(requires);
            return this;
        }

        public Builder setTags(@Nullable Input<List<DocumentTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<DocumentTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTargetType(@Nullable Input<String> targetType) {
            this.targetType = targetType;
            return this;
        }

        public Builder setTargetType(@Nullable String targetType) {
            this.targetType = Input.ofNullable(targetType);
            return this;
        }

        public Builder setVersionName(@Nullable Input<String> versionName) {
            this.versionName = versionName;
            return this;
        }

        public Builder setVersionName(@Nullable String versionName) {
            this.versionName = Input.ofNullable(versionName);
            return this;
        }
        public DocumentArgs build() {
            return new DocumentArgs(attachments, content, documentFormat, documentType, name, requires, tags, targetType, versionName);
        }
    }
}