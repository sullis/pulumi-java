// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm;

import io.pulumi.aws.ssm.inputs.DocumentAttachmentsSourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentArgs Empty = new DocumentArgs();

    /**
     * One or more configuration blocks describing attachments sources to a version of a document. Defined below.
     * 
     */
    @Import(name="attachmentsSources")
      private final @Nullable Output<List<DocumentAttachmentsSourceArgs>> attachmentsSources;

    public Output<List<DocumentAttachmentsSourceArgs>> attachmentsSources() {
        return this.attachmentsSources == null ? Codegen.empty() : this.attachmentsSources;
    }

    /**
     * The JSON or YAML content of the document.
     * 
     */
    @Import(name="content", required=true)
      private final Output<String> content;

    public Output<String> content() {
        return this.content;
    }

    /**
     * The format of the document. Valid document types include: `JSON` and `YAML`
     * 
     */
    @Import(name="documentFormat")
      private final @Nullable Output<String> documentFormat;

    public Output<String> documentFormat() {
        return this.documentFormat == null ? Codegen.empty() : this.documentFormat;
    }

    /**
     * The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
     * 
     */
    @Import(name="documentType", required=true)
      private final Output<String> documentType;

    public Output<String> documentType() {
        return this.documentType;
    }

    /**
     * The name of the document.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Additional Permissions to attach to the document. See Permissions below for details.
     * 
     */
    @Import(name="permissions")
      private final @Nullable Output<Map<String,String>> permissions;

    public Output<Map<String,String>> permissions() {
        return this.permissions == null ? Codegen.empty() : this.permissions;
    }

    /**
     * A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
     * 
     */
    @Import(name="targetType")
      private final @Nullable Output<String> targetType;

    public Output<String> targetType() {
        return this.targetType == null ? Codegen.empty() : this.targetType;
    }

    /**
     * A field specifying the version of the artifact you are creating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document and cannot be changed for an existing document version.
     * 
     */
    @Import(name="versionName")
      private final @Nullable Output<String> versionName;

    public Output<String> versionName() {
        return this.versionName == null ? Codegen.empty() : this.versionName;
    }

    public DocumentArgs(
        @Nullable Output<List<DocumentAttachmentsSourceArgs>> attachmentsSources,
        Output<String> content,
        @Nullable Output<String> documentFormat,
        Output<String> documentType,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> permissions,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> targetType,
        @Nullable Output<String> versionName) {
        this.attachmentsSources = attachmentsSources;
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.documentFormat = documentFormat;
        this.documentType = Objects.requireNonNull(documentType, "expected parameter 'documentType' to be non-null");
        this.name = name;
        this.permissions = permissions;
        this.tags = tags;
        this.targetType = targetType;
        this.versionName = versionName;
    }

    private DocumentArgs() {
        this.attachmentsSources = Codegen.empty();
        this.content = Codegen.empty();
        this.documentFormat = Codegen.empty();
        this.documentType = Codegen.empty();
        this.name = Codegen.empty();
        this.permissions = Codegen.empty();
        this.tags = Codegen.empty();
        this.targetType = Codegen.empty();
        this.versionName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DocumentAttachmentsSourceArgs>> attachmentsSources;
        private Output<String> content;
        private @Nullable Output<String> documentFormat;
        private Output<String> documentType;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> permissions;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> targetType;
        private @Nullable Output<String> versionName;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentsSources = defaults.attachmentsSources;
    	      this.content = defaults.content;
    	      this.documentFormat = defaults.documentFormat;
    	      this.documentType = defaults.documentType;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.tags = defaults.tags;
    	      this.targetType = defaults.targetType;
    	      this.versionName = defaults.versionName;
        }

        public Builder attachmentsSources(@Nullable Output<List<DocumentAttachmentsSourceArgs>> attachmentsSources) {
            this.attachmentsSources = attachmentsSources;
            return this;
        }
        public Builder attachmentsSources(@Nullable List<DocumentAttachmentsSourceArgs> attachmentsSources) {
            this.attachmentsSources = Codegen.ofNullable(attachmentsSources);
            return this;
        }
        public Builder attachmentsSources(DocumentAttachmentsSourceArgs... attachmentsSources) {
            return attachmentsSources(List.of(attachmentsSources));
        }
        public Builder content(Output<String> content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public Builder content(String content) {
            this.content = Output.of(Objects.requireNonNull(content));
            return this;
        }
        public Builder documentFormat(@Nullable Output<String> documentFormat) {
            this.documentFormat = documentFormat;
            return this;
        }
        public Builder documentFormat(@Nullable String documentFormat) {
            this.documentFormat = Codegen.ofNullable(documentFormat);
            return this;
        }
        public Builder documentType(Output<String> documentType) {
            this.documentType = Objects.requireNonNull(documentType);
            return this;
        }
        public Builder documentType(String documentType) {
            this.documentType = Output.of(Objects.requireNonNull(documentType));
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
        public Builder permissions(@Nullable Output<Map<String,String>> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(@Nullable Map<String,String> permissions) {
            this.permissions = Codegen.ofNullable(permissions);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder targetType(@Nullable Output<String> targetType) {
            this.targetType = targetType;
            return this;
        }
        public Builder targetType(@Nullable String targetType) {
            this.targetType = Codegen.ofNullable(targetType);
            return this;
        }
        public Builder versionName(@Nullable Output<String> versionName) {
            this.versionName = versionName;
            return this;
        }
        public Builder versionName(@Nullable String versionName) {
            this.versionName = Codegen.ofNullable(versionName);
            return this;
        }        public DocumentArgs build() {
            return new DocumentArgs(attachmentsSources, content, documentFormat, documentType, name, permissions, tags, targetType, versionName);
        }
    }
}
