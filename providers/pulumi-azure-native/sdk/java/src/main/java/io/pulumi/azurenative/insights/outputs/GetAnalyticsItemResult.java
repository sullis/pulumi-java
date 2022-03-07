// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.ApplicationInsightsComponentAnalyticsItemPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAnalyticsItemResult {
    /**
     * The content of this item
     * 
     */
    private final @Nullable String content;
    /**
     * Internally assigned unique id of the item definition.
     * 
     */
    private final @Nullable String id;
    /**
     * The user-defined name of the item.
     * 
     */
    private final @Nullable String name;
    /**
     * A set of properties that can be defined in the context of a specific item type. Each type may have its own properties.
     * 
     */
    private final ApplicationInsightsComponentAnalyticsItemPropertiesResponse properties;
    /**
     * Enum indicating if this item definition is owned by a specific user or is shared between all users with access to the Application Insights component.
     * 
     */
    private final @Nullable String scope;
    /**
     * Date and time in UTC when this item was created.
     * 
     */
    private final String timeCreated;
    /**
     * Date and time in UTC of the last modification that was made to this item.
     * 
     */
    private final String timeModified;
    /**
     * Enum indicating the type of the Analytics item.
     * 
     */
    private final @Nullable String type;
    /**
     * This instance's version of the data model. This can change as new features are added.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"content","id","name","properties","scope","timeCreated","timeModified","type","version"})
    private GetAnalyticsItemResult(
        @Nullable String content,
        @Nullable String id,
        @Nullable String name,
        ApplicationInsightsComponentAnalyticsItemPropertiesResponse properties,
        @Nullable String scope,
        String timeCreated,
        String timeModified,
        @Nullable String type,
        String version) {
        this.content = content;
        this.id = id;
        this.name = name;
        this.properties = Objects.requireNonNull(properties);
        this.scope = scope;
        this.timeCreated = Objects.requireNonNull(timeCreated);
        this.timeModified = Objects.requireNonNull(timeModified);
        this.type = type;
        this.version = Objects.requireNonNull(version);
    }

    /**
     * The content of this item
     * 
    */
    public Optional<String> getContent() {
        return Optional.ofNullable(this.content);
    }
    /**
     * Internally assigned unique id of the item definition.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The user-defined name of the item.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * A set of properties that can be defined in the context of a specific item type. Each type may have its own properties.
     * 
    */
    public ApplicationInsightsComponentAnalyticsItemPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Enum indicating if this item definition is owned by a specific user or is shared between all users with access to the Application Insights component.
     * 
    */
    public Optional<String> getScope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * Date and time in UTC when this item was created.
     * 
    */
    public String getTimeCreated() {
        return this.timeCreated;
    }
    /**
     * Date and time in UTC of the last modification that was made to this item.
     * 
    */
    public String getTimeModified() {
        return this.timeModified;
    }
    /**
     * Enum indicating the type of the Analytics item.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * This instance's version of the data model. This can change as new features are added.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnalyticsItemResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private @Nullable String id;
        private @Nullable String name;
        private ApplicationInsightsComponentAnalyticsItemPropertiesResponse properties;
        private @Nullable String scope;
        private String timeCreated;
        private String timeModified;
        private @Nullable String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnalyticsItemResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.scope = defaults.scope;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeModified = defaults.timeModified;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setContent(@Nullable String content) {
            this.content = content;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProperties(ApplicationInsightsComponentAnalyticsItemPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }

        public Builder setTimeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }

        public Builder setTimeModified(String timeModified) {
            this.timeModified = Objects.requireNonNull(timeModified);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetAnalyticsItemResult build() {
            return new GetAnalyticsItemResult(content, id, name, properties, scope, timeCreated, timeModified, type, version);
        }
    }
}