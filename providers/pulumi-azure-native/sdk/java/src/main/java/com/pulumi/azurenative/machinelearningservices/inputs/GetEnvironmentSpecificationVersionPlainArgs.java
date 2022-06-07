// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEnvironmentSpecificationVersionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentSpecificationVersionPlainArgs Empty = new GetEnvironmentSpecificationVersionPlainArgs();

    /**
     * Container name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Container name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Version identifier.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    /**
     * @return Version identifier.
     * 
     */
    public String version() {
        return this.version;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return Name of Azure Machine Learning workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetEnvironmentSpecificationVersionPlainArgs() {}

    private GetEnvironmentSpecificationVersionPlainArgs(GetEnvironmentSpecificationVersionPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.version = $.version;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentSpecificationVersionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentSpecificationVersionPlainArgs $;

        public Builder() {
            $ = new GetEnvironmentSpecificationVersionPlainArgs();
        }

        public Builder(GetEnvironmentSpecificationVersionPlainArgs defaults) {
            $ = new GetEnvironmentSpecificationVersionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Container name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param version Version identifier.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            $.version = version;
            return this;
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetEnvironmentSpecificationVersionPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
