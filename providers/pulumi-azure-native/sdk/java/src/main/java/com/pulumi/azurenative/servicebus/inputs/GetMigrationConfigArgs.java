// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMigrationConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMigrationConfigArgs Empty = new GetMigrationConfigArgs();

    /**
     * The configuration name. Should always be &#34;$default&#34;.
     * 
     */
    @Import(name="configName", required=true)
    private Output<String> configName;

    /**
     * @return The configuration name. Should always be &#34;$default&#34;.
     * 
     */
    public Output<String> configName() {
        return this.configName;
    }

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    /**
     * @return The namespace name
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetMigrationConfigArgs() {}

    private GetMigrationConfigArgs(GetMigrationConfigArgs $) {
        this.configName = $.configName;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMigrationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMigrationConfigArgs $;

        public Builder() {
            $ = new GetMigrationConfigArgs();
        }

        public Builder(GetMigrationConfigArgs defaults) {
            $ = new GetMigrationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configName The configuration name. Should always be &#34;$default&#34;.
         * 
         * @return builder
         * 
         */
        public Builder configName(Output<String> configName) {
            $.configName = configName;
            return this;
        }

        /**
         * @param configName The configuration name. Should always be &#34;$default&#34;.
         * 
         * @return builder
         * 
         */
        public Builder configName(String configName) {
            return configName(Output.of(configName));
        }

        /**
         * @param namespaceName The namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName The namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetMigrationConfigArgs build() {
            $.configName = Objects.requireNonNull($.configName, "expected parameter 'configName' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
