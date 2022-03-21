// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm;

import io.pulumi.awsnative.ssm.enums.DocumentFormat;
import io.pulumi.awsnative.ssm.enums.DocumentType;
import io.pulumi.awsnative.ssm.inputs.DocumentAttachmentsSourceArgs;
import io.pulumi.awsnative.ssm.inputs.DocumentRequiresArgs;
import io.pulumi.awsnative.ssm.inputs.DocumentTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="attachments")
      private final @Nullable Output<List<DocumentAttachmentsSourceArgs>> attachments;

    public Output<List<DocumentAttachmentsSourceArgs>> getAttachments() {
        return this.attachments == null ? Output.empty() : this.attachments;
    }

    /**
     * The content for the Systems Manager document in JSON, YAML or String format.
     * 
     */
    @Import(name="content", required=true)
      private final Output<Object> content;

    public Output<Object> getContent() {
        return this.content;
    }

    /**
     * Specify the document format for the request. The document format can be either JSON or YAML. JSON is the default format.
     * 
     */
    @Import(name="documentFormat")
      private final @Nullable Output<DocumentFormat> documentFormat;

    public Output<DocumentFormat> getDocumentFormat() {
        return this.documentFormat == null ? Output.empty() : this.documentFormat;
    }

    /**
     * The type of document to create.
     * 
     */
    @Import(name="documentType")
      private final @Nullable Output<DocumentType> documentType;

    public Output<DocumentType> getDocumentType() {
        return this.documentType == null ? Output.empty() : this.documentType;
    }

    /**
     * A name for the Systems Manager document.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A list of SSM documents required by a document. For example, an ApplicationConfiguration document requires an ApplicationConfigurationSchema document.
     * 
     */
    @Import(name="requires")
      private final @Nullable Output<List<DocumentRequiresArgs>> requires;

    public Output<List<DocumentRequiresArgs>> getRequires() {
        return this.requires == null ? Output.empty() : this.requires;
    }

    /**
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<DocumentTagArgs>> tags;

    public Output<List<DocumentTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Specify a target type to define the kinds of resources the document can run on.
     * 
     */
    @Import(name="targetType")
      private final @Nullable Output<String> targetType;

    public Output<String> getTargetType() {
        return this.targetType == null ? Output.empty() : this.targetType;
    }

    /**
     * An optional field specifying the version of the artifact you are creating with the document. This value is unique across all versions of a document, and cannot be changed.
     * 
     */
    @Import(name="versionName")
      private final @Nullable Output<String> versionName;

    public Output<String> getVersionName() {
        return this.versionName == null ? Output.empty() : this.versionName;
    }

    public DocumentArgs(
        @Nullable Output<List<DocumentAttachmentsSourceArgs>> attachments,
        Output<Object> content,
        @Nullable Output<DocumentFormat> documentFormat,
        @Nullable Output<DocumentType> documentType,
        @Nullable Output<String> name,
        @Nullable Output<List<DocumentRequiresArgs>> requires,
        @Nullable Output<List<DocumentTagArgs>> tags,
        @Nullable Output<String> targetType,
        @Nullable Output<String> versionName) {
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
        this.attachments = Output.empty();
        this.content = Output.empty();
        this.documentFormat = Output.empty();
        this.documentType = Output.empty();
        this.name = Output.empty();
        this.requires = Output.empty();
        this.tags = Output.empty();
        this.targetType = Output.empty();
        this.versionName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DocumentAttachmentsSourceArgs>> attachments;
        private Output<Object> content;
        private @Nullable Output<DocumentFormat> documentFormat;
        private @Nullable Output<DocumentType> documentType;
        private @Nullable Output<String> name;
        private @Nullable Output<List<DocumentRequiresArgs>> requires;
        private @Nullable Output<List<DocumentTagArgs>> tags;
        private @Nullable Output<String> targetType;
        private @Nullable Output<String> versionName;

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

        public Builder attachments(@Nullable Output<List<DocumentAttachmentsSourceArgs>> attachments) {
            this.attachments = attachments;
            return this;
        }
        public Builder attachments(@Nullable List<DocumentAttachmentsSourceArgs> attachments) {
            this.attachments = Output.ofNullable(attachments);
            return this;
        }
        public Builder attachments(DocumentAttachmentsSourceArgs... attachments) {
            return attachments(List.of(attachments));
        }
        public Builder content(Output<Object> content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public Builder content(Object content) {
            this.content = Output.of(Objects.requireNonNull(content));
            return this;
        }
        public Builder documentFormat(@Nullable Output<DocumentFormat> documentFormat) {
            this.documentFormat = documentFormat;
            return this;
        }
        public Builder documentFormat(@Nullable DocumentFormat documentFormat) {
            this.documentFormat = Output.ofNullable(documentFormat);
            return this;
        }
        public Builder documentType(@Nullable Output<DocumentType> documentType) {
            this.documentType = documentType;
            return this;
        }
        public Builder documentType(@Nullable DocumentType documentType) {
            this.documentType = Output.ofNullable(documentType);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder requires(@Nullable Output<List<DocumentRequiresArgs>> requires) {
            this.requires = requires;
            return this;
        }
        public Builder requires(@Nullable List<DocumentRequiresArgs> requires) {
            this.requires = Output.ofNullable(requires);
            return this;
        }
        public Builder requires(DocumentRequiresArgs... requires) {
            return requires(List.of(requires));
        }
        public Builder tags(@Nullable Output<List<DocumentTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<DocumentTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(DocumentTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder targetType(@Nullable Output<String> targetType) {
            this.targetType = targetType;
            return this;
        }
        public Builder targetType(@Nullable String targetType) {
            this.targetType = Output.ofNullable(targetType);
            return this;
        }
        public Builder versionName(@Nullable Output<String> versionName) {
            this.versionName = versionName;
            return this;
        }
        public Builder versionName(@Nullable String versionName) {
            this.versionName = Output.ofNullable(versionName);
            return this;
        }        public DocumentArgs build() {
            return new DocumentArgs(attachments, content, documentFormat, documentType, name, requires, tags, targetType, versionName);
        }
    }
}
