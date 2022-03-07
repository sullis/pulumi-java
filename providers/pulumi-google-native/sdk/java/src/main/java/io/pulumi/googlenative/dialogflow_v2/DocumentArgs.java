// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.enums.DocumentKnowledgeTypesItem;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentArgs Empty = new DocumentArgs();

    /**
     * The URI where the file content is located. For documents stored in Google Cloud Storage, these URIs must have the form `gs:///`. NOTE: External URLs must correspond to public webpages, i.e., they must be indexed by Google Search. In particular, URLs for showing documents in Google Cloud Storage (i.e. the URL in your browser) are not supported. Instead use the `gs://` format URI described above.
     * 
     */
    @InputImport(name="contentUri")
      private final @Nullable Input<String> contentUri;

    public Input<String> getContentUri() {
        return this.contentUri == null ? Input.empty() : this.contentUri;
    }

    /**
     * The display name of the document. The name must be 1024 bytes or less; otherwise, the creation request fails.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Optional. If true, we try to automatically reload the document every day (at a time picked by the system). If false or unspecified, we don't try to automatically reload the document. Currently you can only enable automatic reload for documents sourced from a public url, see `source` field for the source types. Reload status can be tracked in `latest_reload_status`. If a reload fails, we will keep the document unchanged. If a reload fails with internal errors, the system will try to reload the document on the next day. If a reload fails with non-retriable errors (e.g. PERMISION_DENIED), the system will not try to reload the document anymore. You need to manually reload the document successfully by calling `ReloadDocument` and clear the errors.
     * 
     */
    @InputImport(name="enableAutoReload")
      private final @Nullable Input<Boolean> enableAutoReload;

    public Input<Boolean> getEnableAutoReload() {
        return this.enableAutoReload == null ? Input.empty() : this.enableAutoReload;
    }

    @InputImport(name="knowledgeBaseId", required=true)
      private final Input<String> knowledgeBaseId;

    public Input<String> getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * The knowledge type of document content.
     * 
     */
    @InputImport(name="knowledgeTypes", required=true)
      private final Input<List<DocumentKnowledgeTypesItem>> knowledgeTypes;

    public Input<List<DocumentKnowledgeTypesItem>> getKnowledgeTypes() {
        return this.knowledgeTypes;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional. Metadata for the document. The metadata supports arbitrary key-value pairs. Suggested use cases include storing a document's title, an external URL distinct from the document's content_uri, etc. The max size of a `key` or a `value` of the metadata is 1024 bytes.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * The MIME type of this document.
     * 
     */
    @InputImport(name="mimeType", required=true)
      private final Input<String> mimeType;

    public Input<String> getMimeType() {
        return this.mimeType;
    }

    /**
     * Optional. The document resource name. The name must be empty when creating a document. Format: `projects//locations//knowledgeBases//documents/`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ knowledge types.
     * 
     */
    @InputImport(name="rawContent")
      private final @Nullable Input<String> rawContent;

    public Input<String> getRawContent() {
        return this.rawContent == null ? Input.empty() : this.rawContent;
    }

    public DocumentArgs(
        @Nullable Input<String> contentUri,
        Input<String> displayName,
        @Nullable Input<Boolean> enableAutoReload,
        Input<String> knowledgeBaseId,
        Input<List<DocumentKnowledgeTypesItem>> knowledgeTypes,
        @Nullable Input<String> location,
        @Nullable Input<Map<String,String>> metadata,
        Input<String> mimeType,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> rawContent) {
        this.contentUri = contentUri;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.enableAutoReload = enableAutoReload;
        this.knowledgeBaseId = Objects.requireNonNull(knowledgeBaseId, "expected parameter 'knowledgeBaseId' to be non-null");
        this.knowledgeTypes = Objects.requireNonNull(knowledgeTypes, "expected parameter 'knowledgeTypes' to be non-null");
        this.location = location;
        this.metadata = metadata;
        this.mimeType = Objects.requireNonNull(mimeType, "expected parameter 'mimeType' to be non-null");
        this.name = name;
        this.project = project;
        this.rawContent = rawContent;
    }

    private DocumentArgs() {
        this.contentUri = Input.empty();
        this.displayName = Input.empty();
        this.enableAutoReload = Input.empty();
        this.knowledgeBaseId = Input.empty();
        this.knowledgeTypes = Input.empty();
        this.location = Input.empty();
        this.metadata = Input.empty();
        this.mimeType = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.rawContent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> contentUri;
        private Input<String> displayName;
        private @Nullable Input<Boolean> enableAutoReload;
        private Input<String> knowledgeBaseId;
        private Input<List<DocumentKnowledgeTypesItem>> knowledgeTypes;
        private @Nullable Input<String> location;
        private @Nullable Input<Map<String,String>> metadata;
        private Input<String> mimeType;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> rawContent;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentUri = defaults.contentUri;
    	      this.displayName = defaults.displayName;
    	      this.enableAutoReload = defaults.enableAutoReload;
    	      this.knowledgeBaseId = defaults.knowledgeBaseId;
    	      this.knowledgeTypes = defaults.knowledgeTypes;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.mimeType = defaults.mimeType;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.rawContent = defaults.rawContent;
        }

        public Builder setContentUri(@Nullable Input<String> contentUri) {
            this.contentUri = contentUri;
            return this;
        }

        public Builder setContentUri(@Nullable String contentUri) {
            this.contentUri = Input.ofNullable(contentUri);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setEnableAutoReload(@Nullable Input<Boolean> enableAutoReload) {
            this.enableAutoReload = enableAutoReload;
            return this;
        }

        public Builder setEnableAutoReload(@Nullable Boolean enableAutoReload) {
            this.enableAutoReload = Input.ofNullable(enableAutoReload);
            return this;
        }

        public Builder setKnowledgeBaseId(Input<String> knowledgeBaseId) {
            this.knowledgeBaseId = Objects.requireNonNull(knowledgeBaseId);
            return this;
        }

        public Builder setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = Input.of(Objects.requireNonNull(knowledgeBaseId));
            return this;
        }

        public Builder setKnowledgeTypes(Input<List<DocumentKnowledgeTypesItem>> knowledgeTypes) {
            this.knowledgeTypes = Objects.requireNonNull(knowledgeTypes);
            return this;
        }

        public Builder setKnowledgeTypes(List<DocumentKnowledgeTypesItem> knowledgeTypes) {
            this.knowledgeTypes = Input.of(Objects.requireNonNull(knowledgeTypes));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setMimeType(Input<String> mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType);
            return this;
        }

        public Builder setMimeType(String mimeType) {
            this.mimeType = Input.of(Objects.requireNonNull(mimeType));
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRawContent(@Nullable Input<String> rawContent) {
            this.rawContent = rawContent;
            return this;
        }

        public Builder setRawContent(@Nullable String rawContent) {
            this.rawContent = Input.ofNullable(rawContent);
            return this;
        }
        public DocumentArgs build() {
            return new DocumentArgs(contentUri, displayName, enableAutoReload, knowledgeBaseId, knowledgeTypes, location, metadata, mimeType, name, project, rawContent);
        }
    }
}