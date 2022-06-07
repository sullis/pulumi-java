// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTransformArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransformArgs Empty = new GetTransformArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The Media Services account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the Azure subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Transform name.
     * 
     */
    @Import(name="transformName", required=true)
    private Output<String> transformName;

    /**
     * @return The Transform name.
     * 
     */
    public Output<String> transformName() {
        return this.transformName;
    }

    private GetTransformArgs() {}

    private GetTransformArgs(GetTransformArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
        this.transformName = $.transformName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransformArgs $;

        public Builder() {
            $ = new GetTransformArgs();
        }

        public Builder(GetTransformArgs defaults) {
            $ = new GetTransformArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The Media Services account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The Media Services account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param resourceGroupName The name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param transformName The Transform name.
         * 
         * @return builder
         * 
         */
        public Builder transformName(Output<String> transformName) {
            $.transformName = transformName;
            return this;
        }

        /**
         * @param transformName The Transform name.
         * 
         * @return builder
         * 
         */
        public Builder transformName(String transformName) {
            return transformName(Output.of(transformName));
        }

        public GetTransformArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.transformName = Objects.requireNonNull($.transformName, "expected parameter 'transformName' to be non-null");
            return $;
        }
    }

}
