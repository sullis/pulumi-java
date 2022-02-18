// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PriorityLevelConfigurationReference {
    /**
     * `name` is the name of the priority level configuration being referenced Required.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"name"})
    private PriorityLevelConfigurationReference(String name) {
        this.name = Objects.requireNonNull(name);
    }

    /**
     * `name` is the name of the priority level configuration being referenced Required.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityLevelConfigurationReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PriorityLevelConfigurationReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public PriorityLevelConfigurationReference build() {
            return new PriorityLevelConfigurationReference(name);
        }
    }
}
