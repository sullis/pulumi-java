// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.ActionGroupResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ActionListResponse {
    /**
     * The list of the Action Groups.
     * 
     */
    private final @Nullable List<ActionGroupResponse> actionGroups;

    @OutputCustomType.Constructor({"actionGroups"})
    private ActionListResponse(@Nullable List<ActionGroupResponse> actionGroups) {
        this.actionGroups = actionGroups;
    }

    /**
     * The list of the Action Groups.
     * 
     */
    public List<ActionGroupResponse> getActionGroups() {
        return this.actionGroups == null ? List.of() : this.actionGroups;
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
