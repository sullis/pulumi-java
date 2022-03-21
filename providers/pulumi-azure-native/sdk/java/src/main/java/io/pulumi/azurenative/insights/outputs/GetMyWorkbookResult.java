// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.MyWorkbookManagedIdentityResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMyWorkbookResult {
    /**
     * Workbook category, as defined by the user at creation time.
     * 
     */
    private final String category;
    /**
     * The user-defined name of the private workbook.
     * 
     */
    private final String displayName;
    /**
     * Resource etag
     * 
     */
    private final @Nullable Map<String,String> etag;
    /**
     * Azure resource Id
     * 
     */
    private final @Nullable String id;
    /**
     * Identity used for BYOS
     * 
     */
    private final @Nullable MyWorkbookManagedIdentityResponse identity;
    /**
     * The kind of workbook. Choices are user and shared.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * Azure resource name
     * 
     */
    private final @Nullable String name;
    /**
     * Configuration of this particular private workbook. Configuration data is a string containing valid JSON
     * 
     */
    private final String serializedData;
    /**
     * Optional resourceId for a source resource.
     * 
     */
    private final @Nullable String sourceId;
    /**
     * BYOS Storage Account URI
     * 
     */
    private final @Nullable String storageUri;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Date and time in UTC of the last modification that was made to this private workbook definition.
     * 
     */
    private final String timeModified;
    /**
     * Azure resource type
     * 
     */
    private final @Nullable String type;
    /**
     * Unique user id of the specific user that owns this private workbook.
     * 
     */
    private final String userId;
    /**
     * This instance's version of the data model. This can change as new features are added that can be marked private workbook.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private GetMyWorkbookResult(
        @CustomType.Parameter("category") String category,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("etag") @Nullable Map<String,String> etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("identity") @Nullable MyWorkbookManagedIdentityResponse identity,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("serializedData") String serializedData,
        @CustomType.Parameter("sourceId") @Nullable String sourceId,
        @CustomType.Parameter("storageUri") @Nullable String storageUri,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("timeModified") String timeModified,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("userId") String userId,
        @CustomType.Parameter("version") @Nullable String version) {
        this.category = category;
        this.displayName = displayName;
        this.etag = etag;
        this.id = id;
        this.identity = identity;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.serializedData = serializedData;
        this.sourceId = sourceId;
        this.storageUri = storageUri;
        this.tags = tags;
        this.timeModified = timeModified;
        this.type = type;
        this.userId = userId;
        this.version = version;
    }

    /**
     * Workbook category, as defined by the user at creation time.
     * 
    */
    public String getCategory() {
        return this.category;
    }
    /**
     * The user-defined name of the private workbook.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource etag
     * 
    */
    public Map<String,String> getEtag() {
        return this.etag == null ? Map.of() : this.etag;
    }
    /**
     * Azure resource Id
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Identity used for BYOS
     * 
    */
    public Optional<MyWorkbookManagedIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The kind of workbook. Choices are user and shared.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource location
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Azure resource name
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Configuration of this particular private workbook. Configuration data is a string containing valid JSON
     * 
    */
    public String getSerializedData() {
        return this.serializedData;
    }
    /**
     * Optional resourceId for a source resource.
     * 
    */
    public Optional<String> getSourceId() {
        return Optional.ofNullable(this.sourceId);
    }
    /**
     * BYOS Storage Account URI
     * 
    */
    public Optional<String> getStorageUri() {
        return Optional.ofNullable(this.storageUri);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Date and time in UTC of the last modification that was made to this private workbook definition.
     * 
    */
    public String getTimeModified() {
        return this.timeModified;
    }
    /**
     * Azure resource type
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * Unique user id of the specific user that owns this private workbook.
     * 
    */
    public String getUserId() {
        return this.userId;
    }
    /**
     * This instance's version of the data model. This can change as new features are added that can be marked private workbook.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMyWorkbookResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String category;
        private String displayName;
        private @Nullable Map<String,String> etag;
        private @Nullable String id;
        private @Nullable MyWorkbookManagedIdentityResponse identity;
        private @Nullable String kind;
        private @Nullable String location;
        private @Nullable String name;
        private String serializedData;
        private @Nullable String sourceId;
        private @Nullable String storageUri;
        private @Nullable Map<String,String> tags;
        private String timeModified;
        private @Nullable String type;
        private String userId;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMyWorkbookResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.serializedData = defaults.serializedData;
    	      this.sourceId = defaults.sourceId;
    	      this.storageUri = defaults.storageUri;
    	      this.tags = defaults.tags;
    	      this.timeModified = defaults.timeModified;
    	      this.type = defaults.type;
    	      this.userId = defaults.userId;
    	      this.version = defaults.version;
        }

        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder etag(@Nullable Map<String,String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder identity(@Nullable MyWorkbookManagedIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder serializedData(String serializedData) {
            this.serializedData = Objects.requireNonNull(serializedData);
            return this;
        }
        public Builder sourceId(@Nullable String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Builder storageUri(@Nullable String storageUri) {
            this.storageUri = storageUri;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder timeModified(String timeModified) {
            this.timeModified = Objects.requireNonNull(timeModified);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public GetMyWorkbookResult build() {
            return new GetMyWorkbookResult(category, displayName, etag, id, identity, kind, location, name, serializedData, sourceId, storageUri, tags, timeModified, type, userId, version);
        }
    }
}
