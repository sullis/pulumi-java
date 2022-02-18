// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIntegrationAccountSessionResult {
    /**
     * The changed time.
     * 
     */
    private final String changedTime;
    /**
     * The session content.
     * 
     */
    private final @Nullable Object content;
    /**
     * The created time.
     * 
     */
    private final String createdTime;
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
     * Gets the resource name.
     * 
     */
    private final String name;
    /**
     * The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Gets the resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"changedTime","content","createdTime","id","location","name","tags","type"})
    private GetIntegrationAccountSessionResult(
        String changedTime,
        @Nullable Object content,
        String createdTime,
        String id,
        @Nullable String location,
        String name,
        @Nullable Map<String,String> tags,
        String type) {
        this.changedTime = Objects.requireNonNull(changedTime);
        this.content = content;
        this.createdTime = Objects.requireNonNull(createdTime);
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.tags = tags;
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
     * The session content.
     * 
     */
    public Optional<Object> getContent() {
        return Optional.ofNullable(this.content);
    }
    /**
     * The created time.
     * 
     */
    public String getCreatedTime() {
        return this.createdTime;
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
     * Gets the resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
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

    public static Builder builder(GetIntegrationAccountSessionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String changedTime;
        private @Nullable Object content;
        private String createdTime;
        private String id;
        private @Nullable String location;
        private String name;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationAccountSessionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changedTime = defaults.changedTime;
    	      this.content = defaults.content;
    	      this.createdTime = defaults.createdTime;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setChangedTime(String changedTime) {
            this.changedTime = Objects.requireNonNull(changedTime);
            return this;
        }

        public Builder setContent(@Nullable Object content) {
            this.content = content;
            return this;
        }

        public Builder setCreatedTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
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

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetIntegrationAccountSessionResult build() {
            return new GetIntegrationAccountSessionResult(changedTime, content, createdTime, id, location, name, tags, type);
        }
    }
}
