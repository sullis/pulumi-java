// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.ActionGroupResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A list of Activity Log Alert rule actions.
 * 
 */
public final class ActionListResponse extends io.pulumi.resources.InvokeArgs {

    public static final ActionListResponse Empty = new ActionListResponse();

    /**
     * The list of the Action Groups.
     * 
     */
    @InputImport(name="actionGroups")
      private final @Nullable List<ActionGroupResponse> actionGroups;

    public List<ActionGroupResponse> getActionGroups() {
        return this.actionGroups == null ? List.of() : this.actionGroups;
    }

    public ActionListResponse(@Nullable List<ActionGroupResponse> actionGroups) {
        this.actionGroups = actionGroups;
    }

    private ActionListResponse() {
        this.actionGroups = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ActionGroupResponse> actionGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroups = defaults.actionGroups;
        }

        public Builder setActionGroups(@Nullable List<ActionGroupResponse> actionGroups) {
            this.actionGroups = actionGroups;
            return this;
        }
        public ActionListResponse build() {
            return new ActionListResponse(actionGroups);
        }
    }
}