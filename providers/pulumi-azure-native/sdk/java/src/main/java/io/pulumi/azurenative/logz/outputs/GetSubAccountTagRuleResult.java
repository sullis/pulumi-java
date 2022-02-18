// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.outputs;

import io.pulumi.azurenative.logz.outputs.MonitoringTagRulesPropertiesResponse;
import io.pulumi.azurenative.logz.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetSubAccountTagRuleResult {
    /**
     * The id of the rule set.
     * 
     */
    private final String id;
    /**
     * Name of the rule set.
     * 
     */
    private final String name;
    /**
     * Definition of the properties for a TagRules resource.
     * 
     */
    private final MonitoringTagRulesPropertiesResponse properties;
    /**
     * The system metadata relating to this resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the rule set.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","properties","systemData","type"})
    private GetSubAccountTagRuleResult(
        String id,
        String name,
        MonitoringTagRulesPropertiesResponse properties,
        SystemDataResponse systemData,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The id of the rule set.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Name of the rule set.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Definition of the properties for a TagRules resource.
     * 
     */
    public MonitoringTagRulesPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * The system metadata relating to this resource
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the rule set.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubAccountTagRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private MonitoringTagRulesPropertiesResponse properties;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubAccountTagRuleResult defaults) {
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

        public Builder setProperties(MonitoringTagRulesPropertiesResponse properties) {
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

        public GetSubAccountTagRuleResult build() {
            return new GetSubAccountTagRuleResult(id, name, properties, systemData, type);
        }
    }
}
