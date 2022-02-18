// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.CostAllocationRulePropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetCostAllocationRuleResult {
    /**
     * Azure Resource Manager Id for the rule. This is a read ony value.
     * 
     */
    private final String id;
    /**
     * Name of the rule. This is a read only value.
     * 
     */
    private final String name;
    /**
     * Cost allocation rule properties
     * 
     */
    private final CostAllocationRulePropertiesResponse properties;
    /**
     * Resource type of the rule. This is a read only value of Microsoft.CostManagement/CostAllocationRule.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","properties","type"})
    private GetCostAllocationRuleResult(
        String id,
        String name,
        CostAllocationRulePropertiesResponse properties,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Azure Resource Manager Id for the rule. This is a read ony value.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Name of the rule. This is a read only value.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Cost allocation rule properties
     * 
     */
    public CostAllocationRulePropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Resource type of the rule. This is a read only value of Microsoft.CostManagement/CostAllocationRule.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCostAllocationRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private CostAllocationRulePropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCostAllocationRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
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

        public Builder setProperties(CostAllocationRulePropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetCostAllocationRuleResult build() {
            return new GetCostAllocationRuleResult(id, name, properties, type);
        }
    }
}
