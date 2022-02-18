// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.ContentLinkResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIntegrationAccountSchemaResult {
    /**
     * The changed time.
     * 
     */
    private final String changedTime;
    /**
     * The content.
     * 
     */
    private final @Nullable String content;
    /**
     * The content link.
     * 
     */
    private final ContentLinkResponse contentLink;
    /**
     * The content type.
     * 
     */
    private final @Nullable String contentType;
    /**
     * The created time.
     * 
     */
    private final String createdTime;
    /**
     * The document name.
     * 
     */
    private final @Nullable String documentName;
    /**
     * The file name.
     * 
     */
    private final @Nullable String fileName;
    /**
     * The resource id.
     * 
     */
    private final String id;
    /**
     * The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The metadata.
     * 
     */
    private final @Nullable Object metadata;
    /**
     * Gets the resource name.
     * 
     */
    private final String name;
    /**
     * The schema type.
     * 
     */
    private final String schemaType;
    /**
     * The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The target namespace of the schema.
     * 
     */
    private final @Nullable String targetNamespace;
    /**
     * Gets the resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"changedTime","content","contentLink","contentType","createdTime","documentName","fileName","id","location","metadata","name","schemaType","tags","targetNamespace","type"})
    private GetIntegrationAccountSchemaResult(
        String changedTime,
        @Nullable String content,
        ContentLinkResponse contentLink,
        @Nullable String contentType,
        String createdTime,
        @Nullable String documentName,
        @Nullable String fileName,
        String id,
        @Nullable String location,
        @Nullable Object metadata,
        String name,
        String schemaType,
        @Nullable Map<String,String> tags,
        @Nullable String targetNamespace,
        String type) {
        this.changedTime = Objects.requireNonNull(changedTime);
        this.content = content;
        this.contentLink = Objects.requireNonNull(contentLink);
        this.contentType = contentType;
        this.createdTime = Objects.requireNonNull(createdTime);
        this.documentName = documentName;
        this.fileName = fileName;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.metadata = metadata;
        this.name = Objects.requireNonNull(name);
        this.schemaType = Objects.requireNonNull(schemaType);
        this.tags = tags;
        this.targetNamespace = targetNamespace;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The changed time.
     * 
     */
    public String getChangedTime() {
        return this.changedTime;
    }
    /**
     * The content.
     * 
     */
    public Optional<String> getContent() {
        return Optional.ofNullable(this.content);
    }
    /**
     * The content link.
     * 
     */
    public ContentLinkResponse getContentLink() {
        return this.contentLink;
    }
    /**
     * The content type.
     * 
     */
    public Optional<String> getContentType() {
        return Optional.ofNullable(this.contentType);
    }
    /**
     * The created time.
     * 
     */
    public String getCreatedTime() {
        return this.createdTime;
    }
    /**
     * The document name.
     * 
     */
    public Optional<String> getDocumentName() {
        return Optional.ofNullable(this.documentName);
    }
    /**
     * The file name.
     * 
     */
    public Optional<String> getFileName() {
        return Optional.ofNullable(this.fileName);
    }
    /**
     * The resource id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The resource location.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The metadata.
     * 
     */
    public Optional<Object> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * Gets the resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The schema type.
     * 
     */
    public String getSchemaType() {
        return this.schemaType;
    }
    /**
     * The resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The target namespace of the schema.
     * 
     */
    public Optional<String> getTargetNamespace() {
        return Optional.ofNullable(this.targetNamespace);
    }
    /**
     * Gets the resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationAccountSchemaResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String changedTime;
        private @Nullable String content;
        private ContentLinkResponse contentLink;
        private @Nullable String contentType;
        private String createdTime;
        private @Nullable String documentName;
        private @Nullable String fileName;
        private String id;
        private @Nullable String location;
        private @Nullable Object metadata;
        private String name;
        private String schemaType;
        private @Nullable Map<String,String> tags;
        private @Nullable String targetNamespace;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationAccountSchemaResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changedTime = defaults.changedTime;
    	      this.content = defaults.content;
    	      this.contentLink = defaults.contentLink;
    	      this.contentType = defaults.contentType;
    	      this.createdTime = defaults.createdTime;
    	      this.documentName = defaults.documentName;
    	      this.fileName = defaults.fileName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.schemaType = defaults.schemaType;
    	      this.tags = defaults.tags;
    	      this.targetNamespace = defaults.targetNamespace;
    	      this.type = defaults.type;
        }

        public Builder setChangedTime(String changedTime) {
            this.changedTime = Objects.requireNonNull(changedTime);
            return this;
        }

        public Builder setContent(@Nullable String content) {
            this.content = content;
            return this;
        }

        public Builder setContentLink(ContentLinkResponse contentLink) {
            this.contentLink = Objects.requireNonNull(contentLink);
            return this;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setCreatedTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder setDocumentName(@Nullable String documentName) {
            this.documentName = documentName;
            return this;
        }

        public Builder setFileName(@Nullable String fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMetadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSchemaType(String schemaType) {
            this.schemaType = Objects.requireNonNull(schemaType);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTargetNamespace(@Nullable String targetNamespace) {
            this.targetNamespace = targetNamespace;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetIntegrationAccountSchemaResult build() {
            return new GetIntegrationAccountSchemaResult(changedTime, content, contentLink, contentType, createdTime, documentName, fileName, id, location, metadata, name, schemaType, tags, targetNamespace, type);
        }
    }
}
