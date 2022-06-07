// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.quantum.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkspacePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkspacePlainArgs Empty = new GetWorkspacePlainArgs();

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the quantum workspace resource.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of the quantum workspace resource.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetWorkspacePlainArgs() {}

    private GetWorkspacePlainArgs(GetWorkspacePlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkspacePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkspacePlainArgs $;

        public Builder() {
            $ = new GetWorkspacePlainArgs();
        }

        public Builder(GetWorkspacePlainArgs defaults) {
            $ = new GetWorkspacePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param workspaceName The name of the quantum workspace resource.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetWorkspacePlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
