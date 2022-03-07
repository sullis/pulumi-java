// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vpcaccess_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SubnetResponse {
    /**
     * Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}
     * 
     */
    private final String name;
    /**
     * Project in which the subnet exists. If not set, this project is assumed to be the project for which the connector create request was issued.
     * 
     */
    private final String project;

    @OutputCustomType.Constructor({"name","project"})
    private SubnetResponse(
        String name,
        String project) {
        this.name = Objects.requireNonNull(name);
        this.project = Objects.requireNonNull(project);
    }

    /**
     * Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Project in which the subnet exists. If not set, this project is assumed to be the project for which the connector create request was issued.
     * 
    */
    public String getProject() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public SubnetResponse build() {
            return new SubnetResponse(name, project);
        }
    }
}