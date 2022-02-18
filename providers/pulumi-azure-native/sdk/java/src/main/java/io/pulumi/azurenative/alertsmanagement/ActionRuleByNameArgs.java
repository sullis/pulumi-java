// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement;

import io.pulumi.azurenative.alertsmanagement.inputs.ActionGroupArgs;
import io.pulumi.azurenative.alertsmanagement.inputs.DiagnosticsArgs;
import io.pulumi.azurenative.alertsmanagement.inputs.SuppressionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ActionRuleByNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActionRuleByNameArgs Empty = new ActionRuleByNameArgs();

    /**
     * The name of action rule that needs to be created/updated
     * 
     */
    @InputImport(name="actionRuleName")
    private final @Nullable Input<String> actionRuleName;

    public Input<String> getActionRuleName() {
        return this.actionRuleName == null ? Input.empty() : this.actionRuleName;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * action rule properties
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<Object> properties;

    public Input<Object> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Resource group name where the resource is created.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ActionRuleByNameArgs(
        @Nullable Input<String> actionRuleName,
        @Nullable Input<String> location,
        @Nullable Input<Object> properties,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.actionRuleName = actionRuleName;
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ActionRuleByNameArgs() {
        this.actionRuleName = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionRuleByNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> actionRuleName;
        private @Nullable Input<String> location;
        private @Nullable Input<Object> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionRuleByNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionRuleName = defaults.actionRuleName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setActionRuleName(@Nullable Input<String> actionRuleName) {
            this.actionRuleName = actionRuleName;
            return this;
        }

        public Builder setActionRuleName(@Nullable String actionRuleName) {
            this.actionRuleName = Input.ofNullable(actionRuleName);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProperties(@Nullable Input<Object> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Object properties) {
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ActionRuleByNameArgs build() {
            return new ActionRuleByNameArgs(actionRuleName, location, properties, resourceGroupName, tags);
        }
    }
}
