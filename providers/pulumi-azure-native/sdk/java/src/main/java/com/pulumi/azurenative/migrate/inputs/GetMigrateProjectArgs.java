// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMigrateProjectArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMigrateProjectArgs Empty = new GetMigrateProjectArgs();

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="migrateProjectName", required=true)
    private Output<String> migrateProjectName;

    /**
     * @return Name of the Azure Migrate project.
     * 
     */
    public Output<String> migrateProjectName() {
        return this.migrateProjectName;
    }

    /**
     * Name of the Azure Resource Group that migrate project is part of.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the Azure Resource Group that migrate project is part of.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetMigrateProjectArgs() {}

    private GetMigrateProjectArgs(GetMigrateProjectArgs $) {
        this.migrateProjectName = $.migrateProjectName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMigrateProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMigrateProjectArgs $;

        public Builder() {
            $ = new GetMigrateProjectArgs();
        }

        public Builder(GetMigrateProjectArgs defaults) {
            $ = new GetMigrateProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param migrateProjectName Name of the Azure Migrate project.
         * 
         * @return builder
         * 
         */
        public Builder migrateProjectName(Output<String> migrateProjectName) {
            $.migrateProjectName = migrateProjectName;
            return this;
        }

        /**
         * @param migrateProjectName Name of the Azure Migrate project.
         * 
         * @return builder
         * 
         */
        public Builder migrateProjectName(String migrateProjectName) {
            return migrateProjectName(Output.of(migrateProjectName));
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group that migrate project is part of.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group that migrate project is part of.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetMigrateProjectArgs build() {
            $.migrateProjectName = Objects.requireNonNull($.migrateProjectName, "expected parameter 'migrateProjectName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
