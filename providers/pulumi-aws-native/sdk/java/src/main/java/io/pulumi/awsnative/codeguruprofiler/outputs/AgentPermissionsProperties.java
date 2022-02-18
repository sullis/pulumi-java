// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codeguruprofiler.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AgentPermissionsProperties {
    /**
     * The principals for the agent permissions.
     * 
     */
    private final List<String> principals;

    @OutputCustomType.Constructor({"principals"})
    private AgentPermissionsProperties(List<String> principals) {
        this.principals = Objects.requireNonNull(principals);
    }

    /**
     * The principals for the agent permissions.
     * 
     */
    public List<String> getPrincipals() {
        return this.principals;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentPermissionsProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> principals;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentPermissionsProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principals = defaults.principals;
        }

        public Builder setPrincipals(List<String> principals) {
            this.principals = Objects.requireNonNull(principals);
            return this;
        }

        public AgentPermissionsProperties build() {
            return new AgentPermissionsProperties(principals);
        }
    }
}
