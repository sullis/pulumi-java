// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DashboardResourcePermission {
    private final List<String> actions;
    private final String principal;

    @OutputCustomType.Constructor({"actions","principal"})
    private DashboardResourcePermission(
        List<String> actions,
        String principal) {
        this.actions = Objects.requireNonNull(actions);
        this.principal = Objects.requireNonNull(principal);
    }

    public List<String> getActions() {
        return this.actions;
    }
    public String getPrincipal() {
        return this.principal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardResourcePermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> actions;
        private String principal;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardResourcePermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.principal = defaults.principal;
        }

        public Builder setActions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setPrincipal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }

        public DashboardResourcePermission build() {
            return new DashboardResourcePermission(actions, principal);
        }
    }
}
