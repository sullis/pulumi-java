// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDataCollectorResult {
    /**
     * The time at which the data collector was created in milliseconds since the epoch.
     * 
     */
    private final String createdAt;
    /**
     * A description of the data collector.
     * 
     */
    private final String description;
    /**
     * The time at which the Data Collector was last updated in milliseconds since the epoch.
     * 
     */
    private final String lastModifiedAt;
    /**
     * ID of the data collector. Must begin with `dc_`.
     * 
     */
    private final String name;
    /**
     * Immutable. The type of data this data collector will collect.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"createdAt","description","lastModifiedAt","name","type"})
    private GetDataCollectorResult(
        String createdAt,
        String description,
        String lastModifiedAt,
        String name,
        String type) {
        this.createdAt = Objects.requireNonNull(createdAt);
        this.description = Objects.requireNonNull(description);
        this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The time at which the data collector was created in milliseconds since the epoch.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * A description of the data collector.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The time at which the Data Collector was last updated in milliseconds since the epoch.
     * 
    */
    public String getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * ID of the data collector. Must begin with `dc_`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Immutable. The type of data this data collector will collect.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String description;
        private String lastModifiedAt;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCollectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setLastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDataCollectorResult build() {
            return new GetDataCollectorResult(createdAt, description, lastModifiedAt, name, type);
        }
    }
}