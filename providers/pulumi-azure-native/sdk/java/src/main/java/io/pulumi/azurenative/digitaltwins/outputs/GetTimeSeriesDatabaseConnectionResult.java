// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.outputs;

import io.pulumi.azurenative.digitaltwins.outputs.AzureDataExplorerConnectionPropertiesResponse;
import io.pulumi.azurenative.digitaltwins.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetTimeSeriesDatabaseConnectionResult {
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * Extension resource name.
     * 
     */
    private final String name;
    /**
     * Properties of a specific time series database connection.
     * 
     */
    private final AzureDataExplorerConnectionPropertiesResponse properties;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","properties","systemData","type"})
    private GetTimeSeriesDatabaseConnectionResult(
        String id,
        String name,
        AzureDataExplorerConnectionPropertiesResponse properties,
        SystemDataResponse systemData,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The resource identifier.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Extension resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Properties of a specific time series database connection.
     * 
     */
    public AzureDataExplorerConnectionPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTimeSeriesDatabaseConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private AzureDataExplorerConnectionPropertiesResponse properties;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTimeSeriesDatabaseConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(AzureDataExplorerConnectionPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetTimeSeriesDatabaseConnectionResult build() {
            return new GetTimeSeriesDatabaseConnectionResult(id, name, properties, systemData, type);
        }
    }
}
