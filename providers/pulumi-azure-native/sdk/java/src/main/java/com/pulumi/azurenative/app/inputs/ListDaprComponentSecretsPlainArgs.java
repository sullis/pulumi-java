// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListDaprComponentSecretsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListDaprComponentSecretsPlainArgs Empty = new ListDaprComponentSecretsPlainArgs();

    /**
     * Name of the Managed Environment.
     * 
     */
    @Import(name="environmentName", required=true)
    private String environmentName;

    /**
     * @return Name of the Managed Environment.
     * 
     */
    public String environmentName() {
        return this.environmentName;
    }

    /**
     * Name of the Dapr Component.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the Dapr Component.
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

    private ListDaprComponentSecretsPlainArgs() {}

    private ListDaprComponentSecretsPlainArgs(ListDaprComponentSecretsPlainArgs $) {
        this.environmentName = $.environmentName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListDaprComponentSecretsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListDaprComponentSecretsPlainArgs $;

        public Builder() {
            $ = new ListDaprComponentSecretsPlainArgs();
        }

        public Builder(ListDaprComponentSecretsPlainArgs defaults) {
            $ = new ListDaprComponentSecretsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param environmentName Name of the Managed Environment.
         * 
         * @return builder
         * 
         */
        public Builder environmentName(String environmentName) {
            $.environmentName = environmentName;
            return this;
        }

        /**
         * @param name Name of the Dapr Component.
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

        public ListDaprComponentSecretsPlainArgs build() {
            $.environmentName = Objects.requireNonNull($.environmentName, "expected parameter 'environmentName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
