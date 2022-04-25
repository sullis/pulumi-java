// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHyperVCollectorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHyperVCollectorArgs Empty = new GetHyperVCollectorArgs();

    /**
     * Unique name of a Hyper-V collector within a project.
     * 
     */
    @Import(name="hyperVCollectorName", required=true)
    private String hyperVCollectorName;

    /**
     * @return Unique name of a Hyper-V collector within a project.
     * 
     */
    public String hyperVCollectorName() {
        return this.hyperVCollectorName;
    }

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="projectName", required=true)
    private String projectName;

    /**
     * @return Name of the Azure Migrate project.
     * 
     */
    public String projectName() {
        return this.projectName;
    }

    /**
     * Name of the Azure Resource Group that project is part of.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the Azure Resource Group that project is part of.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetHyperVCollectorArgs() {}

    private GetHyperVCollectorArgs(GetHyperVCollectorArgs $) {
        this.hyperVCollectorName = $.hyperVCollectorName;
        this.projectName = $.projectName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHyperVCollectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHyperVCollectorArgs $;

        public Builder() {
            $ = new GetHyperVCollectorArgs();
        }

        public Builder(GetHyperVCollectorArgs defaults) {
            $ = new GetHyperVCollectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hyperVCollectorName Unique name of a Hyper-V collector within a project.
         * 
         * @return builder
         * 
         */
        public Builder hyperVCollectorName(String hyperVCollectorName) {
            $.hyperVCollectorName = hyperVCollectorName;
            return this;
        }

        /**
         * @param projectName Name of the Azure Migrate project.
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group that project is part of.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetHyperVCollectorArgs build() {
            $.hyperVCollectorName = Objects.requireNonNull($.hyperVCollectorName, "expected parameter 'hyperVCollectorName' to be non-null");
            $.projectName = Objects.requireNonNull($.projectName, "expected parameter 'projectName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
