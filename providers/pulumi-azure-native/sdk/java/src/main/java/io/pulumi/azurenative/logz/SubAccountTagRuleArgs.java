// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz;

import io.pulumi.azurenative.logz.inputs.MonitoringTagRulesPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubAccountTagRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubAccountTagRuleArgs Empty = new SubAccountTagRuleArgs();

    /**
     * Monitor resource name
     * 
     */
    @InputImport(name="monitorName", required=true)
    private final Input<String> monitorName;

    public Input<String> getMonitorName() {
        return this.monitorName;
    }

    /**
     * Definition of the properties for a TagRules resource.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<MonitoringTagRulesPropertiesArgs> properties;

    public Input<MonitoringTagRulesPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="ruleSetName")
    private final @Nullable Input<String> ruleSetName;

    public Input<String> getRuleSetName() {
        return this.ruleSetName == null ? Input.empty() : this.ruleSetName;
    }

    /**
     * Sub Account resource name
     * 
     */
    @InputImport(name="subAccountName", required=true)
    private final Input<String> subAccountName;

    public Input<String> getSubAccountName() {
        return this.subAccountName;
    }

    public SubAccountTagRuleArgs(
        Input<String> monitorName,
        @Nullable Input<MonitoringTagRulesPropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<String> ruleSetName,
        Input<String> subAccountName) {
        this.monitorName = Objects.requireNonNull(monitorName, "expected parameter 'monitorName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleSetName = ruleSetName;
        this.subAccountName = Objects.requireNonNull(subAccountName, "expected parameter 'subAccountName' to be non-null");
    }

    private SubAccountTagRuleArgs() {
        this.monitorName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.ruleSetName = Input.empty();
        this.subAccountName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubAccountTagRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> monitorName;
        private @Nullable Input<MonitoringTagRulesPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> ruleSetName;
        private Input<String> subAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubAccountTagRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitorName = defaults.monitorName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleSetName = defaults.ruleSetName;
    	      this.subAccountName = defaults.subAccountName;
        }

        public Builder setMonitorName(Input<String> monitorName) {
            this.monitorName = Objects.requireNonNull(monitorName);
            return this;
        }

        public Builder setMonitorName(String monitorName) {
            this.monitorName = Input.of(Objects.requireNonNull(monitorName));
            return this;
        }

        public Builder setProperties(@Nullable Input<MonitoringTagRulesPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable MonitoringTagRulesPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRuleSetName(@Nullable Input<String> ruleSetName) {
            this.ruleSetName = ruleSetName;
            return this;
        }

        public Builder setRuleSetName(@Nullable String ruleSetName) {
            this.ruleSetName = Input.ofNullable(ruleSetName);
            return this;
        }

        public Builder setSubAccountName(Input<String> subAccountName) {
            this.subAccountName = Objects.requireNonNull(subAccountName);
            return this;
        }

        public Builder setSubAccountName(String subAccountName) {
            this.subAccountName = Input.of(Objects.requireNonNull(subAccountName));
            return this;
        }

        public SubAccountTagRuleArgs build() {
            return new SubAccountTagRuleArgs(monitorName, properties, resourceGroupName, ruleSetName, subAccountName);
        }
    }
}
