// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class TemplateResourcePermissionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TemplateResourcePermissionArgs Empty = new TemplateResourcePermissionArgs();

    @InputImport(name="actions", required=true)
    private final Input<List<String>> actions;

    public Input<List<String>> getActions() {
        return this.actions;
    }

    @InputImport(name="principal", required=true)
    private final Input<String> principal;

    public Input<String> getPrincipal() {
        return this.principal;
    }

    public TemplateResourcePermissionArgs(
        Input<List<String>> actions,
        Input<String> principal) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.principal = Objects.requireNonNull(principal, "expected parameter 'principal' to be non-null");
    }

    private TemplateResourcePermissionArgs() {
        this.actions = Input.empty();
        this.principal = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateResourcePermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> actions;
        private Input<String> principal;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateResourcePermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.principal = defaults.principal;
        }

        public Builder setActions(Input<List<String>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setActions(List<String> actions) {
            this.actions = Input.of(Objects.requireNonNull(actions));
            return this;
        }

        public Builder setPrincipal(Input<String> principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }

        public Builder setPrincipal(String principal) {
            this.principal = Input.of(Objects.requireNonNull(principal));
            return this;
        }

        public TemplateResourcePermissionArgs build() {
            return new TemplateResourcePermissionArgs(actions, principal);
        }
    }
}
