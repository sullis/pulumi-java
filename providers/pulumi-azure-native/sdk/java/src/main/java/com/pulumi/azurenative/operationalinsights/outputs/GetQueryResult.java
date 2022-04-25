// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.outputs;

import com.pulumi.azurenative.operationalinsights.outputs.LogAnalyticsQueryPackQueryPropertiesResponseRelated;
import com.pulumi.azurenative.operationalinsights.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetQueryResult {
    /**
     * @return Object Id of user creating the query.
     * 
     */
    private final String author;
    /**
     * @return Body of the query.
     * 
     */
    private final String body;
    /**
     * @return Description of the query.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Unique display name for your query within the Query Pack.
     * 
     */
    private final String displayName;
    /**
     * @return Azure resource Id
     * 
     */
    private final String id;
    /**
     * @return Azure resource name
     * 
     */
    private final String name;
    /**
     * @return Additional properties that can be set for the query.
     * 
     */
    private final Object properties;
    /**
     * @return The related metadata items for the function.
     * 
     */
    private final @Nullable LogAnalyticsQueryPackQueryPropertiesResponseRelated related;
    /**
     * @return Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Tags associated with the query.
     * 
     */
    private final @Nullable Map<String,List<String>> tags;
    /**
     * @return Creation Date for the Log Analytics Query, in ISO 8601 format.
     * 
     */
    private final String timeCreated;
    /**
     * @return Last modified date of the Log Analytics Query, in ISO 8601 format.
     * 
     */
    private final String timeModified;
    /**
     * @return Azure resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetQueryResult(
        @CustomType.Parameter("author") String author,
        @CustomType.Parameter("body") String body,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") Object properties,
        @CustomType.Parameter("related") @Nullable LogAnalyticsQueryPackQueryPropertiesResponseRelated related,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,List<String>> tags,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeModified") String timeModified,
        @CustomType.Parameter("type") String type) {
        this.author = author;
        this.body = body;
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.related = related;
        this.systemData = systemData;
        this.tags = tags;
        this.timeCreated = timeCreated;
        this.timeModified = timeModified;
        this.type = type;
    }

    /**
     * @return Object Id of user creating the query.
     * 
     */
    public String author() {
        return this.author;
    }
    /**
     * @return Body of the query.
     * 
     */
    public String body() {
        return this.body;
    }
    /**
     * @return Description of the query.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Unique display name for your query within the Query Pack.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Azure resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Azure resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Additional properties that can be set for the query.
     * 
     */
    public Object properties() {
        return this.properties;
    }
    /**
     * @return The related metadata items for the function.
     * 
     */
    public Optional<LogAnalyticsQueryPackQueryPropertiesResponseRelated> related() {
        return Optional.ofNullable(this.related);
    }
    /**
     * @return Read only system data
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Tags associated with the query.
     * 
     */
    public Map<String,List<String>> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Creation Date for the Log Analytics Query, in ISO 8601 format.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return Last modified date of the Log Analytics Query, in ISO 8601 format.
     * 
     */
    public String timeModified() {
        return this.timeModified;
    }
    /**
     * @return Azure resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String author;
        private String body;
        private @Nullable String description;
        private String displayName;
        private String id;
        private String name;
        private Object properties;
        private @Nullable LogAnalyticsQueryPackQueryPropertiesResponseRelated related;
        private SystemDataResponse systemData;
        private @Nullable Map<String,List<String>> tags;
        private String timeCreated;
        private String timeModified;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.author = defaults.author;
    	      this.body = defaults.body;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.related = defaults.related;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeModified = defaults.timeModified;
    	      this.type = defaults.type;
        }

        public Builder author(String author) {
            this.author = Objects.requireNonNull(author);
            return this;
        }
        public Builder body(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(Object properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder related(@Nullable LogAnalyticsQueryPackQueryPropertiesResponseRelated related) {
            this.related = related;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeModified(String timeModified) {
            this.timeModified = Objects.requireNonNull(timeModified);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetQueryResult build() {
            return new GetQueryResult(author, body, description, displayName, id, name, properties, related, systemData, tags, timeCreated, timeModified, type);
        }
    }
}
