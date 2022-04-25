// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformariadb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConfigurationResult {
    /**
     * @return Allowed values of the configuration.
     * 
     */
    private final String allowedValues;
    /**
     * @return Data type of the configuration.
     * 
     */
    private final String dataType;
    /**
     * @return Default value of the configuration.
     * 
     */
    private final String defaultValue;
    /**
     * @return Description of the configuration.
     * 
     */
    private final String description;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Source of the configuration.
     * 
     */
    private final @Nullable String source;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;
    /**
     * @return Value of the configuration.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private GetConfigurationResult(
        @CustomType.Parameter("allowedValues") String allowedValues,
        @CustomType.Parameter("dataType") String dataType,
        @CustomType.Parameter("defaultValue") String defaultValue,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("source") @Nullable String source,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") @Nullable String value) {
        this.allowedValues = allowedValues;
        this.dataType = dataType;
        this.defaultValue = defaultValue;
        this.description = description;
        this.id = id;
        this.name = name;
        this.source = source;
        this.type = type;
        this.value = value;
    }

    /**
     * @return Allowed values of the configuration.
     * 
     */
    public String allowedValues() {
        return this.allowedValues;
    }
    /**
     * @return Data type of the configuration.
     * 
     */
    public String dataType() {
        return this.dataType;
    }
    /**
     * @return Default value of the configuration.
     * 
     */
    public String defaultValue() {
        return this.defaultValue;
    }
    /**
     * @return Description of the configuration.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Source of the configuration.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Value of the configuration.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allowedValues;
        private String dataType;
        private String defaultValue;
        private String description;
        private String id;
        private String name;
        private @Nullable String source;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.dataType = defaults.dataType;
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder allowedValues(String allowedValues) {
            this.allowedValues = Objects.requireNonNull(allowedValues);
            return this;
        }
        public Builder dataType(String dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
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
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public GetConfigurationResult build() {
            return new GetConfigurationResult(allowedValues, dataType, defaultValue, description, id, name, source, type, value);
        }
    }
}
