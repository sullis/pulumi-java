// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkspacePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkspacePlainArgs Empty = new GetWorkspacePlainArgs();

    /**
     * The name of the Databricks Workspace.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Databricks Workspace.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The Name of the Resource Group where the Databricks Workspace exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Name of the Resource Group where the Databricks Workspace exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A mapping of tags to assign to the Databricks Workspace.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A mapping of tags to assign to the Databricks Workspace.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetWorkspacePlainArgs() {}

    private GetWorkspacePlainArgs(GetWorkspacePlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
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
         * @param name The name of the Databricks Workspace.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the Databricks Workspace exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the Databricks Workspace.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetWorkspacePlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
